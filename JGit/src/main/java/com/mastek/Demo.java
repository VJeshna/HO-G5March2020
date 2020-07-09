package com.mastek;

import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.errors.AmbiguousObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.RevisionSyntaxException;
import org.eclipse.jgit.internal.storage.dfs.DfsRepositoryDescription;
import org.eclipse.jgit.internal.storage.dfs.InMemoryRepository;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectLoader;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.transport.RefSpec;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.PathFilter;

public class Demo {

	private static final String REMOTE_URL = "https://github.com/VJeshna/HO-G5March2020.git";
	private static final String BRANCH = "master";
	private static final String FILE_TO_READ = "README.md";
	
	public static void main(String[] args) throws InvalidRemoteException, TransportException, GitAPIException,
			RevisionSyntaxException, AmbiguousObjectException, IncorrectObjectTypeException, IOException {

		// String value = System.getenv("XDG_CONFIG_HOME");

		/*
		 * Git.cloneRepository().setURI(
		 * "https://bitbucket.ipttools.info/scm/iptjj/ipt-jenkins-seed-jobs-kops1.git")
		 * .setCredentialsProvider(new
		 * UsernamePasswordCredentialsProvider("vanita.jeshnani", "Feb2020%84"))
		 * .setDirectory( new File("C:/Product/SampleRepo")) // #1 .call();
		 */

		DfsRepositoryDescription repoDesc = new DfsRepositoryDescription();
		InMemoryRepository repo = new InMemoryRepository(repoDesc);
		Git git = new Git(repo);
		git.fetch().setRemote(REMOTE_URL)
				.setCredentialsProvider(new UsernamePasswordCredentialsProvider("VJeshna", "Feb2020%84"))
				.setRefSpecs(new RefSpec("+refs/heads/*:refs/heads/*"))
				.call();
		repo.getObjectDatabase();
		ObjectId lastCommitId = repo.resolve("refs/heads/" + BRANCH);
		RevWalk revWalk = new RevWalk(repo);
		RevCommit commit = revWalk.parseCommit(lastCommitId);
		RevTree tree = commit.getTree();
		TreeWalk treeWalk = new TreeWalk(repo);
		treeWalk.addTree(tree);
		treeWalk.setRecursive(true);
		treeWalk.setFilter(PathFilter.create(FILE_TO_READ));
		if (!treeWalk.next()) {
			return;
		}
		ObjectId objectId = treeWalk.getObjectId(0);
		ObjectLoader loader = repo.open(objectId);
		loader.copyTo(System.out);
	}
}
