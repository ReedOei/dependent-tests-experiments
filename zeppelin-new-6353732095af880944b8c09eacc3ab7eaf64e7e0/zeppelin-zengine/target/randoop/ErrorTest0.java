import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("2DAY1AANY", "X-Watcher-Key", "2DCC5KEUY");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("hi!");
        java.lang.String str2 = zeppelinWebsocket1.noteId;
        zeppelinWebsocket1.noteId = "2DAY1AANY";
        zeppelinWebsocket1.onWebSocketClose((int) (short) 0, " ");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("{\"op\":\"LIST_NOTES\",\"data\":false,\"meta\":{}}");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder21 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener22 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder23 = builder21.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener22);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder24 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener25 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder26 = builder24.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener25);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj30 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo31 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj30);
        java.lang.String str32 = interpreterInfo31.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array33 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo31 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo34 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34, interpreterInfo_array33);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder36 = builder24.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder37 = builder21.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34);
        org.apache.zeppelin.dep.Dependency[] dependency_array38 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency39 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency39, dependency_array38);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder41 = builder21.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency39);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder42 = builder0.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on interpreterInfo10 and interpreterInfo31", interpreterInfo10.equals(interpreterInfo31) ? interpreterInfo10.hashCode() == interpreterInfo31.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("2DB1PDJAN");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.ManagedInterpreterGroup managedInterpreterGroup3 = interpreterSetting0.getOrCreateInterpreterGroup("{\"op\":\"LIST_NOTES\",\"data\":\"hi!\",\"meta\":{}}", "{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.waitForReady();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("2D96F8MSD", "2DC58V2PC", "paragraph_1522728575982_-102412835");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLoginRoutine("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder21 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener22 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder23 = builder21.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener22);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder24 = new org.apache.zeppelin.interpreter.InterpreterSetting.Builder();
        org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener25 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder26 = builder24.setRemoteInterpreterProcessListener(remoteInterpreterProcessListener25);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj30 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo31 = new org.apache.zeppelin.interpreter.InterpreterInfo("2DB1PDJAN", "2DAY1AANY", false, map_str_obj30);
        java.lang.String str32 = interpreterInfo31.getClassName();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array33 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo31 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo34 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34, interpreterInfo_array33);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder36 = builder24.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder37 = builder21.setInterpreterInfos((java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo34);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder39 = builder37.setGroup("");
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder41 = builder37.setName("2DB7TE5AP");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting42 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting42.setErrorReason("UNKNOWN");
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption45 = interpreterSetting42.getOption();
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder46 = builder37.setOption(interpreterOption45);
        org.apache.zeppelin.interpreter.InterpreterSetting.Builder builder47 = builder20.setOption(interpreterOption45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on interpreterInfo10 and interpreterInfo31", interpreterInfo10.equals(interpreterInfo31) ? interpreterInfo10.hashCode() == interpreterInfo31.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.setErrorReason("UNKNOWN");
        interpreterSetting0.setInterpreterDir("");
        org.apache.zeppelin.interpreter.Interpreter interpreter7 = interpreterSetting0.getDefaultInterpreter("{\"op\":\"DEAD\",\"data\":{\"token\":\"paragraph_1522728573745_131242772\"},\"meta\":{}}", "{\"op\":\"DEAD\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"2D9FT8S92\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.setErrorReason("UNKNOWN");
        interpreterSetting0.clearNoteIdAndParaMap();
        org.apache.zeppelin.interpreter.Interpreter interpreter6 = interpreterSetting0.getDefaultInterpreter("2D9GSEHN5", "2DCYMFFX4");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance("paragraph_1522728573745_131242772");
        zeppelinhubWebsocket1.onWebSocketText("paragraph_1522728565744_-774075707");
        zeppelinhubWebsocket1.onWebSocketText("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.zeppelin.notebook.Note note1 = org.apache.zeppelin.notebook.Note.fromJson("{\"op\":\"INSERT_PARAGRAPH\",\"data\":{\"2DAY1AANY\":\"NOTES_INFO\"},\"ticket\":\"{\\\"op\\\":\\\"LIST_NOTES\\\",\\\"meta\\\":{}}\",\"principal\":\"\",\"roles\":\"\"}");
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion2 = note1.getInterpreterCompletion();
    }
}
