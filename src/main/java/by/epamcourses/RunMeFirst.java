package by.epamcourses;

import java.util.ArrayList;

import by.epamcourses.text_entity.Paragraph;
import by.epamcourses.text_entity.PunctuationMark;
import by.epamcourses.text_entity.Sentence;
import by.epamcourses.text_entity.Text;
import by.epamcourses.text_entity.Word;
import by.epamcourses.text_entity.CompositeTextParts;
import by.epamcourses.text_services.TextParser;

public class RunMeFirst {

    public static void main(String[] args) {

	CompositeTextParts firstParagraph = new Paragraph();
	

	CompositeTextParts firstSentence = new Sentence();
	firstSentence.addElementToList(new Word("This"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("is"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("first"));
	firstSentence.addElementToList(new PunctuationMark("-"));
	firstSentence.addElementToList(new Word("sentence"));
	firstSentence.addElementToList(new PunctuationMark("."));

	firstParagraph.addElementToList(firstSentence);
	
	CompositeTextParts secondSentence = new Sentence();
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
	for (CompositeTextParts c : firstParagraph.getListOfElements()) {
	    System.out.println(c + "   " + c.returnAsString());
	}
	System.out.println("*****************");
	for (CompositeTextParts listOfSentences : firstParagraph.getListOfElements()) {
	    for (CompositeTextParts c : listOfSentences.getListOfElements()) {
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
