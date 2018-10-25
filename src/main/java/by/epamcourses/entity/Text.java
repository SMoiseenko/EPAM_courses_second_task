package by.epamcourses.entity;

import java.io.FileNotFoundException;

import by.epamcourses.services.FileReader;

public class Text {

    private String text;
    
    public Text(String fileName) {
	
	try {
	this.text = new FileReader().readFromFile(fileName);
	} catch (FileNotFoundException e) {
	    System.out.println("File not found!!!");
	}
    }

    
    
    
    
    public String getText() {
	return text;
    }
    
    
    
}
