/*
 * 
 */
package by.moiseenko.text_services;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

/**
 * The utility class to work with {@link Text} objects by methods: <br>
 * </i>ArrayList<CompositeTextParts> getAllParagraphs(Text text)</i> <br>
 * </i>ArrayList<CompositeTextParts> getAllSentences(Text text)</i> <br>
 * </i>ArrayList<CompositeTextParts> getAllWordsAndPunctchars(Text text)</i>
 * <br>
 * </i>ArrayList<CompositeTextParts> getAllWords(Text text)</i> <br>
 * </i>String sortByAlphabet(Text text)</i>
 * 
 * @author moiseenko-s
 * @see Text
 */
public class TextManipulator {
    private final static Logger logger = Logger.getLogger(TextManipulator.class);

    private TextManipulator() {

    }

    public static ArrayList<CompositeTextParts> getAllParagraphs(Text text) {
	if (logger.isInfoEnabled()) {
	    StringBuffer forText = new StringBuffer();
	    text.getListOfElements().stream().forEach(el -> forText.append(el.returnAsString() + "\n"));
	    logger.info(
		    "Text object\n" + forText.toString() + "\n consist with next paragraphs\n" + forText.toString());
	}
	return text.getListOfElements();
    }

    public static ArrayList<CompositeTextParts> getAllSentences(Text text) {
	ArrayList<CompositeTextParts> allSentenses = new ArrayList<>();
	getAllParagraphs(text).stream().forEach(par -> allSentenses.addAll(par.getListOfElements()));
	if (logger.isInfoEnabled()) {
	    StringBuffer forText = new StringBuffer();
	    StringBuffer forSentences = new StringBuffer();
	    text.getListOfElements().stream().forEach(el -> forText.append(el.returnAsString() + "\n"));
	    allSentenses.stream().forEach(el -> forSentences.append(el.returnAsString() + "\n"));
	    logger.info("Text object\n" + forText.toString() + "\n consist with next sentences\n"
		    + forSentences.toString());
	}
	return allSentenses;

    }

    public static ArrayList<CompositeTextParts> getAllWordsAndPunctchars(Text text) {
	ArrayList<CompositeTextParts> allWordsAndPunctchars = new ArrayList<>();
	getAllSentences(text).stream().forEach(sen -> allWordsAndPunctchars.addAll(sen.getListOfElements()));
	if (logger.isInfoEnabled()) {
	    StringBuffer forText = new StringBuffer();
	    StringBuffer forWordsAndPunctchars = new StringBuffer();
	    text.getListOfElements().stream().forEach(el -> forText.append(el.returnAsString() + "\n"));
	    allWordsAndPunctchars.stream().forEach(el -> forWordsAndPunctchars.append(el.returnAsString() + "\n"));
	    logger.info("Text object\n" + forText.toString() + "\n consist with next sentences\n"
		    + forWordsAndPunctchars.toString());
	}
	return allWordsAndPunctchars;
    }

    public static ArrayList<CompositeTextParts> getAllWords(Text text) {
	return getAllWordsAndPunctchars(text).stream().filter(el -> el instanceof Word)
		.collect(Collectors.toCollection(ArrayList::new));
    }

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
	if (logger.isInfoEnabled()) {
	    StringBuffer forText = new StringBuffer();
	    text.getListOfElements().stream().forEach(el -> forText.append(el.returnAsString() + "\n"));
	    logger.info("Text object\n" + forText.toString() + "\n after method \"sortByAlphabet\" return next string\n"
		    + resultString.toString());
	}
	return String.valueOf(resultString);
    }
}
