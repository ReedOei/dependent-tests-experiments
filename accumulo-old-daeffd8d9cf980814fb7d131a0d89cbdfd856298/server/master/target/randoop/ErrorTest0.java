import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner0 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner();
        unorderedWorkAssigner0.assignWork();
    }
}

