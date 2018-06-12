package crystal.server;

import java.io.File;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.junit.Ignore;

import crystal.CrystalTest;

@Ignore
public class TestConstants extends CrystalTest {

    private static Logger _log = Logger.getLogger(TestConstants.class);

    public static String PROJECT_PATH = null;
    static {
        /**
         * This should contain the path to your workspace project location.
         */
        System.out.println("1");
        Vector<String> possiblePaths = new Vector<String>();
        possiblePaths.add("/var/lib/jenkins/jobs/crystalvc/workspace/"); // for ci server
        possiblePaths.add("/Users/rtholmes/Workspaces/inconsistencyworkspace/crystalvc/"); // MBA
        possiblePaths.add("/Users/rtholmes/Workspaces/speculation-inconsistency/crystalvc/"); // craigleith
        possiblePaths.add("C:\\Users\\Yuriy\\Desktop\\work\\My Dropbox\\crystal\\yuriy\\crystalvc"); // for yuriy's laptop
        possiblePaths.add("C:\\Users\\Haochen\\Dropbox\\crystal\\haochen\\crystalvc");
        possiblePaths.add("/homes/gws/brun/Dropbox/crystal/yuriy/crystalvc"); // for yuriy's horseradish machine
        possiblePaths.add("Z:\\Dropbox\\crystal\\yuriy\\crystalvc"); // for yuriy's nomar machine

        System.out.println("2");

        for (String possiblePath : possiblePaths) {
            if (new File(possiblePath).exists()) {
                PROJECT_PATH = possiblePath;
                break;
            }
        }

        System.out.println("3");

        assert PROJECT_PATH != null : "Make sure your project path is in possiblePaths above.";

        if (!PROJECT_PATH.endsWith(File.separator)) {
            PROJECT_PATH += File.separator;
        }

        System.out.println("4");

        _log.info("TestConstants::<clinit> - PROJECT_PATH: " + PROJECT_PATH);
        System.out.println("Constants::<clinit> - working path: " + PROJECT_PATH);
        System.out.println("5");

    }

    public static String HG_COMMAND = null;
    static {
        /**
         * This should contain the path to your hg binary.
         */
        Vector<String> possiblePaths = new Vector<String>();
        possiblePaths.add("/usr/local/bin/hg"); // for os x
        possiblePaths.add("/usr/bin/hg"); // for ci server
        possiblePaths.add("C:\\Program Files (x86)\\TortoiseHg\\hg.exe");
        possiblePaths.add("hg");
        possiblePaths.add("C:\\Program Files\\TortoiseHg\\hg.exe");
        // possiblePaths.add("\"C:\\Program Files\\TortoiseHg\\hg.exe\"");

        for (String possiblePath : possiblePaths) {
            if (new File(possiblePath).exists()) {

                HG_COMMAND = possiblePath;
                break;
            }
        }

        assert HG_COMMAND != null : "Make sure your hg binary is in possiblePaths above.";
        assert new File(HG_COMMAND).exists() : "Cannot find hg executable; this must be defined";

        _log.info("TestConstants::<clinit> -HG_COMMAND: " + HG_COMMAND);
        System.out.println("Constants::<clinit> - HG path: " + HG_COMMAND);
    }

    public static String GIT_COMMAND = null;
    static {
        /**
         * This should contain the path to your git binary.
         */
        Vector<String> possiblePaths = new Vector<String>();
        // TODO add paths
        possiblePaths.add("C:\\Program Files\\Git\\bin\\\\git.exe");
        possiblePaths.add("C:\\Program Files (x86)\\Git\\cmd\\\\git.cmd");
        possiblePaths.add("/usr/local/git/bin/git"); // os x default
        possiblePaths.add("/usr/bin/git"); // linux default, jenkins
        possiblePaths.add("C:\\Program Files (x86)\\Git\\bin\\git.exe");

        for (String possiblePath : possiblePaths) {
            if (new File(possiblePath).exists()) {
                GIT_COMMAND = possiblePath;
                break;
            }
        }

        assert GIT_COMMAND != null : "Make sure your git binary is in possiblePaths above.";
        assert new File(GIT_COMMAND).exists() : "Cannot find git executable; this must be defined";

        _log.info("TestConstants::<clinit> - GIT_COMMAND: " + GIT_COMMAND);
        System.out.println("Constants::<clinit> - GIT path: " + GIT_COMMAND);
    }

    public static final String TEST_REPOS = "test-repos" + File.separator;
    public static final String TEST_TEMP = "test-temp" + File.separator;
    public static final String GIT_TEST_REPOS = "gittestproject" + File.separator;
    public static final String GIT_TEST_TEMP = "git-test-temp" + File.separator;

}
