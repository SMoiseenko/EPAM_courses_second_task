package by.moiseenko.text_services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Utility class that:
 * <br>read from <b>txt</b> file to String with <i>String readFromFile(String fileName)</i> method;
 * <br> write to <b>txt</b> file from String with <i>void writeToFile(String path, String text)</i> method;
 * @author Sergei Moiseenko
 */
public class FileReaderWriter {
    private final static Logger logger = Logger.getLogger(FileReaderWriter.class);

    private FileReaderWriter() {

    }

    public static String readFromFile(String fileName) {
	StringBuilder str = new StringBuilder();
	try (Scanner in = new Scanner(new File(fileName), "UTF-8")) {
	    while (in.hasNext()) {
		str.append("\n" + in.nextLine());
	    }
	} catch (FileNotFoundException e) {
	    logger.error("File" + fileName + " not found!!!");
	}
	str.deleteCharAt(0);
	if (logger.isInfoEnabled()) {
	    logger.info("File" + fileName + "was read in String \n" + str.toString());
	}
	return str.toString();
    }

    public static void writeToFile(String path, String text) {
	try (FileWriter writer = new FileWriter(path)) {
	    writer.write(text);
	    writer.flush();
	    if (logger.isInfoEnabled()) {
		    logger.info("String \n" + text + "\n was written to the file" + path);
	    }
	    System.out.println("File was written successfully.");

	} catch (IOException e) {
	    logger.error("File" + path
		    + "exists but is a directory rather than a regular file, does not exist but cannot be created, or cannot be opened for any other reason");
	}

    }

}
