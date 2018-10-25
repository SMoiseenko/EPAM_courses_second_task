package by.epamcourses.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public String readFromFile(String fileName) throws FileNotFoundException {
	StringBuilder str = new StringBuilder("");
	Scanner in = new Scanner(new File(fileName));
	while (in.hasNext()) {
	    str.append(in.nextLine() + "\r\n");
	}
	in.close();
	return str.toString();
    }

}
