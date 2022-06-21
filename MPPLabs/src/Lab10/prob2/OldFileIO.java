package Lab10.prob2;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.logging.Logger;



public class OldFileIO {
	private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());

	String projectDirectory = System.getProperty("user.dir");
	Path filePath = Paths.get(projectDirectory, "src", "Lab10", "prob1", "bugreport.txt");

	public final static String FILE_LOCATION =  Paths.get(System.getProperty("user.dir"),
			"src", "Lab10", "prob2", "output.txt").toString();

	public final static String TO_PRINT = "This is the string to print to file.";
	
	void writeText(String filename, String text) {
		File f = new File(filename);

		try (FileWriter fw = new FileWriter(new File(filename));
			 PrintWriter writer = new PrintWriter(fw)) {
			writer.print(text);
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		OldFileIO old = new OldFileIO();
	    old.writeText(FILE_LOCATION, TO_PRINT);
		
	}

}
