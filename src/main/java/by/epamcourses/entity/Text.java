package by.epamcourses.entity;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.epamcourses.services.FileReader;

public class Text {

    private ArrayList<Paragraph> listOfParagraphs = new ArrayList<>();

    private String testText;

    public Text(String fileName) {

	try {
	    this.testText = new FileReader().readFromFile(fileName);
	} catch (FileNotFoundException e) {
	    System.out.println("File not found!!!");
	}
	parseByParagraph();

    }

    private void parseByParagraph() {
	char[] bufText = testText.toCharArray();
	StringBuffer strbuf = new StringBuffer();
	for (char sym : bufText) {
	    if (sym != '\u004E') {
		strbuf = strbuf.append(sym);
	    } else {
		listOfParagraphs.add(new Paragraph(strbuf.toString()));
		strbuf.setLength(0);
	    }
	}
    }

    public ArrayList<Paragraph> getListOfParagraphs() {
	return listOfParagraphs;
    }
    
    
    public String getTestText() {
	return testText;
    }

}
