package by.moiseenko.text_services;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Paragraph;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Sentence;
import by.moiseenko.text_entity.Word;

public class TextParser {
    private ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();
    private ArrayList<Sentence> listOfSentences = new ArrayList<>();
    

    String punctWordArray = ",:-)";
    String punctSentencesArray = ".?!";

    public ArrayList<Sentence> parseText(String parseMe) {

	char[] bufText = parseMe.toCharArray(); // parse String to char[]

	StringBuilder bufWord = new StringBuilder(); // buff to create word from char
	ArrayList<CompositeTextParts> bufferPartsOfSentence = new ArrayList<>();
	
	for (char symb : bufText) {

	    if (punctSentencesArray.contains(String.valueOf(symb))) {
		bufferPartsOfSentence.add(new Word(bufWord.toString()));
		bufferPartsOfSentence.add(new PunctuationMark(String.valueOf(symb)));
		bufWord.setLength(0);
		listOfSentences.add(new Sentence());
		bufferPartsOfSentence.clear();;

	    } else {
//****************************
		if (Character.isLetterOrDigit(symb) || symb == '\'') {// слово это буквы цифры и апостроф
		    bufWord.append(symb);
		}

		if (symb == '\t') {// табы опускаем
		    continue;
		}

		if (symb == ' ' && bufWord.length() != 0) { // пробелы = новое слово
		    bufferPartsOfSentence.add(new Word(bufWord.toString()));
		    bufWord.setLength(0);

		}

		if (symb == '(') {
		    bufferPartsOfSentence.add(new PunctuationMark(String.valueOf(symb)));

		}

		if (punctWordArray.contains(String.valueOf(symb))) {// есть ли пункт в стринге пунктров
		    bufferPartsOfSentence.add(new Word(bufWord.toString()));
		    bufferPartsOfSentence.add(new PunctuationMark(String.valueOf(symb)));
		    bufWord.setLength(0);
		}
	    }
//************************
	}

	return listOfSentences;

    }

}
