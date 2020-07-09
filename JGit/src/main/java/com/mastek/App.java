package com.mastek;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
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

public class App {

	private static final String REMOTE_URL = "https://bitbucket.ipttools.info/scm/iptjj/ipt-jenkins-seed-jobs-kops1.git";
	private static final String BRANCH = "master";
	private static final String FILE_TO_READ = "feature-test-jenkins/test-feat-i-cw-atlas1/feat1-test-atlas/";

	public static void main(String[] args) {
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
		RevWalk revWalk = new RevWalk(repo);
		TreeWalk treeWalk = new TreeWalk(repo);
		try {
			git.fetch().setRemote(REMOTE_URL)
					.setCredentialsProvider(new UsernamePasswordCredentialsProvider("vanita.jeshnani", "Feb2020%84"))
					.setRefSpecs(new RefSpec("+refs/heads/*:refs/heads/*"))
					.call();

			repo.getObjectDatabase();
			ObjectId lastCommitId = repo.resolve("refs/heads/" + BRANCH);
			RevCommit commit = revWalk.parseCommit(lastCommitId);
			RevTree tree = commit.getTree();
			treeWalk.addTree(tree);
			treeWalk.setRecursive(true);
			treeWalk.setFilter(PathFilter.create(FILE_TO_READ));

			while (treeWalk.next()) {
				String name = treeWalk.getNameString();
				if(name.contains("groovy"))
				{
					OutputStream out = new FileOutputStream(name);
					ObjectId objectId = treeWalk.getObjectId(0);
					ObjectLoader loader = repo.open(objectId);
					loader.copyTo(out);
					out.close();
				}
			}
			revWalk.dispose();
		} 
		
		catch (GitAPIException e) {
			e.printStackTrace();
		} catch (RevisionSyntaxException e) {
			e.printStackTrace();
		} catch (AmbiguousObjectException e) {
			e.printStackTrace();
		} catch (IncorrectObjectTypeException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		finally {
			repo.close();
			git.close();
			revWalk.close();
			treeWalk.close();
		}
		
	}
}
