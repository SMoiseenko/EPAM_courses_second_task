package by.moiseenko.text_services;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Paragraph;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Sentence;
import by.moiseenko.text_entity.Word;

public class TextParser {
   
    static final String punctWordArray = ",:)";
    static final String punctSentencesArray = ".?!";
    static final String wordsElements = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789'-";

   static public ArrayList<CompositeTextParts> parseText(String parseMe) {

	ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();

	StringBuilder bufWord = new StringBuilder(); // buff to create word from char

	char[] bufText = parseMe.toCharArray(); // parse String to char[]

	if (bufText.length != 0) {
	    CompositeTextParts newSentence = new Sentence();
	    CompositeTextParts newParagraph = new Paragraph();

	    for (char symb : bufText) {

		if (symb == '\t') {// табы опускаем
		    continue;
		}

		if (symb == '\n') {
		    listOfParagraphs.add(newParagraph);
		    newParagraph = new Paragraph();
		}

		if (punctSentencesArray.contains(String.valueOf(symb))) {
		    if (bufWord.length() != 0) {
		    newSentence.addElementToList(new Word(bufWord.toString()));
		    bufWord.setLength(0);
		    }
		    newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
		    newParagraph.addElementToList(newSentence);
		    newSentence = new Sentence();
		}

		if (punctWordArray.contains(String.valueOf(symb))) {
		    newSentence.addElementToList(new Word(bufWord.toString()));
		    newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
		    bufWord.setLength(0);
		}

		if (symb == ' ' && bufWord.length() != 0) {
		    newSentence.addElementToList(new Word(bufWord.toString()));
		    bufWord.setLength(0);
		}
		if (symb == '(') {
		    newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
		}

		if (wordsElements.contains(String.valueOf(symb))) {
		    bufWord.append(symb);
		}
	    }

	} else {
	    System.out.println("File is empty, so no needed to be parsed!!!");
	}
	return listOfParagraphs;
    }
}
