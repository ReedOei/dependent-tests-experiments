import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
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
        org.apache.zeppelin.notebook.Note note18 = note7.getUserNote("2DB1PDJAN");
        java.io.File file21 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory22 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory23 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
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
        org.apache.zeppelin.notebook.Note note36 = note31.getUserNote("2DB1PDJAN");
        heliumApplicationFactory23.onNoteCreate(note31);
        org.apache.zeppelin.notebook.Notebook notebook38 = heliumApplicationFactory23.getNotebook();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager39 = null;
        org.apache.zeppelin.helium.Helium helium40 = new org.apache.zeppelin.helium.Helium("2DB1PDJAN", "anonymous", file21, heliumBundleFactory22, heliumApplicationFactory23, interpreterSettingManager39);
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
        boolean b54 = note49.isLastParagraph("2DB1PDJAN");
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
        org.apache.zeppelin.notebook.Paragraph paragraph66 = null;
        note62.onOutputAppend(paragraph66, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str70 = note62.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory71 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph72 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note49, (org.apache.zeppelin.scheduler.JobListener) note62, interpreterFactory71);
        java.lang.String str73 = paragraph72.getText();
        heliumApplicationFactory23.unload(paragraph72, "");
        paragraph72.setText("2DB1PDJAN");
        int i78 = paragraph72.progress();
        note18.addParagraph(paragraph72);
        boolean b80 = paragraph72.isRunning();
        org.junit.Assert.assertNotNull(note18);
        org.junit.Assert.assertNotNull(note36);
        org.junit.Assert.assertNull(notebook38);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(list_map_str_str70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
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
        java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job18 = remoteScheduler14.getJobsWaiting();
        java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job19 = remoteScheduler14.getJobsRunning();
        remoteScheduler14.run();
        org.junit.Assert.assertNotNull(uRL_array10);
        org.junit.Assert.assertNull(job16);
        org.junit.Assert.assertNotNull(collection_job18);
        org.junit.Assert.assertNotNull(collection_job19);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
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
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult34 = paragraph31.getResult();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo35 = paragraph31.getAuthenticationInfo();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(interpreterResult34);
        org.junit.Assert.assertNull(authenticationInfo35);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
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
        org.apache.zeppelin.scheduler.Job.Status status70 = null;
        paragraph49.setStatus(status70);
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(list_map_str_str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(interpreterResult68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("{\"errors\":[],\"warnings\":[]}", "2DCYMFFX4", "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}", "anonymous", "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}");
        java.lang.String str6 = paragraphRuntimeInfo5.getInterpreterSettingId();
        java.lang.String str7 = paragraphRuntimeInfo5.getInterpreterSettingId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str6.equals("{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}" + "'", str7.equals("{\"op\":\"COMMIT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"noteId\":\"hi!\"}", "2D9N8WKST", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}");
        try {
            org.eclipse.jetty.websocket.api.Session session9 = zeppelinClient3.getZeppelinConnection("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}", "/", "2DBCX7K8S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(message5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        org.apache.zeppelin.helium.NpmPackage npmPackage1 = org.apache.zeppelin.helium.NpmPackage.fromJson("{\"op\":\"DEAD\",\"data\":{\"token\":\"paragraph_1522728573745_131242772\"},\"meta\":{}}");
        java.lang.String str2 = npmPackage1.toJson();
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = npmPackage1.dependencies;
        org.junit.Assert.assertNotNull(npmPackage1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(map_str_str3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
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
        boolean b19 = remoteInterpreter6.isOpened();
        org.junit.Assert.assertNull(managedInterpreterGroup8);
        org.junit.Assert.assertNotNull(uRL_array16);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
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
        java.util.List<org.apache.zeppelin.notebook.ApplicationState> list_applicationState34 = paragraph31.getAllApplicationStates();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(note33);
        org.junit.Assert.assertNotNull(list_applicationState34);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory1 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
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
        org.apache.zeppelin.notebook.Paragraph paragraph27 = null;
        note23.onOutputAppend(paragraph27, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str31 = note23.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory32 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph33 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note10, (org.apache.zeppelin.scheduler.JobListener) note23, interpreterFactory32);
        java.lang.String str34 = paragraph33.getText();
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
        paragraph33.setNote(note42);
        org.apache.zeppelin.notebook.Paragraph paragraph52 = paragraph33.getUserParagraph("/");
        org.apache.zeppelin.notebook.Paragraph paragraph54 = paragraph52.cloneParagraphForUser("X-Watcher-Key");
        org.apache.zeppelin.scheduler.Job.Status status55 = null;
        paragraph54.setStatusToUserParagraph(status55);
        int i57 = paragraph54.progress();
        boolean b58 = paragraph54.isEnabled();
        org.apache.zeppelin.scheduler.Job.Status status59 = null;
        heliumApplicationFactory1.onParagraphStatusChange(paragraph54, status59);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller61 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, (org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(list_map_str_str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertNotNull(paragraph54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting1.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner4 = null;
        interpreterSetting1.setInterpreterRunner(interpreterRunner4);
        interpreterSetting1.setInterpreterDir("2DD5KD9WH");
        org.apache.zeppelin.interpreter.LifecycleManager lifecycleManager8 = interpreterSetting1.getLifecycleManager();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager9 = interpreterSetting1.getInterpreterSettingManager();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup12 = interpreterSetting1.getInterpreterGroup("2DBKZC971", "");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = interpreterSetting1.getConf();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication14 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("2D9J8Q3RX", zeppelinConfiguration13);
        org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo zeppelinHubRepo15 = new org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo(zeppelinConfiguration13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo17 = zeppelinHubRepo15.list(authenticationInfo16);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo20 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision21 = zeppelinHubRepo15.checkpoint("{\"op\":\"DEAD\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"2D9FT8S92\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", "{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}", authenticationInfo20);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo23 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision24 = zeppelinHubRepo15.revisionHistory("hi!", authenticationInfo23);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo26 = null;
        try {
            zeppelinHubRepo15.remove("2D9Y7887R", authenticationInfo26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(lifecycleManager8);
        org.junit.Assert.assertNull(interpreterSettingManager9);
        org.junit.Assert.assertNull(managedInterpreterGroup12);
        org.junit.Assert.assertNotNull(zeppelinConfiguration13);
        org.junit.Assert.assertNotNull(authentication14);
        org.junit.Assert.assertNotNull(list_noteInfo17);
        org.junit.Assert.assertNotNull(revision21);
        org.junit.Assert.assertNotNull(list_revision24);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("2DBZFBPQW", "{}", zeppelinConfiguration2);
        zeppelinClient3.ping();
        zeppelinClient3.start();
        int i6 = zeppelinClient3.countConnectedNotes();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.fromJson("{\"op\":\"DEAD\",\"data\":{\"token\":\"{\\\"op\\\":\\\"COMMIT_PARAGRAPH\\\",\\\"data\\\":{\\\"2DAY1AANY\\\":\\\"NOTES_INFO\\\"},\\\"ticket\\\":\\\"{\\\\\\\"op\\\\\\\":\\\\\\\"LIST_NOTES\\\\\\\",\\\\\\\"meta\\\\\\\":{}}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"2DA4WJ5SN\\\"}\"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        message0.principal = "2DB1PDJAN";
        org.apache.zeppelin.notebook.socket.Message.OP oP5 = message0.op;
        java.lang.String str6 = message0.ticket;
        java.lang.String str7 = message0.toString();
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP5 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP5.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}" + "'", str6.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Message{data={2DAY1AANY=NOTES_INFO}, op=INSERT_PARAGRAPH}" + "'", str7.equals("Message{data={2DAY1AANY=NOTES_INFO}, op=INSERT_PARAGRAPH}"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
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
        luceneSearch0.addIndexDoc(note8);
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
        boolean b27 = note22.isLastParagraph("2DB1PDJAN");
        boolean b28 = note22.isPersonalizedMode();
        java.lang.String str29 = note22.getFolderId();
        boolean b31 = note22.equals((java.lang.Object) "X-Zeppelin-Token");
        luceneSearch0.addIndexDoc(note22);
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph35 = note22.removeParagraph("2D9EPJ6AT", "2DB48EBD1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(note13);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "/" + "'", str29.equals("/"));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test16");
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
        luceneSearch0.updateIndexDoc(note9);
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
        org.apache.zeppelin.notebook.Paragraph paragraph45 = null;
        note41.onOutputAppend(paragraph45, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        note41.setName("X-Watcher-Key");
        luceneSearch0.deleteIndexDocs(note41);
        luceneSearch0.close();
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
        org.apache.zeppelin.notebook.Paragraph paragraph64 = null;
        note60.onOutputAppend(paragraph64, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str68 = note60.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note70 = note60.getUserNote("2DCC5KEUY");
        boolean b71 = note60.isPersonalizedMode();
        try {
            luceneSearch0.updateIndexDoc(note60);
            org.junit.Assert.fail("Expected exception of type org.apache.lucene.store.AlreadyClosedException");
        } catch (org.apache.lucene.store.AlreadyClosedException e) {
        }
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertNotNull(list_map_str_str68);
        org.junit.Assert.assertNotNull(note70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test17");
        try {
            org.apache.zeppelin.notebook.Note note1 = org.apache.zeppelin.notebook.Note.fromJson("2DBN1WJYC");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test18");
        org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = heliumConf0.getPackagePersistedConfig("RemoteInterpreter_2DC3C95JX_X-Watcher-Key");
        org.junit.Assert.assertNotNull(map_str_map_str_obj1);
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test19");
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
        org.apache.zeppelin.display.AngularObject angularObject26 = remoteAngularObjectRegistry3.remove("Message{data={2DAY1AANY=NOTES_INFO}, op=INSERT_PARAGRAPH}", "2DAZG8KCC", "2DCACGJR9");
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(angularObject22);
        org.junit.Assert.assertNull(angularObject26);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test20");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.token = "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}";
        java.lang.String str5 = instance0.token;
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}" + "'", str5.equals("{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test21");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        boolean b9 = remoteInterpreter6.isOpened();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext10 = null;
        int i11 = remoteInterpreter6.getProgress(interpreterContext10);
        try {
            org.apache.zeppelin.interpreter.Interpreter interpreter13 = remoteInterpreter6.getInterpreterInTheSameSessionByClassName("paragraph_1522728565744_-774075707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test22");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setId("2DB1PDJAN");
        org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener3 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder2.setAngularObjectRegistryListener(angularObjectRegistryListener3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test23");
        java.util.Properties properties0 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager5 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration4);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter6 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties0, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager5);
        java.net.URL[] uRL_array7 = new java.net.URL[] {};
        remoteInterpreter6.setClassloaderUrls(uRL_array7);
        java.lang.String str9 = remoteInterpreter6.getClassName();
        org.apache.zeppelin.interpreter.InterpreterContext interpreterContext11 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterResult interpreterResult12 = remoteInterpreter6.interpret("paragraph_1522728595493_-1119990236", interpreterContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(uRL_array7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test25");
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
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo38 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory39 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager40 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory41 = null;
        org.apache.zeppelin.search.SearchService searchService42 = null;
        org.apache.zeppelin.user.Credentials credentials43 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener44 = null;
        org.apache.zeppelin.notebook.Note note45 = new org.apache.zeppelin.notebook.Note(notebookRepo38, interpreterFactory39, interpreterSettingManager40, jobListenerFactory41, searchService42, credentials43, noteEventListener44);
        org.apache.zeppelin.user.Credentials credentials46 = null;
        note45.setCredentials(credentials46);
        note45.setName("anonymous");
        java.util.Map<java.lang.String, java.lang.String> map_str_str51 = note45.generateSingleParagraphInfo("anonymous");
        paragraph31.updateRuntimeInfos("{\"op\":\"AUTH_INFO\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"paragraph_1522728565744_-774075707\",\"principal\":\"\",\"roles\":\"2DA4WJ5SN\"}", "2DCVXD5TW", map_str_str51, "2DAA2V7VE", "X-Watcher-Key");
        java.util.Properties properties55 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration59 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager60 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration59);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter61 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties55, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager60);
        remoteInterpreter61.close();
        paragraph31.setInterpreter((org.apache.zeppelin.interpreter.Interpreter) remoteInterpreter61);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(throwable33);
        org.junit.Assert.assertNotNull(map_str_str51);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test26");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting4 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting4.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner7 = null;
        interpreterSetting4.setInterpreterRunner(interpreterRunner7);
        interpreterSetting4.setInterpreterDir("2DD5KD9WH");
        org.apache.zeppelin.interpreter.LifecycleManager lifecycleManager11 = interpreterSetting4.getLifecycleManager();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager12 = interpreterSetting4.getInterpreterSettingManager();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup15 = interpreterSetting4.getInterpreterGroup("2DBKZC971", "");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration16 = interpreterSetting4.getConf();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication17 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("X-Zeppelin-Token", zeppelinConfiguration16);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client18 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("paragraph_1522728604549_-1665934155", "2DC68ZDPV", "{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}", zeppelinConfiguration16);
        org.apache.zeppelin.interpreter.lifecycle.TimeoutLifecycleManager timeoutLifecycleManager19 = new org.apache.zeppelin.interpreter.lifecycle.TimeoutLifecycleManager(zeppelinConfiguration16);
        org.junit.Assert.assertNull(lifecycleManager11);
        org.junit.Assert.assertNull(interpreterSettingManager12);
        org.junit.Assert.assertNull(managedInterpreterGroup15);
        org.junit.Assert.assertNotNull(zeppelinConfiguration16);
        org.junit.Assert.assertNotNull(authentication17);
        org.junit.Assert.assertNotNull(client18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test27");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"noteId\":\"hi!\"}", "2D9N8WKST", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"paragraph_1522728565744_-774075707\",\"roles\":\"\"}");
        zeppelinClient3.removeNoteConnection("");
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(message5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test28");
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter> map_str_registeredInterpreter0 = org.apache.zeppelin.interpreter.Interpreter.registeredInterpreters;
        org.apache.zeppelin.interpreter.Interpreter.registeredInterpreters = map_str_registeredInterpreter0;
        org.apache.zeppelin.interpreter.Interpreter.registeredInterpreters = map_str_registeredInterpreter0;
        org.junit.Assert.assertNotNull(map_str_registeredInterpreter0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test29");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED;
        org.apache.zeppelin.notebook.socket.Message message1 = new org.apache.zeppelin.notebook.socket.Message(oP0);
        java.lang.Object obj3 = message1.get("{\"op\":\"LIST_NOTES\",\"meta\":{}}");
        message1.roles = "";
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED));
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test30");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.version;
        npmPackage0.version = "2DB1PDJAN";
        npmPackage0.name = "X-Zeppelin-Token";
        java.lang.String str6 = npmPackage0.version;
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
        org.apache.zeppelin.notebook.Paragraph paragraph18 = null;
        note14.onOutputAppend(paragraph18, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str22 = note14.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note24 = note14.getUserNote("2DCC5KEUY");
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
        boolean b38 = note33.isLastParagraph("2DB1PDJAN");
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
        org.apache.zeppelin.notebook.Paragraph paragraph50 = null;
        note46.onOutputAppend(paragraph50, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str54 = note46.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory55 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph56 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note33, (org.apache.zeppelin.scheduler.JobListener) note46, interpreterFactory55);
        java.lang.String str57 = paragraph56.getText();
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
        paragraph56.setNote(note65);
        note24.addParagraph(paragraph56);
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult75 = paragraph56.getResult();
        boolean b76 = paragraph56.isBlankParagraph();
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder78 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("hi!");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings79 = builder78.build();
        notebookRepoWithSettings79.className = " ";
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo82 = notebookRepoWithSettings79.settings;
        paragraph56.setResult((java.lang.Object) list_notebookRepoSettingsInfo82);
        org.apache.zeppelin.notebook.socket.Message.OP oP84 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE;
        org.apache.zeppelin.helium.HeliumConf heliumConf85 = new org.apache.zeppelin.helium.HeliumConf();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj86 = heliumConf85.getAllPackageConfigs();
        java.util.Map<java.lang.String, java.lang.String> map_str_str87 = heliumConf85.getEnabledPackages();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage88 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) list_notebookRepoSettingsInfo82, (java.lang.Object) oP84, map_str_str87);
        npmPackage0.dependencies = map_str_str87;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2DB1PDJAN" + "'", str6.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(list_map_str_str22);
        org.junit.Assert.assertNotNull(note24);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(list_map_str_str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(interpreterResult75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(notebookRepoWithSettings79);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo82);
        org.junit.Assert.assertTrue("'" + oP84 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE + "'", oP84.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE));
        org.junit.Assert.assertNotNull(map_str_map_str_obj86);
        org.junit.Assert.assertNotNull(map_str_str87);
        org.junit.Assert.assertNotNull(zeppelinhubMessage88);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test32");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
        org.eclipse.jetty.websocket.api.Session session1 = null;
        watcherWebsocket0.connection = session1;
        byte[] byte_array9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array9, 0, (int) (byte) 1);
        java.lang.Throwable throwable13 = null;
        watcherWebsocket0.onWebSocketError(throwable13);
        org.junit.Assert.assertNotNull(watcherWebsocket0);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test33");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "";
        org.apache.zeppelin.notebook.socket.Message.OP oP3 = org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH;
        message0.op = oP3;
        message0.ticket = "{\"op\":\"LIST_NOTES\",\"meta\":{}}";
        java.lang.String str7 = message0.ticket;
        java.lang.Object obj9 = message0.get("2DAY1AANY");
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP3 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP3.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}" + "'", str7.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", obj9.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test34");
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
        int i85 = paragraph83.progress();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertTrue(i85 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test35");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting1.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner4 = null;
        interpreterSetting1.setInterpreterRunner(interpreterRunner4);
        interpreterSetting1.setInterpreterDir("2DD5KD9WH");
        org.apache.zeppelin.interpreter.LifecycleManager lifecycleManager8 = interpreterSetting1.getLifecycleManager();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager9 = interpreterSetting1.getInterpreterSettingManager();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup12 = interpreterSetting1.getInterpreterGroup("2DBKZC971", "");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = interpreterSetting1.getConf();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication14 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("2D9J8Q3RX", zeppelinConfiguration13);
        org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo zeppelinHubRepo15 = new org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo(zeppelinConfiguration13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo17 = zeppelinHubRepo15.list(authenticationInfo16);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision20 = zeppelinHubRepo15.revisionHistory("UNKNOWN", authenticationInfo19);
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
        note28.setName("/");
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
        boolean b47 = note42.isLastParagraph("2DB1PDJAN");
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
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str63 = note55.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory64 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph65 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note42, (org.apache.zeppelin.scheduler.JobListener) note55, interpreterFactory64);
        java.lang.String str66 = paragraph65.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo67 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory68 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager69 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory70 = null;
        org.apache.zeppelin.search.SearchService searchService71 = null;
        org.apache.zeppelin.user.Credentials credentials72 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener73 = null;
        org.apache.zeppelin.notebook.Note note74 = new org.apache.zeppelin.notebook.Note(notebookRepo67, interpreterFactory68, interpreterSettingManager69, jobListenerFactory70, searchService71, credentials72, noteEventListener73);
        org.apache.zeppelin.search.SearchService searchService75 = null;
        note74.setIndex(searchService75);
        org.apache.zeppelin.notebook.NoteInfo noteInfo77 = new org.apache.zeppelin.notebook.NoteInfo(note74);
        org.apache.zeppelin.notebook.Paragraph paragraph78 = null;
        note74.onOutputAppend(paragraph78, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph65.setNote(note74);
        org.apache.zeppelin.notebook.Paragraph paragraph84 = paragraph65.getUserParagraph("/");
        java.lang.String str85 = paragraph84.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager86 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory87 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager86);
        paragraph84.setInterpreterFactory(interpreterFactory87);
        note28.setInterpreterFactory(interpreterFactory87);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo90 = null;
        try {
            zeppelinHubRepo15.save(note28, authenticationInfo90);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(lifecycleManager8);
        org.junit.Assert.assertNull(interpreterSettingManager9);
        org.junit.Assert.assertNull(managedInterpreterGroup12);
        org.junit.Assert.assertNotNull(zeppelinConfiguration13);
        org.junit.Assert.assertNotNull(authentication14);
        org.junit.Assert.assertNotNull(list_noteInfo17);
        org.junit.Assert.assertNotNull(list_revision20);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(list_map_str_str63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(paragraph84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "X-Watcher-Key" + "'", str85.equals("X-Watcher-Key"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test36");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder0 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner1 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder2 = builder0.setInterpreterRunner(interpreterRunner1);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder4 = builder0.setInterpreterDir("2DAY1AANY");
        org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool5 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder6 = builder0.setProperties((java.lang.Object) interpreterContextRunnerPool5);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager8 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration7);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder9 = builder0.setLifecycleManager((org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager8);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder10 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener11 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder12 = builder10.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener11);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner13 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder14 = builder12.setRunner(interpreterRunner13);
        java.util.Properties properties15 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration19 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager20 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration19);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter21 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties15, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager20);
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup22 = null;
        nullLifecycleManager20.onInterpreterSessionCreated(managedInterpreterGroup22, "2D9FT8S92");
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup25 = null;
        nullLifecycleManager20.onInterpreterGroupCreated(managedInterpreterGroup25);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder27 = builder14.setLifecycleManager((org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager20);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder28 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener29 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder30 = builder28.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener29);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder31 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener32 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder33 = builder31.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener32);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj37 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo38 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj37);
        java.lang.String str39 = interpreterInfo38.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array40 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo38 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo41 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo41, interpreterInfo_array40);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder43 = builder31.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo41);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder44 = builder28.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo41);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder46 = builder44.setGroup("");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder48 = builder44.setName("2DB7TE5AP");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting49 = builder44.create();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup52 = interpreterSetting49.getOrCreateInterpreterGroup("2DCYMFFX4", "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}");
        managedInterpreterGroup52.close("2DAREQVAC");
        nullLifecycleManager20.onInterpreterGroupCreated(managedInterpreterGroup52);
        int i56 = managedInterpreterGroup52.getSessionNum();
        nullLifecycleManager8.onInterpreterUse(managedInterpreterGroup52, "{\n  \"enabled\": {},\n  \"packageConfig\": {\n    \"{\\\"op\\\":\\\"INSERT_PARAGRAPH\\\",\\\"data\\\":{\\\"2DAY1AANY\\\":\\\"NOTES_INFO\\\"},\\\"ticket\\\":\\\"{\\\\\\\"op\\\\\\\":\\\\\\\"LIST_NOTES\\\\\\\",\\\\\\\"meta\\\\\\\":{}}\\\",\\\"principal\\\":\\\"paragraph_1522728565744_-774075707\\\",\\\"roles\\\":\\\"\\\"}\": {}\n  },\n  \"bundleDisplayOrder\": []\n}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "2DB1PDJAN" + "'", str39.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(interpreterSetting49);
        org.junit.Assert.assertNotNull(managedInterpreterGroup52);
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test37");
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
        org.apache.zeppelin.interpreter.InterpreterResult interpreterResult53 = paragraph50.getResult();
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertNotNull(paragraph52);
        org.junit.Assert.assertNull(interpreterResult53);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test38");
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
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder17 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener18 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder19 = builder17.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener18);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder20 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener21 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder22 = builder20.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener21);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj26 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo27 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj26);
        java.lang.String str28 = interpreterInfo27.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array29 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo27 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo30 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo30, interpreterInfo_array29);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder32 = builder20.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo30);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder33 = builder17.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo30);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder35 = builder33.setGroup("");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder37 = builder33.setName("2DB7TE5AP");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting38 = builder33.create();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup41 = interpreterSetting38.getOrCreateInterpreterGroup("2DCYMFFX4", "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}");
        org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry42 = null;
        managedInterpreterGroup41.setInterpreterHookRegistry(interpreterHookRegistry42);
        org.apache.zeppelin.resource.ResourcePool resourcePool44 = managedInterpreterGroup41.getResourcePool();
        remoteInterpreterEventPoller16.setInterpreterGroup(managedInterpreterGroup41);
        org.junit.Assert.assertNotNull(note14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "2DB1PDJAN" + "'", str28.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(interpreterSetting38);
        org.junit.Assert.assertNotNull(managedInterpreterGroup41);
        org.junit.Assert.assertNull(resourcePool44);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test40");
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
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder18 = builder16.setGroup("");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder20 = builder16.setName("2DB7TE5AP");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting21 = builder16.create();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup24 = interpreterSetting21.getOrCreateInterpreterGroup("2DCYMFFX4", "{\"op\":\"APP_STATUS_CHANGE\",\"data\":false,\"meta\":{}}");
        org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry25 = null;
        managedInterpreterGroup24.setInterpreterHookRegistry(interpreterHookRegistry25);
        org.apache.zeppelin.resource.ResourcePool resourcePool27 = managedInterpreterGroup24.getResourcePool();
        int i28 = managedInterpreterGroup24.getSessionNum();
        java.util.Properties properties29 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration33 = null;
        org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager nullLifecycleManager34 = new org.apache.zeppelin.interpreter.lifecycle.NullLifecycleManager(zeppelinConfiguration33);
        org.apache.zeppelin.interpreter.remote.RemoteInterpreter remoteInterpreter35 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreter(properties29, "hi!", "", "", (org.apache.zeppelin.interpreter.LifecycleManager) nullLifecycleManager34);
        remoteInterpreter35.close();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup37 = remoteInterpreter35.getInterpreterGroup();
        managedInterpreterGroup24.addInterpreterToSession((org.apache.zeppelin.interpreter.Interpreter) remoteInterpreter35, "{\n  \"dateUpdated\": \"2018-04-02 23:09:45.877\",\n  \"config\": {},\n  \"settings\": {\n    \"params\": {},\n    \"forms\": {}\n  },\n  \"apps\": [],\n  \"jobName\": \"paragraph_1522728585877_-924588907\",\n  \"id\": \"X-Watcher-Key\",\n  \"dateCreated\": \"2018-04-02 23:09:45.877\",\n  \"status\": \"READY\",\n  \"progressUpdateIntervalMs\": 500\n}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2DB1PDJAN" + "'", str11.equals("2DB1PDJAN"));
        org.junit.Assert.assertNotNull(interpreterInfo_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(interpreterSetting21);
        org.junit.Assert.assertNotNull(managedInterpreterGroup24);
        org.junit.Assert.assertNull(resourcePool27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(managedInterpreterGroup37);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test41");
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
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        note19.onOutputAppend(paragraph23, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str27 = note19.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note29 = note19.getUserNote("2DCC5KEUY");
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
        boolean b43 = note38.isLastParagraph("2DB1PDJAN");
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo44 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory45 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager46 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory47 = null;
        org.apache.zeppelin.search.SearchService searchService48 = null;
        org.apache.zeppelin.user.Credentials credentials49 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener50 = null;
        org.apache.zeppelin.notebook.Note note51 = new org.apache.zeppelin.notebook.Note(notebookRepo44, interpreterFactory45, interpreterSettingManager46, jobListenerFactory47, searchService48, credentials49, noteEventListener50);
        org.apache.zeppelin.search.SearchService searchService52 = null;
        note51.setIndex(searchService52);
        org.apache.zeppelin.notebook.NoteInfo noteInfo54 = new org.apache.zeppelin.notebook.NoteInfo(note51);
        org.apache.zeppelin.notebook.Paragraph paragraph55 = null;
        note51.onOutputAppend(paragraph55, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str59 = note51.generateParagraphsInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory60 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph61 = new org.apache.zeppelin.notebook.Paragraph("X-Watcher-Key", note38, (org.apache.zeppelin.scheduler.JobListener) note51, interpreterFactory60);
        java.lang.String str62 = paragraph61.getText();
        org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo63 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory64 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager65 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory66 = null;
        org.apache.zeppelin.search.SearchService searchService67 = null;
        org.apache.zeppelin.user.Credentials credentials68 = null;
        org.apache.zeppelin.notebook.NoteEventListener noteEventListener69 = null;
        org.apache.zeppelin.notebook.Note note70 = new org.apache.zeppelin.notebook.Note(notebookRepo63, interpreterFactory64, interpreterSettingManager65, jobListenerFactory66, searchService67, credentials68, noteEventListener69);
        org.apache.zeppelin.search.SearchService searchService71 = null;
        note70.setIndex(searchService71);
        org.apache.zeppelin.notebook.NoteInfo noteInfo73 = new org.apache.zeppelin.notebook.NoteInfo(note70);
        org.apache.zeppelin.notebook.Paragraph paragraph74 = null;
        note70.onOutputAppend(paragraph74, (int) 'a', "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}");
        paragraph61.setNote(note70);
        note29.addParagraph(paragraph61);
        java.lang.Object obj80 = paragraph61.getReturn();
        org.apache.zeppelin.notebook.socket.Message message83 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP85 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.apache.zeppelin.notebook.socket.Message message86 = message83.put("2DAY1AANY", (java.lang.Object) oP85);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj87 = message83.data;
        org.apache.zeppelin.notebook.NoteInfo noteInfo88 = new org.apache.zeppelin.notebook.NoteInfo("", "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", map_str_obj87);
        paragraph61.setConfig(map_str_obj87);
        org.apache.zeppelin.scheduler.Job.Status status90 = null;
        org.apache.zeppelin.scheduler.Job.Status status91 = null;
        note7.beforeStatusChange((org.apache.zeppelin.scheduler.Job) paragraph61, status90, status91);
        org.apache.zeppelin.user.Credentials credentials93 = note7.getCredentials();
        org.junit.Assert.assertNotNull(list_paragraph10);
        org.junit.Assert.assertNotNull(list_map_str_str27);
        org.junit.Assert.assertNotNull(note29);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(list_map_str_str59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(message83);
        org.junit.Assert.assertTrue("'" + oP85 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP85.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
        org.junit.Assert.assertNotNull(message86);
        org.junit.Assert.assertNotNull(map_str_obj87);
        org.junit.Assert.assertNull(credentials93);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test42");
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
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption14 = interpreterSetting0.getOption();
        org.junit.Assert.assertNull(lifecycleManager7);
        org.junit.Assert.assertNull(interpreterSettingManager8);
        org.junit.Assert.assertNull(managedInterpreterGroup11);
        org.junit.Assert.assertNotNull(zeppelinConfiguration12);
        org.junit.Assert.assertNull(status13);
        org.junit.Assert.assertNotNull(interpreterOption14);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test43");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        int i1 = folderView0.countFolders();
        folderView0.clear();
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
        java.util.Map<java.lang.String, java.lang.String> map_str_str15 = note10.generateSingleParagraphInfo("2DB1PDJAN");
        folderView0.removeNote(note10);
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
        note24.moveParagraph(" ", (int) 'a');
        org.apache.zeppelin.notebook.Folder folder33 = folderView0.getFolderOf(note24);
        org.apache.zeppelin.notebook.Folder folder35 = new org.apache.zeppelin.notebook.Folder("2DC68ZDPV");
        folderView0.onFolderRenamed(folder35, "2DA4J6V3U");
        folder35.rename("2DCQT9RZT");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(map_str_str15);
        org.junit.Assert.assertNotNull(note29);
        org.junit.Assert.assertNull(folder33);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test44");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.name = "paragraph_1522728565744_-774075707";
        java.lang.String str5 = instance0.token;
        instance0.name = "2D9UYM3EQ";
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test45");
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
        java.lang.String str85 = note22.getName();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(list_map_str_str30);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(list_map_str_str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(paragraph83);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "2DCJFYR58" + "'", str85.equals("2DCJFYR58"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test46");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        java.lang.String str2 = instance0.name;
        instance0.name = "paragraph_1522728565744_-774075707";
        java.lang.String str5 = instance0.name;
        instance0.name = "2D96F8MSD";
        instance0.name = "2D98N71NQ";
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "paragraph_1522728565744_-774075707" + "'", str5.equals("paragraph_1522728565744_-774075707"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test47");
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
        java.lang.String str51 = paragraph50.getId();
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager52 = null;
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory53 = new org.apache.zeppelin.interpreter.InterpreterFactory(interpreterSettingManager52);
        paragraph50.setInterpreterFactory(interpreterFactory53);
        try {
            org.apache.zeppelin.interpreter.Interpreter interpreter58 = interpreterFactory53.getInterpreter("2DAV3DTZ8:shared_process", "2DCC5KEUY", "2DCJFYR58");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(list_map_str_str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paragraph50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "X-Watcher-Key" + "'", str51.equals("X-Watcher-Key"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test48");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array5 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        boolean b9 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str6, "2DAY1AANY");
        java.lang.String[] str_array20 = new java.lang.String[] { "79d33c9f-2b95-4ada-a917-c9915707b781", "2DCC5KEUY", "X-Zeppelin-Token", "{\"op\":\"LIST_NOTES\",\"meta\":{}}", "/", "2DB1PDJAN", "2DC3C95JX", " ", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        boolean b23 = notebookAuthorization0.isRunner("X-Watcher-Key", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.lang.String[] str_array30 = new java.lang.String[] { " ", "/", "2DB1PDJAN", " ", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str31, str_array30);
        notebookAuthorization0.setRunners("2DC3C95JX", (java.util.Set<java.lang.String>) linkedhashset_str31);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization34 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array41 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str42, str_array41);
        notebookAuthorization34.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str42);
        java.util.Set<java.lang.String> set_str46 = notebookAuthorization34.getRoles("2DAY1AANY");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization47 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array52 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", "2DCC5KEUY", "/", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str53, str_array52);
        boolean b56 = notebookAuthorization47.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str53, "2DAY1AANY");
        java.util.Set<java.lang.String> set_str58 = notebookAuthorization47.getOwners("X-Zeppelin-Token");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization59 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.lang.String[] str_array66 = new java.lang.String[] { "anonymous", "2DCC5KEUY", "2DB1PDJAN", "2DB1PDJAN", "2DAY1AANY" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str67, str_array66);
        notebookAuthorization59.setReaders("79d33c9f-2b95-4ada-a917-c9915707b781", (java.util.Set<java.lang.String>) linkedhashset_str67);
        java.util.Set<java.lang.String> set_str71 = notebookAuthorization59.getRoles("2DAY1AANY");
        boolean b73 = notebookAuthorization47.hasReadAuthorization(set_str71, "hi!");
        boolean b75 = notebookAuthorization34.hasRunAuthorization(set_str71, "{\"op\":\"LIST_NOTES\",\"meta\":{}}");
        java.util.Set<java.lang.String> set_str77 = notebookAuthorization34.getReaders("2DAREQVAC");
        boolean b79 = notebookAuthorization0.hasRunAuthorization(set_str77, "paragraph_1522728604549_-1665934155");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization34);
        org.junit.Assert.assertNotNull(str_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set_str46);
        org.junit.Assert.assertNotNull(notebookAuthorization47);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set_str58);
        org.junit.Assert.assertNotNull(notebookAuthorization59);
        org.junit.Assert.assertNotNull(str_array66);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set_str71);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(set_str77);
        org.junit.Assert.assertTrue(b79 == true);
    }
}
