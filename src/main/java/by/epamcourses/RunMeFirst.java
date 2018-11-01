package by.epamcourses;

import by.epamcourses.entity.Paragraph;
import by.epamcourses.entity.PunctuationMark;
import by.epamcourses.entity.ReturnAsString;
import by.epamcourses.entity.Text;
import by.epamcourses.entity.Word;
import by.epamcourses.services.TextParser;

public class RunMeFirst {

    public static void main(String[] args) {
	Text newText = new Text("src/main/resources/1.txt");
	//System.out.println(newText.getTestText());
	TextParser newTextParser = new TextParser();
for (ReturnAsString word : newTextParser.parseText(newText.getTestText())) {
	   
    if (word instanceof Word) {
	 System.out.print(" ");
    }
    if(".".equals(word.returnAsString())  || "!".equals(word.returnAsString()) ||  "?".equals(word.returnAsString()) ) {
	System.out.println(word.returnAsString());
    } else {
    System.out.print(word.returnAsString());
    }	   
	    
	}
	
	//System.out.println(newTextParser.parseBySentences(newText.getTestText()));
	
    }

}
