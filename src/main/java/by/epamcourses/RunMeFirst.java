package by.epamcourses;

import java.util.ArrayList;

import by.epamcourses.entity.Paragraph;
import by.epamcourses.entity.PunctuationMark;
import by.epamcourses.entity.Sentence;
import by.epamcourses.entity.Text;
import by.epamcourses.entity.Word;
import by.epamcourses.entity.WorkAsString;
import by.epamcourses.services.TextParser;

public class RunMeFirst {

    public static void main(String[] args) {

	WorkAsString firstParagraph = new Paragraph();
	

	WorkAsString firstSentence = new Sentence();
	firstSentence.addElementToList(new Word("This"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("is"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("first"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("sentence"));
	firstSentence.addElementToList(new PunctuationMark("."));

	firstParagraph.addElementToList(firstSentence);
	
	WorkAsString secondSentence = new Sentence();
	secondSentence.addElementToList(new Word("Second"));
	secondSentence.addElementToList(new PunctuationMark("-"));
	secondSentence.addElementToList(new Word("sentence"));
	secondSentence.addElementToList(new PunctuationMark("-"));
	secondSentence.addElementToList(new Word("is"));
	secondSentence.addElementToList(new PunctuationMark("-"));
	secondSentence.addElementToList(new Word("this"));
	secondSentence.addElementToList(new PunctuationMark("."));

	firstParagraph.addElementToList(secondSentence);
	firstParagraph.addElementToList(firstSentence);
	firstParagraph.addElementToList(secondSentence);
	
	
	System.out.println(firstParagraph + "   " + firstParagraph.returnAsString());

	System.out.println("*****************");
	for (WorkAsString c : firstParagraph.getListOfElements()) {
	    System.out.println(c + "   " + c.returnAsString());
	}
	System.out.println("*****************");
	for (WorkAsString listOfSentences : firstParagraph.getListOfElements()) {
	    for (WorkAsString c : listOfSentences.getListOfElements()) {
		System.out.println(c + "   " + c.returnAsString());
	    }
	}
	System.out.println("*****************");

	

	/*
	 * Text newText = new Text("src/main/resources/1.txt"); //
	 * System.out.println(newText.getTestText()); TextParser newTextParser = new
	 * TextParser();
	 * 
	 * for (Sentence word : newTextParser.parseText(newText.getTestText())) {
	 * 
	 * System.out.println(word);
	 * 
	 * 
	 * if (word instanceof Word) { System.out.print(" "); }
	 * if(".".equals(word.returnAsString()) || "!".equals(word.returnAsString()) ||
	 * "?".equals(word.returnAsString()) ) {
	 * System.out.println(word.returnAsString()); } else {
	 * System.out.print(word.returnAsString()); }
	 * 
	 * }
	 * 
	 * // System.out.println(newTextParser.parseBySentences(newText.getTestText()));
	 * 
	 * }
	 */
    }
}
