package by.moiseenko.text_services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Utility class that receive path to file and return it as String (maybe make
 * inner?s)
 * 
 * @author Sergei Moiseenko
 *
 */
public class FileReaderWriter {
    
    private FileReaderWriter() {
	
    }

    public static String readFromFile(String fileName) {
	StringBuilder str = new StringBuilder();
	try (Scanner in = new Scanner(new File(fileName), "UTF-8")) {
	    while (in.hasNext()) {
		str.append("\n" + in.nextLine());
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File not found!!!");
	}
	str.deleteCharAt(0);
	return str.toString();
    }

    public static void writeToFile(String path, String text) {
	try (FileWriter writer = new FileWriter(path)) {
	    writer.write(text);
	    writer.flush();
	    System.out.println("File was written successfully.");

	} catch (IOException e) {
	    System.out.println(
		    "File named exists but is a directory rather than a regular file, does not exist but cannot be created, or cannot be opened for any other reason");
	}

    }

}
