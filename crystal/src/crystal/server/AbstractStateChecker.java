package crystal.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.junit.Assert;

import crystal.client.ProjectPreferences;
import crystal.model.DataSource;
import crystal.model.DataSource.RepoKind;
import crystal.model.LocalStateResult;
import crystal.model.Relationship;
import crystal.model.RevisionHistory;
import crystal.server.AbstractLogParser.CheckpointLabels;
import crystal.util.RunIt;
import crystal.util.RunIt.Output;
import crystal.util.TimeUtility;

public abstract class AbstractStateChecker {

	/** using for comparing output */
	private static Logger _log = Logger.getLogger(AbstractStateChecker.class);

	/**
	 * @param String
	 *            pathToGit: the path to the executable
	 * @param String
	 *            pathToRepo: the full path to the remote repo
	 * @param String
	 *            tempWorkPath: path to a temp directory
	 * @param RepoKind
	 *            kind: type of the repository
	 * @return: Whether or not the pathToRepo is a valid type repository
	 */
	public static boolean isCorrectRepository(String pathExecutable, String pathToRepo, String tempWorkPath, RepoKind kind) throws IOException {
		Assert.assertNotNull(pathExecutable);
		Assert.assertNotNull(pathToRepo);
		Assert.assertNotNull(tempWorkPath);

		String[] myArgs = { "clone", pathToRepo };
		String output = (RunIt.execute(pathExecutable, myArgs, tempWorkPath + "status_check", false)).getOutput();

		RunIt.deleteDirectory(new File(tempWorkPath + "status_check"));

		return (output.indexOf("does not appear to be an " + kind.toString().toLowerCase() + " repository!") < 0);
	}

	/**
	 * @param String
	 *            pathToGit: the path to the git executable
	 * @param String
	 *            pathToRemoteRepo: the full path to the remote repo
	 * @param String
	 *            pathToLocalRepo: the path to the local repo which this method creates
	 * @param String
	 *            tempWorkPath: path to a temp directory
	 * @effect: clones the pathToRemoteRepo repository to pathToLocalRepo
	 */
	protected static synchronized void createLocalRepository(String pathExecutable, String pathToRemoteRepo, String pathToLocalRepo, String tempWorkPath, String remoteCmd)
			throws IOException, OperationException {
		Assert.assertNotNull(pathExecutable);
		Assert.assertNotNull(pathToRemoteRepo);
		Assert.assertNotNull(pathToLocalRepo);
		Assert.assertNotNull(tempWorkPath);
		// _log.info("create local repository");
		// String git = prefs.getClientPreferences().getGitPath();

		// String tempWorkPath = prefs.getClientPreferences().getTempDirectory();
		// String pathToRemoteGitRepo = prefs.getEnvironment().getCloneString();
		// String pathToLocalGitRepo = prefs.getClientPreferences().getTempDirectory() +
		// prefs.getEnvironment().getLocalPath();

		String command = pathExecutable + " clone";

		List<String> myArgsList = new ArrayList<String>();
		myArgsList.add("clone");
		if (remoteCmd != null) {
			myArgsList.add("--remotecmd");
			myArgsList.add(remoteCmd);
			command += " --remotecmd " + remoteCmd;
		}
		myArgsList.add(pathToRemoteRepo);
		myArgsList.add(pathToLocalRepo);
		command += " " + pathToRemoteRepo + " " + pathToLocalRepo;

		Output output = RunIt.execute(pathExecutable, myArgsList.toArray(new String[0]), tempWorkPath, false);
		if (pathExecutable.contains("git")) {
			_log.info("create local repository");
			_log.info("run command: " + command);
			_log.info("output: " + output.getOutput());
			if (output.getError().length() > 0) {
				_log.info("error: " + output.getError());
			}

		}
		if (output.getOutput().indexOf("updating to branch") < 0 && output.getOutput().indexOf("done.") < 0) {
			String errorMsg = "Crystal tried to execute command:\n" + "\"" + pathExecutable + " clone " + pathToRemoteRepo + " " + pathToLocalRepo + "\"\n" + "from \""
					+ tempWorkPath + "\"\n" + "but got the unexpected output:\n" + output.toString();
			// JOptionPane.showMessageDialog(null, dialogMsg, "git clone failure", JOptionPane.ERROR_MESSAGE);
			throw new OperationException(errorMsg, tempWorkPath, output.toString());
			// throw new RuntimeException("Could not clone repository " + pathToRemoteRepo + " to " + pathToLocalRepo + "\n" + output);
		}
	}

	/**
	 * @param String
	 *            pathExecutable: the path to the executable
	 * @param String
	 *            pathToLocalRepo: the path to the local repo which this method creates
	 * @param String
	 *            tempWorkPath: path to a temp directory
	 * @return
	 * @effect: performs a pull and update on the pathToLocalRepo repository
	 */
	protected static synchronized void updateLocalRepository(String pathExecutable, String pathToLocalRepo, String pathToRemoteRepo, String tempWorkPath, String remoteCmd)
			throws IOException, OperationException {
		Assert.assertNotNull(pathExecutable);
		Assert.assertNotNull(pathToLocalRepo);
		Assert.assertNotNull(tempWorkPath);

		// _log.info("update local repository");

		String command = pathExecutable + " pull -u " + pathToRemoteRepo;
		List<String> myArgsList = new ArrayList<String>();
		myArgsList.add("pull");
		myArgsList.add("-u");
		myArgsList.add(pathToRemoteRepo);
		if (remoteCmd != null) {
			myArgsList.add("--remotecmd");
			myArgsList.add(remoteCmd);
			command += "--remotecmd " + remoteCmd;
		}

		// String[] myArgs = { "pull", "-u" };
		Output output = RunIt.execute(pathExecutable, myArgsList.toArray(new String[0]), pathToLocalRepo, false);
		if (pathExecutable.contains("git")) {
			_log.info("update local repository");
			_log.info("run command: " + command);
			_log.info("output: \n" + output.getOutput());
			if (output.getError().length() > 0) {
				_log.info("error: " + output.getError());
			}
		}
		// TODO only for hg
		if (pathExecutable.contains("hg") && (output.getOutput().indexOf("files updated") < 0) && (output.getOutput().indexOf("no changes found") < 0)) {
			throw new OperationException(command, pathToLocalRepo, output.toString());
		}

		// for git
		if (pathExecutable.contains("git") && (output.getOutput().indexOf("Fast-forward") < 0) && (output.getOutput().indexOf("Already up-to-date.") < 0)) {
			throw new OperationException(command, pathToLocalRepo, output.toString());
		}

		/*
		 * if (pathExecutable.contains("git")) { _log.info("output: \n" + output.getOutput() + "\n error: \n" + output.getError()); }
		 */
	}

	/**
	 * Pulls into the local repo and checks for an error in the cache.
	 * 
	 * @param ds
	 *            : the repo to pull into
	 * @param Git
	 *            : path to git executable
	 * @param localRepo
	 *            : path to the local copy of the repo
	 * @param tempWorkPath
	 *            : the temp path
	 * @param remoteGit
	 *            : the optional remoteGit command (null if none)
	 * @param repoName
	 *            : the name of the repo
	 * @param projectName
	 *            : the name of the project
	 * @throws GitOperationException
	 * @throws IOException
	 */
	protected static synchronized void updateLocalRepositoryAndCheckCacheError(DataSource ds, String pathExecutable, String localRepo, String tempWorkPath, String remoteCmd,
			String repoName, String projectName) throws OperationException, IOException {
		// _log.info("update local repository and check cache error");
		Logger log = Logger.getLogger(AbstractStateChecker.class);
		_log.info("call update local repository and check cache error");
		_log.info("local repository: " + localRepo + ", exist?: " + (new File(localRepo).exists()));
		if (new File(localRepo).exists()) {
			try {
				_log.info("trying to update local repository: " + localRepo);
				updateLocalRepository(pathExecutable, localRepo, ds.getCloneString(), tempWorkPath, remoteCmd);
				_log.info("successfully finished updating local repository: " + localRepo);
			} catch (OperationException e) {
				_log.info("operation exception in running update local repository");
				_log.info("command: " + e.getCommand() + "\n path: " + e.getPath() + "\n repo name: " + repoName + "\n output: " + e.getOutput() + "\n");
				String errorMsg = "Crystal is having trouble executing\n" + e.getCommand() + "\nin " + e.getPath() + "\n for your " + repoName + " repository of project "
						+ projectName + ".\n" + "Crystal got the unexpected output:\n" + e.getOutput() + "\n";
				log.error(errorMsg);
				errorMsg += "Sometimes, clearing Crystal's local cache can remedy this problem";
				throw new OperationException(errorMsg, e.getPath(), e.getOutput());
			}
		} else {
			_log.info("trying to create local repository: " + localRepo);
			createLocalRepository(pathExecutable, ds.getCloneString(), localRepo, tempWorkPath, remoteCmd);
			_log.info("finished creating local repository: " + localRepo);
		}
	}

	/**
	 * @param prefs
	 *            : the ProjectPreferences for the project to consider
	 * @return the local state of my repo of the prefs project
	 * @throws IOException
	 */
	public static String getLocalState(ProjectPreferences prefs) throws IOException {
		// _log.info("get local state");
		Assert.assertNotNull(prefs);

		// if source are disabled, return null.
		if (!prefs.getEnvironment().isEnabled())
			return null;

		Map<CheckpointLabels, String> logLabels = null;
		RepoKind kind = prefs.getEnvironment().getKind();
		if (kind.equals(RepoKind.HG))
			logLabels = HgLogParser.hgCheckpoint;
		else if (kind.equals(RepoKind.GIT))
			logLabels = GitLogParser.gitCheckpoint;
		else
			return null;
		/*
		 * We are going to: 1. update the local clone 2. get the log from the local clone 3. if the cloneString is local, we will also get heads and check for UNCHECKPOINTED 4.
		 * check for MUST_RESOLVE or ALL_CLEAR and return
		 */

		String executablePath = null;
		if (kind.equals(RepoKind.HG))
			executablePath = prefs.getClientPreferences().getHgPath();
		else if (kind.equals(RepoKind.GIT))
			executablePath = prefs.getClientPreferences().getGitPath();
		else
			return null;

		String tempWorkPath = prefs.getClientPreferences().getTempDirectory();
		String mine = prefs.getProjectCheckoutLocation(prefs.getEnvironment());

		// Step 1. Update the local clone. If cloning fails, return ERROR state
		// TODO: The errors on the local state are not reported as toottips yet (need to make LocalState not interned)
		try {
			updateLocalRepositoryAndCheckCacheError(prefs.getEnvironment(), executablePath, mine, tempWorkPath, prefs.getEnvironment().getRemoteCmd(), "your own", 
			        prefs.getName());
		} catch (OperationException e) {
			_log.info("failed to update local repository and check cache error in get local state");
			return LocalStateResult.ERROR + " " + e.getMessage();
		} catch (IOException e) {
			_log.info("failed to update local repository and check cache error in get local state");
			return LocalStateResult.ERROR + " " + e.getMessage();
		}
		_log.info("successfully update local repository and check cache error in get local state");
		// Step 2. Get the log from the local clone and set the history
		
		
		//String[] logArgs = { "log" };
		String[] hgLogArgs = { "log", "-r", "0:tip" };
		String[] gitLogArgs = { "log", "--reverse" };
		Output output;
		if (kind.equals(RepoKind.HG)) {
			output = RunIt.execute(executablePath, hgLogArgs, mine, false);
		} else if (kind.equals(RepoKind.GIT))
			output = RunIt.execute(executablePath, gitLogArgs, mine, false);
		else
			output = null;
		// if (kind.equals(RepoKind.GIT))
		// _log.info("log output: \n" + output.getOutput());
		prefs.getEnvironment().setHistory(new RevisionHistory(output.getOutput(), kind));

		// TODO Step 2.5. If the history has changed, find out if build or test fails.

		if ((new File(prefs.getEnvironment().getCloneString())).exists()) {
			/*
			 * Check if repo status has non-empty response. If it does, return UNCHECKPOINTED
			 */
			String[] statusArgs = { "status" };
			output = RunIt.execute(executablePath, statusArgs, prefs.getEnvironment().getCloneString(), false);
			// check if any of the lines in the output don't start with "?"

			StringTokenizer tokens = new StringTokenizer(output.getOutput().trim(), "\n");
			while (tokens.hasMoreTokens()) {
				String nextToken = tokens.nextToken();
				if (!(nextToken.startsWith("?"))) {
					if (kind.equals(RepoKind.HG))
						return LocalStateResult.HG_UNCHECKPOINTED;
					else if (kind.equals(RepoKind.GIT))
						return LocalStateResult.GIT_UNCHECKPOINTED;
					else
						return null;
				}

			}
		}

		// We can't find out the status, but we can find out if MUST_RESOLVE

		/*
		 * Check if mine is two headed. If it is, return MUST_RESOLVE
		 */
		String[] headArgs = { "heads" };
		output = RunIt.execute(executablePath, headArgs, mine, false);
		if (hasTwoHeads(output, logLabels)) {
			if (kind.equals(RepoKind.HG))
				return LocalStateResult.HG_MUST_RESOLVE;
			else if (kind.equals(RepoKind.GIT))
				return LocalStateResult.GIT_MUST_RESOLVE;
		}
		return LocalStateResult.ALL_CLEAR;
	}

	/**
	 * @param output
	 *            : the output of "git heads"
	 * @return true iff the output indicated there are two heads. known problem: if the log message looks like the output of a changelog in the "git log" command, this method gets
	 *         confused.
	 */
	protected static boolean hasTwoHeads(Output output, Map<CheckpointLabels, String> logLables) {
		Pattern heads = Pattern.compile(".*^" + logLables.get(CheckpointLabels.CHANGESET) + " .*^" + logLables.get(CheckpointLabels.CHANGESET) + " .*", Pattern.DOTALL
				| Pattern.MULTILINE);
		Matcher matcher = heads.matcher(output.getOutput());
		return matcher.matches();
	}

	/**
	 * Computes the Relationship of my repo and one other source repo
	 * 
	 * @param prefs
	 *            : the ProjectPreferences for the project to consider.
	 * @param source
	 *            : the repo to compare to.
	 * @param oldRelationship
	 *            : the old Relationship, in String form.
	 * @return the current relationship between my repo in prefs and source
	 * @throws Exception
	 * @throws IOException
	 */
	public static String getRelationship(ProjectPreferences prefs, DataSource source, String oldRelationship, RepoKind kind) {
		Assert.assertNotNull(prefs);
		Assert.assertNotNull(source);

		_log.info("AbstractStateChecker::getRelationship(..)");

		// if project or source are disabled, return null.
		if ((!prefs.getEnvironment().isEnabled()) || (!source.isEnabled()))
			return null;

		String mine = prefs.getProjectCheckoutLocation(prefs.getEnvironment());
		String yours = prefs.getProjectCheckoutLocation(source);

		String executablePath = null;
		if (kind.equals(RepoKind.HG))
			executablePath = prefs.getClientPreferences().getHgPath();
		else if (kind.equals(RepoKind.GIT))
			executablePath = prefs.getClientPreferences().getGitPath();
		else
			return null;
		String tempWorkPath = prefs.getClientPreferences().getTempDirectory();
		// tempWorkPath + tempMyName used to store a local copy of my repo
		String tempMyName = "tempMine_" + TimeUtility.getCurrentLSMRDateString();
		// tempWorkPath + tempYourName used to store a local copy of your repo
		// String tempYourName = "tempYour_" + TimeUtility.getCurrentLSMRDateString();

		// My local copy has already been updated when we checked the local status
		// So we are just going to update yours
		try {
			updateLocalRepositoryAndCheckCacheError(source, executablePath, yours, tempWorkPath, source.getRemoteCmd(), source.getShortName(), prefs.getName());
		} catch (OperationException e1) {
			if (kind.equals(RepoKind.GIT))
				_log.info("AbstractStateChecker::getRelationship(..) - ERROR: failed to update local repo and check cache error in get relationship");
			return Relationship.ERROR + " " + e1.getMessage();
		} catch (IOException e2) {
			if (kind.equals(RepoKind.GIT))
				_log.info("AbstractStateChecker::getRelationship(..) - ERROR: failed to update local repo and check cache error in get relationship");
			return Relationship.ERROR + " " + e2.getMessage();
		}
		if (kind.equals(RepoKind.GIT))
			_log.info("AbstractStateChecker::getRelationship(..) - successfully update local repo and check cache error in get relationship");
		// Get your log and set your history
		//String[] logArgs = { "log" };
		String[] hgLogArgs = { "log", "-r", "0:tip" };
		String[] gitLogArgs = { "log", "--reverse" };
		Output logOutput = null;
		try {
			if (kind.equals(RepoKind.HG)) {
				logOutput = RunIt.execute(executablePath, hgLogArgs, yours, false);
			} else if (kind.equals(RepoKind.GIT))
				logOutput = RunIt.execute(executablePath, gitLogArgs, yours, false);
		} catch (IOException e2) {
			return Relationship.ERROR + " Couldn't get the log: " + e2.getMessage();
		}

		RevisionHistory yourHistory = new RevisionHistory(logOutput.getOutput(), kind);
		if (kind.equals(RepoKind.GIT)) {
			_log.info("your history\n" + yourHistory.toString());

		}
		source.setHistory(yourHistory);

		RevisionHistory myHistory = prefs.getEnvironment().getHistory();

		if (myHistory == null)
			return Relationship.ERROR + " Could not parse the history of your repository.";

		if (kind.equals(RepoKind.GIT))
			_log.info("my history\n" + myHistory.toString());
		// TODO figure out if we need to check for compile and test whenever histories change:
		// one of (source.hasHistoryChanged()) or (prefs.getEnvironment.hasHistoryChanged()) are true

		if (myHistory.equals(yourHistory)) {
			if (kind.equals(RepoKind.GIT)) {
				_log.info("\n yours: " + yours + "\nlog output: \n" + logOutput.getOutput());
				_log.info("same");
			}
			return Relationship.SAME;
		} else if (myHistory.superHistory(yourHistory)) {
			if (kind.equals(RepoKind.GIT)) {
				_log.info("\n yours: " + yours + "\nlog output: \n" + logOutput.getOutput());
				_log.info("ahead");
			}

			return Relationship.AHEAD;
		}

		else if (myHistory.subHistory(yourHistory)) {
			if (kind.equals(RepoKind.GIT)) {
				_log.info("\n yours: " + yours + "\nlog output: \n" + logOutput.getOutput());
				_log.info("behind");
			}
			return Relationship.BEHIND;
		} else if (kind.equals(RepoKind.GIT)) {
			_log.info("\n yours: " + yours + "\nlog output: \n" + logOutput.getOutput());
			_log.info("not same, ahead, or behind");
		}
		// Well, we in one of {MERGE, CONFLICT, COMPILECONFLICT, TESTCONFLICT} relationships, so we are going to have to bite the bullet and make local clones.

		// First, check if anything has changed.
		if (!(prefs.getEnvironment().hasHistoryChanged() || source.hasHistoryChanged())) {
			// Nothing has changed. Keep old status.
			if (kind.equals(RepoKind.GIT))
				_log.info("same with old relationship");
			return oldRelationship;
		}
		// OK, things have changed. We have to recompute.
		String answer;
		Output output;

		// pull your repo into [a temp clone of] mine
		String[] myArgs = { "clone", mine, tempMyName };
		try {
			output = RunIt.execute(executablePath, myArgs, tempWorkPath, false);
		} catch (IOException e2) {
			return Relationship.ERROR + " Couldn't make a temp clone: " + e2.getMessage();
		}
		String[] pullArgs = { "pull", yours };
		try {
			output = RunIt.execute(executablePath, pullArgs, tempWorkPath + tempMyName, false);
			if (kind.equals(RepoKind.GIT)) {
				_log.info("\n path: " + tempWorkPath + tempMyName);
				_log.info("\n pull output: " + output.getOutput());
			}
		} catch (IOException e2) {
			return Relationship.ERROR + " Couldn't pull into my temp clone: " + e2.getMessage();
		}

		if (output.getOutput().indexOf("(run '" + kind.toString().toLowerCase() + " heads' to see heads, '" + kind.toString().toLowerCase() + " merge' to merge)") >= 0
				|| output.getOutput().indexOf("Auto-merging") >= 0) {
			// there are two heads, so let's see if they merge cleanly
			String[] mergeArgs = { "merge", "--noninteractive" };
			try {
				if (kind.equals(RepoKind.HG))
					output = RunIt.execute(executablePath, mergeArgs, tempWorkPath + tempMyName, false);
			} catch (IOException e2) {
				return Relationship.ERROR + " Couldn't execute merge: " + e2.getMessage();
			}
			// if the merge goes through cleanly, we can try to compile and test
			if (output.getOutput().indexOf("(branch merge, don't forget to commit)") >= 0 || output.getOutput().indexOf("Merge made by recursive.") >= 0) {
				// try to compile
				String compileCommand = prefs.getEnvironment().getCompileCommand();
				if (compileCommand != null) {
					try {
						Output compileOutput = RunIt.tryCommand(compileCommand, tempWorkPath + tempMyName);
						if (compileOutput.getStatus() != 0)
							// if unsuccessful:
							answer = Relationship.COMPILECONFLICT;
						else {
							// if successful try to test
							String testCommand = prefs.getEnvironment().getTestCommand();
							if (testCommand != null) {
								Output testOutput = RunIt.tryCommand(testCommand, tempWorkPath + tempMyName);
								if (testOutput.getStatus() != 0)
									// if unsuccessful:
									answer = Relationship.TESTCONFLICT;
								else
									// if successful:
									answer = Relationship.MERGECLEAN;
							} else
								// we don't know how to test
								answer = Relationship.MERGECLEAN;
						}
					} catch (IOException e2) {
						return Relationship.ERROR + " Had and IO error trying to either compile or run tests: " + e2.getMessage();
					}
				} else
					// we don't know how to compile
					answer = Relationship.MERGECLEAN;
			}
			// otherwise, the merge failed
			else
				answer = Relationship.MERGECONFLICT;
		} else {
			// something went wrong
			_log.error("Crystal is having trouble comparing" + mine + " and " + yours + "\n" + output.toString());
			String errorMsg = "Crystal is having trouble comparing\n" + mine + " and " + yours + "\n" + "for the repository " + source.getShortName() + " in project "
					+ prefs.getName() + ".\n";
			// JOptionPane.showConfirmDialog(null, dialogMsg);
			// source.setEnabled(false);
			return Relationship.ERROR + " " + errorMsg;
		}
		// Clean up temp directories:
		if (kind.equals(RepoKind.GIT))
			_log.info("the relationship: " + answer);
		RunIt.deleteDirectory(new File(tempWorkPath + tempMyName));
		return answer;
	}

	/**
	 * An exception for GitOperations
	 */
	public static class OperationException extends Exception {
		private static final long serialVersionUID = -6885233021486785003L;

		private String _output;
		private String _command;
		private String _path;

		/**
		 * Creates a new GitOperationException
		 * 
		 * @param command
		 *            : the git command that caused the exception.
		 * @param path
		 *            : the path from which the command was run.
		 * @param output
		 *            : the output of the command.
		 */
		public OperationException(String command, String path, String output) {
			super("Tried to execute \n\"" + command + "\"\n in \"" + path + "\"\n" + "but got the output\n" + output);
			_output = output;
			_path = path;
			_command = command;
		}

		/**
		 * @return the output of the command.
		 */
		public String getOutput() {
			return _output;
		}

		/**
		 * @return the path in which this command was run.
		 */
		public String getPath() {
			return _path;
		}

		/**
		 * @return the command that was run.
		 */
		public String getCommand() {
			return _command;
		}

	}

}
