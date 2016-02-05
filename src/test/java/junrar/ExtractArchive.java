package junrar;

import java.io.File;
import java.io.IOException;

import junrar.exception.RarException;
import junrar.extract.RarExtractor;

/**
 * extract an archive to the given location
 * 
 * @author edmund wagner
 * 
 */
public class ExtractArchive {

	public static void main(String[] args) throws IOException, RarException {
		if (args.length == 3) {
			extractArchive(args[0], args[1], args[2]);
		} else if (args.length == 2) {
			extractArchive(args[0], args[1], null);
		} else {
			System.out.println("Usage: java -jar extractArchive.jar <thearchive> <the destination directory> [<password>]");
		}
	}
	
	public static void extractArchive(String archive, String destination, String password) throws IOException, RarException {
		if (archive == null || destination == null) {
			throw new RuntimeException("Archive and destination must be set");
		}
		File arch = new File(archive);
		if (!arch.exists()) {
			throw new RuntimeException("The archive does not exit: " + archive);
		}
		File dest = new File(destination);
		if (!dest.exists() || !dest.isDirectory()) {
			throw new RuntimeException("The destination must exist and point to a directory: " + destination);
		}
		ExtractArchive.extractArchive(arch, dest, password);
	}
	
	public static void extractArchive(File archive, File destination, String password) throws IOException, RarException {
		RarExtractor rarExtractor = new RarExtractor();
		rarExtractor.extractArchive(archive, destination/*, password*/);
	}

}
