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
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("hi!");
        org.junit.Assert.assertNull(oP1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.zeppelin.helium.NpmPackage npmPackage1 = org.apache.zeppelin.helium.NpmPackage.fromJson("");
        org.junit.Assert.assertNull(npmPackage1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.HTTP_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Watcher-Key" + "'", str0.equals("X-Watcher-Key"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
        try {
            note7.initializeJobListenerForParagraph(paragraph10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = org.apache.zeppelin.notebook.utility.IdHashes.generateId();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2DB1PDJAN" + "'", str0.equals("2DB1PDJAN"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext7 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterResult interpreterResult8 = remoteInterpreter6.executePrecode(interpreterContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.ZEPPELIN_TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.apache.zeppelin.notebook.Folder.ROOT_FOLDER_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/" + "'", str0.equals("/"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        try {
            java.lang.String str11 = remoteInterpreter6.getHook("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "X-Watcher-Key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph10 = note7.getLastParagraph();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving1 = org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving.fromJson("");
        org.junit.Assert.assertNull(notebookAuthorizationInfoSaving1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.WATCHER;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.WATCHER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.WATCHER));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState3 = heliumApplicationFactory0.get(paragraph1, "X-Watcher-Key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("X-Watcher-Key");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        try {
            org.apache.zeppelin.interpreter.Interpreter.FormType formType9 = remoteInterpreter6.getFormType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.interpreter.lifecycle.TimeoutLifecycleManager timeoutLifecycleManager1 = new org.apache.zeppelin.interpreter.lifecycle.TimeoutLifecycleManager(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.nio.file.Path path0 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.loadFromFile(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
        try {
            java.lang.String str3 = heliumApplicationFactory0.loadAndRun(heliumPackage1, paragraph2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note7.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
        try {
            note7.initializeJobListenerForParagraph(paragraph17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo1 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.getKey();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "79d33c9f-2b95-4ada-a917-c9915707b781" + "'", str0.equals("79d33c9f-2b95-4ada-a917-c9915707b781"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        try {
            org.apache.zeppelin.helium.HeliumConf heliumConf1 = org.apache.zeppelin.helium.HeliumConf.fromJson("2DCC5KEUY");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("/");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        try {
            org.apache.zeppelin.notebook.Notebook notebook9 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, notebookAuthorization7, credentials8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        boolean b12 = note7.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.scheduler.Job job13 = null;
        org.apache.zeppelin.scheduler.Job.Status status14 = null;
        org.apache.zeppelin.scheduler.Job.Status status15 = null;
        note7.beforeStatusChange(job13, status14, status15);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int i0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.getMaxNoteSize();
        org.junit.Assert.assertTrue(i0 == 67108864);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.util.Properties properties7 = null;
        remoteInterpreter6.setProperties(properties7);
        try {
            remoteInterpreter6.registerHook("X-Zeppelin-Token", "anonymous");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo4 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory5 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory7 = null;
        org.apache.zeppelin.search.SearchService searchService8 = null;
        org.apache.zeppelin.user.Credentials credentials9 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener10 = null;
        org.apache.zeppelin.notebook.Note note11 = new org.apache.zeppelin.notebook.Note(notebookRepo4, interpreterFactory5, interpreterSettingManager6, jobListenerFactory7, searchService8, credentials9, noteEventListener10);
        org.apache.zeppelin.search.SearchService searchService12 = null;
        note11.setIndex(searchService12);
        org.apache.zeppelin.notebook.NoteInfo noteInfo14 = new org.apache.zeppelin.notebook.NoteInfo(note11);
        org.apache.zeppelin.notebook.Note note16 = note11.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = null;
        heliumApplicationFactory3.onUnbindInterpreter(note16, interpreterSetting17);
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("2DAY1AANY");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2DAY1AANY" + "'", str1.equals("2DAY1AANY"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("anonymous");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "anonymous" + "'", str1.equals("anonymous"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("79d33c9f-2b95-4ada-a917-c9915707b781");
        org.junit.Assert.assertNull(oP1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Throwable throwable0 = null;
        java.lang.String str1 = org.apache.zeppelin.scheduler.Job.getStack(throwable0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str1 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        notebookRepoSettingsInfo0.value = arraylist_map_str_str1;
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("");
        org.junit.Assert.assertNull(zeppelinHubOp1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.google.gson.Gson gson0 = org.apache.zeppelin.notebook.Note.getGson();
        org.junit.Assert.assertNotNull(gson0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        heliumApplicationFactory3.onOutputAppend("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", (int) (short) 100, "", "2DB1PDJAN");
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int i0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        try {
            boolean b24 = helium21.enable("", "2DAY1AANY");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        try {
            org.apache.zeppelin.resource.ResourceSet resourceSet22 = helium21.getAllResources();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "anonymous";
        org.junit.Assert.assertNotNull(message0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        try {
            remoteInterpreter6.setProperty("", "79d33c9f-2b95-4ada-a917-c9915707b781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        org.apache.zeppelin.notebook.Notebook notebook15 = heliumApplicationFactory0.getNotebook();
        org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState18 = heliumApplicationFactory0.get(paragraph16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertNull(notebook15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            java.lang.String str17 = remoteInterpreter9.getProperty("", "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str0 = org.apache.zeppelin.notebook.Folder.TRASH_FOLDER_CONFLICT_INFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " " + "'", str0.equals(" "));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication0 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.getInstance();
        org.junit.Assert.assertNull(authentication0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        try {
            java.lang.String str11 = remoteInterpreter6.getHook("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        try {
            java.lang.String str16 = remoteInterpreter9.getHook("", "X-Zeppelin-Token");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.File file2 = null;
        try {
            org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry3 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("2DCC5KEUY", "X-Watcher-Key", file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.FileSystemNotebookRepo fileSystemNotebookRepo1 = new org.apache.zeppelin.notebook.repo.FileSystemNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter registeredInterpreter0 = null;
        try {
            org.apache.zeppelin.interpreter.Interpreter.register(registeredInterpreter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo.TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int i0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync1 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.File file2 = null;
        try {
            org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry3 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("2DAY1AANY", "2DCC5KEUY", file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
        java.io.File file5 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo8 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory9 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory11 = null;
        org.apache.zeppelin.search.SearchService searchService12 = null;
        org.apache.zeppelin.user.Credentials credentials13 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener14 = null;
        org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note(notebookRepo8, interpreterFactory9, interpreterSettingManager10, jobListenerFactory11, searchService12, credentials13, noteEventListener14);
        org.apache.zeppelin.search.SearchService searchService16 = null;
        note15.setIndex(searchService16);
        org.apache.zeppelin.notebook.NoteInfo noteInfo18 = new org.apache.zeppelin.notebook.NoteInfo(note15);
        org.apache.zeppelin.notebook.Note note20 = note15.getUserNote("2DB1PDJAN");
        heliumApplicationFactory7.onNoteCreate(note15);
        org.apache.zeppelin.notebook.Notebook notebook22 = heliumApplicationFactory7.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager23 = null;
        org.apache.zeppelin.helium.Helium helium24 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file5, heliumBundleFactory6, heliumApplicationFactory7, interpreterSettingManager23);
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager25 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNull(notebook22);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        boolean b9 = remoteInterpreter6.isOpened();
        try {
            org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess10 = remoteInterpreter6.getOrCreateInterpreterProcess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.zeppelin.notebook.Notebook notebook0 = null;
        org.apache.zeppelin.notebook.Notebook.CronJob.notebook = notebook0;
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        try {
            remoteInterpreter6.open();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter registeredInterpreter1 = org.apache.zeppelin.interpreter.Interpreter.findRegisteredInterpreterByClassName("X-Watcher-Key");
        org.junit.Assert.assertNull(registeredInterpreter1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int i0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer2 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler0, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        try {
            java.lang.String str4 = userTokenContainer2.getDefaultZeppelinInstanceToken("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(userTokenContainer2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        try {
            org.apache.zeppelin.scheduler.Scheduler scheduler8 = remoteInterpreter6.getScheduler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.util.Properties properties7 = null;
        remoteInterpreter6.setProperties(properties7);
        try {
            remoteInterpreter6.unregisterHook("2DC3C95JX", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            java.lang.String str17 = remoteInterpreter9.getHook("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job14 = remoteScheduler13.getJobsWaiting();
        org.junit.Assert.assertNotNull(collection_job14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        boolean b9 = remoteInterpreter6.isOpened();
        try {
            org.apache.zeppelin.interpreter.Interpreter.FormType formType10 = remoteInterpreter6.getFormType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.Paragraph paragraph16 = note7.clearParagraphOutput("79d33c9f-2b95-4ada-a917-c9915707b781");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo18 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory19 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory21 = null;
        org.apache.zeppelin.search.SearchService searchService22 = null;
        org.apache.zeppelin.user.Credentials credentials23 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener24 = null;
        org.apache.zeppelin.notebook.Note note25 = new org.apache.zeppelin.notebook.Note(notebookRepo18, interpreterFactory19, interpreterSettingManager20, jobListenerFactory21, searchService22, credentials23, noteEventListener24);
        org.apache.zeppelin.search.SearchService searchService26 = null;
        note25.setIndex(searchService26);
        org.apache.zeppelin.notebook.NoteInfo noteInfo28 = new org.apache.zeppelin.notebook.NoteInfo(note25);
        boolean b30 = note25.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo31 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory32 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager33 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory34 = null;
        org.apache.zeppelin.search.SearchService searchService35 = null;
        org.apache.zeppelin.user.Credentials credentials36 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener37 = null;
        org.apache.zeppelin.notebook.Note note38 = new org.apache.zeppelin.notebook.Note(notebookRepo31, interpreterFactory32, interpreterSettingManager33, jobListenerFactory34, searchService35, credentials36, noteEventListener37);
        org.apache.zeppelin.search.SearchService searchService39 = null;
        note38.setIndex(searchService39);
        org.apache.zeppelin.notebook.NoteInfo noteInfo41 = new org.apache.zeppelin.notebook.NoteInfo(note38);
        org.apache.zeppelin.notebook.Paragraph paragraph42 = null;
        note38.onOutputAppend(paragraph42, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str46 = note38.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory47 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph48 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note25, (org.apache.zeppelin.scheduler.JobListener) note38, interpreterFactory47);
        java.lang.String str49 = paragraph48.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo50 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory51 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager52 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory53 = null;
        org.apache.zeppelin.search.SearchService searchService54 = null;
        org.apache.zeppelin.user.Credentials credentials55 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener56 = null;
        org.apache.zeppelin.notebook.Note note57 = new org.apache.zeppelin.notebook.Note(notebookRepo50, interpreterFactory51, interpreterSettingManager52, jobListenerFactory53, searchService54, credentials55, noteEventListener56);
        org.apache.zeppelin.search.SearchService searchService58 = null;
        note57.setIndex(searchService58);
        org.apache.zeppelin.notebook.NoteInfo noteInfo60 = new org.apache.zeppelin.notebook.NoteInfo(note57);
        org.apache.zeppelin.notebook.Paragraph paragraph61 = null;
        note57.onOutputAppend(paragraph61, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph48.setNote(note57);
        org.apache.zeppelin.notebook.Paragraph paragraph67 = paragraph48.getUserParagraph("/");
        org.apache.zeppelin.notebook.Note note68 = paragraph67.getNote();
        try {
            note7.initializeJobListenerForParagraph(paragraph67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(paragraph16);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(list_map_str_str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(paragraph67);
        org.junit.Assert.assertNotNull(note68);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient0);
        try {
            zeppelinHeartbeat1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinHeartbeat1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        java.io.File file1 = null;
        java.io.File file2 = null;
        java.io.File file3 = null;
        java.io.File file4 = null;
        java.io.File file5 = null;
        try {
            org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file1, file2, file3, file4, file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        note7.clearAllParagraphOutput();
        try {
            boolean b12 = note7.run(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.zeppelin.helium.WebpackResult webpackResult0 = new org.apache.zeppelin.helium.WebpackResult();
        java.lang.String str1 = webpackResult0.toJson();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"errors\":[],\"warnings\":[]}" + "'", str1.equals("{\"errors\":[],\"warnings\":[]}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.DefaultInterpreterProperty> map_str_defaultInterpreterProperty4 = null;
        org.apache.zeppelin.interpreter.Interpreter.register("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "2DC3C95JX", "2DC3C95JX", false, map_str_defaultInterpreterProperty4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.getInstance();
        org.junit.Assert.assertNull(client0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult24 = helium21.getAllPackageInfo(true, "2DCC5KEUY");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage25 = null;
        try {
            java.io.File file27 = helium21.getBundle(heliumPackage25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult24);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADING;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADING + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADING));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        try {
            org.apache.zeppelin.interpreter.Interpreter.FormType formType14 = remoteInterpreter9.getFormType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph16 = note7.getLastParagraph();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.getInstance();
        org.junit.Assert.assertNull(zeppelinhubClient0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.zeppelin.interpreter.install.InstallInterpreter.usage();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        java.util.Map<java.lang.String, java.lang.String> map_str_str13 = note8.generateSingleParagraphInfo("2DB1PDJAN");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str14 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b15 = arraylist_map_str_str14.add(map_str_str13);
        notebookRepoSettingsInfo0.value = arraylist_map_str_str14;
        org.junit.Assert.assertNotNull(map_str_str13);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener10 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler12 = new org.apache.zeppelin.scheduler.RemoteScheduler("2DB1PDJAN", executorService1, "X-Watcher-Key", remoteInterpreter9, schedulerListener10, (int) (byte) 0);
        try {
            remoteInterpreter9.setProperty("{\"errors\":[],\"warnings\":[]}", "anonymous");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.zeppelin.notebook.NotebookImportDeserializer notebookImportDeserializer0 = new org.apache.zeppelin.notebook.NotebookImportDeserializer();
        com.google.gson.JsonElement jsonElement1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext3 = null;
        try {
            java.util.Date date4 = notebookImportDeserializer0.deserialize(jsonElement1, type2, jsonDeserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.AzureNotebookRepo azureNotebookRepo1 = new org.apache.zeppelin.notebook.repo.AzureNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.DefaultInterpreterProperty> map_str_defaultInterpreterProperty4 = null;
        org.apache.zeppelin.interpreter.Interpreter.register("2DCC5KEUY", "{\"errors\":[],\"warnings\":[]}", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", true, map_str_defaultInterpreterProperty4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        try {
            org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage1 = org.apache.zeppelin.notebook.socket.WatcherMessage.fromJson("X-Watcher-Key");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type1 = null;
        notebookRepoSettingsInfo0.type = type1;
        java.lang.String str3 = notebookRepoSettingsInfo0.name;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str4 = notebookRepoSettingsInfo0.value;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_map_str_str4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.util.Set<java.lang.String> set_str11 = notebookAuthorization0.getOwners("X-Zeppelin-Token");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization12 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array19 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str20, str_array19);
        notebookAuthorization12.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str20);
        java.util.Set<java.lang.String> set_str24 = notebookAuthorization12.getRoles("2DAY1AANY");
        boolean b26 = notebookAuthorization0.hasReadAuthorization(set_str24, "hi!");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization28 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array35 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str36, str_array35);
        notebookAuthorization28.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str36);
        java.util.Set<java.lang.String> set_str40 = notebookAuthorization28.getRoles("2DAY1AANY");
        java.lang.String[] str_array55 = new java.lang.String[] { "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "2D9FT8S92", " ", "hi!", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "/", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str56, str_array55);
        boolean b59 = notebookAuthorization28.hasWriteAuthorization((java.util.Set<java.lang.String>) linkedhashset_str56, "anonymous");
        notebookAuthorization0.setReaders("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str56);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set_str11);
        org.junit.Assert.assertNotNull(notebookAuthorization12);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set_str24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization28);
        org.junit.Assert.assertNotNull(str_array35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set_str40);
        org.junit.Assert.assertNotNull(str_array55);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage(" ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.Paragraph paragraph16 = note7.clearParagraphOutput("79d33c9f-2b95-4ada-a917-c9915707b781");
        note7.resetRuntimeInfos();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph20 = note7.insertNewParagraph((int) (byte) 1, authenticationInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(paragraph16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        try {
            org.apache.zeppelin.helium.NpmPackage npmPackage1 = org.apache.zeppelin.helium.NpmPackage.fromJson("79d33c9f-2b95-4ada-a917-c9915707b781");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.zeppelin.notebook.Note note1 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
        note9.onOutputAppend(paragraph13, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note9.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note20 = note9.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory21 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph22 = new org.apache.zeppelin.notebook.Paragraph("2DC3C95JX", note1, (org.apache.zeppelin.scheduler.JobListener) note20, interpreterFactory21);
        org.apache.zeppelin.scheduler.Job.Status status23 = null;
        paragraph22.setStatus(status23);
        org.junit.Assert.assertNotNull(note20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory2 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        org.apache.zeppelin.notebook.Note note15 = note10.getUserNote("2DB1PDJAN");
        heliumApplicationFactory2.onNoteCreate(note10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller17 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener1, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller18 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        try {
            remoteInterpreterEventPoller18.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo85 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory86 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager87 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory88 = null;
        org.apache.zeppelin.search.SearchService searchService89 = null;
        org.apache.zeppelin.user.Credentials credentials90 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener91 = null;
        org.apache.zeppelin.notebook.Note note92 = new org.apache.zeppelin.notebook.Note(notebookRepo85, interpreterFactory86, interpreterSettingManager87, jobListenerFactory88, searchService89, credentials90, noteEventListener91);
        org.apache.zeppelin.search.SearchService searchService93 = null;
        note92.setIndex(searchService93);
        org.apache.zeppelin.notebook.NoteInfo noteInfo95 = new org.apache.zeppelin.notebook.NoteInfo(note92);
        java.util.Map<java.lang.String, java.lang.String> map_str_str97 = note92.generateSingleParagraphInfo("2DB1PDJAN");
        luceneSearch0.updateIndexDoc(note92);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertNotNull(map_str_str97);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status0 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES + "'", status0.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        java.lang.String str4 = remoteInterpreterRunningProcess3.getHost();
        boolean b5 = remoteInterpreterRunningProcess3.isRunning();
        int i6 = remoteInterpreterRunningProcess3.getPort();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("");
        java.lang.Object obj2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) zeppelinhubMessage1, obj2, map_str_str3);
        org.apache.zeppelin.notebook.socket.Message message5 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message8 = message5.put("2DAY1AANY", (java.lang.Object) oP7);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat10 = message8.getType("");
        java.lang.String str11 = message8.toJson();
        org.apache.zeppelin.notebook.socket.Message.OP oP12 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
        message8.op = oP12;
        message8.principal = "hi!";
        zeppelinhubMessage1.data = "hi!";
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(zeppelinhubMessage4);
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}" + "'", str11.equals("{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}"));
        org.junit.Assert.assertTrue("'" + oP12 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP12.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.message("anonymous");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("2DAY1AANY", "2D9GSEHN5", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2D9GSEHN5", "2D9FT8S92");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        note7.clearParagraphOutputFields(paragraph49);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj52 = note7.getConfig();
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map_str_obj52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        try {
            java.lang.String str16 = remoteInterpreter9.getProperty("2D9FT8S92", "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = notebookRepoSettingsInfo0.value;
        org.junit.Assert.assertNull(list_map_str_str1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "anonymous", 1, "");
        java.lang.String str5 = appendOutputBuffer4.getNoteId();
        int i6 = appendOutputBuffer4.getIndex();
        java.lang.String str7 = appendOutputBuffer4.getParagraphId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str5.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "anonymous" + "'", str7.equals("anonymous"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note7.setName("X-Watcher-Key");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str17 = note7.generateParagraphsInfo();
        org.junit.Assert.assertNotNull(list_map_str_str17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
        org.apache.zeppelin.search.SearchService searchService15 = null;
        org.apache.zeppelin.user.Credentials credentials16 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
        org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
        org.apache.zeppelin.search.SearchService searchService19 = null;
        note18.setIndex(searchService19);
        org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo(note18);
        boolean b23 = note18.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo24 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory25 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory27 = null;
        org.apache.zeppelin.search.SearchService searchService28 = null;
        org.apache.zeppelin.user.Credentials credentials29 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener30 = null;
        org.apache.zeppelin.notebook.Note note31 = new org.apache.zeppelin.notebook.Note(notebookRepo24, interpreterFactory25, interpreterSettingManager26, jobListenerFactory27, searchService28, credentials29, noteEventListener30);
        org.apache.zeppelin.search.SearchService searchService32 = null;
        note31.setIndex(searchService32);
        org.apache.zeppelin.notebook.NoteInfo noteInfo34 = new org.apache.zeppelin.notebook.NoteInfo(note31);
        org.apache.zeppelin.notebook.Paragraph paragraph35 = null;
        note31.onOutputAppend(paragraph35, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str39 = note31.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory40 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph41 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note18, (org.apache.zeppelin.scheduler.JobListener) note31, interpreterFactory40);
        java.lang.String str42 = paragraph41.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo43 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory44 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager45 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory46 = null;
        org.apache.zeppelin.search.SearchService searchService47 = null;
        org.apache.zeppelin.user.Credentials credentials48 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener49 = null;
        org.apache.zeppelin.notebook.Note note50 = new org.apache.zeppelin.notebook.Note(notebookRepo43, interpreterFactory44, interpreterSettingManager45, jobListenerFactory46, searchService47, credentials48, noteEventListener49);
        org.apache.zeppelin.search.SearchService searchService51 = null;
        note50.setIndex(searchService51);
        org.apache.zeppelin.notebook.NoteInfo noteInfo53 = new org.apache.zeppelin.notebook.NoteInfo(note50);
        org.apache.zeppelin.notebook.Paragraph paragraph54 = null;
        note50.onOutputAppend(paragraph54, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph41.setNote(note50);
        org.apache.zeppelin.notebook.Paragraph paragraph60 = paragraph41.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status61 = null;
        paragraph41.setStatusToUserParagraph(status61);
        paragraph41.abort();
        note7.onProgressUpdate((org.apache.zeppelin.scheduler.Job) paragraph41, (-1));
        note7.clearAllParagraphOutput();
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(list_map_str_str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(paragraph60);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        java.lang.String str3 = message0.principal;
        message0.principal = "paragraph_1522728565744_-774075707";
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        try {
            org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage1 = org.apache.zeppelin.notebook.socket.WatcherMessage.fromJson("2DCC5KEUY");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        try {
            org.apache.zeppelin.helium.WebpackResult webpackResult1 = org.apache.zeppelin.helium.WebpackResult.fromJson("paragraph_1522728564700_1613699057");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        java.lang.Object obj68 = paragraph49.getReturn();
        java.util.Date date69 = null;
        paragraph49.setDateStarted(date69);
        org.apache.zeppelin.display.GUI gUI71 = null;
        paragraph49.settings = gUI71;
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph16 = note8.addNewParagraph(authenticationInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("");
        java.lang.String str2 = zeppelinhubMessage1.toJson();
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}" + "'", str2.equals("{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory2 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        org.apache.zeppelin.notebook.Note note15 = note10.getUserNote("2DB1PDJAN");
        heliumApplicationFactory2.onNoteCreate(note10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller17 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener1, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller18 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage19 = null;
        java.lang.Object obj20 = null;
        try {
            remoteInterpreterEventPoller18.sendInvokeMethodResult(invokeResourceMethodEventMessage19, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (short) 0, "2DB1PDJAN", (int) (byte) 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.util.Properties properties7 = null;
        remoteInterpreter6.setProperties(properties7);
        try {
            org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess9 = remoteInterpreter6.getOrCreateInterpreterProcess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult24 = helium21.getAllPackageInfo(true, "2DCC5KEUY");
        java.util.List<java.lang.String> list_str25 = helium21.getVisualizationPackageOrder();
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj28 = helium21.getPackageConfig("2DC58V2PC", "79d33c9f-2b95-4ada-a917-c9915707b781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult24);
        org.junit.Assert.assertNotNull(list_str25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        boolean b53 = paragraph50.isAborted();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status0 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR + "'", status0.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings2 = builder1.build();
        notebookRepoWithSettings2.className = " ";
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings2.settings;
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder7 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings8 = builder7.build();
        notebookRepoWithSettings8.className = " ";
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo11 = notebookRepoWithSettings8.settings;
        notebookRepoWithSettings2.settings = list_notebookRepoSettingsInfo11;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings2);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);
        org.junit.Assert.assertNotNull(notebookRepoWithSettings8);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            remoteInterpreter9.registerHook("{\"errors\":[],\"warnings\":[]}", "{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            java.util.Properties properties15 = remoteInterpreter9.getProperties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory85 = null;
        note22.setInterpreterFactory(interpreterFactory85);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory87 = null;
        note22.setInterpreterFactory(interpreterFactory87);
        note22.resetRuntimeInfos();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = note7.generateSingleParagraphInfo("2DB1PDJAN");
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph15 = note7.removeParagraph("2DAREQVAC", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_str12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        message0.principal = "2DB1PDJAN";
        message0.roles = "2DA4WJ5SN";
        org.junit.Assert.assertNotNull(message0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        helium21.saveConfig();
        try {
            boolean b25 = helium21.enable("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
        note12.onOutputAppend(paragraph16, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str20 = note12.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note22 = note12.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo24 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory25 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory27 = null;
        org.apache.zeppelin.search.SearchService searchService28 = null;
        org.apache.zeppelin.user.Credentials credentials29 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener30 = null;
        org.apache.zeppelin.notebook.Note note31 = new org.apache.zeppelin.notebook.Note(notebookRepo24, interpreterFactory25, interpreterSettingManager26, jobListenerFactory27, searchService28, credentials29, noteEventListener30);
        org.apache.zeppelin.search.SearchService searchService32 = null;
        note31.setIndex(searchService32);
        org.apache.zeppelin.notebook.NoteInfo noteInfo34 = new org.apache.zeppelin.notebook.NoteInfo(note31);
        boolean b36 = note31.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo37 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory38 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager39 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory40 = null;
        org.apache.zeppelin.search.SearchService searchService41 = null;
        org.apache.zeppelin.user.Credentials credentials42 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener43 = null;
        org.apache.zeppelin.notebook.Note note44 = new org.apache.zeppelin.notebook.Note(notebookRepo37, interpreterFactory38, interpreterSettingManager39, jobListenerFactory40, searchService41, credentials42, noteEventListener43);
        org.apache.zeppelin.search.SearchService searchService45 = null;
        note44.setIndex(searchService45);
        org.apache.zeppelin.notebook.NoteInfo noteInfo47 = new org.apache.zeppelin.notebook.NoteInfo(note44);
        org.apache.zeppelin.notebook.Paragraph paragraph48 = null;
        note44.onOutputAppend(paragraph48, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str52 = note44.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory53 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph54 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note31, (org.apache.zeppelin.scheduler.JobListener) note44, interpreterFactory53);
        java.lang.String str55 = paragraph54.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo56 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory57 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager58 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory59 = null;
        org.apache.zeppelin.search.SearchService searchService60 = null;
        org.apache.zeppelin.user.Credentials credentials61 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener62 = null;
        org.apache.zeppelin.notebook.Note note63 = new org.apache.zeppelin.notebook.Note(notebookRepo56, interpreterFactory57, interpreterSettingManager58, jobListenerFactory59, searchService60, credentials61, noteEventListener62);
        org.apache.zeppelin.search.SearchService searchService64 = null;
        note63.setIndex(searchService64);
        org.apache.zeppelin.notebook.NoteInfo noteInfo66 = new org.apache.zeppelin.notebook.NoteInfo(note63);
        org.apache.zeppelin.notebook.Paragraph paragraph67 = null;
        note63.onOutputAppend(paragraph67, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph54.setNote(note63);
        note22.addParagraph(paragraph54);
        note22.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo75 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory76 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager77 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory78 = null;
        org.apache.zeppelin.search.SearchService searchService79 = null;
        org.apache.zeppelin.user.Credentials credentials80 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener81 = null;
        org.apache.zeppelin.notebook.Note note82 = new org.apache.zeppelin.notebook.Note(notebookRepo75, interpreterFactory76, interpreterSettingManager77, jobListenerFactory78, searchService79, credentials80, noteEventListener81);
        org.apache.zeppelin.search.SearchService searchService83 = null;
        note82.setIndex(searchService83);
        org.apache.zeppelin.notebook.NoteInfo noteInfo85 = new org.apache.zeppelin.notebook.NoteInfo(note82);
        java.lang.String str86 = noteInfo85.getName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj87 = noteInfo85.getConfig();
        note22.setConfig(map_str_obj87);
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo89 = new org.apache.zeppelin.interpreter.InterpreterInfo("{\"op\":\"LIST_NOTES\",\"meta\":{}}", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", false, map_str_obj87);
        org.apache.zeppelin.notebook.NoteInfo noteInfo90 = new org.apache.zeppelin.notebook.NoteInfo("2DCC5KEUY", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}", map_str_obj87);
        org.junit.Assert.assertNotNull(list_map_str_str20);
        org.junit.Assert.assertNotNull(note22);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(list_map_str_str52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "2DBKZC971" + "'", str86.equals("2DBKZC971"));
        org.junit.Assert.assertNotNull(map_str_obj87);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "anonymous", 1, "");
        int i5 = appendOutputBuffer4.getIndex();
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo23 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory24 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager25 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory26 = null;
        org.apache.zeppelin.search.SearchService searchService27 = null;
        org.apache.zeppelin.user.Credentials credentials28 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener29 = null;
        org.apache.zeppelin.notebook.Note note30 = new org.apache.zeppelin.notebook.Note(notebookRepo23, interpreterFactory24, interpreterSettingManager25, jobListenerFactory26, searchService27, credentials28, noteEventListener29);
        org.apache.zeppelin.search.SearchService searchService31 = null;
        note30.setIndex(searchService31);
        org.apache.zeppelin.notebook.NoteInfo noteInfo33 = new org.apache.zeppelin.notebook.NoteInfo(note30);
        boolean b35 = note30.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo36 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory37 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager38 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory39 = null;
        org.apache.zeppelin.search.SearchService searchService40 = null;
        org.apache.zeppelin.user.Credentials credentials41 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener42 = null;
        org.apache.zeppelin.notebook.Note note43 = new org.apache.zeppelin.notebook.Note(notebookRepo36, interpreterFactory37, interpreterSettingManager38, jobListenerFactory39, searchService40, credentials41, noteEventListener42);
        org.apache.zeppelin.search.SearchService searchService44 = null;
        note43.setIndex(searchService44);
        org.apache.zeppelin.notebook.NoteInfo noteInfo46 = new org.apache.zeppelin.notebook.NoteInfo(note43);
        org.apache.zeppelin.notebook.Paragraph paragraph47 = null;
        note43.onOutputAppend(paragraph47, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str51 = note43.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph53 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note30, (org.apache.zeppelin.scheduler.JobListener) note43, interpreterFactory52);
        java.lang.String str54 = paragraph53.getText();
        heliumApplicationFactory4.unload(paragraph53, "");
        paragraph53.setText("2DB1PDJAN");
        paragraph53.clearRuntimeInfos();
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(list_map_str_str51);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.notebook.Paragraph paragraph14 = note12.clearParagraphOutput("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.SearchService searchService20 = null;
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
        org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
        org.apache.zeppelin.search.SearchService searchService24 = null;
        note23.setIndex(searchService24);
        org.apache.zeppelin.notebook.NoteInfo noteInfo26 = new org.apache.zeppelin.notebook.NoteInfo(note23);
        boolean b28 = note23.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
        org.apache.zeppelin.search.SearchService searchService33 = null;
        org.apache.zeppelin.user.Credentials credentials34 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
        org.apache.zeppelin.search.SearchService searchService37 = null;
        note36.setIndex(searchService37);
        org.apache.zeppelin.notebook.NoteInfo noteInfo39 = new org.apache.zeppelin.notebook.NoteInfo(note36);
        org.apache.zeppelin.notebook.Paragraph paragraph40 = null;
        note36.onOutputAppend(paragraph40, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str44 = note36.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory45 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph46 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note23, (org.apache.zeppelin.scheduler.JobListener) note36, interpreterFactory45);
        java.lang.String str47 = paragraph46.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo48 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory49 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager50 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory51 = null;
        org.apache.zeppelin.search.SearchService searchService52 = null;
        org.apache.zeppelin.user.Credentials credentials53 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener54 = null;
        org.apache.zeppelin.notebook.Note note55 = new org.apache.zeppelin.notebook.Note(notebookRepo48, interpreterFactory49, interpreterSettingManager50, jobListenerFactory51, searchService52, credentials53, noteEventListener54);
        org.apache.zeppelin.search.SearchService searchService56 = null;
        note55.setIndex(searchService56);
        org.apache.zeppelin.notebook.NoteInfo noteInfo58 = new org.apache.zeppelin.notebook.NoteInfo(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph59 = null;
        note55.onOutputAppend(paragraph59, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph46.setNote(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph65 = paragraph46.getUserParagraph("/");
        org.apache.zeppelin.notebook.Note note66 = paragraph65.getNote();
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage68 = null;
        note12.onOutputUpdate(paragraph65, (int) (short) -1, interpreterResultMessage68);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo71 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph72 = note12.insertNewParagraph((-1), authenticationInfo71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNull(paragraph14);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_map_str_str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(paragraph65);
        org.junit.Assert.assertNotNull(note66);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.fromJson("");
        org.junit.Assert.assertNull(interpreterInfoSaving1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.lang.String[] str_array20 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        boolean b23 = notebookAuthorization0.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = null;
        try {
            boolean b26 = notebookAuthorization0.isWriter("2DAA2V7VE", set_str25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterDir();
        try {
            remoteInterpreterManagedProcess7.start("2DB1PDJAN", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        java.lang.Throwable throwable33 = paragraph31.getException();
        paragraph31.setText("anonymous");
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(throwable33);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        try {
            boolean b11 = note7.run("2DB7TE5AP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = notebookRepoSettingsInfo0.value;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(list_map_str_str1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo1 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        remoteInterpreter6.close();
        try {
            remoteInterpreter6.open();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
        org.apache.zeppelin.helium.HeliumRegistry heliumRegistry1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonSerializationContext jsonSerializationContext3 = null;
        try {
            com.google.gson.JsonElement jsonElement4 = heliumRegistrySerializer0.serialize(heliumRegistry1, type2, jsonSerializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        java.util.Properties properties9 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager14 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration13);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter15 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties9, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager14);
        java.net.URL[] uRL_array16 = new java.net.URL[] {};
        remoteInterpreter15.setClassloaderUrls(uRL_array16);
        remoteInterpreter6.setClassloaderUrls(uRL_array16);
        try {
            java.util.Properties properties19 = remoteInterpreter6.getProperties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(uRL_array16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        org.apache.zeppelin.search.LuceneSearch luceneSearch14 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.SearchService searchService20 = null;
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
        org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
        org.apache.zeppelin.search.SearchService searchService24 = null;
        note23.setIndex(searchService24);
        org.apache.zeppelin.notebook.NoteInfo noteInfo26 = new org.apache.zeppelin.notebook.NoteInfo(note23);
        boolean b28 = note23.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
        org.apache.zeppelin.search.SearchService searchService33 = null;
        org.apache.zeppelin.user.Credentials credentials34 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
        org.apache.zeppelin.search.SearchService searchService37 = null;
        note36.setIndex(searchService37);
        org.apache.zeppelin.notebook.NoteInfo noteInfo39 = new org.apache.zeppelin.notebook.NoteInfo(note36);
        org.apache.zeppelin.notebook.Paragraph paragraph40 = null;
        note36.onOutputAppend(paragraph40, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str44 = note36.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory45 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph46 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note23, (org.apache.zeppelin.scheduler.JobListener) note36, interpreterFactory45);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo48 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory49 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager50 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory51 = null;
        org.apache.zeppelin.search.SearchService searchService52 = null;
        org.apache.zeppelin.user.Credentials credentials53 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener54 = null;
        org.apache.zeppelin.notebook.Note note55 = new org.apache.zeppelin.notebook.Note(notebookRepo48, interpreterFactory49, interpreterSettingManager50, jobListenerFactory51, searchService52, credentials53, noteEventListener54);
        org.apache.zeppelin.search.SearchService searchService56 = null;
        note55.setIndex(searchService56);
        org.apache.zeppelin.notebook.NoteInfo noteInfo58 = new org.apache.zeppelin.notebook.NoteInfo(note55);
        boolean b60 = note55.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo61 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory62 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager63 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory64 = null;
        org.apache.zeppelin.search.SearchService searchService65 = null;
        org.apache.zeppelin.user.Credentials credentials66 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener67 = null;
        org.apache.zeppelin.notebook.Note note68 = new org.apache.zeppelin.notebook.Note(notebookRepo61, interpreterFactory62, interpreterSettingManager63, jobListenerFactory64, searchService65, credentials66, noteEventListener67);
        org.apache.zeppelin.search.SearchService searchService69 = null;
        note68.setIndex(searchService69);
        org.apache.zeppelin.notebook.NoteInfo noteInfo71 = new org.apache.zeppelin.notebook.NoteInfo(note68);
        org.apache.zeppelin.notebook.Paragraph paragraph72 = null;
        note68.onOutputAppend(paragraph72, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str76 = note68.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory77 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph78 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note55, (org.apache.zeppelin.scheduler.JobListener) note68, interpreterFactory77);
        java.lang.String str79 = paragraph78.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo80 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory81 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager82 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory83 = null;
        org.apache.zeppelin.search.SearchService searchService84 = null;
        org.apache.zeppelin.user.Credentials credentials85 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener86 = null;
        org.apache.zeppelin.notebook.Note note87 = new org.apache.zeppelin.notebook.Note(notebookRepo80, interpreterFactory81, interpreterSettingManager82, jobListenerFactory83, searchService84, credentials85, noteEventListener86);
        org.apache.zeppelin.search.SearchService searchService88 = null;
        note87.setIndex(searchService88);
        org.apache.zeppelin.notebook.NoteInfo noteInfo90 = new org.apache.zeppelin.notebook.NoteInfo(note87);
        org.apache.zeppelin.notebook.Paragraph paragraph91 = null;
        note87.onOutputAppend(paragraph91, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph78.setNote(note87);
        org.apache.zeppelin.notebook.Paragraph paragraph97 = paragraph78.getUserParagraph("/");
        luceneSearch14.deleteIndexDoc(note36, paragraph97);
        remoteScheduler13.submit((org.apache.zeppelin.scheduler.Job) paragraph97);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_map_str_str44);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(list_map_str_str76);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(paragraph97);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("79d33c9f-2b95-4ada-a917-c9915707b781", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}", (int) (short) 10, "2DAA2V7VE");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        java.util.Properties properties9 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager14 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration13);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter15 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties9, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager14);
        java.net.URL[] uRL_array16 = new java.net.URL[] {};
        remoteInterpreter15.setClassloaderUrls(uRL_array16);
        remoteInterpreter6.setClassloaderUrls(uRL_array16);
        try {
            org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess19 = remoteInterpreter6.getOrCreateInterpreterProcess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(uRL_array16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        org.apache.zeppelin.notebook.Paragraph paragraph14 = null;
        note10.onOutputAppend(paragraph14, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str18 = note10.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note20 = note10.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo22 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory23 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory25 = null;
        org.apache.zeppelin.search.SearchService searchService26 = null;
        org.apache.zeppelin.user.Credentials credentials27 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener28 = null;
        org.apache.zeppelin.notebook.Note note29 = new org.apache.zeppelin.notebook.Note(notebookRepo22, interpreterFactory23, interpreterSettingManager24, jobListenerFactory25, searchService26, credentials27, noteEventListener28);
        org.apache.zeppelin.search.SearchService searchService30 = null;
        note29.setIndex(searchService30);
        org.apache.zeppelin.notebook.NoteInfo noteInfo32 = new org.apache.zeppelin.notebook.NoteInfo(note29);
        boolean b34 = note29.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo35 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory36 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager37 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory38 = null;
        org.apache.zeppelin.search.SearchService searchService39 = null;
        org.apache.zeppelin.user.Credentials credentials40 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener41 = null;
        org.apache.zeppelin.notebook.Note note42 = new org.apache.zeppelin.notebook.Note(notebookRepo35, interpreterFactory36, interpreterSettingManager37, jobListenerFactory38, searchService39, credentials40, noteEventListener41);
        org.apache.zeppelin.search.SearchService searchService43 = null;
        note42.setIndex(searchService43);
        org.apache.zeppelin.notebook.NoteInfo noteInfo45 = new org.apache.zeppelin.notebook.NoteInfo(note42);
        org.apache.zeppelin.notebook.Paragraph paragraph46 = null;
        note42.onOutputAppend(paragraph46, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str50 = note42.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory51 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph52 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note29, (org.apache.zeppelin.scheduler.JobListener) note42, interpreterFactory51);
        java.lang.String str53 = paragraph52.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo54 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory55 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager56 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory57 = null;
        org.apache.zeppelin.search.SearchService searchService58 = null;
        org.apache.zeppelin.user.Credentials credentials59 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener60 = null;
        org.apache.zeppelin.notebook.Note note61 = new org.apache.zeppelin.notebook.Note(notebookRepo54, interpreterFactory55, interpreterSettingManager56, jobListenerFactory57, searchService58, credentials59, noteEventListener60);
        org.apache.zeppelin.search.SearchService searchService62 = null;
        note61.setIndex(searchService62);
        org.apache.zeppelin.notebook.NoteInfo noteInfo64 = new org.apache.zeppelin.notebook.NoteInfo(note61);
        org.apache.zeppelin.notebook.Paragraph paragraph65 = null;
        note61.onOutputAppend(paragraph65, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph52.setNote(note61);
        note20.addParagraph(paragraph52);
        note20.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo73 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory74 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager75 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory76 = null;
        org.apache.zeppelin.search.SearchService searchService77 = null;
        org.apache.zeppelin.user.Credentials credentials78 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener79 = null;
        org.apache.zeppelin.notebook.Note note80 = new org.apache.zeppelin.notebook.Note(notebookRepo73, interpreterFactory74, interpreterSettingManager75, jobListenerFactory76, searchService77, credentials78, noteEventListener79);
        org.apache.zeppelin.search.SearchService searchService81 = null;
        note80.setIndex(searchService81);
        org.apache.zeppelin.notebook.NoteInfo noteInfo83 = new org.apache.zeppelin.notebook.NoteInfo(note80);
        java.lang.String str84 = noteInfo83.getName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj85 = noteInfo83.getConfig();
        note20.setConfig(map_str_obj85);
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo87 = new org.apache.zeppelin.interpreter.InterpreterInfo("{\"op\":\"LIST_NOTES\",\"meta\":{}}", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", false, map_str_obj85);
        interpreterInfo87.setName("2DBKZC971");
        org.junit.Assert.assertNotNull(list_map_str_str18);
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(list_map_str_str50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "2DD4S11WG" + "'", str84.equals("2DD4S11WG"));
        org.junit.Assert.assertNotNull(map_str_obj85);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.Object obj2 = message0.get("/");
        java.lang.Object obj4 = message0.get("anonymous");
        java.lang.String str5 = message0.ticket;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}" + "'", str5.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        try {
            org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.fromJson("79d33c9f-2b95-4ada-a917-c9915707b781");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        try {
            org.apache.zeppelin.display.AngularObject angularObject1 = org.apache.zeppelin.display.AngularObject.fromJson("2DB1PDJAN");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.name = "paragraph_1522728565744_-774075707";
        java.lang.String str5 = instance0.name;
        instance0.token = "2DC58V2PC";
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str5.equals("paragraph_1522728565744_-774075707"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.ERROR;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.ERROR + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.ERROR));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings2 = builder1.build();
        notebookRepoWithSettings2.name = "X-Zeppelin-Token";
        org.junit.Assert.assertNotNull(notebookRepoWithSettings2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.lang.String str11 = noteInfo10.getId();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj12 = noteInfo10.getConfig();
        noteInfo10.setId("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2D9JQHJ4G" + "'", str11.equals("2D9JQHJ4G"));
        org.junit.Assert.assertNotNull(map_str_obj12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        java.lang.String str51 = paragraph31.getJobName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj52 = paragraph31.info();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo53 = null;
        try {
            paragraph31.setAuthenticationInfo(authenticationInfo53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "paragraph_1522728570989_-233105026" + "'", str51.equals("paragraph_1522728570989_-233105026"));
        org.junit.Assert.assertNull(map_str_obj52);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo6 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory7 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager8 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory9 = null;
        org.apache.zeppelin.search.SearchService searchService10 = null;
        org.apache.zeppelin.user.Credentials credentials11 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener12 = null;
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note(notebookRepo6, interpreterFactory7, interpreterSettingManager8, jobListenerFactory9, searchService10, credentials11, noteEventListener12);
        org.apache.zeppelin.search.SearchService searchService14 = null;
        note13.setIndex(searchService14);
        org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo(note13);
        org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
        note13.onOutputAppend(paragraph17, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str21 = note13.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note23 = note13.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo25 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory26 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager27 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory28 = null;
        org.apache.zeppelin.search.SearchService searchService29 = null;
        org.apache.zeppelin.user.Credentials credentials30 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener31 = null;
        org.apache.zeppelin.notebook.Note note32 = new org.apache.zeppelin.notebook.Note(notebookRepo25, interpreterFactory26, interpreterSettingManager27, jobListenerFactory28, searchService29, credentials30, noteEventListener31);
        org.apache.zeppelin.search.SearchService searchService33 = null;
        note32.setIndex(searchService33);
        org.apache.zeppelin.notebook.NoteInfo noteInfo35 = new org.apache.zeppelin.notebook.NoteInfo(note32);
        boolean b37 = note32.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo38 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory39 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager40 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory41 = null;
        org.apache.zeppelin.search.SearchService searchService42 = null;
        org.apache.zeppelin.user.Credentials credentials43 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener44 = null;
        org.apache.zeppelin.notebook.Note note45 = new org.apache.zeppelin.notebook.Note(notebookRepo38, interpreterFactory39, interpreterSettingManager40, jobListenerFactory41, searchService42, credentials43, noteEventListener44);
        org.apache.zeppelin.search.SearchService searchService46 = null;
        note45.setIndex(searchService46);
        org.apache.zeppelin.notebook.NoteInfo noteInfo48 = new org.apache.zeppelin.notebook.NoteInfo(note45);
        org.apache.zeppelin.notebook.Paragraph paragraph49 = null;
        note45.onOutputAppend(paragraph49, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str53 = note45.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory54 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph55 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note32, (org.apache.zeppelin.scheduler.JobListener) note45, interpreterFactory54);
        java.lang.String str56 = paragraph55.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo57 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory58 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager59 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory60 = null;
        org.apache.zeppelin.search.SearchService searchService61 = null;
        org.apache.zeppelin.user.Credentials credentials62 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener63 = null;
        org.apache.zeppelin.notebook.Note note64 = new org.apache.zeppelin.notebook.Note(notebookRepo57, interpreterFactory58, interpreterSettingManager59, jobListenerFactory60, searchService61, credentials62, noteEventListener63);
        org.apache.zeppelin.search.SearchService searchService65 = null;
        note64.setIndex(searchService65);
        org.apache.zeppelin.notebook.NoteInfo noteInfo67 = new org.apache.zeppelin.notebook.NoteInfo(note64);
        org.apache.zeppelin.notebook.Paragraph paragraph68 = null;
        note64.onOutputAppend(paragraph68, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph55.setNote(note64);
        note23.addParagraph(paragraph55);
        note23.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo76 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory77 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager78 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory79 = null;
        org.apache.zeppelin.search.SearchService searchService80 = null;
        org.apache.zeppelin.user.Credentials credentials81 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener82 = null;
        org.apache.zeppelin.notebook.Note note83 = new org.apache.zeppelin.notebook.Note(notebookRepo76, interpreterFactory77, interpreterSettingManager78, jobListenerFactory79, searchService80, credentials81, noteEventListener82);
        org.apache.zeppelin.search.SearchService searchService84 = null;
        note83.setIndex(searchService84);
        org.apache.zeppelin.notebook.NoteInfo noteInfo86 = new org.apache.zeppelin.notebook.NoteInfo(note83);
        java.lang.String str87 = noteInfo86.getName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj88 = noteInfo86.getConfig();
        note23.setConfig(map_str_obj88);
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo90 = new org.apache.zeppelin.interpreter.InterpreterInfo("{\"op\":\"LIST_NOTES\",\"meta\":{}}", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", false, map_str_obj88);
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo91 = new org.apache.zeppelin.interpreter.InterpreterInfo("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", "2DD4S11WG", true, map_str_obj88);
        org.junit.Assert.assertNotNull(list_map_str_str21);
        org.junit.Assert.assertNotNull(note23);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(list_map_str_str53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "2DA4J6V3U" + "'", str87.equals("2DA4J6V3U"));
        org.junit.Assert.assertNotNull(map_str_obj88);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array7 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str8, str_array7);
        notebookAuthorization0.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str8);
        java.util.Set<java.lang.String> set_str12 = notebookAuthorization0.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization13 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array18 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        boolean b22 = notebookAuthorization13.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str19, "2DAY1AANY");
        java.lang.String[] str_array33 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str34, str_array33);
        boolean b36 = notebookAuthorization13.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str34);
        boolean b38 = notebookAuthorization0.isOwner((java.util.Set<java.lang.String>) linkedhashset_str34, "2DB1PDJAN");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization40 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array47 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str48, str_array47);
        notebookAuthorization40.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str48);
        java.util.Set<java.lang.String> set_str52 = notebookAuthorization40.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization53 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array58 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str59, str_array58);
        boolean b62 = notebookAuthorization53.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str59, "2DAY1AANY");
        java.lang.String[] str_array73 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str74, str_array73);
        boolean b76 = notebookAuthorization53.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str74);
        boolean b78 = notebookAuthorization40.isOwner((java.util.Set<java.lang.String>) linkedhashset_str74, "2DB1PDJAN");
        boolean b79 = notebookAuthorization0.isOwner("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str74);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set_str12);
        org.junit.Assert.assertNotNull(notebookAuthorization13);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization40);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set_str52);
        org.junit.Assert.assertNotNull(notebookAuthorization53);
        org.junit.Assert.assertNotNull(str_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(str_array73);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        watcherMessage2.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        watcherMessage2.message = "2DA4WJ5SN";
        java.lang.String str7 = watcherMessage2.subject;
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        note17.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note71 = note17.getUserNote("2DAA2V7VE");
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(note71);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph14 = note8.getParagraphs();
        org.apache.zeppelin.notebook.Folder folder15 = folderView0.getFolderOf(note8);
        int i16 = folderView0.countNotes();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_paragraph14);
        org.junit.Assert.assertNull(folder15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory2 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        org.apache.zeppelin.notebook.Note note15 = note10.getUserNote("2DB1PDJAN");
        heliumApplicationFactory2.onNoteCreate(note10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller17 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener1, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller18 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage19 = null;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder21 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage22 = builder21.build();
        watcherMessage22.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        try {
            remoteInterpreterEventPoller18.sendInvokeMethodResult(invokeResourceMethodEventMessage19, (java.lang.Object) watcherMessage22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(watcherMessage22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.zeppelin.notebook.Notebook notebook0 = org.apache.zeppelin.notebook.Notebook.CronJob.notebook;
        org.junit.Assert.assertNull(notebook0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        org.apache.zeppelin.notebook.socket.Message.OP oP3 = org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH;
        message0.op = oP3;
        message0.ticket = "{\"op\":\"LIST_NOTES\",\"meta\":{}}";
        java.lang.String str7 = message0.toJson();
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP3 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP3.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str7.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult68 = paragraph49.getResult();
        boolean b69 = paragraph49.isBlankParagraph();
        java.util.Date date70 = paragraph49.getDateCreated();
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(date70);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("X-Zeppelin-Token", "2DAY1AANY", "hi!", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "");
        java.lang.String str6 = paragraphRuntimeInfo5.getInterpreterSettingId();
        paragraphRuntimeInfo5.addValue("2DAA2V7VE");
        java.lang.String str9 = paragraphRuntimeInfo5.getInterpreterSettingId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
        note7.persist(10, authenticationInfo14);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo17 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory18 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory20 = null;
        org.apache.zeppelin.search.SearchService searchService21 = null;
        org.apache.zeppelin.user.Credentials credentials22 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener23 = null;
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note(notebookRepo17, interpreterFactory18, interpreterSettingManager19, jobListenerFactory20, searchService21, credentials22, noteEventListener23);
        org.apache.zeppelin.search.SearchService searchService25 = null;
        note24.setIndex(searchService25);
        org.apache.zeppelin.notebook.NoteInfo noteInfo27 = new org.apache.zeppelin.notebook.NoteInfo(note24);
        boolean b29 = note24.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo30 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager32 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory33 = null;
        org.apache.zeppelin.search.SearchService searchService34 = null;
        org.apache.zeppelin.user.Credentials credentials35 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener36 = null;
        org.apache.zeppelin.notebook.Note note37 = new org.apache.zeppelin.notebook.Note(notebookRepo30, interpreterFactory31, interpreterSettingManager32, jobListenerFactory33, searchService34, credentials35, noteEventListener36);
        org.apache.zeppelin.search.SearchService searchService38 = null;
        note37.setIndex(searchService38);
        org.apache.zeppelin.notebook.NoteInfo noteInfo40 = new org.apache.zeppelin.notebook.NoteInfo(note37);
        org.apache.zeppelin.notebook.Paragraph paragraph41 = null;
        note37.onOutputAppend(paragraph41, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str45 = note37.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory46 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph47 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note24, (org.apache.zeppelin.scheduler.JobListener) note37, interpreterFactory46);
        java.lang.String str48 = paragraph47.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo49 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory50 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager51 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory52 = null;
        org.apache.zeppelin.search.SearchService searchService53 = null;
        org.apache.zeppelin.user.Credentials credentials54 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener55 = null;
        org.apache.zeppelin.notebook.Note note56 = new org.apache.zeppelin.notebook.Note(notebookRepo49, interpreterFactory50, interpreterSettingManager51, jobListenerFactory52, searchService53, credentials54, noteEventListener55);
        org.apache.zeppelin.search.SearchService searchService57 = null;
        note56.setIndex(searchService57);
        org.apache.zeppelin.notebook.NoteInfo noteInfo59 = new org.apache.zeppelin.notebook.NoteInfo(note56);
        org.apache.zeppelin.notebook.Paragraph paragraph60 = null;
        note56.onOutputAppend(paragraph60, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph47.setNote(note56);
        org.apache.zeppelin.notebook.Paragraph paragraph66 = paragraph47.getUserParagraph("/");
        java.lang.String str67 = paragraph66.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory69 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager68);
        paragraph66.setInterpreterFactory(interpreterFactory69);
        note7.setInterpreterFactory(interpreterFactory69);
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(list_map_str_str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(paragraph66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "X-Watcher-Key" + "'", str67.equals("X-Watcher-Key"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.version;
        npmPackage0.name = "2DA4J6V3U";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = message3.getType("");
        java.lang.String str6 = message3.toJson();
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
        message3.op = oP7;
        message3.principal = "hi!";
        java.lang.String str11 = message3.roles;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str6.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2DA4WJ5SN" + "'", str11.equals("2DA4WJ5SN"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        boolean b9 = remoteInterpreter6.isOpened();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterResult interpreterResult12 = remoteInterpreter6.interpret(" ", interpreterContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str86 = luceneSearch0.query("");
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertNotNull(list_map_str_str86);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        try {
            org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.fromJson("2DCC5KEUY");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj2 = null;
        org.apache.zeppelin.notebook.NoteInfo noteInfo3 = new org.apache.zeppelin.notebook.NoteInfo("", "hi!", map_str_obj2);
        noteInfo3.setId("2DD4S11WG");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.zeppelin.notebook.Notebook.CronJob cronJob0 = new org.apache.zeppelin.notebook.Notebook.CronJob();
        org.quartz.JobExecutionContext jobExecutionContext1 = null;
        try {
            cronJob0.execute(jobExecutionContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj6);
        java.lang.String str8 = interpreterInfo7.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array9 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo7 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo10 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo10, interpreterInfo_array9);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = builder0.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo10);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner13 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setInterpreterRunner(interpreterRunner13);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder14.setRunner(interpreterRunner15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2DB1PDJAN" + "'", str8.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer2 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler0, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.lang.String> list_str3 = userTokenContainer2.getAllTokens();
        try {
            java.lang.String str5 = userTokenContainer2.getDefaultZeppelinInstanceToken("2DB7TE5AP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(userTokenContainer2);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        org.apache.zeppelin.notebook.Note note23 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo24 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory25 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory27 = null;
        org.apache.zeppelin.search.SearchService searchService28 = null;
        org.apache.zeppelin.user.Credentials credentials29 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener30 = null;
        org.apache.zeppelin.notebook.Note note31 = new org.apache.zeppelin.notebook.Note(notebookRepo24, interpreterFactory25, interpreterSettingManager26, jobListenerFactory27, searchService28, credentials29, noteEventListener30);
        org.apache.zeppelin.search.SearchService searchService32 = null;
        note31.setIndex(searchService32);
        org.apache.zeppelin.notebook.NoteInfo noteInfo34 = new org.apache.zeppelin.notebook.NoteInfo(note31);
        org.apache.zeppelin.notebook.Paragraph paragraph35 = null;
        note31.onOutputAppend(paragraph35, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note31.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note42 = note31.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory43 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph44 = new org.apache.zeppelin.notebook.Paragraph("2DC3C95JX", note23, (org.apache.zeppelin.scheduler.JobListener) note42, interpreterFactory43);
        org.apache.zeppelin.notebook.ApplicationState applicationState46 = heliumApplicationFactory4.get(paragraph44, "2D9GSEHN5");
        org.apache.zeppelin.notebook.Notebook notebook47 = heliumApplicationFactory4.getNotebook();
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(note42);
        org.junit.Assert.assertNull(applicationState46);
        org.junit.Assert.assertNull(notebook47);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion12 = remoteInterpreter6.completion("2DA4J6V3U", (int) (byte) 0, interpreterContext11);
        try {
            java.lang.String str15 = remoteInterpreter6.getHook("/", "2D9FT8S92");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(list_interpreterCompletion12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        helium21.saveConfig();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo24 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory25 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory27 = null;
        org.apache.zeppelin.search.SearchService searchService28 = null;
        org.apache.zeppelin.user.Credentials credentials29 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener30 = null;
        org.apache.zeppelin.notebook.Note note31 = new org.apache.zeppelin.notebook.Note(notebookRepo24, interpreterFactory25, interpreterSettingManager26, jobListenerFactory27, searchService28, credentials29, noteEventListener30);
        org.apache.zeppelin.search.SearchService searchService32 = null;
        note31.setIndex(searchService32);
        org.apache.zeppelin.notebook.NoteInfo noteInfo34 = new org.apache.zeppelin.notebook.NoteInfo(note31);
        boolean b36 = note31.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo37 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory38 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager39 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory40 = null;
        org.apache.zeppelin.search.SearchService searchService41 = null;
        org.apache.zeppelin.user.Credentials credentials42 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener43 = null;
        org.apache.zeppelin.notebook.Note note44 = new org.apache.zeppelin.notebook.Note(notebookRepo37, interpreterFactory38, interpreterSettingManager39, jobListenerFactory40, searchService41, credentials42, noteEventListener43);
        org.apache.zeppelin.search.SearchService searchService45 = null;
        note44.setIndex(searchService45);
        org.apache.zeppelin.notebook.NoteInfo noteInfo47 = new org.apache.zeppelin.notebook.NoteInfo(note44);
        org.apache.zeppelin.notebook.Paragraph paragraph48 = null;
        note44.onOutputAppend(paragraph48, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str52 = note44.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory53 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph54 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note31, (org.apache.zeppelin.scheduler.JobListener) note44, interpreterFactory53);
        boolean b55 = paragraph54.isEnabled();
        try {
            org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion56 = helium21.suggestApp(paragraph54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(list_map_str_str52);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup9 = remoteInterpreter6.getInterpreterGroup();
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNull(managedInterpreterGroup9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        try {
            zeppelinhubRestApiHandler1.put("{\"errors\":[],\"warnings\":[]}", "paragraph_1522728564700_1613699057");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.fromJson("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(interpreterInfoSaving1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setInterpreterRunner(interpreterRunner1);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder0.setInterpreterDir("2DAY1AANY");
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool5 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder0.setProperties((java.lang.Object) interpreterContextRunnerPool5);
        try {
            interpreterContextRunnerPool5.run("2DD4S11WG", "2DAREQVAC");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        try {
            org.apache.zeppelin.notebook.Note note1 = org.apache.zeppelin.notebook.Note.fromJson("/");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo23 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory24 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager25 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory26 = null;
        org.apache.zeppelin.search.SearchService searchService27 = null;
        org.apache.zeppelin.user.Credentials credentials28 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener29 = null;
        org.apache.zeppelin.notebook.Note note30 = new org.apache.zeppelin.notebook.Note(notebookRepo23, interpreterFactory24, interpreterSettingManager25, jobListenerFactory26, searchService27, credentials28, noteEventListener29);
        org.apache.zeppelin.search.SearchService searchService31 = null;
        note30.setIndex(searchService31);
        org.apache.zeppelin.notebook.NoteInfo noteInfo33 = new org.apache.zeppelin.notebook.NoteInfo(note30);
        boolean b35 = note30.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo36 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory37 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager38 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory39 = null;
        org.apache.zeppelin.search.SearchService searchService40 = null;
        org.apache.zeppelin.user.Credentials credentials41 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener42 = null;
        org.apache.zeppelin.notebook.Note note43 = new org.apache.zeppelin.notebook.Note(notebookRepo36, interpreterFactory37, interpreterSettingManager38, jobListenerFactory39, searchService40, credentials41, noteEventListener42);
        org.apache.zeppelin.search.SearchService searchService44 = null;
        note43.setIndex(searchService44);
        org.apache.zeppelin.notebook.NoteInfo noteInfo46 = new org.apache.zeppelin.notebook.NoteInfo(note43);
        org.apache.zeppelin.notebook.Paragraph paragraph47 = null;
        note43.onOutputAppend(paragraph47, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str51 = note43.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph53 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note30, (org.apache.zeppelin.scheduler.JobListener) note43, interpreterFactory52);
        java.lang.String str54 = paragraph53.getText();
        heliumApplicationFactory4.unload(paragraph53, "");
        paragraph53.setText("2DB1PDJAN");
        boolean b59 = paragraph53.isRunning();
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(list_map_str_str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult24 = helium21.getAllPackageInfo(true, "2DCC5KEUY");
        java.util.List<java.lang.String> list_str25 = helium21.getVisualizationPackageOrder();
        org.apache.zeppelin.helium.HeliumRegistry heliumRegistry26 = null;
        helium21.addRegistry(heliumRegistry26);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
        org.apache.zeppelin.search.SearchService searchService33 = null;
        org.apache.zeppelin.user.Credentials credentials34 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
        org.apache.zeppelin.search.SearchService searchService37 = null;
        note36.setIndex(searchService37);
        org.apache.zeppelin.notebook.NoteInfo noteInfo39 = new org.apache.zeppelin.notebook.NoteInfo(note36);
        boolean b41 = note36.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo42 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory43 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager44 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory45 = null;
        org.apache.zeppelin.search.SearchService searchService46 = null;
        org.apache.zeppelin.user.Credentials credentials47 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener48 = null;
        org.apache.zeppelin.notebook.Note note49 = new org.apache.zeppelin.notebook.Note(notebookRepo42, interpreterFactory43, interpreterSettingManager44, jobListenerFactory45, searchService46, credentials47, noteEventListener48);
        org.apache.zeppelin.search.SearchService searchService50 = null;
        note49.setIndex(searchService50);
        org.apache.zeppelin.notebook.NoteInfo noteInfo52 = new org.apache.zeppelin.notebook.NoteInfo(note49);
        org.apache.zeppelin.notebook.Paragraph paragraph53 = null;
        note49.onOutputAppend(paragraph53, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str57 = note49.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory58 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph59 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note36, (org.apache.zeppelin.scheduler.JobListener) note49, interpreterFactory58);
        java.lang.String str60 = paragraph59.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo61 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory62 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager63 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory64 = null;
        org.apache.zeppelin.search.SearchService searchService65 = null;
        org.apache.zeppelin.user.Credentials credentials66 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener67 = null;
        org.apache.zeppelin.notebook.Note note68 = new org.apache.zeppelin.notebook.Note(notebookRepo61, interpreterFactory62, interpreterSettingManager63, jobListenerFactory64, searchService65, credentials66, noteEventListener67);
        org.apache.zeppelin.search.SearchService searchService69 = null;
        note68.setIndex(searchService69);
        org.apache.zeppelin.notebook.NoteInfo noteInfo71 = new org.apache.zeppelin.notebook.NoteInfo(note68);
        org.apache.zeppelin.notebook.Paragraph paragraph72 = null;
        note68.onOutputAppend(paragraph72, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph59.setNote(note68);
        org.apache.zeppelin.notebook.Paragraph paragraph78 = paragraph59.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status79 = null;
        paragraph59.setStatusToUserParagraph(status79);
        paragraph59.abort();
        try {
            org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion82 = helium21.suggestApp(paragraph59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult24);
        org.junit.Assert.assertNotNull(list_str25);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(list_map_str_str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(paragraph78);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        try {
            java.lang.String str10 = remoteInterpreter6.getHook("paragraph_1522728565744_-774075707", "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.lang.String str11 = noteInfo10.getName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj12 = noteInfo10.getConfig();
        noteInfo10.setId("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2DD5KD9WH" + "'", str11.equals("2DD5KD9WH"));
        org.junit.Assert.assertNotNull(map_str_obj12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        org.apache.zeppelin.notebook.Notebook notebook15 = heliumApplicationFactory0.getNotebook();
        org.apache.zeppelin.notebook.Notebook notebook16 = null;
        heliumApplicationFactory0.setNotebook(notebook16);
        org.apache.zeppelin.helium.HeliumPackage heliumPackage18 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo30 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager32 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory33 = null;
        org.apache.zeppelin.search.SearchService searchService34 = null;
        org.apache.zeppelin.user.Credentials credentials35 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener36 = null;
        org.apache.zeppelin.notebook.Note note37 = new org.apache.zeppelin.notebook.Note(notebookRepo30, interpreterFactory31, interpreterSettingManager32, jobListenerFactory33, searchService34, credentials35, noteEventListener36);
        org.apache.zeppelin.search.SearchService searchService38 = null;
        note37.setIndex(searchService38);
        org.apache.zeppelin.notebook.NoteInfo noteInfo40 = new org.apache.zeppelin.notebook.NoteInfo(note37);
        boolean b42 = note37.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo43 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory44 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager45 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory46 = null;
        org.apache.zeppelin.search.SearchService searchService47 = null;
        org.apache.zeppelin.user.Credentials credentials48 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener49 = null;
        org.apache.zeppelin.notebook.Note note50 = new org.apache.zeppelin.notebook.Note(notebookRepo43, interpreterFactory44, interpreterSettingManager45, jobListenerFactory46, searchService47, credentials48, noteEventListener49);
        org.apache.zeppelin.search.SearchService searchService51 = null;
        note50.setIndex(searchService51);
        org.apache.zeppelin.notebook.NoteInfo noteInfo53 = new org.apache.zeppelin.notebook.NoteInfo(note50);
        org.apache.zeppelin.notebook.Paragraph paragraph54 = null;
        note50.onOutputAppend(paragraph54, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str58 = note50.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory59 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph60 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note37, (org.apache.zeppelin.scheduler.JobListener) note50, interpreterFactory59);
        java.lang.String str61 = paragraph60.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo62 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager64 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory65 = null;
        org.apache.zeppelin.search.SearchService searchService66 = null;
        org.apache.zeppelin.user.Credentials credentials67 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener68 = null;
        org.apache.zeppelin.notebook.Note note69 = new org.apache.zeppelin.notebook.Note(notebookRepo62, interpreterFactory63, interpreterSettingManager64, jobListenerFactory65, searchService66, credentials67, noteEventListener68);
        org.apache.zeppelin.search.SearchService searchService70 = null;
        note69.setIndex(searchService70);
        org.apache.zeppelin.notebook.NoteInfo noteInfo72 = new org.apache.zeppelin.notebook.NoteInfo(note69);
        org.apache.zeppelin.notebook.Paragraph paragraph73 = null;
        note69.onOutputAppend(paragraph73, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph60.setNote(note69);
        org.apache.zeppelin.notebook.Paragraph paragraph79 = paragraph60.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status80 = null;
        paragraph60.setStatusToUserParagraph(status80);
        paragraph60.abort();
        note26.onProgressUpdate((org.apache.zeppelin.scheduler.Job) paragraph60, (-1));
        try {
            java.lang.String str85 = heliumApplicationFactory0.loadAndRun(heliumPackage18, paragraph60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertNull(notebook15);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(list_map_str_str58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(paragraph79);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        try {
            boolean b52 = paragraph50.isValidInterpreter("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.getInstance();
        org.junit.Assert.assertNull(zeppelinClient0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage("2D9FT8S92");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"2D9FT8S92\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"2D9FT8S92\"},\"meta\":{}}"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.DefaultInterpreterProperty> map_str_defaultInterpreterProperty3 = null;
        org.apache.zeppelin.interpreter.Interpreter.register("2D9GSEHN5", "2DAA2V7VE", "2D9FT8S92", map_str_defaultInterpreterProperty3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            remoteInterpreter9.registerHook("2DC3C95JX", "{\"op\":\"DEAD\",\"data\":{\"token\":\"2D9FT8S92\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.lang.String str12 = noteInfo11.getId();
        org.junit.Assert.assertNotNull(list_paragraph10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "2DBEWRJDH" + "'", str12.equals("2DBEWRJDH"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo4 = new org.apache.zeppelin.interpreter.InterpreterInfo("X-Zeppelin-Token", "hi!", true, map_str_obj3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance5 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        boolean b6 = interpreterInfo4.equals((java.lang.Object) instance5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo9 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory10 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager11 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory12 = null;
        org.apache.zeppelin.search.SearchService searchService13 = null;
        org.apache.zeppelin.user.Credentials credentials14 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener15 = null;
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note(notebookRepo9, interpreterFactory10, interpreterSettingManager11, jobListenerFactory12, searchService13, credentials14, noteEventListener15);
        org.apache.zeppelin.search.SearchService searchService17 = null;
        note16.setIndex(searchService17);
        org.apache.zeppelin.notebook.NoteInfo noteInfo19 = new org.apache.zeppelin.notebook.NoteInfo(note16);
        org.apache.zeppelin.notebook.Note note21 = note16.getUserNote("2DB1PDJAN");
        heliumApplicationFactory8.onNoteCreate(note16);
        org.apache.zeppelin.notebook.Notebook notebook23 = heliumApplicationFactory8.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
        org.apache.zeppelin.helium.Helium helium25 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file6, heliumBundleFactory7, heliumApplicationFactory8, interpreterSettingManager24);
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.helium.Helium helium27 = new org.apache.zeppelin.helium.Helium("{\"op\":\"LIST_NOTES\",\"meta\":{}}", "2D9FT8S92", file2, heliumBundleFactory3, heliumApplicationFactory8, interpreterSettingManager26);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo28 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory29 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager30 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory31 = null;
        org.apache.zeppelin.search.SearchService searchService32 = null;
        org.apache.zeppelin.user.Credentials credentials33 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener34 = null;
        org.apache.zeppelin.notebook.Note note35 = new org.apache.zeppelin.notebook.Note(notebookRepo28, interpreterFactory29, interpreterSettingManager30, jobListenerFactory31, searchService32, credentials33, noteEventListener34);
        org.apache.zeppelin.search.SearchService searchService36 = null;
        note35.setIndex(searchService36);
        org.apache.zeppelin.notebook.NoteInfo noteInfo38 = new org.apache.zeppelin.notebook.NoteInfo(note35);
        org.apache.zeppelin.notebook.Paragraph paragraph39 = null;
        note35.onOutputAppend(paragraph39, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str43 = note35.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note45 = note35.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        boolean b59 = note54.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo60 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory61 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager62 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory63 = null;
        org.apache.zeppelin.search.SearchService searchService64 = null;
        org.apache.zeppelin.user.Credentials credentials65 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener66 = null;
        org.apache.zeppelin.notebook.Note note67 = new org.apache.zeppelin.notebook.Note(notebookRepo60, interpreterFactory61, interpreterSettingManager62, jobListenerFactory63, searchService64, credentials65, noteEventListener66);
        org.apache.zeppelin.search.SearchService searchService68 = null;
        note67.setIndex(searchService68);
        org.apache.zeppelin.notebook.NoteInfo noteInfo70 = new org.apache.zeppelin.notebook.NoteInfo(note67);
        org.apache.zeppelin.notebook.Paragraph paragraph71 = null;
        note67.onOutputAppend(paragraph71, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str75 = note67.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory76 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph77 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note54, (org.apache.zeppelin.scheduler.JobListener) note67, interpreterFactory76);
        java.lang.String str78 = paragraph77.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo79 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory80 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager81 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory82 = null;
        org.apache.zeppelin.search.SearchService searchService83 = null;
        org.apache.zeppelin.user.Credentials credentials84 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener85 = null;
        org.apache.zeppelin.notebook.Note note86 = new org.apache.zeppelin.notebook.Note(notebookRepo79, interpreterFactory80, interpreterSettingManager81, jobListenerFactory82, searchService83, credentials84, noteEventListener85);
        org.apache.zeppelin.search.SearchService searchService87 = null;
        note86.setIndex(searchService87);
        org.apache.zeppelin.notebook.NoteInfo noteInfo89 = new org.apache.zeppelin.notebook.NoteInfo(note86);
        org.apache.zeppelin.notebook.Paragraph paragraph90 = null;
        note86.onOutputAppend(paragraph90, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph77.setNote(note86);
        note45.addParagraph(paragraph77);
        heliumApplicationFactory8.onNoteRemove(note45);
        try {
            java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion97 = note45.getInterpreterCompletion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note21);
        org.junit.Assert.assertNull(notebook23);
        org.junit.Assert.assertNotNull(list_map_str_str43);
        org.junit.Assert.assertNotNull(note45);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(list_map_str_str75);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj2 = null;
        org.apache.zeppelin.notebook.NoteInfo noteInfo3 = new org.apache.zeppelin.notebook.NoteInfo("79d33c9f-2b95-4ada-a917-c9915707b781", "2DC3C95JX", map_str_obj2);
        java.lang.String str4 = noteInfo3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2DC3C95JX" + "'", str4.equals("2DC3C95JX"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        java.lang.String str3 = message0.ticket;
        java.lang.String str4 = message0.principal;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}" + "'", str3.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        org.apache.zeppelin.notebook.Paragraph paragraph86 = paragraph83.cloneParagraphForUser("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
        paragraph83.abort();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertNotNull(paragraph86);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.zeppelin.helium.WebpackResult webpackResult1 = org.apache.zeppelin.helium.WebpackResult.fromJson("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}");
        java.lang.String str2 = webpackResult1.toJson();
        org.junit.Assert.assertNotNull(webpackResult1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{\"errors\":[],\"warnings\":[]}" + "'", str2.equals("{\"errors\":[],\"warnings\":[]}"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.user.Credentials credentials8 = null;
        note7.setCredentials(credentials8);
        note7.setName("anonymous");
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph15 = note7.removeParagraph("", "2DA4J6V3U");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        java.util.List<org.apache.zeppelin.notebook.ApplicationState> list_applicationState33 = paragraph31.getAllApplicationStates();
        java.lang.Object obj34 = paragraph31.getReturn();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(list_applicationState33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("paragraph_1522728564700_1613699057", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}", (-1), "2DA4WJ5SN");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        folder1.setParent(folder3);
        folder3.removeChild("2DD4S11WG");
        folder3.notifyRenamed("2D9J8Q3RX");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinHubOp("{}");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo4 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj3);
        java.lang.String str5 = interpreterInfo4.getClassName();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array13 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str14, str_array13);
        notebookAuthorization6.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str14);
        java.util.Set<java.lang.String> set_str18 = notebookAuthorization6.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization19 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array24 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str25, str_array24);
        boolean b28 = notebookAuthorization19.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str25, "2DAY1AANY");
        java.lang.String[] str_array39 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str40, str_array39);
        boolean b42 = notebookAuthorization19.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str40);
        boolean b44 = notebookAuthorization6.isOwner((java.util.Set<java.lang.String>) linkedhashset_str40, "2DB1PDJAN");
        boolean b45 = interpreterInfo4.equals((java.lang.Object) b44);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2DB1PDJAN" + "'", str5.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(notebookAuthorization6);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set_str18);
        org.junit.Assert.assertNotNull(notebookAuthorization19);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(str_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
        org.eclipse.jetty.websocket.api.Session session1 = null;
        watcherWebsocket0.connection = session1;
        org.eclipse.jetty.websocket.api.Session session3 = null;
        try {
            watcherWebsocket0.onWebSocketConnect(session3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(watcherWebsocket0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.zeppelin.notebook.utility.IdHashes idHashes0 = new org.apache.zeppelin.notebook.utility.IdHashes();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient.ZEPPELIN_TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings2 = builder1.build();
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder4 = builder1.className("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings5 = builder4.build();
        org.junit.Assert.assertNotNull(notebookRepoWithSettings2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(notebookRepoWithSettings5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage("paragraph_1522728573745_131242772");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"paragraph_1522728573745_131242772\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"paragraph_1522728573745_131242772\"},\"meta\":{}}"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.lang.String[] str_array20 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        boolean b23 = notebookAuthorization0.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str21);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization25 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array32 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str33, str_array32);
        notebookAuthorization25.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str33);
        java.util.Set<java.lang.String> set_str37 = notebookAuthorization25.getRoles("2DAY1AANY");
        java.lang.String[] str_array52 = new java.lang.String[] { "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "2D9FT8S92", " ", "hi!", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "/", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str53, str_array52);
        boolean b56 = notebookAuthorization25.hasWriteAuthorization((java.util.Set<java.lang.String>) linkedhashset_str53, "anonymous");
        notebookAuthorization0.setRoles("2DBKZC971", (java.util.Set<java.lang.String>) linkedhashset_str53);
        java.util.Set<java.lang.String> set_str59 = notebookAuthorization0.getRunners("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization25);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set_str37);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set_str59);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
        com.google.gson.JsonElement jsonElement1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext3 = null;
        try {
            org.apache.zeppelin.helium.HeliumRegistry heliumRegistry4 = heliumRegistrySerializer0.deserialize(jsonElement1, type2, jsonDeserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        try {
            org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving1 = org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving.fromJson("2DA4WJ5SN");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("");
        java.lang.Object obj2 = zeppelinhubMessage1.data;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        boolean b15 = note10.isLastParagraph("2DB1PDJAN");
        boolean b16 = note10.isPersonalizedMode();
        zeppelinhubMessage1.data = b16;
        java.lang.Object obj18 = zeppelinhubMessage1.data;
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = zeppelinhubMessage1.meta;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + "hi!" + "'", obj2.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(map_str_str19);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
        java.lang.String str2 = ticketContainer0.getTicket("2D9FT8S92");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f59d65ec-3608-45a4-819c-81b5803f77eb" + "'", str2.equals("f59d65ec-3608-45a4-819c-81b5803f77eb"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph1 = org.apache.zeppelin.notebook.Paragraph.fromJson("2DAREQVAC");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str11 = note7.generateParagraphsInfo();
        org.junit.Assert.assertNotNull(list_paragraph10);
        org.junit.Assert.assertNotNull(list_map_str_str11);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency4, dependency_array3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder2.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency4);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dependency_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo1 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        boolean b12 = note7.isLastParagraph("2DB1PDJAN");
        boolean b14 = note7.isLastParagraph("X-Zeppelin-Token");
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion12 = remoteInterpreter6.completion("2DA4J6V3U", (int) (byte) 0, interpreterContext11);
        try {
            remoteInterpreter6.unregisterHook("2DAY1AANY", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(list_interpreterCompletion12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        try {
            boolean b24 = helium21.enable("", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        instance0.id = (short) 10;
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.Properties properties6 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager11 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter12 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties6, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager11);
        java.net.URL[] uRL_array13 = new java.net.URL[] {};
        remoteInterpreter12.setClassloaderUrls(uRL_array13);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener15 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler17 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService4, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter12, schedulerListener15, (int) (short) 0);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener18 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler20 = new org.apache.zeppelin.scheduler.RemoteScheduler("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", executorService1, "2DAY1AANY", remoteInterpreter12, schedulerListener18, 0);
        try {
            java.lang.String str22 = remoteInterpreter12.getHook("2D9GSEHN5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool4 = remoteInterpreterRunningProcess3.getInterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener5 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory6 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo7 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory8 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager9 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory10 = null;
        org.apache.zeppelin.search.SearchService searchService11 = null;
        org.apache.zeppelin.user.Credentials credentials12 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener13 = null;
        org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note(notebookRepo7, interpreterFactory8, interpreterSettingManager9, jobListenerFactory10, searchService11, credentials12, noteEventListener13);
        org.apache.zeppelin.search.SearchService searchService15 = null;
        note14.setIndex(searchService15);
        org.apache.zeppelin.notebook.NoteInfo noteInfo17 = new org.apache.zeppelin.notebook.NoteInfo(note14);
        org.apache.zeppelin.notebook.Note note19 = note14.getUserNote("2DB1PDJAN");
        heliumApplicationFactory6.onNoteCreate(note14);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller21 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener5, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory6);
        remoteInterpreterRunningProcess3.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller21);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess26 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        java.lang.String str27 = remoteInterpreterRunningProcess26.getHost();
        java.lang.String str28 = remoteInterpreterRunningProcess26.getHost();
        remoteInterpreterEventPoller21.setInterpreterProcess((org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess) remoteInterpreterRunningProcess26);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup30 = null;
        remoteInterpreterEventPoller21.setInterpreterGroup(managedInterpreterGroup30);
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool4);
        org.junit.Assert.assertNotNull(note19);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion12 = remoteInterpreter6.completion("2DA4J6V3U", (int) (byte) 0, interpreterContext11);
        try {
            org.apache.zeppelin.interpreter.Interpreter.FormType formType13 = remoteInterpreter6.getFormType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(list_interpreterCompletion12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool4 = remoteInterpreterRunningProcess3.getInterpreterContextRunnerPool();
        try {
            interpreterContextRunnerPool4.run("2DAA2V7VE", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        try {
            org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client8 = remoteInterpreterManagedProcess7.getClient();
            org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
        } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.io.File file0 = null;
        java.io.File file1 = null;
        try {
            org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter3 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file0, file1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("");
        java.lang.Object obj2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) zeppelinhubMessage1, obj2, map_str_str3);
        java.lang.String str5 = zeppelinhubMessage1.toJson();
        java.lang.String str6 = zeppelinhubMessage1.toJson();
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(zeppelinhubMessage4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}" + "'", str5.equals("{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}" + "'", str6.equals("{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        note7.setName("/");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str13 = note7.generateParagraphsInfo();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str14 = note7.generateParagraphsInfo();
        org.junit.Assert.assertNotNull(list_map_str_str13);
        org.junit.Assert.assertNotNull(list_map_str_str14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder12.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener15);
        remoteInterpreterManagedProcess7.updateRemoteAngularObject("2DCC5KEUY", " ", "2DC3C95JX", (java.lang.Object) remoteInterpreterProcessListener15);
        java.lang.String str18 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        remoteInterpreterManagedProcess7.onProcessComplete(0);
        int i21 = remoteInterpreterManagedProcess7.getPort();
        try {
            remoteInterpreterManagedProcess7.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "anonymous" + "'", str18.equals("anonymous"));
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        int i71 = paragraph49.calculateCursorPosition("2DCC5KEUY", "/", (int) 'a');
        boolean b72 = paragraph49.isEnabled();
        org.apache.zeppelin.notebook.Note note74 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo75 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory76 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager77 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory78 = null;
        org.apache.zeppelin.search.SearchService searchService79 = null;
        org.apache.zeppelin.user.Credentials credentials80 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener81 = null;
        org.apache.zeppelin.notebook.Note note82 = new org.apache.zeppelin.notebook.Note(notebookRepo75, interpreterFactory76, interpreterSettingManager77, jobListenerFactory78, searchService79, credentials80, noteEventListener81);
        org.apache.zeppelin.search.SearchService searchService83 = null;
        note82.setIndex(searchService83);
        org.apache.zeppelin.notebook.NoteInfo noteInfo85 = new org.apache.zeppelin.notebook.NoteInfo(note82);
        org.apache.zeppelin.notebook.Paragraph paragraph86 = null;
        note82.onOutputAppend(paragraph86, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note82.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note93 = note82.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory94 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph95 = new org.apache.zeppelin.notebook.Paragraph("2DC3C95JX", note74, (org.apache.zeppelin.scheduler.JobListener) note93, interpreterFactory94);
        paragraph49.addUser(paragraph95, "f59d65ec-3608-45a4-819c-81b5803f77eb");
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue(i71 == 97);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(note93);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.Long long0 = org.apache.zeppelin.interpreter.remote.AppendOutputRunner.BUFFER_TIME_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 100L + "'", long0.equals(100L));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting14 = null;
        heliumApplicationFactory0.onUnbindInterpreter(note13, interpreterSetting14);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type20 = null;
        heliumApplicationFactory0.onOutputUpdated("2DAY1AANY", "2D9J8Q3RX", 100, "", type20, "X-Zeppelin-Token");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo23 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory24 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager25 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory26 = null;
        org.apache.zeppelin.search.SearchService searchService27 = null;
        org.apache.zeppelin.user.Credentials credentials28 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener29 = null;
        org.apache.zeppelin.notebook.Note note30 = new org.apache.zeppelin.notebook.Note(notebookRepo23, interpreterFactory24, interpreterSettingManager25, jobListenerFactory26, searchService27, credentials28, noteEventListener29);
        org.apache.zeppelin.search.SearchService searchService31 = null;
        note30.setIndex(searchService31);
        org.apache.zeppelin.notebook.NoteInfo noteInfo33 = new org.apache.zeppelin.notebook.NoteInfo(note30);
        note30.setName("/");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo37 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory38 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager39 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory40 = null;
        org.apache.zeppelin.search.SearchService searchService41 = null;
        org.apache.zeppelin.user.Credentials credentials42 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener43 = null;
        org.apache.zeppelin.notebook.Note note44 = new org.apache.zeppelin.notebook.Note(notebookRepo37, interpreterFactory38, interpreterSettingManager39, jobListenerFactory40, searchService41, credentials42, noteEventListener43);
        org.apache.zeppelin.search.SearchService searchService45 = null;
        note44.setIndex(searchService45);
        org.apache.zeppelin.notebook.NoteInfo noteInfo47 = new org.apache.zeppelin.notebook.NoteInfo(note44);
        boolean b49 = note44.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo50 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory51 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager52 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory53 = null;
        org.apache.zeppelin.search.SearchService searchService54 = null;
        org.apache.zeppelin.user.Credentials credentials55 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener56 = null;
        org.apache.zeppelin.notebook.Note note57 = new org.apache.zeppelin.notebook.Note(notebookRepo50, interpreterFactory51, interpreterSettingManager52, jobListenerFactory53, searchService54, credentials55, noteEventListener56);
        org.apache.zeppelin.search.SearchService searchService58 = null;
        note57.setIndex(searchService58);
        org.apache.zeppelin.notebook.NoteInfo noteInfo60 = new org.apache.zeppelin.notebook.NoteInfo(note57);
        org.apache.zeppelin.notebook.Paragraph paragraph61 = null;
        note57.onOutputAppend(paragraph61, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str65 = note57.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory66 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph67 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note44, (org.apache.zeppelin.scheduler.JobListener) note57, interpreterFactory66);
        java.lang.String str68 = paragraph67.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo69 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory70 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager71 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory72 = null;
        org.apache.zeppelin.search.SearchService searchService73 = null;
        org.apache.zeppelin.user.Credentials credentials74 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener75 = null;
        org.apache.zeppelin.notebook.Note note76 = new org.apache.zeppelin.notebook.Note(notebookRepo69, interpreterFactory70, interpreterSettingManager71, jobListenerFactory72, searchService73, credentials74, noteEventListener75);
        org.apache.zeppelin.search.SearchService searchService77 = null;
        note76.setIndex(searchService77);
        org.apache.zeppelin.notebook.NoteInfo noteInfo79 = new org.apache.zeppelin.notebook.NoteInfo(note76);
        org.apache.zeppelin.notebook.Paragraph paragraph80 = null;
        note76.onOutputAppend(paragraph80, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph67.setNote(note76);
        org.apache.zeppelin.notebook.Paragraph paragraph86 = paragraph67.getUserParagraph("/");
        java.lang.String str87 = paragraph86.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager88 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory89 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager88);
        paragraph86.setInterpreterFactory(interpreterFactory89);
        note30.setInterpreterFactory(interpreterFactory89);
        org.apache.zeppelin.notebook.Paragraph paragraph94 = note30.clearPersonalizedParagraphOutput("paragraph_1522728575982_-102412835", "2DA4WJ5SN");
        heliumApplicationFactory0.onNoteRemove(note30);
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(list_map_str_str65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(paragraph86);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "X-Watcher-Key" + "'", str87.equals("X-Watcher-Key"));
        org.junit.Assert.assertNull(paragraph94);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setOption(interpreterOption3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.Properties properties8 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager13 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration12);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter14 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties8, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager13);
        java.net.URL[] uRL_array15 = new java.net.URL[] {};
        remoteInterpreter14.setClassloaderUrls(uRL_array15);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener17 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler19 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService6, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter14, schedulerListener17, (int) (short) 0);
        org.apache.zeppelin.scheduler.Job job21 = remoteScheduler19.removeFromWaitingQueue("X-Zeppelin-Token");
        remoteScheduler19.stop();
        java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job23 = remoteScheduler19.getJobsWaiting();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder24 = builder2.setProperties((java.lang.Object) collection_job23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(uRL_array15);
        org.junit.Assert.assertNull(job21);
        org.junit.Assert.assertNotNull(collection_job23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        org.apache.zeppelin.notebook.Notebook notebook15 = heliumApplicationFactory0.getNotebook();
        org.apache.zeppelin.notebook.Note note17 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo18 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory19 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory21 = null;
        org.apache.zeppelin.search.SearchService searchService22 = null;
        org.apache.zeppelin.user.Credentials credentials23 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener24 = null;
        org.apache.zeppelin.notebook.Note note25 = new org.apache.zeppelin.notebook.Note(notebookRepo18, interpreterFactory19, interpreterSettingManager20, jobListenerFactory21, searchService22, credentials23, noteEventListener24);
        org.apache.zeppelin.search.SearchService searchService26 = null;
        note25.setIndex(searchService26);
        org.apache.zeppelin.notebook.NoteInfo noteInfo28 = new org.apache.zeppelin.notebook.NoteInfo(note25);
        org.apache.zeppelin.notebook.Paragraph paragraph29 = null;
        note25.onOutputAppend(paragraph29, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note25.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note36 = note25.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory37 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph38 = new org.apache.zeppelin.notebook.Paragraph("2DC3C95JX", note17, (org.apache.zeppelin.scheduler.JobListener) note36, interpreterFactory37);
        heliumApplicationFactory0.onNoteRemove(note36);
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertNull(notebook15);
        org.junit.Assert.assertNotNull(note36);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        org.apache.zeppelin.scheduler.Job job16 = remoteScheduler14.removeFromWaitingQueue("X-Zeppelin-Token");
        remoteScheduler14.stop();
        remoteScheduler14.setMaxConcurrency((int) (short) 1);
        org.junit.Assert.assertNotNull(uRL_array10);
        org.junit.Assert.assertNull(job16);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication2 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("X-Watcher-Key", zeppelinConfiguration1);
        org.junit.Assert.assertNull(authentication2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext8 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterResult interpreterResult9 = remoteInterpreter6.executePrecode(interpreterContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        try {
            org.apache.zeppelin.notebook.socket.Message message1 = org.apache.zeppelin.notebook.socket.Message.fromJson("2DBKZC971");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.display.GUI gUI49 = paragraph31.settings;
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(gUI49);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.getInstance();
        userTokenContainer0.setUserToken("2DAA2V7VE", "79d33c9f-2b95-4ada-a917-c9915707b781");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = userTokenContainer0.getAllUserTokens();
        org.junit.Assert.assertNotNull(userTokenContainer0);
        org.junit.Assert.assertNotNull(map_str_str4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADED));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("{\"errors\":[],\"warnings\":[]}");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        watcherMessage2.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        watcherMessage2.message = "2DA4WJ5SN";
        java.lang.String str7 = watcherMessage2.noteId;
        java.lang.String str8 = watcherMessage2.noteId;
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}" + "'", str7.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}" + "'", str8.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.notebook.Paragraph paragraph14 = note12.clearParagraphOutput("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.SearchService searchService20 = null;
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
        org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
        org.apache.zeppelin.search.SearchService searchService24 = null;
        note23.setIndex(searchService24);
        org.apache.zeppelin.notebook.NoteInfo noteInfo26 = new org.apache.zeppelin.notebook.NoteInfo(note23);
        boolean b28 = note23.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
        org.apache.zeppelin.search.SearchService searchService33 = null;
        org.apache.zeppelin.user.Credentials credentials34 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
        org.apache.zeppelin.search.SearchService searchService37 = null;
        note36.setIndex(searchService37);
        org.apache.zeppelin.notebook.NoteInfo noteInfo39 = new org.apache.zeppelin.notebook.NoteInfo(note36);
        org.apache.zeppelin.notebook.Paragraph paragraph40 = null;
        note36.onOutputAppend(paragraph40, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str44 = note36.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory45 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph46 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note23, (org.apache.zeppelin.scheduler.JobListener) note36, interpreterFactory45);
        java.lang.String str47 = paragraph46.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo48 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory49 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager50 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory51 = null;
        org.apache.zeppelin.search.SearchService searchService52 = null;
        org.apache.zeppelin.user.Credentials credentials53 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener54 = null;
        org.apache.zeppelin.notebook.Note note55 = new org.apache.zeppelin.notebook.Note(notebookRepo48, interpreterFactory49, interpreterSettingManager50, jobListenerFactory51, searchService52, credentials53, noteEventListener54);
        org.apache.zeppelin.search.SearchService searchService56 = null;
        note55.setIndex(searchService56);
        org.apache.zeppelin.notebook.NoteInfo noteInfo58 = new org.apache.zeppelin.notebook.NoteInfo(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph59 = null;
        note55.onOutputAppend(paragraph59, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph46.setNote(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph65 = paragraph46.getUserParagraph("/");
        org.apache.zeppelin.notebook.Note note66 = paragraph65.getNote();
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage68 = null;
        note12.onOutputUpdate(paragraph65, (int) (short) -1, interpreterResultMessage68);
        paragraph65.clearUserParagraphs();
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNull(paragraph14);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_map_str_str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(paragraph65);
        org.junit.Assert.assertNotNull(note66);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener2 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, interpreterOption1, angularObjectRegistryListener2, remoteInterpreterProcessListener3, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = message3.getType("");
        java.lang.String str6 = message3.toJson();
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
        message3.op = oP7;
        message3.principal = "hi!";
        message3.principal = "";
        java.lang.Object obj14 = message3.get("{}");
        org.apache.zeppelin.display.AngularObject angularObject16 = message3.getType("2DAREQVAC");
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str6.equals("{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(angularObject16);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo1 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        try {
            org.apache.zeppelin.interpreter.Interpreter interpreter53 = paragraph52.getBindedInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter registeredInterpreter1 = org.apache.zeppelin.interpreter.Interpreter.findRegisteredInterpreterByClassName("2DBEWRJDH");
        org.junit.Assert.assertNull(registeredInterpreter1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        try {
            note7.moveParagraph("UNKNOWN", 5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        try {
            org.apache.zeppelin.helium.WebpackResult webpackResult1 = org.apache.zeppelin.helium.WebpackResult.fromJson("2D9JQHJ4G");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        remoteInterpreter6.close();
        try {
            org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess9 = remoteInterpreter6.getOrCreateInterpreterProcess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        try {
            java.lang.String str16 = remoteInterpreter9.getHook("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}", "2DCC5KEUY");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        note7.clearParagraphOutputFields(paragraph49);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo53 = null;
        note7.persist(100, authenticationInfo53);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory55 = null;
        note7.setInterpreterFactory(interpreterFactory55);
        boolean b58 = note7.isLastParagraph("2DC68ZDPV");
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = org.apache.zeppelin.interpreter.InterpreterInfoSaving.fromJson("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
        org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array2 = new org.sonatype.aether.repository.RemoteRepository[] {};
        java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository3 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>) arraylist_remoteRepository3, remoteRepository_array2);
        interpreterInfoSaving1.interpreterRepositories = arraylist_remoteRepository3;
        org.junit.Assert.assertNotNull(interpreterInfoSaving1);
        org.junit.Assert.assertNotNull(remoteRepository_array2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = message3.getType("");
        java.lang.String str6 = message3.principal;
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT;
        message3.op = oP7;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP6 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message7 = message4.put("2DAY1AANY", (java.lang.Object) oP6);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj8 = message4.data;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo9 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory10 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager11 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory12 = null;
        org.apache.zeppelin.search.SearchService searchService13 = null;
        org.apache.zeppelin.user.Credentials credentials14 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener15 = null;
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note(notebookRepo9, interpreterFactory10, interpreterSettingManager11, jobListenerFactory12, searchService13, credentials14, noteEventListener15);
        org.apache.zeppelin.search.SearchService searchService17 = null;
        note16.setIndex(searchService17);
        org.apache.zeppelin.notebook.NoteInfo noteInfo19 = new org.apache.zeppelin.notebook.NoteInfo(note16);
        java.lang.String str20 = noteInfo19.getId();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj21 = noteInfo19.getConfig();
        message4.data = map_str_obj21;
        message3.data = map_str_obj21;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + oP6 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP6.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertNotNull(map_str_obj8);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "2D9N8WKST" + "'", str20.equals("2D9N8WKST"));
        org.junit.Assert.assertNotNull(map_str_obj21);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion12 = remoteInterpreter6.completion("2DA4J6V3U", (int) (byte) 0, interpreterContext11);
        try {
            remoteInterpreter6.registerHook("2D9JQHJ4G", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(list_interpreterCompletion12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setId("2DB1PDJAN");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo4 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory5 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory7 = null;
        org.apache.zeppelin.search.SearchService searchService8 = null;
        org.apache.zeppelin.user.Credentials credentials9 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener10 = null;
        org.apache.zeppelin.notebook.Note note11 = new org.apache.zeppelin.notebook.Note(notebookRepo4, interpreterFactory5, interpreterSettingManager6, jobListenerFactory7, searchService8, credentials9, noteEventListener10);
        org.apache.zeppelin.search.SearchService searchService12 = null;
        note11.setIndex(searchService12);
        org.apache.zeppelin.notebook.NoteInfo noteInfo14 = new org.apache.zeppelin.notebook.NoteInfo(note11);
        org.apache.zeppelin.notebook.Note note16 = note11.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = null;
        heliumApplicationFactory3.onUnbindInterpreter(note16, interpreterSetting17);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder19 = builder0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder21 = builder0.setId("2DAREQVAC");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(note16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        try {
            org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage1 = org.apache.zeppelin.notebook.socket.WatcherMessage.fromJson("/");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.util.Properties properties7 = null;
        remoteInterpreter6.setProperties(properties7);
        try {
            remoteInterpreter6.open();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.socket.Message.OP oP4 = message0.op;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertTrue("'" + oP4 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT + "'", oP4.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
        try {
            watcherWebsocket0.onWebSocketText("2DC3C95JX");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(watcherWebsocket0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.version;
        npmPackage0.version = "2DB1PDJAN";
        java.lang.String str4 = npmPackage0.name;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        java.util.Map<java.lang.String, java.lang.String> map_str_str17 = note12.generateSingleParagraphInfo("2DB1PDJAN");
        npmPackage0.dependencies = map_str_str17;
        npmPackage0.name = "anonymous";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map_str_str17);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        zeppelinhubRestApiHandler1.close();
        try {
            zeppelinhubRestApiHandler1.put("2DCC5KEUY", "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo23 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory24 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager25 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory26 = null;
        org.apache.zeppelin.search.SearchService searchService27 = null;
        org.apache.zeppelin.user.Credentials credentials28 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener29 = null;
        org.apache.zeppelin.notebook.Note note30 = new org.apache.zeppelin.notebook.Note(notebookRepo23, interpreterFactory24, interpreterSettingManager25, jobListenerFactory26, searchService27, credentials28, noteEventListener29);
        org.apache.zeppelin.search.SearchService searchService31 = null;
        note30.setIndex(searchService31);
        org.apache.zeppelin.notebook.NoteInfo noteInfo33 = new org.apache.zeppelin.notebook.NoteInfo(note30);
        boolean b35 = note30.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo36 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory37 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager38 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory39 = null;
        org.apache.zeppelin.search.SearchService searchService40 = null;
        org.apache.zeppelin.user.Credentials credentials41 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener42 = null;
        org.apache.zeppelin.notebook.Note note43 = new org.apache.zeppelin.notebook.Note(notebookRepo36, interpreterFactory37, interpreterSettingManager38, jobListenerFactory39, searchService40, credentials41, noteEventListener42);
        org.apache.zeppelin.search.SearchService searchService44 = null;
        note43.setIndex(searchService44);
        org.apache.zeppelin.notebook.NoteInfo noteInfo46 = new org.apache.zeppelin.notebook.NoteInfo(note43);
        org.apache.zeppelin.notebook.Paragraph paragraph47 = null;
        note43.onOutputAppend(paragraph47, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str51 = note43.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph53 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note30, (org.apache.zeppelin.scheduler.JobListener) note43, interpreterFactory52);
        java.lang.String str54 = paragraph53.getText();
        heliumApplicationFactory4.unload(paragraph53, "");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo57 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory58 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager59 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory60 = null;
        org.apache.zeppelin.search.SearchService searchService61 = null;
        org.apache.zeppelin.user.Credentials credentials62 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener63 = null;
        org.apache.zeppelin.notebook.Note note64 = new org.apache.zeppelin.notebook.Note(notebookRepo57, interpreterFactory58, interpreterSettingManager59, jobListenerFactory60, searchService61, credentials62, noteEventListener63);
        org.apache.zeppelin.search.SearchService searchService65 = null;
        note64.setIndex(searchService65);
        org.apache.zeppelin.notebook.NoteInfo noteInfo67 = new org.apache.zeppelin.notebook.NoteInfo(note64);
        org.apache.zeppelin.notebook.Paragraph paragraph68 = null;
        note64.onOutputAppend(paragraph68, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note64.setName("X-Watcher-Key");
        org.apache.zeppelin.notebook.Paragraph paragraph75 = note64.clearParagraphOutput("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
        java.lang.String str76 = note64.getName();
        heliumApplicationFactory4.onNoteRemove(note64);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(list_map_str_str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(paragraph75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "X-Watcher-Key" + "'", str76.equals("X-Watcher-Key"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.util.Set<java.lang.String> set_str11 = notebookAuthorization0.getOwners("X-Zeppelin-Token");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization13 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array20 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        notebookAuthorization13.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = notebookAuthorization13.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization26 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array31 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str32, str_array31);
        boolean b35 = notebookAuthorization26.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str32, "2DAY1AANY");
        java.lang.String[] str_array46 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str47, str_array46);
        boolean b49 = notebookAuthorization26.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str47);
        boolean b51 = notebookAuthorization13.isOwner((java.util.Set<java.lang.String>) linkedhashset_str47, "2DB1PDJAN");
        boolean b52 = notebookAuthorization0.isReader("/", (java.util.Set<java.lang.String>) linkedhashset_str47);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization54 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization56 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array63 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str64, str_array63);
        notebookAuthorization56.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str64);
        java.util.Set<java.lang.String> set_str68 = notebookAuthorization56.getRoles("2DAY1AANY");
        java.lang.String[] str_array83 = new java.lang.String[] { "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "2D9FT8S92", " ", "hi!", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "/", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str84, str_array83);
        boolean b87 = notebookAuthorization56.hasWriteAuthorization((java.util.Set<java.lang.String>) linkedhashset_str84, "anonymous");
        notebookAuthorization54.setRunners("paragraph_1522728564700_1613699057", (java.util.Set<java.lang.String>) linkedhashset_str84);
        boolean b89 = notebookAuthorization0.isRunner("2DAA2V7VE", (java.util.Set<java.lang.String>) linkedhashset_str84);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set_str11);
        org.junit.Assert.assertNotNull(notebookAuthorization13);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
        org.junit.Assert.assertNotNull(notebookAuthorization26);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization54);
        org.junit.Assert.assertNotNull(notebookAuthorization56);
        org.junit.Assert.assertNotNull(str_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set_str68);
        org.junit.Assert.assertNotNull(str_array83);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b89 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = remoteInterpreterManagedProcess7.getEnv();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertNull(map_str_str9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        try {
            java.lang.String str5 = zeppelinhubRestApiHandler1.putWithResponseBody("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", "2DA4J6V3U", "2D9FT8S92");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        int i16 = note7.getParagraphCount();
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener2 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener3 = null;
        org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener4 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, interpreterOption1, angularObjectRegistryListener2, remoteInterpreterProcessListener3, applicationEventListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
        boolean b3 = ticketContainer0.isValid("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "hi!");
        java.lang.String str5 = ticketContainer0.getTicket("X-Watcher-Key");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7bbc97d2-4425-40e7-ad10-9859c853f903" + "'", str5.equals("7bbc97d2-4425-40e7-ad10-9859c853f903"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup2 = null;
        org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry3 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("2DD4S11WG", angularObjectRegistryListener1, managedInterpreterGroup2);
        org.apache.zeppelin.display.AngularObject angularObject8 = remoteAngularObjectRegistry3.add("2DC58V2PC", (java.lang.Object) 1.0d, "2D9J8Q3RX", "{\"errors\":[],\"warnings\":[]}");
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.Properties properties13 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration17 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager18 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration17);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter19 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties13, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager18);
        java.net.URL[] uRL_array20 = new java.net.URL[] {};
        remoteInterpreter19.setClassloaderUrls(uRL_array20);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener22 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler24 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService11, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter19, schedulerListener22, (int) (short) 0);
        org.apache.zeppelin.scheduler.Job job26 = remoteScheduler24.removeFromWaitingQueue("X-Zeppelin-Token");
        remoteScheduler24.stop();
        java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job28 = remoteScheduler24.getJobsWaiting();
        try {
            org.apache.zeppelin.display.AngularObject angularObject31 = remoteAngularObjectRegistry3.addAndNotifyRemoteProcess("2DAXG9ZYE", (java.lang.Object) collection_job28, "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}", "{\"op\":\"LIST_NOTES\",\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(angularObject8);
        org.junit.Assert.assertNotNull(uRL_array20);
        org.junit.Assert.assertNull(job26);
        org.junit.Assert.assertNotNull(collection_job28);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getHost();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "localhost" + "'", str8.equals("localhost"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult68 = paragraph49.getResult();
        boolean b69 = paragraph49.isBlankParagraph();
        int i70 = paragraph49.progress();
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        try {
            java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion15 = note8.getInterpreterCompletion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer2 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler0, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.lang.String> list_str3 = userTokenContainer2.getAllTokens();
        java.lang.String str5 = userTokenContainer2.getUserToken("{\"errors\":[],\"warnings\":[]}");
        java.lang.String str7 = userTokenContainer2.getExistingUserToken("localhost");
        org.junit.Assert.assertNotNull(userTokenContainer2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str5.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (short) -1, "f59d65ec-3608-45a4-819c-81b5803f77eb", 67108864);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        try {
            org.apache.zeppelin.helium.NpmPackage npmPackage1 = org.apache.zeppelin.helium.NpmPackage.fromJson("2DAXG9ZYE");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup7 = null;
        nullLifecycleManager5.onInterpreterSessionCreated(managedInterpreterGroup7, "2D9FT8S92");
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup10 = null;
        nullLifecycleManager5.onInterpreterGroupCreated(managedInterpreterGroup10);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup12 = null;
        nullLifecycleManager5.onInterpreterUse(managedInterpreterGroup12, "2DB7TE5AP");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance("paragraph_1522728573745_131242772");
        zeppelinhubWebsocket1.onWebSocketText("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener2 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener3 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo9 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory10 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager11 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory12 = null;
        org.apache.zeppelin.search.SearchService searchService13 = null;
        org.apache.zeppelin.user.Credentials credentials14 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener15 = null;
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note(notebookRepo9, interpreterFactory10, interpreterSettingManager11, jobListenerFactory12, searchService13, credentials14, noteEventListener15);
        org.apache.zeppelin.search.SearchService searchService17 = null;
        note16.setIndex(searchService17);
        org.apache.zeppelin.notebook.NoteInfo noteInfo19 = new org.apache.zeppelin.notebook.NoteInfo(note16);
        org.apache.zeppelin.notebook.Note note21 = note16.getUserNote("2DB1PDJAN");
        heliumApplicationFactory8.onNoteCreate(note16);
        org.apache.zeppelin.notebook.Notebook notebook23 = heliumApplicationFactory8.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
        org.apache.zeppelin.helium.Helium helium25 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file6, heliumBundleFactory7, heliumApplicationFactory8, interpreterSettingManager24);
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, interpreterOption1, angularObjectRegistryListener2, remoteInterpreterProcessListener3, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note21);
        org.junit.Assert.assertNull(notebook23);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status51 = null;
        paragraph31.setStatusToUserParagraph(status51);
        paragraph31.abort();
        paragraph31.clearRuntimeInfos();
        try {
            boolean b56 = paragraph31.isValidInterpreter("UNKNOWN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        try {
            org.apache.zeppelin.notebook.socket.Message message1 = org.apache.zeppelin.notebook.socket.Message.fromJson("2DAA2V7VE");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DAY1AANY", "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup7 = null;
        nullLifecycleManager5.onInterpreterUse(managedInterpreterGroup7, "X-Watcher-Key");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        java.lang.String str53 = paragraph50.getId();
        paragraph50.setTitle("hi!");
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "X-Watcher-Key" + "'", str53.equals("X-Watcher-Key"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "anonymous", 1, "");
        java.lang.String str5 = appendOutputBuffer4.getNoteId();
        int i6 = appendOutputBuffer4.getIndex();
        java.lang.String str7 = appendOutputBuffer4.getData();
        java.lang.String str8 = appendOutputBuffer4.getData();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str5.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.io.File file0 = null;
        java.io.File file1 = null;
        try {
            org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter3 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file0, file1, "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("anonymous", executorService1, "2DCC5KEUY", remoteInterpreter9, schedulerListener11, (int) (byte) 0);
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext14 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterResult interpreterResult15 = remoteInterpreter9.executePrecode(interpreterContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("{\"errors\":[],\"warnings\":[]}");
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("{\"noteId\":\"hi!\"}", "", "2DA4WJ5SN", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}", "X-Zeppelin-Token");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph14 = note8.getParagraphs();
        org.apache.zeppelin.notebook.Folder folder15 = folderView0.getFolderOf(note8);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.SearchService searchService20 = null;
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
        org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
        org.apache.zeppelin.search.SearchService searchService24 = null;
        note23.setIndex(searchService24);
        note23.clearAllParagraphOutput();
        folderView0.putNote(note23);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_paragraph14);
        org.junit.Assert.assertNull(folder15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        watcherMessage2.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        java.lang.String str5 = watcherMessage2.noteId;
        java.lang.String str6 = watcherMessage2.subject;
        watcherMessage2.subject = "2DAXG9ZYE";
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}" + "'", str5.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterDir();
        int i9 = remoteInterpreterManagedProcess7.getPort();
        java.lang.String str10 = remoteInterpreterManagedProcess7.getInterpreterRunner();
        java.lang.String str11 = remoteInterpreterManagedProcess7.getInterpreterDir();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "79d33c9f-2b95-4ada-a917-c9915707b781" + "'", str10.equals("79d33c9f-2b95-4ada-a917-c9915707b781"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        int i1 = folderView0.countFolders();
        try {
            boolean b3 = folderView0.hasFolder("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        org.apache.zeppelin.notebook.Paragraph paragraph86 = paragraph83.cloneParagraphForUser("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
        org.apache.zeppelin.notebook.Paragraph paragraph88 = paragraph83.getUserParagraph("f59d65ec-3608-45a4-819c-81b5803f77eb");
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertNotNull(paragraph86);
        org.junit.Assert.assertNotNull(paragraph88);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.search.SearchService searchService16 = null;
        note7.setIndex(searchService16);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph68 = paragraph49.getUserParagraph("/");
        java.lang.String str69 = paragraph68.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager70 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory71 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager70);
        paragraph68.setInterpreterFactory(interpreterFactory71);
        boolean b73 = paragraph68.isTerminated();
        note7.onProgressUpdate((org.apache.zeppelin.scheduler.Job) paragraph68, 97);
        paragraph68.setText("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}");
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(paragraph68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "X-Watcher-Key" + "'", str69.equals("X-Watcher-Key"));
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("X-Zeppelin-Token", executorService1, "{\"errors\":[],\"warnings\":[]}", remoteInterpreter9, schedulerListener11, (int) (byte) -1);
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext16 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion17 = remoteInterpreter9.completion("{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}", 35, interpreterContext16);
        org.junit.Assert.assertNotNull(list_interpreterCompletion17);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
        boolean b3 = ticketContainer0.isValid("paragraph_1522728575982_-102412835", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.lang.String str11 = noteInfo10.getId();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj12 = noteInfo10.getConfig();
        java.lang.String str13 = noteInfo10.getName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = noteInfo10.getConfig();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.EMPTY;
        org.apache.zeppelin.helium.NpmPackage npmPackage16 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str17 = npmPackage16.version;
        npmPackage16.version = "2DB1PDJAN";
        java.lang.String str20 = npmPackage16.name;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo21 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory22 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager23 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory24 = null;
        org.apache.zeppelin.search.SearchService searchService25 = null;
        org.apache.zeppelin.user.Credentials credentials26 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener27 = null;
        org.apache.zeppelin.notebook.Note note28 = new org.apache.zeppelin.notebook.Note(notebookRepo21, interpreterFactory22, interpreterSettingManager23, jobListenerFactory24, searchService25, credentials26, noteEventListener27);
        org.apache.zeppelin.user.Credentials credentials29 = null;
        note28.setCredentials(credentials29);
        note28.setName("anonymous");
        java.util.Map<java.lang.String, java.lang.String> map_str_str34 = note28.generateSingleParagraphInfo("anonymous");
        npmPackage16.dependencies = map_str_str34;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage36 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) map_str_obj14, (java.lang.Object) zeppelinhubMessage15, map_str_str34);
        java.lang.Object obj37 = zeppelinhubMessage15.data;
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2DCHMPRQT" + "'", str11.equals("2DCHMPRQT"));
        org.junit.Assert.assertNotNull(map_str_obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2DCHMPRQT" + "'", str13.equals("2DCHMPRQT"));
        org.junit.Assert.assertNotNull(map_str_obj14);
        org.junit.Assert.assertNotNull(zeppelinhubMessage15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map_str_str34);
        org.junit.Assert.assertNotNull(zeppelinhubMessage36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("2DBZFBPQW", "{}", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message4.principal = "";
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = message4.op;
        try {
            zeppelinClient3.send(message4, "2DAXG9ZYE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        boolean b2 = folder1.isTrash();
        org.apache.zeppelin.notebook.Folder folder3 = folder1.getParent();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(folder3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status51 = null;
        paragraph31.setStatusToUserParagraph(status51);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult53 = null;
        java.lang.Throwable throwable54 = null;
        paragraph31.setReturn(interpreterResult53, throwable54);
        java.lang.String str56 = paragraph31.getText();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("2DB1PDJAN");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Paragraph> map_str_paragraph53 = paragraph52.getUserParagraphMap();
        paragraph52.setText("2DAREQVAC");
        paragraph52.setId("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertNotNull(map_str_paragraph53);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext9 = null;
        remoteInterpreter6.cancel(interpreterContext9);
        boolean b11 = remoteInterpreter6.isOpened();
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.interpreter.launcher.ShellScriptLauncher shellScriptLauncher1 = new org.apache.zeppelin.interpreter.launcher.ShellScriptLauncher(zeppelinConfiguration0);
        org.apache.zeppelin.interpreter.launcher.InterpreterLaunchContext interpreterLaunchContext2 = null;
        try {
            org.apache.zeppelin.interpreter.launcher.InterpreterClient interpreterClient3 = shellScriptLauncher1.launch(interpreterLaunchContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        try {
            zeppelinhubRestApiHandler1.del("2DA4WJ5SN", "f59d65ec-3608-45a4-819c-81b5803f77eb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        java.lang.String str33 = paragraph31.getErrorMessage();
        org.apache.zeppelin.notebook.ApplicationState applicationState35 = paragraph31.getApplicationState("/");
        boolean b37 = paragraph31.execute(true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(applicationState35);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("2D9N8WKST");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult68 = paragraph49.getResult();
        boolean b69 = paragraph49.isBlankParagraph();
        org.apache.zeppelin.helium.HeliumPackage heliumPackage70 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState71 = paragraph49.createOrGetApplicationState(heliumPackage70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setInterpreterRunner(interpreterRunner1);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setName("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj2 = null;
        org.apache.zeppelin.notebook.NoteInfo noteInfo3 = new org.apache.zeppelin.notebook.NoteInfo("", "hi!", map_str_obj2);
        java.lang.String str4 = noteInfo3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        note7.setName("/");
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        note7.persist(0, authenticationInfo15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization3 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array10 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str11, str_array10);
        notebookAuthorization3.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str11);
        java.util.Set<java.lang.String> set_str15 = notebookAuthorization3.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization16 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array21 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str22, str_array21);
        boolean b25 = notebookAuthorization16.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str22, "2DAY1AANY");
        java.lang.String[] str_array36 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str37, str_array36);
        boolean b39 = notebookAuthorization16.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str37);
        boolean b41 = notebookAuthorization3.isOwner((java.util.Set<java.lang.String>) linkedhashset_str37, "2DB1PDJAN");
        notebookAuthorization1.setWriters("2DAA2V7VE", (java.util.Set<java.lang.String>) linkedhashset_str37);
        boolean b43 = notebookAuthorization1.isPublic();
        org.junit.Assert.assertNotNull(notebookAuthorization1);
        org.junit.Assert.assertNotNull(notebookAuthorization3);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set_str15);
        org.junit.Assert.assertNotNull(notebookAuthorization16);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(str_array36);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        zeppelinhubRestApiHandler1.close();
        try {
            zeppelinhubRestApiHandler1.del("2D96F8MSD", "2DCC5KEUY");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion12 = remoteInterpreter6.completion("2DA4J6V3U", (int) (byte) 0, interpreterContext11);
        java.util.Properties properties13 = null;
        remoteInterpreter6.setProperties(properties13);
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(list_interpreterCompletion12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph14 = note8.getParagraphs();
        org.apache.zeppelin.notebook.Folder folder15 = folderView0.getFolderOf(note8);
        boolean b17 = folderView0.hasFolder("{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}");
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_paragraph14);
        org.junit.Assert.assertNull(folder15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DAY1AANY", "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.lang.String str7 = remoteInterpreter6.toString();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "RemoteInterpreter_2DAY1AANY_{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str7.equals("RemoteInterpreter_2DAY1AANY_{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
        org.junit.Assert.assertNull(managedInterpreterGroup8);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
        java.io.File file5 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo8 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory9 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory11 = null;
        org.apache.zeppelin.search.SearchService searchService12 = null;
        org.apache.zeppelin.user.Credentials credentials13 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener14 = null;
        org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note(notebookRepo8, interpreterFactory9, interpreterSettingManager10, jobListenerFactory11, searchService12, credentials13, noteEventListener14);
        org.apache.zeppelin.search.SearchService searchService16 = null;
        note15.setIndex(searchService16);
        org.apache.zeppelin.notebook.NoteInfo noteInfo18 = new org.apache.zeppelin.notebook.NoteInfo(note15);
        org.apache.zeppelin.notebook.Note note20 = note15.getUserNote("2DB1PDJAN");
        heliumApplicationFactory7.onNoteCreate(note15);
        org.apache.zeppelin.notebook.Notebook notebook22 = heliumApplicationFactory7.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager23 = null;
        org.apache.zeppelin.helium.Helium helium24 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file5, heliumBundleFactory6, heliumApplicationFactory7, interpreterSettingManager23);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo25 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory26 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager27 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory28 = null;
        org.apache.zeppelin.search.SearchService searchService29 = null;
        org.apache.zeppelin.user.Credentials credentials30 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener31 = null;
        org.apache.zeppelin.notebook.Note note32 = new org.apache.zeppelin.notebook.Note(notebookRepo25, interpreterFactory26, interpreterSettingManager27, jobListenerFactory28, searchService29, credentials30, noteEventListener31);
        org.apache.zeppelin.search.SearchService searchService33 = null;
        note32.setIndex(searchService33);
        org.apache.zeppelin.notebook.NoteInfo noteInfo35 = new org.apache.zeppelin.notebook.NoteInfo(note32);
        boolean b37 = note32.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph38 = note32.getParagraphs();
        heliumApplicationFactory7.onNoteRemove(note32);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type44 = null;
        heliumApplicationFactory7.onOutputUpdated("/", "2DAA2V7VE", (int) (byte) 100, "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", type44, "{\"errors\":[],\"warnings\":[]}");
        org.apache.zeppelin.notebook.Paragraph paragraph47 = null;
        heliumApplicationFactory7.unload(paragraph47, "2DAREQVAC");
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager50 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNull(notebook22);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(list_paragraph38);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup7 = null;
        nullLifecycleManager5.onInterpreterSessionCreated(managedInterpreterGroup7, "2D9FT8S92");
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup10 = null;
        nullLifecycleManager5.onInterpreterSessionCreated(managedInterpreterGroup10, "2DCHMPRQT");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status51 = null;
        paragraph31.setStatusToUserParagraph(status51);
        paragraph31.abort();
        paragraph31.clearRuntimeInfos();
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.ParagraphRuntimeInfo> map_str_paragraphRuntimeInfo55 = paragraph31.getRuntimeInfos();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNull(map_str_paragraphRuntimeInfo55);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        org.apache.zeppelin.notebook.Notebook notebook15 = heliumApplicationFactory0.getNotebook();
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory20 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo21 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory22 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager23 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory24 = null;
        org.apache.zeppelin.search.SearchService searchService25 = null;
        org.apache.zeppelin.user.Credentials credentials26 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener27 = null;
        org.apache.zeppelin.notebook.Note note28 = new org.apache.zeppelin.notebook.Note(notebookRepo21, interpreterFactory22, interpreterSettingManager23, jobListenerFactory24, searchService25, credentials26, noteEventListener27);
        org.apache.zeppelin.search.SearchService searchService29 = null;
        note28.setIndex(searchService29);
        org.apache.zeppelin.notebook.NoteInfo noteInfo31 = new org.apache.zeppelin.notebook.NoteInfo(note28);
        org.apache.zeppelin.notebook.Note note33 = note28.getUserNote("2DB1PDJAN");
        heliumApplicationFactory20.onNoteCreate(note28);
        org.apache.zeppelin.notebook.Notebook notebook35 = heliumApplicationFactory20.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.helium.Helium helium37 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file18, heliumBundleFactory19, heliumApplicationFactory20, interpreterSettingManager36);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo39 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory40 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager41 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory42 = null;
        org.apache.zeppelin.search.SearchService searchService43 = null;
        org.apache.zeppelin.user.Credentials credentials44 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener45 = null;
        org.apache.zeppelin.notebook.Note note46 = new org.apache.zeppelin.notebook.Note(notebookRepo39, interpreterFactory40, interpreterSettingManager41, jobListenerFactory42, searchService43, credentials44, noteEventListener45);
        org.apache.zeppelin.search.SearchService searchService47 = null;
        note46.setIndex(searchService47);
        org.apache.zeppelin.notebook.NoteInfo noteInfo49 = new org.apache.zeppelin.notebook.NoteInfo(note46);
        boolean b51 = note46.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo52 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory53 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager54 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory55 = null;
        org.apache.zeppelin.search.SearchService searchService56 = null;
        org.apache.zeppelin.user.Credentials credentials57 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener58 = null;
        org.apache.zeppelin.notebook.Note note59 = new org.apache.zeppelin.notebook.Note(notebookRepo52, interpreterFactory53, interpreterSettingManager54, jobListenerFactory55, searchService56, credentials57, noteEventListener58);
        org.apache.zeppelin.search.SearchService searchService60 = null;
        note59.setIndex(searchService60);
        org.apache.zeppelin.notebook.NoteInfo noteInfo62 = new org.apache.zeppelin.notebook.NoteInfo(note59);
        org.apache.zeppelin.notebook.Paragraph paragraph63 = null;
        note59.onOutputAppend(paragraph63, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str67 = note59.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory68 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph69 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note46, (org.apache.zeppelin.scheduler.JobListener) note59, interpreterFactory68);
        java.lang.String str70 = paragraph69.getText();
        heliumApplicationFactory20.unload(paragraph69, "");
        heliumApplicationFactory0.unload(paragraph69, "");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo75 = null;
        try {
            paragraph69.setAuthenticationInfo(authenticationInfo75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertNull(notebook15);
        org.junit.Assert.assertNotNull(note33);
        org.junit.Assert.assertNull(notebook35);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(list_map_str_str67);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup2 = null;
        org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry3 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("2DD4S11WG", angularObjectRegistryListener1, managedInterpreterGroup2);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        boolean b17 = note12.isLastParagraph("2DB1PDJAN");
        boolean b18 = note12.isPersonalizedMode();
        org.apache.zeppelin.display.AngularObject angularObject22 = remoteAngularObjectRegistry3.add("2DA4WJ5SN", (java.lang.Object) b18, "2DCC5KEUY", "2DB1PDJAN", false);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.zeppelin.display.AngularObject>> map_str_map_str_angularObject23 = null;
        try {
            remoteAngularObjectRegistry3.setRegistry(map_str_map_str_angularObject23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(angularObject22);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        folder1.setParent(folder3);
        org.apache.zeppelin.notebook.Folder folder6 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        org.apache.zeppelin.notebook.Folder folder8 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        folder6.setParent(folder8);
        folder8.removeChild("2DD4S11WG");
        folder8.notifyRenamed("anonymous");
        java.lang.String str14 = folder8.getParentFolderId();
        folder1.setParent(folder8);
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Folder> map_str_folder16 = folder8.getChildren();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "/" + "'", str14.equals("/"));
        org.junit.Assert.assertNotNull(map_str_folder16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        note8.setPersonalizedMode((java.lang.Boolean) true);
        org.apache.zeppelin.notebook.NoteInfo noteInfo34 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller4 = remoteInterpreterRunningProcess3.getRemoteInterpreterEventPoller();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess8 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool9 = remoteInterpreterRunningProcess8.getInterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener10 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory11 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo12 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory13 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager14 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory15 = null;
        org.apache.zeppelin.search.SearchService searchService16 = null;
        org.apache.zeppelin.user.Credentials credentials17 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener18 = null;
        org.apache.zeppelin.notebook.Note note19 = new org.apache.zeppelin.notebook.Note(notebookRepo12, interpreterFactory13, interpreterSettingManager14, jobListenerFactory15, searchService16, credentials17, noteEventListener18);
        org.apache.zeppelin.search.SearchService searchService20 = null;
        note19.setIndex(searchService20);
        org.apache.zeppelin.notebook.NoteInfo noteInfo22 = new org.apache.zeppelin.notebook.NoteInfo(note19);
        org.apache.zeppelin.notebook.Note note24 = note19.getUserNote("2DB1PDJAN");
        heliumApplicationFactory11.onNoteCreate(note19);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller26 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener10, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory11);
        remoteInterpreterRunningProcess8.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller26);
        remoteInterpreterRunningProcess3.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller26);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup29 = null;
        remoteInterpreterEventPoller26.setInterpreterGroup(managedInterpreterGroup29);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup31 = null;
        remoteInterpreterEventPoller26.setInterpreterGroup(managedInterpreterGroup31);
        org.junit.Assert.assertNull(remoteInterpreterEventPoller4);
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool9);
        org.junit.Assert.assertNotNull(note24);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("2DBZFBPQW", "{}", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        zeppelinHeartbeat4.run();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo22 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory23 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory25 = null;
        org.apache.zeppelin.search.SearchService searchService26 = null;
        org.apache.zeppelin.user.Credentials credentials27 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener28 = null;
        org.apache.zeppelin.notebook.Note note29 = new org.apache.zeppelin.notebook.Note(notebookRepo22, interpreterFactory23, interpreterSettingManager24, jobListenerFactory25, searchService26, credentials27, noteEventListener28);
        org.apache.zeppelin.search.SearchService searchService30 = null;
        note29.setIndex(searchService30);
        org.apache.zeppelin.notebook.NoteInfo noteInfo32 = new org.apache.zeppelin.notebook.NoteInfo(note29);
        boolean b34 = note29.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph35 = note29.getParagraphs();
        heliumApplicationFactory4.onNoteRemove(note29);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type41 = null;
        heliumApplicationFactory4.onOutputUpdated("/", "2DAA2V7VE", (int) (byte) 100, "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", type41, "{\"errors\":[],\"warnings\":[]}");
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        heliumApplicationFactory4.unload(paragraph44, "2DAREQVAC");
        heliumApplicationFactory4.onStatusChange("{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}", "{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}", "7bbc97d2-4425-40e7-ad10-9859c853f903", "2DAA2V7VE");
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(list_paragraph35);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        try {
            org.apache.zeppelin.helium.NpmPackage npmPackage1 = org.apache.zeppelin.helium.NpmPackage.fromJson("anonymous");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        boolean b32 = paragraph31.isEnabled();
        org.apache.zeppelin.notebook.Note note33 = paragraph31.getNote();
        org.apache.zeppelin.notebook.Paragraph paragraph35 = paragraph31.getUserParagraph("paragraph_1522728564700_1613699057");
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(note33);
        org.junit.Assert.assertNotNull(paragraph35);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setRunner(interpreterRunner3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder5 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener6 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder7 = builder5.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener6);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder8 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener9 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder10 = builder8.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener9);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo15 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj14);
        java.lang.String str16 = interpreterInfo15.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array17 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo15 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo18 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo18, interpreterInfo_array17);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder20 = builder8.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo18);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder21 = builder5.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo18);
        org.apache.zeppelin.dep.Dependency[] dependency_array22 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency23 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency23, dependency_array22);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder25 = builder5.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency23);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder26 = builder4.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "2DB1PDJAN" + "'", str16.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(dependency_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setInterpreterRunner(interpreterRunner1);
        org.apache.zeppelin.dep.DependencyResolver dependencyResolver3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setDependencyResolver(dependencyResolver3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder2.setGroup("2DB1PDJAN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "anonymous", 1, "");
        java.lang.String str5 = appendOutputBuffer4.getNoteId();
        int i6 = appendOutputBuffer4.getIndex();
        java.lang.String str7 = appendOutputBuffer4.getData();
        int i8 = appendOutputBuffer4.getIndex();
        java.lang.String str9 = appendOutputBuffer4.getData();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str5.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.util.Properties properties32 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration36 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager37 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration36);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter38 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties32, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager37);
        java.net.URL[] uRL_array39 = new java.net.URL[] {};
        remoteInterpreter38.setClassloaderUrls(uRL_array39);
        paragraph31.setInterpreter((org.apache.zeppelin.interpreter.Interpreter) remoteInterpreter38);
        java.lang.String str42 = remoteInterpreter38.getClassName();
        try {
            java.util.Properties properties43 = remoteInterpreter38.getProperties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNotNull(uRL_array39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        try {
            java.lang.String str8 = remoteInterpreter6.getHook("2DB1PDJAN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings2 = builder1.build();
        notebookRepoWithSettings2.name = "2DAREQVAC";
        org.junit.Assert.assertNotNull(notebookRepoWithSettings2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        interpreterSetting0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
        interpreterSetting0.setConf(zeppelinConfiguration3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status5 = interpreterSetting0.getStatus();
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status6 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY;
        interpreterSetting0.setStatus(status6);
        try {
            org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup10 = interpreterSetting0.getOrCreateInterpreterGroup("X-Watcher-Key", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(status5);
        org.junit.Assert.assertTrue("'" + status6 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status6.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        zeppelinhubRestApiHandler1.close();
        try {
            java.lang.String str5 = zeppelinhubRestApiHandler1.get("2DCC5KEUY", "7bbc97d2-4425-40e7-ad10-9859c853f903");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.Paragraph paragraph16 = note7.clearParagraphOutput("79d33c9f-2b95-4ada-a917-c9915707b781");
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph19 = note7.removeParagraph("2D9N8WKST", "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(paragraph16);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder12.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener15);
        remoteInterpreterManagedProcess7.updateRemoteAngularObject("2DCC5KEUY", " ", "2DC3C95JX", (java.lang.Object) remoteInterpreterProcessListener15);
        boolean b18 = remoteInterpreterManagedProcess7.isRunning();
        remoteInterpreterManagedProcess7.onProcessComplete((int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.String> map_str_str21 = remoteInterpreterManagedProcess7.getEnv();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(map_str_str21);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj6);
        java.lang.String str8 = interpreterInfo7.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array9 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo7 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo10 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo10, interpreterInfo_array9);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = builder0.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener13 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2DB1PDJAN" + "'", str8.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.zeppelin.notebook.socket.Message message3 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str4 = message3.roles;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = message3.data;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo6 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "2D9FT8S92", true, map_str_obj5);
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2DA4WJ5SN" + "'", str4.equals("2DA4WJ5SN"));
        org.junit.Assert.assertNotNull(map_str_obj5);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("2DAA2V7VE");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2DAA2V7VE" + "'", str1.equals("2DAA2V7VE"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        notebookRepoSettingsInfo0.name = "";
        java.lang.String str3 = notebookRepoSettingsInfo0.selected;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        paragraph50.setText("/");
        boolean b55 = paragraph50.isTerminated();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        interpreterSetting0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
        interpreterSetting0.setConf(zeppelinConfiguration3);
        java.lang.String str5 = interpreterSetting0.getErrorReason();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.name = "paragraph_1522728565744_-774075707";
        java.lang.String str5 = instance0.name;
        int i6 = instance0.id;
        instance0.id = 35;
        java.lang.String str9 = instance0.name;
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str5.equals("paragraph_1522728565744_-774075707"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str9.equals("paragraph_1522728565744_-774075707"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting14 = null;
        heliumApplicationFactory0.onUnbindInterpreter(note13, interpreterSetting14);
        org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
        org.apache.zeppelin.scheduler.Job.Status status17 = null;
        heliumApplicationFactory0.onParagraphStatusChange(paragraph16, status17);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type23 = null;
        heliumApplicationFactory0.onOutputUpdated("2D96F8MSD", "X-Watcher-Key", 0, "2DA4WJ5SN", type23, "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo26 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory27 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager28 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory29 = null;
        org.apache.zeppelin.search.SearchService searchService30 = null;
        org.apache.zeppelin.user.Credentials credentials31 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener32 = null;
        org.apache.zeppelin.notebook.Note note33 = new org.apache.zeppelin.notebook.Note(notebookRepo26, interpreterFactory27, interpreterSettingManager28, jobListenerFactory29, searchService30, credentials31, noteEventListener32);
        org.apache.zeppelin.search.SearchService searchService34 = null;
        note33.setIndex(searchService34);
        org.apache.zeppelin.notebook.NoteInfo noteInfo36 = new org.apache.zeppelin.notebook.NoteInfo(note33);
        org.apache.zeppelin.notebook.Paragraph paragraph37 = null;
        note33.onOutputAppend(paragraph37, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str41 = note33.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note43 = note33.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo45 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory46 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager47 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory48 = null;
        org.apache.zeppelin.search.SearchService searchService49 = null;
        org.apache.zeppelin.user.Credentials credentials50 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener51 = null;
        org.apache.zeppelin.notebook.Note note52 = new org.apache.zeppelin.notebook.Note(notebookRepo45, interpreterFactory46, interpreterSettingManager47, jobListenerFactory48, searchService49, credentials50, noteEventListener51);
        org.apache.zeppelin.search.SearchService searchService53 = null;
        note52.setIndex(searchService53);
        org.apache.zeppelin.notebook.NoteInfo noteInfo55 = new org.apache.zeppelin.notebook.NoteInfo(note52);
        boolean b57 = note52.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo58 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory59 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager60 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory61 = null;
        org.apache.zeppelin.search.SearchService searchService62 = null;
        org.apache.zeppelin.user.Credentials credentials63 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener64 = null;
        org.apache.zeppelin.notebook.Note note65 = new org.apache.zeppelin.notebook.Note(notebookRepo58, interpreterFactory59, interpreterSettingManager60, jobListenerFactory61, searchService62, credentials63, noteEventListener64);
        org.apache.zeppelin.search.SearchService searchService66 = null;
        note65.setIndex(searchService66);
        org.apache.zeppelin.notebook.NoteInfo noteInfo68 = new org.apache.zeppelin.notebook.NoteInfo(note65);
        org.apache.zeppelin.notebook.Paragraph paragraph69 = null;
        note65.onOutputAppend(paragraph69, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str73 = note65.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory74 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph75 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note52, (org.apache.zeppelin.scheduler.JobListener) note65, interpreterFactory74);
        java.lang.String str76 = paragraph75.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo77 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory78 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager79 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory80 = null;
        org.apache.zeppelin.search.SearchService searchService81 = null;
        org.apache.zeppelin.user.Credentials credentials82 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener83 = null;
        org.apache.zeppelin.notebook.Note note84 = new org.apache.zeppelin.notebook.Note(notebookRepo77, interpreterFactory78, interpreterSettingManager79, jobListenerFactory80, searchService81, credentials82, noteEventListener83);
        org.apache.zeppelin.search.SearchService searchService85 = null;
        note84.setIndex(searchService85);
        org.apache.zeppelin.notebook.NoteInfo noteInfo87 = new org.apache.zeppelin.notebook.NoteInfo(note84);
        org.apache.zeppelin.notebook.Paragraph paragraph88 = null;
        note84.onOutputAppend(paragraph88, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph75.setNote(note84);
        note43.addParagraph(paragraph75);
        boolean b95 = paragraph75.execute(true);
        heliumApplicationFactory0.run(paragraph75, "2DBKZC971");
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertNotNull(list_map_str_str41);
        org.junit.Assert.assertNotNull(note43);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(list_map_str_str73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue(b95 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        try {
            org.apache.zeppelin.helium.WebpackResult webpackResult1 = org.apache.zeppelin.helium.WebpackResult.fromJson("2DC68ZDPV");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterDir();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener9 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory10 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
        org.apache.zeppelin.search.SearchService searchService15 = null;
        org.apache.zeppelin.user.Credentials credentials16 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
        org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
        org.apache.zeppelin.search.SearchService searchService19 = null;
        note18.setIndex(searchService19);
        org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo(note18);
        org.apache.zeppelin.notebook.Note note23 = note18.getUserNote("2DB1PDJAN");
        heliumApplicationFactory10.onNoteCreate(note18);
        org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener25 = heliumApplicationFactory10.getApplicationEventListener();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller26 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener9, applicationEventListener25);
        remoteInterpreterManagedProcess7.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller26);
        org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage28 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess32 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller33 = remoteInterpreterRunningProcess32.getRemoteInterpreterEventPoller();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess37 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool38 = remoteInterpreterRunningProcess37.getInterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener39 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory40 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo41 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory42 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager43 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory44 = null;
        org.apache.zeppelin.search.SearchService searchService45 = null;
        org.apache.zeppelin.user.Credentials credentials46 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener47 = null;
        org.apache.zeppelin.notebook.Note note48 = new org.apache.zeppelin.notebook.Note(notebookRepo41, interpreterFactory42, interpreterSettingManager43, jobListenerFactory44, searchService45, credentials46, noteEventListener47);
        org.apache.zeppelin.search.SearchService searchService49 = null;
        note48.setIndex(searchService49);
        org.apache.zeppelin.notebook.NoteInfo noteInfo51 = new org.apache.zeppelin.notebook.NoteInfo(note48);
        org.apache.zeppelin.notebook.Note note53 = note48.getUserNote("2DB1PDJAN");
        heliumApplicationFactory40.onNoteCreate(note48);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller55 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener39, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory40);
        remoteInterpreterRunningProcess37.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller55);
        remoteInterpreterRunningProcess32.setRemoteInterpreterEventPoller(remoteInterpreterEventPoller55);
        try {
            remoteInterpreterEventPoller26.sendInvokeMethodResult(invokeResourceMethodEventMessage28, (java.lang.Object) remoteInterpreterEventPoller55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(note23);
        org.junit.Assert.assertNull(applicationEventListener25);
        org.junit.Assert.assertNull(remoteInterpreterEventPoller33);
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool38);
        org.junit.Assert.assertNotNull(note53);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.name = "paragraph_1522728565744_-774075707";
        java.lang.String str5 = instance0.name;
        int i6 = instance0.id;
        java.lang.String str7 = instance0.token;
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str5.equals("paragraph_1522728565744_-774075707"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.io.File file0 = null;
        java.io.File file1 = null;
        try {
            org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter3 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file0, file1, "paragraph_1522728565744_-774075707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization11 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array18 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        notebookAuthorization11.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str19);
        java.util.Set<java.lang.String> set_str23 = notebookAuthorization11.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization24 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array29 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str30, str_array29);
        boolean b33 = notebookAuthorization24.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str30, "2DAY1AANY");
        java.util.Set<java.lang.String> set_str35 = notebookAuthorization24.getOwners("X-Zeppelin-Token");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization36 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array43 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str44, str_array43);
        notebookAuthorization36.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str44);
        java.util.Set<java.lang.String> set_str48 = notebookAuthorization36.getRoles("2DAY1AANY");
        boolean b50 = notebookAuthorization24.hasReadAuthorization(set_str48, "hi!");
        boolean b52 = notebookAuthorization11.hasRunAuthorization(set_str48, "{\"op\":\"LIST_NOTES\",\"meta\":{}}");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization54 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array59 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str60, str_array59);
        boolean b63 = notebookAuthorization54.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str60, "2DAY1AANY");
        java.util.Set<java.lang.String> set_str65 = notebookAuthorization54.getOwners("X-Zeppelin-Token");
        boolean b66 = notebookAuthorization11.isWriter("anonymous", set_str65);
        boolean b67 = notebookAuthorization0.isOwner("paragraph_1522728564700_1613699057", set_str65);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization11);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set_str23);
        org.junit.Assert.assertNotNull(notebookAuthorization24);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set_str35);
        org.junit.Assert.assertNotNull(notebookAuthorization36);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set_str48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization54);
        org.junit.Assert.assertNotNull(str_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set_str65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance("{\"errors\":[],\"warnings\":[]}");
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.notebook.Paragraph paragraph14 = note12.clearParagraphOutput("X-Watcher-Key");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.SearchService searchService20 = null;
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
        org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
        org.apache.zeppelin.search.SearchService searchService24 = null;
        note23.setIndex(searchService24);
        org.apache.zeppelin.notebook.NoteInfo noteInfo26 = new org.apache.zeppelin.notebook.NoteInfo(note23);
        boolean b28 = note23.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
        org.apache.zeppelin.search.SearchService searchService33 = null;
        org.apache.zeppelin.user.Credentials credentials34 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
        org.apache.zeppelin.search.SearchService searchService37 = null;
        note36.setIndex(searchService37);
        org.apache.zeppelin.notebook.NoteInfo noteInfo39 = new org.apache.zeppelin.notebook.NoteInfo(note36);
        org.apache.zeppelin.notebook.Paragraph paragraph40 = null;
        note36.onOutputAppend(paragraph40, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str44 = note36.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory45 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph46 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note23, (org.apache.zeppelin.scheduler.JobListener) note36, interpreterFactory45);
        java.lang.String str47 = paragraph46.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo48 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory49 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager50 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory51 = null;
        org.apache.zeppelin.search.SearchService searchService52 = null;
        org.apache.zeppelin.user.Credentials credentials53 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener54 = null;
        org.apache.zeppelin.notebook.Note note55 = new org.apache.zeppelin.notebook.Note(notebookRepo48, interpreterFactory49, interpreterSettingManager50, jobListenerFactory51, searchService52, credentials53, noteEventListener54);
        org.apache.zeppelin.search.SearchService searchService56 = null;
        note55.setIndex(searchService56);
        org.apache.zeppelin.notebook.NoteInfo noteInfo58 = new org.apache.zeppelin.notebook.NoteInfo(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph59 = null;
        note55.onOutputAppend(paragraph59, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph46.setNote(note55);
        org.apache.zeppelin.notebook.Paragraph paragraph65 = paragraph46.getUserParagraph("/");
        org.apache.zeppelin.notebook.Note note66 = paragraph65.getNote();
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage68 = null;
        note12.onOutputUpdate(paragraph65, (int) (short) -1, interpreterResultMessage68);
        java.lang.String str70 = paragraph65.toJson();
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNull(paragraph14);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_map_str_str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(paragraph65);
        org.junit.Assert.assertNotNull(note66);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}" + "'", str70.equals("{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.getInstance();
        java.lang.String str2 = userTokenContainer0.getUserToken("2DC68ZDPV");
        org.junit.Assert.assertNotNull(userTokenContainer0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str2.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.zeppelin.helium.WebpackResult webpackResult0 = new org.apache.zeppelin.helium.WebpackResult();
        java.lang.String[] str_array1 = webpackResult0.warnings;
        java.lang.String[] str_array2 = webpackResult0.warnings;
        java.lang.String[] str_array3 = webpackResult0.warnings;
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertNotNull(str_array2);
        org.junit.Assert.assertNotNull(str_array3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        paragraph83.clearUserParagraphs();
        paragraph83.clearRuntimeInfos();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult68 = paragraph49.getResult();
        java.util.Date date69 = null;
        paragraph49.setDateStarted(date69);
        org.apache.zeppelin.notebook.socket.Message message71 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP73 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message74 = message71.put("2DAY1AANY", (java.lang.Object) oP73);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj75 = message71.data;
        paragraph49.setConfig(map_str_obj75);
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertNotNull(message71);
        org.junit.Assert.assertTrue("'" + oP73 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP73.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message74);
        org.junit.Assert.assertNotNull(map_str_obj75);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.scheduler.JobListener jobListener51 = paragraph50.getListener();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNull(jobListener51);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication2 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", zeppelinConfiguration1);
        org.junit.Assert.assertNull(authentication2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.user.Credentials credentials8 = null;
        note7.setCredentials(credentials8);
        note7.setName("anonymous");
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        try {
            java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion13 = note7.getInterpreterCompletion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.version;
        java.lang.String str2 = npmPackage0.version;
        npmPackage0.version = "";
        org.apache.zeppelin.helium.HeliumConf heliumConf5 = new org.apache.zeppelin.helium.HeliumConf();
        java.util.Map<java.lang.String, java.lang.String> map_str_str6 = heliumConf5.getEnabledPackages();
        npmPackage0.dependencies = map_str_str6;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map_str_str6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        java.lang.String str12 = noteInfo11.getId();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "2DD2X1VTE" + "'", str12.equals("2DD2X1VTE"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        note7.moveParagraph(" ", (int) 'a');
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo17 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory18 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory20 = null;
        org.apache.zeppelin.search.SearchService searchService21 = null;
        org.apache.zeppelin.user.Credentials credentials22 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener23 = null;
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note(notebookRepo17, interpreterFactory18, interpreterSettingManager19, jobListenerFactory20, searchService21, credentials22, noteEventListener23);
        org.apache.zeppelin.search.SearchService searchService25 = null;
        note24.setIndex(searchService25);
        org.apache.zeppelin.notebook.NoteInfo noteInfo27 = new org.apache.zeppelin.notebook.NoteInfo(note24);
        org.apache.zeppelin.notebook.Note note29 = note24.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting30 = null;
        heliumApplicationFactory16.onUnbindInterpreter(note29, interpreterSetting30);
        int i32 = note29.getParagraphCount();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status84 = null;
        org.apache.zeppelin.scheduler.Job.Status status85 = null;
        note29.afterStatusChange((org.apache.zeppelin.scheduler.Job) paragraph64, status84, status85);
        note7.onOutputAppend(paragraph64, 5, "paragraph_1522728573745_131242772");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage90 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState91 = paragraph64.createOrGetApplicationState(heliumPackage90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(note29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
        java.util.Map<java.lang.String, java.lang.String> map_str_str1 = heliumConf0.getEnabledPackages();
        org.apache.zeppelin.helium.HeliumPackage heliumPackage2 = null;
        try {
            heliumConf0.disablePackage(heliumPackage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_str1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status51 = null;
        paragraph31.setStatusToUserParagraph(status51);
        org.apache.zeppelin.notebook.ApplicationState applicationState54 = paragraph31.getApplicationState("79d33c9f-2b95-4ada-a917-c9915707b781");
        paragraph31.setErrorMessage("{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}");
        paragraph31.clearRuntimeInfos();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNull(applicationState54);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("X-Zeppelin-Token", executorService1, "{\"errors\":[],\"warnings\":[]}", remoteInterpreter9, schedulerListener11, (int) (byte) -1);
        try {
            java.lang.String str16 = remoteInterpreter9.getHook("2DBZFBPQW", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        try {
            remoteInterpreter6.unregisterHook("", "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        boolean b14 = note9.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
        org.apache.zeppelin.search.SearchService searchService19 = null;
        org.apache.zeppelin.user.Credentials credentials20 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
        org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
        org.apache.zeppelin.search.SearchService searchService23 = null;
        note22.setIndex(searchService23);
        org.apache.zeppelin.notebook.NoteInfo noteInfo25 = new org.apache.zeppelin.notebook.NoteInfo(note22);
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note22.onOutputAppend(paragraph26, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str30 = note22.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory31 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph32 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note9, (org.apache.zeppelin.scheduler.JobListener) note22, interpreterFactory31);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        luceneSearch0.deleteIndexDoc(note22, paragraph83);
        org.apache.zeppelin.notebook.Paragraph paragraph86 = paragraph83.cloneParagraphForUser("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Paragraph> map_str_paragraph87 = paragraph86.getUserParagraphMap();
        paragraph86.setId("2DA4J6V3U");
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertNotNull(paragraph86);
        org.junit.Assert.assertNotNull(map_str_paragraph87);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("2DBZFBPQW", "{}", zeppelinConfiguration2);
        try {
            org.eclipse.jetty.websocket.api.Session session7 = zeppelinClient3.getZeppelinConnection("2DB1PDJAN", "anonymous", "2DCVXD5TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving0 = new org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> map_str_map_str_set_str1 = notebookAuthorizationInfoSaving0.authInfo;
        java.lang.String str2 = notebookAuthorizationInfoSaving0.toJson();
        org.junit.Assert.assertNull(map_str_map_str_set_str1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult24 = helium21.getAllPackageInfo(true, "2DCC5KEUY");
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult27 = helium21.getAllPackageInfo(false, "2DB1PDJAN");
        java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult29 = helium21.getSinglePackageInfo("2DAY1AANY");
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult24);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult27);
        org.junit.Assert.assertNotNull(list_heliumPackageSearchResult29);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("2DC68ZDPV");
        org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        boolean b4 = folder3.isTrash();
        folder1.addChild(folder3);
        java.lang.String str6 = folder1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2DC68ZDPV" + "'", str6.equals("2DC68ZDPV"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory1 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        org.apache.zeppelin.notebook.Note note14 = note9.getUserNote("2DB1PDJAN");
        heliumApplicationFactory1.onNoteCreate(note9);
        org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener16 = heliumApplicationFactory1.getApplicationEventListener();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller17 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, applicationEventListener16);
        remoteInterpreterEventPoller17.shutdown();
        org.junit.Assert.assertNotNull(note14);
        org.junit.Assert.assertNull(applicationEventListener16);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        java.lang.String str3 = instance0.name;
        instance0.name = "2DAXG9ZYE";
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        zeppelinhubRestApiHandler1.close();
        try {
            zeppelinhubRestApiHandler1.del("2DCHMPRQT", "{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder3 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener4 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder5 = builder3.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo10 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj9);
        java.lang.String str11 = interpreterInfo10.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array12 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo10 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo13, interpreterInfo_array12);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder15 = builder3.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo13);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder0.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo13);
        org.apache.zeppelin.dep.Dependency[] dependency_array17 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency18 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18, dependency_array17);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder20 = builder0.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener21 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder22 = builder20.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener21);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder24 = builder20.setName("2DCHMPRQT");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2DB1PDJAN" + "'", str11.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(dependency_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        note7.setName("/");
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        boolean b14 = note7.isTrash();
        try {
            boolean b17 = note7.run("2DC58V2PC", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = message3.getType("");
        java.lang.String str6 = message3.principal;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = message3.data;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(map_str_obj7);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        int i9 = remoteInterpreterManagedProcess7.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.interpreter.launcher.SparkInterpreterLauncher sparkInterpreterLauncher1 = new org.apache.zeppelin.interpreter.launcher.SparkInterpreterLauncher(zeppelinConfiguration0);
        org.apache.zeppelin.interpreter.launcher.InterpreterLaunchContext interpreterLaunchContext2 = null;
        try {
            org.apache.zeppelin.interpreter.launcher.InterpreterClient interpreterClient3 = sparkInterpreterLauncher1.launch(interpreterLaunchContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner3 = null;
        interpreterSetting0.setInterpreterRunner(interpreterRunner3);
        interpreterSetting0.setInterpreterDir("2DD5KD9WH");
        org.apache.zeppelin.interpreter.LifecycleManager lifecycleManager7 = interpreterSetting0.getLifecycleManager();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager8 = interpreterSetting0.getInterpreterSettingManager();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup11 = interpreterSetting0.getInterpreterGroup("2DBKZC971", "");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = interpreterSetting0.getConf();
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener13 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener14 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory15 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo17 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory18 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory20 = null;
        org.apache.zeppelin.search.SearchService searchService21 = null;
        org.apache.zeppelin.user.Credentials credentials22 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener23 = null;
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note(notebookRepo17, interpreterFactory18, interpreterSettingManager19, jobListenerFactory20, searchService21, credentials22, noteEventListener23);
        org.apache.zeppelin.search.SearchService searchService25 = null;
        note24.setIndex(searchService25);
        org.apache.zeppelin.notebook.NoteInfo noteInfo27 = new org.apache.zeppelin.notebook.NoteInfo(note24);
        org.apache.zeppelin.notebook.Note note29 = note24.getUserNote("2DB1PDJAN");
        heliumApplicationFactory16.onNoteCreate(note24);
        org.apache.zeppelin.notebook.Notebook notebook31 = heliumApplicationFactory16.getNotebook();
        java.io.File file34 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory35 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory36 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo37 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory38 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager39 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory40 = null;
        org.apache.zeppelin.search.SearchService searchService41 = null;
        org.apache.zeppelin.user.Credentials credentials42 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener43 = null;
        org.apache.zeppelin.notebook.Note note44 = new org.apache.zeppelin.notebook.Note(notebookRepo37, interpreterFactory38, interpreterSettingManager39, jobListenerFactory40, searchService41, credentials42, noteEventListener43);
        org.apache.zeppelin.search.SearchService searchService45 = null;
        note44.setIndex(searchService45);
        org.apache.zeppelin.notebook.NoteInfo noteInfo47 = new org.apache.zeppelin.notebook.NoteInfo(note44);
        org.apache.zeppelin.notebook.Note note49 = note44.getUserNote("2DB1PDJAN");
        heliumApplicationFactory36.onNoteCreate(note44);
        org.apache.zeppelin.notebook.Notebook notebook51 = heliumApplicationFactory36.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager52 = null;
        org.apache.zeppelin.helium.Helium helium53 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file34, heliumBundleFactory35, heliumApplicationFactory36, interpreterSettingManager52);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo55 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory56 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager57 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory58 = null;
        org.apache.zeppelin.search.SearchService searchService59 = null;
        org.apache.zeppelin.user.Credentials credentials60 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener61 = null;
        org.apache.zeppelin.notebook.Note note62 = new org.apache.zeppelin.notebook.Note(notebookRepo55, interpreterFactory56, interpreterSettingManager57, jobListenerFactory58, searchService59, credentials60, noteEventListener61);
        org.apache.zeppelin.search.SearchService searchService63 = null;
        note62.setIndex(searchService63);
        org.apache.zeppelin.notebook.NoteInfo noteInfo65 = new org.apache.zeppelin.notebook.NoteInfo(note62);
        boolean b67 = note62.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo68 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory69 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager70 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory71 = null;
        org.apache.zeppelin.search.SearchService searchService72 = null;
        org.apache.zeppelin.user.Credentials credentials73 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener74 = null;
        org.apache.zeppelin.notebook.Note note75 = new org.apache.zeppelin.notebook.Note(notebookRepo68, interpreterFactory69, interpreterSettingManager70, jobListenerFactory71, searchService72, credentials73, noteEventListener74);
        org.apache.zeppelin.search.SearchService searchService76 = null;
        note75.setIndex(searchService76);
        org.apache.zeppelin.notebook.NoteInfo noteInfo78 = new org.apache.zeppelin.notebook.NoteInfo(note75);
        org.apache.zeppelin.notebook.Paragraph paragraph79 = null;
        note75.onOutputAppend(paragraph79, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str83 = note75.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory84 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph85 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note62, (org.apache.zeppelin.scheduler.JobListener) note75, interpreterFactory84);
        java.lang.String str86 = paragraph85.getText();
        heliumApplicationFactory36.unload(paragraph85, "");
        heliumApplicationFactory16.unload(paragraph85, "");
        heliumApplicationFactory15.unload(paragraph85, "");
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager93 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration12, angularObjectRegistryListener13, remoteInterpreterProcessListener14, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory15);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException");
        } catch (java.nio.file.NoSuchFileException e) {
        }
        org.junit.Assert.assertNull(lifecycleManager7);
        org.junit.Assert.assertNull(interpreterSettingManager8);
        org.junit.Assert.assertNull(managedInterpreterGroup11);
        org.junit.Assert.assertNotNull(zeppelinConfiguration12);
        org.junit.Assert.assertNotNull(note29);
        org.junit.Assert.assertNull(notebook31);
        org.junit.Assert.assertNotNull(note49);
        org.junit.Assert.assertNull(notebook51);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(list_map_str_str83);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        heliumApplicationFactory0.onNoteCreate(note8);
        note8.resetRuntimeInfos();
        org.junit.Assert.assertNotNull(note13);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        java.lang.String str3 = message0.ticket;
        org.apache.zeppelin.notebook.socket.Message.OP oP4 = org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO;
        message0.op = oP4;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2DA4WJ5SN" + "'", str3.equals("2DA4WJ5SN"));
        org.junit.Assert.assertTrue("'" + oP4 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO + "'", oP4.equals(org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        try {
            remoteInterpreter6.unregisterHook("2DA4J6V3U");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("X-Zeppelin-Token", "2DAY1AANY", "hi!", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "");
        java.lang.String str6 = paragraphRuntimeInfo5.getInterpreterSettingId();
        paragraphRuntimeInfo5.addValue("2D96F8MSD");
        java.lang.String str9 = paragraphRuntimeInfo5.getInterpreterSettingId();
        java.lang.String str10 = paragraphRuntimeInfo5.getInterpreterSettingId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        watcherMessage2.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        java.lang.String str5 = watcherMessage2.noteId;
        java.lang.String str6 = watcherMessage2.message;
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}" + "'", str5.equals("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo9 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory10 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager11 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory12 = null;
        org.apache.zeppelin.search.SearchService searchService13 = null;
        org.apache.zeppelin.user.Credentials credentials14 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener15 = null;
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note(notebookRepo9, interpreterFactory10, interpreterSettingManager11, jobListenerFactory12, searchService13, credentials14, noteEventListener15);
        org.apache.zeppelin.search.SearchService searchService17 = null;
        note16.setIndex(searchService17);
        org.apache.zeppelin.notebook.NoteInfo noteInfo19 = new org.apache.zeppelin.notebook.NoteInfo(note16);
        org.apache.zeppelin.notebook.Note note21 = note16.getUserNote("2DB1PDJAN");
        heliumApplicationFactory8.onNoteCreate(note16);
        org.apache.zeppelin.notebook.Notebook notebook23 = heliumApplicationFactory8.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
        org.apache.zeppelin.helium.Helium helium25 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file6, heliumBundleFactory7, heliumApplicationFactory8, interpreterSettingManager24);
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
        org.apache.zeppelin.helium.Helium helium27 = new org.apache.zeppelin.helium.Helium("{\"op\":\"LIST_NOTES\",\"meta\":{}}", "2D9FT8S92", file2, heliumBundleFactory3, heliumApplicationFactory8, interpreterSettingManager26);
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj29 = helium27.getSpellConfig("UNKNOWN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note21);
        org.junit.Assert.assertNull(notebook23);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        notebookRepoSettingsInfo0.selected = "UNKNOWN";
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type3 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN;
        notebookRepoSettingsInfo0.type = type3;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN + "'", type3.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        java.lang.Throwable throwable33 = paragraph31.getException();
        org.apache.zeppelin.display.GUI gUI34 = null;
        paragraph31.settings = gUI34;
        java.lang.String str36 = paragraph31.getIntpText();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(throwable33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Note note12 = note7.getUserNote("2DB1PDJAN");
        note7.moveParagraph(" ", (int) 'a');
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo17 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory18 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory20 = null;
        org.apache.zeppelin.search.SearchService searchService21 = null;
        org.apache.zeppelin.user.Credentials credentials22 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener23 = null;
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note(notebookRepo17, interpreterFactory18, interpreterSettingManager19, jobListenerFactory20, searchService21, credentials22, noteEventListener23);
        org.apache.zeppelin.search.SearchService searchService25 = null;
        note24.setIndex(searchService25);
        org.apache.zeppelin.notebook.NoteInfo noteInfo27 = new org.apache.zeppelin.notebook.NoteInfo(note24);
        org.apache.zeppelin.notebook.Note note29 = note24.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting30 = null;
        heliumApplicationFactory16.onUnbindInterpreter(note29, interpreterSetting30);
        int i32 = note29.getParagraphCount();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
        org.apache.zeppelin.search.SearchService searchService38 = null;
        org.apache.zeppelin.user.Credentials credentials39 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
        org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
        org.apache.zeppelin.search.SearchService searchService42 = null;
        note41.setIndex(searchService42);
        org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note41);
        boolean b46 = note41.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo47 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager49 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory50 = null;
        org.apache.zeppelin.search.SearchService searchService51 = null;
        org.apache.zeppelin.user.Credentials credentials52 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener53 = null;
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note(notebookRepo47, interpreterFactory48, interpreterSettingManager49, jobListenerFactory50, searchService51, credentials52, noteEventListener53);
        org.apache.zeppelin.search.SearchService searchService55 = null;
        note54.setIndex(searchService55);
        org.apache.zeppelin.notebook.NoteInfo noteInfo57 = new org.apache.zeppelin.notebook.NoteInfo(note54);
        org.apache.zeppelin.notebook.Paragraph paragraph58 = null;
        note54.onOutputAppend(paragraph58, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str62 = note54.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory63 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph64 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note41, (org.apache.zeppelin.scheduler.JobListener) note54, interpreterFactory63);
        java.lang.String str65 = paragraph64.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo66 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory67 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager68 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory69 = null;
        org.apache.zeppelin.search.SearchService searchService70 = null;
        org.apache.zeppelin.user.Credentials credentials71 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener72 = null;
        org.apache.zeppelin.notebook.Note note73 = new org.apache.zeppelin.notebook.Note(notebookRepo66, interpreterFactory67, interpreterSettingManager68, jobListenerFactory69, searchService70, credentials71, noteEventListener72);
        org.apache.zeppelin.search.SearchService searchService74 = null;
        note73.setIndex(searchService74);
        org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph77 = null;
        note73.onOutputAppend(paragraph77, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph64.setNote(note73);
        org.apache.zeppelin.notebook.Paragraph paragraph83 = paragraph64.getUserParagraph("/");
        org.apache.zeppelin.scheduler.Job.Status status84 = null;
        org.apache.zeppelin.scheduler.Job.Status status85 = null;
        note29.afterStatusChange((org.apache.zeppelin.scheduler.Job) paragraph64, status84, status85);
        note7.onOutputAppend(paragraph64, 5, "paragraph_1522728573745_131242772");
        paragraph64.setText("2DC3C95JX");
        boolean b92 = paragraph64.isAborted();
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(note29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory1 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
        org.apache.zeppelin.search.SearchService searchService6 = null;
        org.apache.zeppelin.user.Credentials credentials7 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
        org.apache.zeppelin.search.SearchService searchService10 = null;
        note9.setIndex(searchService10);
        org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note9);
        org.apache.zeppelin.notebook.Note note14 = note9.getUserNote("2DB1PDJAN");
        heliumApplicationFactory1.onNoteCreate(note9);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller16 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory1);
        try {
            remoteInterpreterEventPoller16.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note14);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"errors\":[],\"warnings\":[]}");
        zeppelinhubRestApiHandler1.close();
        try {
            zeppelinhubRestApiHandler1.put("{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}", "{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
        org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("2D9FT8S92", heliumPackage1, true);
        java.lang.String str4 = heliumPackageSearchResult3.getRegistry();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2D9FT8S92" + "'", str4.equals("2D9FT8S92"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinHubOp("2DCVXD5TW");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving0 = new org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving();
        java.lang.String str1 = notebookAuthorizationInfoSaving0.toJson();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> map_str_map_str_set_str2 = notebookAuthorizationInfoSaving0.authInfo;
        java.lang.String str3 = notebookAuthorizationInfoSaving0.toJson();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}" + "'", str1.equals("{}"));
        org.junit.Assert.assertNull(map_str_map_str_set_str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("RemoteInterpreter_2DAY1AANY_{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", (int) (short) 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        note7.clearParagraphOutputFields(paragraph49);
        note7.moveParagraph("2D9N8WKST", (int) 'a', false);
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption3 = interpreterSetting0.getOption();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = interpreterSetting0.getInterpreterSettingManager();
        org.junit.Assert.assertNotNull(interpreterOption3);
        org.junit.Assert.assertNull(interpreterSettingManager4);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setRunner(interpreterRunner3);
        java.util.Properties properties5 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration9 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager10 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration9);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter11 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties5, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager10);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup12 = null;
        nullLifecycleManager10.onInterpreterSessionCreated(managedInterpreterGroup12, "2D9FT8S92");
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup15 = null;
        nullLifecycleManager10.onInterpreterGroupCreated(managedInterpreterGroup15);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder17 = builder4.setLifecycleManager((org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager10);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup18 = null;
        nullLifecycleManager10.onInterpreterUse(managedInterpreterGroup18, "{\"op\":\"LIST_NOTES\",\"meta\":{}}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message3 = message0.put("2DAY1AANY", (java.lang.Object) oP2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = message3.getType("");
        java.lang.String str6 = message3.toJson();
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
        message3.op = oP7;
        org.apache.zeppelin.notebook.socket.Message.OP oP9 = message3.op;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNull(zeppelinHubHeartbeat5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"AUTH_INFO\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"paragraph_1522728565744_-774075707\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str6.equals("{\"op\":\"AUTH_INFO\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"paragraph_1522728565744_-774075707\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + oP9 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP9.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        remoteScheduler14.setMaxConcurrency((-1));
        remoteScheduler14.stop();
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        org.apache.zeppelin.notebook.Note note13 = note8.getUserNote("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting14 = null;
        heliumApplicationFactory0.onUnbindInterpreter(note13, interpreterSetting14);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type20 = null;
        heliumApplicationFactory0.onOutputUpdated("2DAY1AANY", "2D9J8Q3RX", 100, "", type20, "X-Zeppelin-Token");
        org.apache.zeppelin.notebook.Notebook notebook23 = null;
        heliumApplicationFactory0.setNotebook(notebook23);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo25 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory26 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager27 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory28 = null;
        org.apache.zeppelin.search.SearchService searchService29 = null;
        org.apache.zeppelin.user.Credentials credentials30 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener31 = null;
        org.apache.zeppelin.notebook.Note note32 = new org.apache.zeppelin.notebook.Note(notebookRepo25, interpreterFactory26, interpreterSettingManager27, jobListenerFactory28, searchService29, credentials30, noteEventListener31);
        org.apache.zeppelin.search.SearchService searchService33 = null;
        note32.setIndex(searchService33);
        org.apache.zeppelin.notebook.NoteInfo noteInfo35 = new org.apache.zeppelin.notebook.NoteInfo(note32);
        boolean b37 = note32.isLastParagraph("2DB1PDJAN");
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph38 = note32.getParagraphs();
        heliumApplicationFactory0.onNoteRemove(note32);
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(list_paragraph38);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        org.apache.zeppelin.notebook.socket.Message.OP oP3 = org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH;
        message0.op = oP3;
        message0.ticket = "{\"op\":\"LIST_NOTES\",\"meta\":{}}";
        java.lang.String str7 = message0.ticket;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo8 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory9 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory11 = null;
        org.apache.zeppelin.search.SearchService searchService12 = null;
        org.apache.zeppelin.user.Credentials credentials13 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener14 = null;
        org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note(notebookRepo8, interpreterFactory9, interpreterSettingManager10, jobListenerFactory11, searchService12, credentials13, noteEventListener14);
        org.apache.zeppelin.search.SearchService searchService16 = null;
        note15.setIndex(searchService16);
        org.apache.zeppelin.notebook.NoteInfo noteInfo18 = new org.apache.zeppelin.notebook.NoteInfo(note15);
        java.util.Map<java.lang.String, java.lang.String> map_str_str20 = note15.generateSingleParagraphInfo("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage21 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str20);
        message0.ticket = "2DC58V2PC";
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP3 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP3.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}" + "'", str7.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));
        org.junit.Assert.assertNotNull(map_str_str20);
        org.junit.Assert.assertNotNull(zeppelinhubMessage21);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        remoteInterpreter9.close();
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener11 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler13 = new org.apache.zeppelin.scheduler.RemoteScheduler("X-Zeppelin-Token", executorService1, "{\"errors\":[],\"warnings\":[]}", remoteInterpreter9, schedulerListener11, (int) (byte) -1);
        org.apache.zeppelin.scheduler.Job job15 = remoteScheduler13.removeFromWaitingQueue("{\"errors\":[],\"warnings\":[]}");
        org.junit.Assert.assertNull(job15);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        org.apache.zeppelin.scheduler.Job job16 = remoteScheduler14.removeFromWaitingQueue("X-Zeppelin-Token");
        remoteScheduler14.stop();
        remoteScheduler14.stop();
        org.junit.Assert.assertNotNull(uRL_array10);
        org.junit.Assert.assertNull(job16);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.io.File file2 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        org.apache.zeppelin.notebook.Note note17 = note12.getUserNote("2DB1PDJAN");
        heliumApplicationFactory4.onNoteCreate(note12);
        org.apache.zeppelin.notebook.Notebook notebook19 = heliumApplicationFactory4.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
        org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file2, heliumBundleFactory3, heliumApplicationFactory4, interpreterSettingManager20);
        java.io.File file25 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory26 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory27 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo28 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory29 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager30 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory31 = null;
        org.apache.zeppelin.search.SearchService searchService32 = null;
        org.apache.zeppelin.user.Credentials credentials33 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener34 = null;
        org.apache.zeppelin.notebook.Note note35 = new org.apache.zeppelin.notebook.Note(notebookRepo28, interpreterFactory29, interpreterSettingManager30, jobListenerFactory31, searchService32, credentials33, noteEventListener34);
        org.apache.zeppelin.search.SearchService searchService36 = null;
        note35.setIndex(searchService36);
        org.apache.zeppelin.notebook.NoteInfo noteInfo38 = new org.apache.zeppelin.notebook.NoteInfo(note35);
        org.apache.zeppelin.notebook.Note note40 = note35.getUserNote("2DB1PDJAN");
        heliumApplicationFactory27.onNoteCreate(note35);
        org.apache.zeppelin.notebook.Notebook notebook42 = heliumApplicationFactory27.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager43 = null;
        org.apache.zeppelin.helium.Helium helium44 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file25, heliumBundleFactory26, heliumApplicationFactory27, interpreterSettingManager43);
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult47 = helium44.getAllPackageInfo(true, "2DCC5KEUY");
        java.util.List<java.lang.String> list_str48 = helium44.getVisualizationPackageOrder();
        java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult51 = helium44.getAllPackageInfo(true, "2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo53 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory54 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager55 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory56 = null;
        org.apache.zeppelin.search.SearchService searchService57 = null;
        org.apache.zeppelin.user.Credentials credentials58 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener59 = null;
        org.apache.zeppelin.notebook.Note note60 = new org.apache.zeppelin.notebook.Note(notebookRepo53, interpreterFactory54, interpreterSettingManager55, jobListenerFactory56, searchService57, credentials58, noteEventListener59);
        org.apache.zeppelin.search.SearchService searchService61 = null;
        note60.setIndex(searchService61);
        org.apache.zeppelin.notebook.NoteInfo noteInfo63 = new org.apache.zeppelin.notebook.NoteInfo(note60);
        java.lang.String str64 = noteInfo63.getId();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj65 = noteInfo63.getConfig();
        helium44.updatePackageConfig("2DAA2V7VE", map_str_obj65);
        helium21.updatePackageConfig("2DB1PDJAN", map_str_obj65);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj68 = helium21.getAllPackageConfig();
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNull(notebook19);
        org.junit.Assert.assertNotNull(note40);
        org.junit.Assert.assertNull(notebook42);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult47);
        org.junit.Assert.assertNotNull(list_str48);
        org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult51);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "2DCQT9RZT" + "'", str64.equals("2DCQT9RZT"));
        org.junit.Assert.assertNotNull(map_str_obj65);
        org.junit.Assert.assertNotNull(map_str_map_str_obj68);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup8 = remoteInterpreter6.getInterpreterGroup();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext9 = null;
        remoteInterpreter6.cancel(interpreterContext9);
        java.net.URL[] uRL_array11 = remoteInterpreter6.getClassloaderUrls();
        try {
            org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = remoteInterpreter6.getOrCreateInterpreterProcess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNull(uRL_array11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
        org.apache.zeppelin.search.SearchService searchService4 = null;
        org.apache.zeppelin.user.Credentials credentials5 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note7.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note7);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note7.onOutputAppend(paragraph11, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note7.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note7.getUserNote("2DCC5KEUY");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        note17.addParagraph(paragraph49);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult68 = paragraph49.getResult();
        java.lang.String str69 = paragraph49.getIntpText();
        org.apache.zeppelin.interpreter.InterpreterContextRunner interpreterContextRunner70 = paragraph49.getInterpreterContextRunner();
        java.lang.String str71 = paragraph49.getUser();
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(interpreterContextRunner70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.Properties properties3 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter9 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties3, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        java.net.URL[] uRL_array10 = new java.net.URL[] {};
        remoteInterpreter9.setClassloaderUrls(uRL_array10);
        org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
        org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler14 = new org.apache.zeppelin.scheduler.RemoteScheduler("/", executorService1, "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", remoteInterpreter9, schedulerListener12, (int) (short) 0);
        try {
            remoteInterpreter9.registerHook("2DBEDFGFH", "{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder12.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener15);
        remoteInterpreterManagedProcess7.updateRemoteAngularObject("2DCC5KEUY", " ", "2DC3C95JX", (java.lang.Object) remoteInterpreterProcessListener15);
        java.lang.String str18 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        java.lang.String str19 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "anonymous" + "'", str18.equals("anonymous"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "anonymous" + "'", str19.equals("anonymous"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "X-Watcher-Key", "2DC3C95JX", "{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = remoteInterpreter6.getClassloaderUrls();
        try {
            org.apache.zeppelin.interpreter.Interpreter.FormType formType8 = remoteInterpreter6.getFormType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL_array7);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type1 = null;
        notebookRepoSettingsInfo0.type = type1;
        java.lang.String str3 = notebookRepoSettingsInfo0.selected;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("paragraph_1522728565744_-774075707", "");
        java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage3 = heliumLocalRegistry2.getAll();
        java.lang.String str4 = heliumLocalRegistry2.name();
        org.junit.Assert.assertNotNull(list_heliumPackage3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str4.equals("paragraph_1522728565744_-774075707"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("UNKNOWN");
        folder1.setParent(folder3);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
        org.apache.zeppelin.search.SearchService searchService13 = null;
        note12.setIndex(searchService13);
        org.apache.zeppelin.notebook.NoteInfo noteInfo15 = new org.apache.zeppelin.notebook.NoteInfo(note12);
        note12.setName("/");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo19 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory20 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager21 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory22 = null;
        org.apache.zeppelin.search.SearchService searchService23 = null;
        org.apache.zeppelin.user.Credentials credentials24 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener25 = null;
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note(notebookRepo19, interpreterFactory20, interpreterSettingManager21, jobListenerFactory22, searchService23, credentials24, noteEventListener25);
        org.apache.zeppelin.search.SearchService searchService27 = null;
        note26.setIndex(searchService27);
        org.apache.zeppelin.notebook.NoteInfo noteInfo29 = new org.apache.zeppelin.notebook.NoteInfo(note26);
        boolean b31 = note26.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
        org.apache.zeppelin.search.SearchService searchService36 = null;
        org.apache.zeppelin.user.Credentials credentials37 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
        org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
        org.apache.zeppelin.search.SearchService searchService40 = null;
        note39.setIndex(searchService40);
        org.apache.zeppelin.notebook.NoteInfo noteInfo42 = new org.apache.zeppelin.notebook.NoteInfo(note39);
        org.apache.zeppelin.notebook.Paragraph paragraph43 = null;
        note39.onOutputAppend(paragraph43, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str47 = note39.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory48 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph49 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note26, (org.apache.zeppelin.scheduler.JobListener) note39, interpreterFactory48);
        java.lang.String str50 = paragraph49.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo51 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory52 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager53 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory54 = null;
        org.apache.zeppelin.search.SearchService searchService55 = null;
        org.apache.zeppelin.user.Credentials credentials56 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener57 = null;
        org.apache.zeppelin.notebook.Note note58 = new org.apache.zeppelin.notebook.Note(notebookRepo51, interpreterFactory52, interpreterSettingManager53, jobListenerFactory54, searchService55, credentials56, noteEventListener57);
        org.apache.zeppelin.search.SearchService searchService59 = null;
        note58.setIndex(searchService59);
        org.apache.zeppelin.notebook.NoteInfo noteInfo61 = new org.apache.zeppelin.notebook.NoteInfo(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph62 = null;
        note58.onOutputAppend(paragraph62, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph49.setNote(note58);
        org.apache.zeppelin.notebook.Paragraph paragraph68 = paragraph49.getUserParagraph("/");
        java.lang.String str69 = paragraph68.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager70 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory71 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager70);
        paragraph68.setInterpreterFactory(interpreterFactory71);
        note12.setInterpreterFactory(interpreterFactory71);
        org.apache.zeppelin.notebook.Paragraph paragraph76 = note12.clearPersonalizedParagraphOutput("paragraph_1522728575982_-102412835", "2DA4WJ5SN");
        folder3.addNote(note12);
        java.lang.String str78 = folder3.getId();
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(paragraph68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "X-Watcher-Key" + "'", str69.equals("X-Watcher-Key"));
        org.junit.Assert.assertNull(paragraph76);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "UNKNOWN" + "'", str78.equals("UNKNOWN"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
        zeppelinhubSession0.close();
        org.junit.Assert.assertNotNull(zeppelinhubSession0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("{\n  \"interpreterSettings\": {},\n  \"interpreterBindings\": {},\n  \"interpreterRepositories\": []\n}", 97);
        org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
        clientFactory2.activateObject(pooledobject_client3);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.lang.String[] str_array20 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        boolean b23 = notebookAuthorization0.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str21);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization25 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array32 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str33, str_array32);
        notebookAuthorization25.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str33);
        java.util.Set<java.lang.String> set_str37 = notebookAuthorization25.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization38 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array43 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str44, str_array43);
        boolean b47 = notebookAuthorization38.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str44, "2DAY1AANY");
        boolean b49 = notebookAuthorization25.hasWriteAuthorization((java.util.Set<java.lang.String>) linkedhashset_str44, "X-Zeppelin-Token");
        boolean b50 = notebookAuthorization0.isWriter("2DA4WJ5SN", (java.util.Set<java.lang.String>) linkedhashset_str44);
        java.lang.String[] str_array83 = new java.lang.String[] { "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}", "2DB1PDJAN", "2D9N8WKST", "2DD4S11WG", "localhost", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"hi!\",\"roles\":\"\"}", "f59d65ec-3608-45a4-819c-81b5803f77eb", "UNKNOWN", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}", "paragraph_1522728564700_1613699057", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}", "2DA4J6V3U", "2DCQT9RZT", "2D9GSEHN5", "2DCC5KEUY", "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}", "2DD2X1VTE", "2DC58V2PC", "UNKNOWN", "{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}", "2DBKZC971", "2DCYMFFX4", "f59d65ec-3608-45a4-819c-81b5803f77eb", "{}", "2D9N8WKST", "f59d65ec-3608-45a4-819c-81b5803f77eb", "paragraph_1522728564700_1613699057", "2DC58V2PC", "2DCQT9RZT", "{\"op\":\"DEAD\",\"data\":{\"token\":\"paragraph_1522728573745_131242772\"},\"meta\":{}}" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str84, str_array83);
        notebookAuthorization0.setRoles("2DA4WJ5SN", (java.util.Set<java.lang.String>) linkedhashset_str84);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization25);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set_str37);
        org.junit.Assert.assertNotNull(notebookAuthorization38);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(str_array83);
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setOption(interpreterOption3);
        org.apache.zeppelin.dep.DependencyResolver dependencyResolver5 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder4.setDependencyResolver(dependencyResolver5);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting7 = builder4.create();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner8 = null;
        interpreterSetting7.setInterpreterRunner(interpreterRunner8);
        try {
            org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup12 = interpreterSetting7.getInterpreterGroup("2DCYMFFX4", "paragraph_1522728564700_1613699057");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(interpreterSetting7);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder2 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("hi!");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage3 = builder2.build();
        watcherMessage3.noteId = "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
        org.apache.zeppelin.helium.NpmPackage npmPackage6 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str7 = npmPackage6.version;
        npmPackage6.version = "2DB1PDJAN";
        java.lang.String str10 = npmPackage6.name;
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
        org.apache.zeppelin.search.SearchService searchService15 = null;
        org.apache.zeppelin.user.Credentials credentials16 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
        org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
        org.apache.zeppelin.search.SearchService searchService19 = null;
        note18.setIndex(searchService19);
        org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo(note18);
        java.util.Map<java.lang.String, java.lang.String> map_str_str23 = note18.generateSingleParagraphInfo("2DB1PDJAN");
        npmPackage6.dependencies = map_str_str23;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage25 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) heliumRegistrySerializer0, (java.lang.Object) "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", map_str_str23);
        com.google.gson.JsonElement jsonElement26 = null;
        java.lang.reflect.Type type27 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext28 = null;
        try {
            org.apache.zeppelin.helium.HeliumRegistry heliumRegistry29 = heliumRegistrySerializer0.deserialize(jsonElement26, type27, jsonDeserializationContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(watcherMessage3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map_str_str23);
        org.junit.Assert.assertNotNull(zeppelinhubMessage25);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("2DA4J6V3U", 5);
        org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
        clientFactory2.passivateObject(pooledobject_client3);
        org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client5 = null;
        try {
            boolean b6 = clientFactory2.validateObject(pooledobject_client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess3 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess(5, "{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}", 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        remoteInterpreter6.close();
        java.lang.String str9 = remoteInterpreter6.getStatus("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UNKNOWN" + "'", str9.equals("UNKNOWN"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner3 = null;
        interpreterSetting0.setInterpreterRunner(interpreterRunner3);
        interpreterSetting0.setInterpreterDir("2DD5KD9WH");
        org.apache.zeppelin.interpreter.LifecycleManager lifecycleManager7 = interpreterSetting0.getLifecycleManager();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager8 = interpreterSetting0.getInterpreterSettingManager();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup11 = interpreterSetting0.getInterpreterGroup("2DBKZC971", "");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = interpreterSetting0.getConf();
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status13 = interpreterSetting0.getStatus();
        interpreterSetting0.setErrorReason("2DBEDFGFH");
        org.junit.Assert.assertNull(lifecycleManager7);
        org.junit.Assert.assertNull(interpreterSettingManager8);
        org.junit.Assert.assertNull(managedInterpreterGroup11);
        org.junit.Assert.assertNotNull(zeppelinConfiguration12);
        org.junit.Assert.assertNull(status13);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess remoteInterpreterManagedProcess7 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterManagedProcess("79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "", "X-Watcher-Key", map_str_str4, 10, "anonymous");
        java.lang.String str8 = remoteInterpreterManagedProcess7.getInterpreterGroupName();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setId("2DB1PDJAN");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder16 = builder12.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener15);
        remoteInterpreterManagedProcess7.updateRemoteAngularObject("2DCC5KEUY", " ", "2DC3C95JX", (java.lang.Object) remoteInterpreterProcessListener15);
        boolean b18 = remoteInterpreterManagedProcess7.isRunning();
        remoteInterpreterManagedProcess7.onProcessComplete((int) (byte) 1);
        try {
            remoteInterpreterManagedProcess7.start("2D9GSEHN5", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "anonymous" + "'", str8.equals("anonymous"));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = remoteInterpreter6.getClassloaderUrls();
        try {
            org.apache.zeppelin.interpreter.Interpreter interpreter9 = remoteInterpreter6.getInterpreterInTheSameSessionByClassName("2DCHMPRQT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL_array7);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.slf4j.Logger logger0 = org.apache.zeppelin.interpreter.Interpreter.logger;
        org.apache.zeppelin.interpreter.Interpreter.logger = logger0;
        org.apache.zeppelin.interpreter.Interpreter.logger = logger0;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setInterpreterRunner(interpreterRunner1);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder0.setInterpreterDir("2DAY1AANY");
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool5 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder0.setProperties((java.lang.Object) interpreterContextRunnerPool5);
        org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array8 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner9 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner9, interpreterContextRunner_array8);
        interpreterContextRunnerPool5.addAll("2DA4WJ5SN", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner9);
        interpreterContextRunnerPool5.clear("2D9J8Q3RX");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess18 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool19 = remoteInterpreterRunningProcess18.getInterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array21 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner22 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner22, interpreterContextRunner_array21);
        interpreterContextRunnerPool19.addAll("X-Watcher-Key", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner22);
        org.apache.zeppelin.interpreter.InterpreterContextRunner interpreterContextRunner26 = null;
        interpreterContextRunnerPool19.add("hi!", interpreterContextRunner26);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess remoteInterpreterRunningProcess32 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterRunningProcess((int) (byte) -1, "", (int) '#');
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool33 = remoteInterpreterRunningProcess32.getInterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array35 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner36, interpreterContextRunner_array35);
        interpreterContextRunnerPool33.addAll("X-Watcher-Key", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner36);
        interpreterContextRunnerPool19.addAll("2DAXG9ZYE", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner36);
        interpreterContextRunnerPool5.addAll("2DD5KD9WH", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>) arraylist_interpreterContextRunner36);
        try {
            interpreterContextRunnerPool5.run("RemoteInterpreter_2DAY1AANY_{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "UNKNOWN");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(interpreterContextRunner_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool19);
        org.junit.Assert.assertNotNull(interpreterContextRunner_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(interpreterContextRunnerPool33);
        org.junit.Assert.assertNotNull(interpreterContextRunner_array35);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        interpreterSetting0.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener1);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
        interpreterSetting0.setConf(zeppelinConfiguration3);
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status5 = interpreterSetting0.getStatus();
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status6 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY;
        interpreterSetting0.setStatus(status6);
        interpreterSetting0.setInterpreterDir("2DCHMPRQT");
        try {
            org.apache.zeppelin.interpreter.Interpreter interpreter13 = interpreterSetting0.getInterpreter("UNKNOWN", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}", "2DA4J6V3U");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(status5);
        org.junit.Assert.assertTrue("'" + status6 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status6.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener1 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory2 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo3 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory4 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory6 = null;
        org.apache.zeppelin.search.SearchService searchService7 = null;
        org.apache.zeppelin.user.Credentials credentials8 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener9 = null;
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note(notebookRepo3, interpreterFactory4, interpreterSettingManager5, jobListenerFactory6, searchService7, credentials8, noteEventListener9);
        org.apache.zeppelin.search.SearchService searchService11 = null;
        note10.setIndex(searchService11);
        org.apache.zeppelin.notebook.NoteInfo noteInfo13 = new org.apache.zeppelin.notebook.NoteInfo(note10);
        org.apache.zeppelin.notebook.Note note15 = note10.getUserNote("2DB1PDJAN");
        heliumApplicationFactory2.onNoteCreate(note10);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller17 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener1, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller18 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory2);
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo20 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory21 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager22 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory23 = null;
        org.apache.zeppelin.search.SearchService searchService24 = null;
        org.apache.zeppelin.user.Credentials credentials25 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener26 = null;
        org.apache.zeppelin.notebook.Note note27 = new org.apache.zeppelin.notebook.Note(notebookRepo20, interpreterFactory21, interpreterSettingManager22, jobListenerFactory23, searchService24, credentials25, noteEventListener26);
        org.apache.zeppelin.search.SearchService searchService28 = null;
        note27.setIndex(searchService28);
        org.apache.zeppelin.notebook.NoteInfo noteInfo30 = new org.apache.zeppelin.notebook.NoteInfo(note27);
        boolean b32 = note27.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str48 = note40.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory49 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph50 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note27, (org.apache.zeppelin.scheduler.JobListener) note40, interpreterFactory49);
        java.lang.String str51 = paragraph50.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo52 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory53 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager54 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory55 = null;
        org.apache.zeppelin.search.SearchService searchService56 = null;
        org.apache.zeppelin.user.Credentials credentials57 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener58 = null;
        org.apache.zeppelin.notebook.Note note59 = new org.apache.zeppelin.notebook.Note(notebookRepo52, interpreterFactory53, interpreterSettingManager54, jobListenerFactory55, searchService56, credentials57, noteEventListener58);
        org.apache.zeppelin.search.SearchService searchService60 = null;
        note59.setIndex(searchService60);
        org.apache.zeppelin.notebook.NoteInfo noteInfo62 = new org.apache.zeppelin.notebook.NoteInfo(note59);
        org.apache.zeppelin.notebook.Paragraph paragraph63 = null;
        note59.onOutputAppend(paragraph63, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph50.setNote(note59);
        org.apache.zeppelin.notebook.Paragraph paragraph69 = paragraph50.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph71 = paragraph69.cloneParagraphForUser("X-Watcher-Key");
        org.apache.zeppelin.scheduler.Job.Status status72 = null;
        paragraph71.setStatusToUserParagraph(status72);
        int i74 = paragraph71.progress();
        org.apache.zeppelin.notebook.ApplicationState applicationState76 = heliumApplicationFactory2.get(paragraph71, "2D9FT8S92");
        java.lang.Object obj77 = paragraph71.getReturn();
        org.junit.Assert.assertNotNull(note15);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(list_map_str_str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(paragraph69);
        org.junit.Assert.assertNotNull(paragraph71);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNull(applicationState76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
        org.apache.zeppelin.search.SearchService searchService5 = null;
        org.apache.zeppelin.user.Credentials credentials6 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
        org.apache.zeppelin.search.SearchService searchService9 = null;
        note8.setIndex(searchService9);
        org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note8);
        boolean b13 = note8.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo14 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory17 = null;
        org.apache.zeppelin.search.SearchService searchService18 = null;
        org.apache.zeppelin.user.Credentials credentials19 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener20 = null;
        org.apache.zeppelin.notebook.Note note21 = new org.apache.zeppelin.notebook.Note(notebookRepo14, interpreterFactory15, interpreterSettingManager16, jobListenerFactory17, searchService18, credentials19, noteEventListener20);
        org.apache.zeppelin.search.SearchService searchService22 = null;
        note21.setIndex(searchService22);
        org.apache.zeppelin.notebook.NoteInfo noteInfo24 = new org.apache.zeppelin.notebook.NoteInfo(note21);
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        note21.onOutputAppend(paragraph25, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = note21.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph31 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note8, (org.apache.zeppelin.scheduler.JobListener) note21, interpreterFactory30);
        java.lang.String str32 = paragraph31.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo33 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory34 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager35 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory36 = null;
        org.apache.zeppelin.search.SearchService searchService37 = null;
        org.apache.zeppelin.user.Credentials credentials38 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener39 = null;
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note(notebookRepo33, interpreterFactory34, interpreterSettingManager35, jobListenerFactory36, searchService37, credentials38, noteEventListener39);
        org.apache.zeppelin.search.SearchService searchService41 = null;
        note40.setIndex(searchService41);
        org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        note40.onOutputAppend(paragraph44, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph31.setNote(note40);
        org.apache.zeppelin.notebook.Paragraph paragraph50 = paragraph31.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph50.cloneParagraphForUser("X-Watcher-Key");
        org.apache.zeppelin.scheduler.Job.Status status53 = null;
        paragraph52.setStatusToUserParagraph(status53);
        int i55 = paragraph52.progress();
        java.lang.String str56 = paragraph52.getId();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "X-Watcher-Key" + "'", str56.equals("X-Watcher-Key"));
    }
}

