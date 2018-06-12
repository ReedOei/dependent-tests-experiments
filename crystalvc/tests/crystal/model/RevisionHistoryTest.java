package crystal.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import crystal.model.DataSource.RepoKind;
/**
 * Class RevisionHistoryTest will test the performance of class RevisionHistory
 * 
 * @author Haochen
 *
 */
public class RevisionHistoryTest {

	public RevisionHistory history;
	
		
	@Before
	public void createConstructor(){
		File f1 = new File("testDataFile/testLogVersion1.txt");
		
		String log = "";
		try {
			log = FileUtils.readFileToString(f1);
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
		history = new RevisionHistory(log, RepoKind.HG);
		assertNotNull(history);
	}

	@Test
	public void testEqualsObject() {
		File f1 = new File("testDataFile/testLogVersion1.txt");
		File f2 = new File("testDataFile/testLogVersion2.txt");
		
		String log_1 = "";
		String log_2 = "";
		try {
			log_1 = FileUtils.readFileToString(f1);
			log_2 = FileUtils.readFileToString(f2);
			
		} catch (IOException e) {
			System.err.println("File not found");
		}
		RevisionHistory history_1 = new RevisionHistory(log_1, RepoKind.HG);
		RevisionHistory history_2 = new RevisionHistory(log_2, RepoKind.HG);
		assertTrue("Same log text", history.equals(history_1));
		assertFalse("Different log files", history_2.equals(history_1));
		assertFalse("Different log files", history_1.equals(history_2));
		
	}

	@Test
	public void testSuperSubHistory() {
		File f1 = new File("testDataFile/testLogVersion1.txt");
		File f2 = new File("testDataFile/testLogVersion2.txt");
		
		String log_1 = "";
		String log_2 = "";
		try {
			log_1 = FileUtils.readFileToString(f1);
			log_2 = FileUtils.readFileToString(f2);
			
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
		RevisionHistory history_1 = new RevisionHistory(log_1, RepoKind.HG);
		RevisionHistory history_2 = new RevisionHistory(log_2, RepoKind.HG);
		
		
		
		assertTrue("Super history", history.superHistory(history_2));
		assertTrue("Sub history", history_2.subHistory(history));
		assertTrue("Same history", history.subHistory(history_1));
		assertTrue("Same history", history.superHistory(history_1));
	}

	@Test
	public void testGetCommitters() {
		File f3 = new File("testDataFile/testLogVersion3.txt");
		
		String log_3 = "";
		try {
			log_3 = FileUtils.readFileToString(f3);
			
		} catch (IOException e) {
			System.err.println("File not found");
		}
		RevisionHistory history_3 = new RevisionHistory(log_3, RepoKind.HG);
		System.out.println(history.getCommitters(history_3));
		assertTrue("One different name"
				, history.getCommitters(history_3).equals("Kenneth Reitz <me@kennethreitz.com>"));
	}


}
