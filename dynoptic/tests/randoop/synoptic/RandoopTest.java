package randoop.synoptic;
import java.util.List;

import junit.framework.*;
import junit.textui.*;

public class RandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RandoopTest0.class));
    result.addTest(new TestSuite(RandoopTest1.class));
    result.addTest(new TestSuite(RandoopTest2.class));
    result.addTest(new TestSuite(RandoopTest3.class));
    result.addTest(new TestSuite(RandoopTest4.class));
    return result;
  }


public List<Test> getTests() {
	// TODO Auto-generated method stub
	return null;
}


public void run(TestResult arg0, List<String> arg1) {
	// TODO Auto-generated method stub
	
}

}
