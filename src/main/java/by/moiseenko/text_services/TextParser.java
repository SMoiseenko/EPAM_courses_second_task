package by.moiseenko.text_services;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Paragraph;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Sentence;
import by.moiseenko.text_entity.Word;

public class TextParser {

    static final String PUNCT_WORD_ARRAY = ",:;-)";
    static final String PUNCT_SENTENCES_ARRAY = ".?!";
    static final String WORDS_ELEMENTS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789'";
    
    private TextParser () {
	
    }

    public static ArrayList<CompositeTextParts> textParser(String parseMe) {

	ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();

	StringBuilder bufWord = new StringBuilder();
	char[] bufText = parseMe.toCharArray();

	if (bufText.length != 0) {
	    CompositeTextParts newSentence = new Sentence();
	    CompositeTextParts newParagraph = new Paragraph();

	    for (char symb : bufText) {

		if (symb == '\t') {
		    continue;
		}

		if (symb == '\n') {
		    listOfParagraphs.add(newParagraph);
		    newParagraph = new Paragraph();
		}

		if (PUNCT_SENTENCES_ARRAY.contains(String.valueOf(symb))) {
		    if (bufWord.length() != 0) {
			newSentence.addElementToList(new Word(bufWord.toString()));
			bufWord.setLength(0);
		    }
		    newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
		    newParagraph.addElementToList(newSentence);
		    newSentence = new Sentence();
		}

		if (PUNCT_WORD_ARRAY.contains(String.valueOf(symb))) {
		    if (symb != '-') {
			newSentence.addElementToList(new Word(bufWord.toString()));
			newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
			bufWord.setLength(0);
		    } else {
			newSentence.addElementToList(new PunctuationMark(String.valueOf(symb)));
			bufWord.setLength(0);
		    }
		}

		if (symb == ' ' && bufWord.length() != 0) {
		    newSentence.addElementToList(new Word(bufWord.toString()));
		    bufWord.setLength(0);
		}

		if (WORDS_ELEMENTS.contains(String.valueOf(symb))) {
		    bufWord.append(symb);
		}
	    }

	    listOfParagraphs.add(newParagraph);//add last 
	    
	} else {
	    System.out.println("File is empty, so no needed to be parsed!!!");
	}
	return listOfParagraphs;
    }
}
