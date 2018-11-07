package by.moiseenko.text_services;

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
	Scanner in = new Scanner(new File(fileName), "UTF-8");
	while (in.hasNext()) {
	    str.append(in.nextLine() + "\n");
	}
	in.close();
	return str.toString();
    }

}
