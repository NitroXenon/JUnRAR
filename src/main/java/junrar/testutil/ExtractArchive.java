package junrar.testutil;

import java.io.File;
import java.io.IOException;

import junrar.exception.RarException;

/**
 * extract an archive to the given location
 * 
 * @author edmund wagner
 * 
 */
public class ExtractArchive {

	public static void main(String[] args) throws IOException, RarException {
		if (args.length == 2) {
			extractArchive(args[0], args[1]);
		} else {
			System.out.println("usage: java -jar extractArchive.jar <thearchive> <the destination directory>");
		}
	}
	
	public static void extractArchive(String archive, String destination) throws IOException, RarException {
		if (archive == null || destination == null) {
			throw new RuntimeException("archive and destination must me set");
		}
		File arch = new File(archive);
		if (!arch.exists()) {
			throw new RuntimeException("the archive does not exit: " + archive);
		}
		File dest = new File(destination);
		if (!dest.exists() || !dest.isDirectory()) {
			throw new RuntimeException("the destination must exist and point to a directory: " + destination);
		}
		ExtractArchive.extractArchive(arch, dest);
	}
	
	public static void extractArchive(File archive, File destination) throws IOException, RarException {
		junrar.extract.RarExtractor extractArchive = new junrar.extract.RarExtractor();
//		extractArchive.setLogger(LogFactory.getLog(ExtractArchive.class.getName()));
		extractArchive.extractArchive(archive, destination);
	}
}
