package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.entity.Paragraph;
import by.epamcourses.entity.PunctuationMark;
import by.epamcourses.entity.ReturnAsString;
import by.epamcourses.entity.Sentence;
import by.epamcourses.entity.Word;

public class TextParser {
    private ArrayList<ReturnAsString> listOfParagraphs = new ArrayList<>();
    private ArrayList<ReturnAsString> listOfSentences = new ArrayList<>();

    public ArrayList<ReturnAsString> parseText(String parseMe) {

	char[] bufText = parseMe.toCharArray();
	StringBuilder bufWord = new StringBuilder();
	// StringBuilder bufSentence = new StringBuilder();
	// StringBuilder bufParagraph = new StringBuilder();
	for (char symb : bufText) {

	    if (symb == ',' || symb == '!' || symb == '?') {
		listOfSentences.add(new Word(bufWord.toString()));
		listOfSentences.add(new PunctuationMark(String.valueOf(symb)));
		bufWord.setLength(0);
	    }

	    /*
	     * switch (symb) { case '\t': break; case '\n': break; case ' ': if
	     * (bufWord.length() != 0) { listOfSentences.add(new Word(bufWord.toString()));
	     * bufWord.setLength(0); } break; case ',': findPunctchar( bufWord, symb);
	     * break; case '.': findPunctchar(bufWord, symb); break; case '!':
	     * findPunctchar(bufWord, symb); break; case '?': findPunctchar(bufWord, symb);
	     * break;
	     * 
	     * default: bufWord.append(symb); break;
	     */
	}

 return listOfSentences;

    }

    private void findPunctchar(StringBuilder bufWord, char symb) {
	listOfSentences.add(new Word(bufWord.toString()));
	listOfSentences.add(new PunctuationMark(String.valueOf(symb)));
	bufWord.setLength(0);
    }

}
