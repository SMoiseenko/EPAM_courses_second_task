package by.epamcourses.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Method-class that recieve path to file and return it as String (maybe make inner?s)
 * @author Sergei Moiseenko
 *
 */
public class FileReader {

    public String readFromFile(String fileName) throws FileNotFoundException {
	StringBuilder str = new StringBuilder("");
	Scanner in = new Scanner(new File(fileName));
	while (in.hasNext()) {
	    str.append(in.nextLine());
	}
	in.close();
	return str.toString();
    }

}
