/*
 * 
 */
package by.moiseenko.text_services;

import java.util.ArrayList;
import java.util.stream.Collectors;
import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

/**
 * The Class TextManipulator.
 */
public class TextManipulator {

    private TextManipulator() {

    }

    public static ArrayList<CompositeTextParts> getAllParagraphs(Text text) {
	return text.getListOfElements();
    }

    public static ArrayList<CompositeTextParts> getAllSentences(Text text) {
	ArrayList<CompositeTextParts> allSentenses = new ArrayList<>();
	getAllParagraphs(text).stream().forEach(par -> allSentenses.addAll(par.getListOfElements()));
	return allSentenses;
    }
//tested
    public static ArrayList<CompositeTextParts> getAllWordsAndPunctchars(Text text) {
	ArrayList<CompositeTextParts> allWordsAndPunctchars = new ArrayList<>();
	getAllSentences(text).stream().forEach(sen -> allWordsAndPunctchars.addAll(sen.getListOfElements()));
	return allWordsAndPunctchars;
    }
//tested
    public static ArrayList<CompositeTextParts> getAllWords(Text text) {
	return getAllWordsAndPunctchars(text).stream().filter(el -> el instanceof Word)
		.collect(Collectors.toCollection(ArrayList::new));
    }
//tested
    public static String sortByAlphabet(Text text) {

	StringBuilder resultString = new StringBuilder();
	char newLetter = '0';

	ArrayList<String> arrayOfWords = getAllWords(text).stream().map(el -> el.returnAsString().toLowerCase())
		.distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

	for (String word : arrayOfWords) {
	    if (word.charAt(0) == newLetter) {
		resultString.append(", " + word);
	    } else {
		newLetter = word.charAt(0);
		char[] s = word.toCharArray();
		s[0] = Character.toUpperCase(s[0]);
		resultString.append(";\n" + String.valueOf(s));
	    }
	}
	resultString.delete(0, 2);
	resultString.append(";");
	return String.valueOf(resultString);
    }
}
