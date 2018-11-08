package by.moiseenko.text_services;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

public class TextManipulator {

    public ArrayList<CompositeTextParts> getAllParagraphs(Text text) {
	return text.getListOfElements();
    }

    public ArrayList<CompositeTextParts> getAllSentences(Text text) {
	ArrayList<CompositeTextParts> allSentenses = new ArrayList<>();
	getAllParagraphs(text).stream().forEach(par -> allSentenses.addAll(par.getListOfElements()));
	return allSentenses;
    }

    public ArrayList<CompositeTextParts> getAllWordsAndPunctchars(Text text) {
	ArrayList<CompositeTextParts> allWordsAndPunctchars = new ArrayList<>();
	getAllSentences(text).stream().forEach(sen -> allWordsAndPunctchars.addAll(sen.getListOfElements()));
	;
	return allWordsAndPunctchars;
    }

    public ArrayList<CompositeTextParts> getAllWords(Text text) {
	return getAllWordsAndPunctchars(text).stream().filter(el -> el instanceof Word)
		.collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<CompositeTextParts> sortByAlphabet(Text text) {

	return getAllWords(text).stream().peek((el) -> new Word(el.returnAsString().toLowerCase())).distinct().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

}
