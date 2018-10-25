package by.epamcourses.entity;

import java.io.FileNotFoundException;

import by.epamcourses.services.FileReader;

public class Text {

    private String text;
    
    public void setText(String fileName) throws FileNotFoundException {
	this.text = new FileReader().readFromFile(fileName);
	 }
    
    public String getText() {
	return text;
    }
    
    
    
}
