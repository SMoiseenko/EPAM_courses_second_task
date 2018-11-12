package by.moiseenko.text_entity;

import java.util.ArrayList;

import by.moiseenko.text_services.FileReaderWriter;
import by.moiseenko.text_services.TextParser;

/**
 * The basic entity class Text implement {@link CompositeTextParts} to realize
 * composite pattern. Have one field of collection type of list to storage all
 * {@link Paragraph}.
 * 
 * @author moiseenko-s
 * @see Paragraph
 * @see Sentence
 * @see Word
 * @see PunctuationMark
 */
public class Text implements CompositeTextParts {
    private ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();

    public Text(String fileName) {
	String tempText = FileReaderWriter.readFromFile(fileName);
	this.listOfParagraphs = TextParser.textParser(tempText);
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
