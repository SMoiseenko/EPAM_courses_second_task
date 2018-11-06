package by.moiseenko.text_entity;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.moiseenko.text_services.FileReader;

public class Text {

    private ArrayList<Paragraph> listOfParagraphs = new ArrayList<>();

    private String tempText;
/**
 * Default constructor that create new instance of the text and filled String tempText filed
 * by files with path
 * @param fileName
 */
    public Text(String fileName) {
	try {
	    this.tempText = new FileReader().readFromFile(fileName);
	} catch (FileNotFoundException e) {
	    System.out.println("File not found!!!");
	}
    }

    public ArrayList<Paragraph> getListOfParagraphs() {
	return listOfParagraphs;
    }

    public String getTestText() {
	return tempText;
    }

}
