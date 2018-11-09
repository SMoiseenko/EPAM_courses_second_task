package by.moiseenko.text_entity;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import by.moiseenko.text_services.FileReaderWriter;
import by.moiseenko.text_services.TextParser;

public class Text implements CompositeTextParts {

    // private final static Logger logger = Logger.getLogger(Text.class);

    private ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();

    /**
     * Default constructor that create new instance of the text, parse it, and
     * filled listOfParagraphs
     * 
     * @param fileName
     */

    public Text(String fileName) {
	String tempText = FileReaderWriter.readFromFile(fileName);
	this.listOfParagraphs = TextParser.parseText(tempText);
    }

    @Override
    public void addElementToList(CompositeTextParts paragraph) {
	listOfParagraphs.add(paragraph);
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	return listOfParagraphs;
    }

    @Override
    public String returnAsString() {
	StringBuilder paragraph = new StringBuilder();
	for (CompositeTextParts elements : listOfParagraphs) {
	    paragraph.append(elements.returnAsString());
	}
	return String.valueOf(paragraph);
    }

    @Override
    public String toString() {
	return (String.valueOf(this.getClass())).substring(31) + ".class";
    }

}
