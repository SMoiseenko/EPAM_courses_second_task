package by.moiseenko;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Paragraph;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Sentence;
import by.moiseenko.text_entity.Word;

/**
 * The Class to initializing all data for tests.
 * @see TestTextParser
 * @see TestTextRestorer
 * @see TestTextManipulator
 */
public class InitDataForTests {
    
    private ArrayList<CompositeTextParts> paragraphsList = new ArrayList<>();
    private ArrayList<CompositeTextParts> sentencesList = new ArrayList<>();
    private ArrayList<CompositeTextParts> wordsAndPunctcharsList = new ArrayList<>();
    private ArrayList<CompositeTextParts> wordsList = new ArrayList<>();
    private String sortByAlphabetString = "A, an, april;\n" + "Breast, bright;\n" + "Chin, clocks, cold;\n" + "Day;\n"
	    + "Effort, escape;\n" + "His;\n" + "In, into, it;\n" + "Nuzzled;\n" + "Smith, striking;\n"
	    + "The, thirteen, to;\n" + "Vile;\n" + "Was, were, wind, winston;";
    private String textForParsingString = "\tIt was a bright, cold day in April.\n"
	    + "\tThe clocks were striking thirteen. Winston Smith, his chin nuzzled into his breast in an effort to "
	    + "escape the vile wind.";

    {
	// create wordsList
	wordsList.add(new Word("It"));
	wordsList.add(new Word("was"));
	wordsList.add(new Word("a"));
	wordsList.add(new Word("bright"));
	wordsList.add(new Word("cold"));
	wordsList.add(new Word("day"));
	wordsList.add(new Word("in"));
	wordsList.add(new Word("April"));
	wordsList.add(new Word("The"));
	wordsList.add(new Word("clocks"));
	wordsList.add(new Word("were"));
	wordsList.add(new Word("striking"));
	wordsList.add(new Word("thirteen"));
	wordsList.add(new Word("Winston"));
	wordsList.add(new Word("Smith"));
	wordsList.add(new Word("his"));
	wordsList.add(new Word("chin"));
	wordsList.add(new Word("nuzzled"));
	wordsList.add(new Word("into"));
	wordsList.add(new Word("his"));
	wordsList.add(new Word("breast"));
	wordsList.add(new Word("in"));
	wordsList.add(new Word("an"));
	wordsList.add(new Word("effort"));
	wordsList.add(new Word("to"));
	wordsList.add(new Word("escape"));
	wordsList.add(new Word("the"));
	wordsList.add(new Word("vile"));
	wordsList.add(new Word("wind"));
	// create wordsAndPunctcharsList
	wordsAndPunctcharsList.add(new Word("It"));
	wordsAndPunctcharsList.add(new Word("was"));
	wordsAndPunctcharsList.add(new Word("a"));
	wordsAndPunctcharsList.add(new Word("bright"));
	wordsAndPunctcharsList.add(new PunctuationMark(","));
	wordsAndPunctcharsList.add(new Word("cold"));
	wordsAndPunctcharsList.add(new Word("day"));
	wordsAndPunctcharsList.add(new Word("in"));
	wordsAndPunctcharsList.add(new Word("April"));
	wordsAndPunctcharsList.add(new PunctuationMark("."));
	wordsAndPunctcharsList.add(new Word("The"));
	wordsAndPunctcharsList.add(new Word("clocks"));
	wordsAndPunctcharsList.add(new Word("were"));
	wordsAndPunctcharsList.add(new Word("striking"));
	wordsAndPunctcharsList.add(new Word("thirteen"));
	wordsAndPunctcharsList.add(new PunctuationMark("."));
	wordsAndPunctcharsList.add(new Word("Winston"));
	wordsAndPunctcharsList.add(new Word("Smith"));
	wordsAndPunctcharsList.add(new PunctuationMark(","));
	wordsAndPunctcharsList.add(new Word("his"));
	wordsAndPunctcharsList.add(new Word("chin"));
	wordsAndPunctcharsList.add(new Word("nuzzled"));
	wordsAndPunctcharsList.add(new Word("into"));
	wordsAndPunctcharsList.add(new Word("his"));
	wordsAndPunctcharsList.add(new Word("breast"));
	wordsAndPunctcharsList.add(new Word("in"));
	wordsAndPunctcharsList.add(new Word("an"));
	wordsAndPunctcharsList.add(new Word("effort"));
	wordsAndPunctcharsList.add(new Word("to"));
	wordsAndPunctcharsList.add(new Word("escape"));
	wordsAndPunctcharsList.add(new Word("the"));
	wordsAndPunctcharsList.add(new Word("vile"));
	wordsAndPunctcharsList.add(new Word("wind"));
	wordsAndPunctcharsList.add(new PunctuationMark("."));
	// create sentencesList and paragraphsList
	CompositeTextParts firstSentence = new Sentence();
	CompositeTextParts firstParagraph = new Paragraph();
	firstSentence.addElementToList(new Word("It"));
	firstSentence.addElementToList(new Word("was"));
	firstSentence.addElementToList(new Word("a"));
	firstSentence.addElementToList(new Word("bright"));
	firstSentence.addElementToList(new PunctuationMark(","));
	firstSentence.addElementToList(new Word("cold"));
	firstSentence.addElementToList(new Word("day"));
	firstSentence.addElementToList(new Word("in"));
	firstSentence.addElementToList(new Word("April"));
	firstSentence.addElementToList(new PunctuationMark("."));
	sentencesList.add(firstSentence);
	firstParagraph.addElementToList(firstSentence);
	paragraphsList.add(firstParagraph);
	CompositeTextParts secondSentence = new Sentence();
	CompositeTextParts secondParagraph = new Paragraph();
	secondSentence.addElementToList(new Word("The"));
	secondSentence.addElementToList(new Word("clocks"));
	secondSentence.addElementToList(new Word("were"));
	secondSentence.addElementToList(new Word("striking"));
	secondSentence.addElementToList(new Word("thirteen"));
	secondSentence.addElementToList(new PunctuationMark("."));
	sentencesList.add(secondSentence);
	secondParagraph.addElementToList(secondSentence);
	CompositeTextParts thirdSentence = new Sentence();
	thirdSentence.addElementToList(new Word("Winston"));
	thirdSentence.addElementToList(new Word("Smith"));
	thirdSentence.addElementToList(new PunctuationMark(","));
	thirdSentence.addElementToList(new Word("his"));
	thirdSentence.addElementToList(new Word("chin"));
	thirdSentence.addElementToList(new Word("nuzzled"));
	thirdSentence.addElementToList(new Word("into"));
	thirdSentence.addElementToList(new Word("his"));
	thirdSentence.addElementToList(new Word("breast"));
	thirdSentence.addElementToList(new Word("in"));
	thirdSentence.addElementToList(new Word("an"));
	thirdSentence.addElementToList(new Word("effort"));
	thirdSentence.addElementToList(new Word("to"));
	thirdSentence.addElementToList(new Word("escape"));
	thirdSentence.addElementToList(new Word("the"));
	thirdSentence.addElementToList(new Word("vile"));
	thirdSentence.addElementToList(new Word("wind"));
	thirdSentence.addElementToList(new PunctuationMark("."));
	sentencesList.add(thirdSentence);
	secondParagraph.addElementToList(thirdSentence);
	paragraphsList.add(secondParagraph);
    }

    public ArrayList<CompositeTextParts> getParagraphsList() {
	return paragraphsList;
    }

    public ArrayList<CompositeTextParts> getSentencesList() {
	return sentencesList;
    }

    public ArrayList<CompositeTextParts> getWordsAndPunctcharsList() {
	return wordsAndPunctcharsList;
    }

    public ArrayList<CompositeTextParts> getWordsList() {
	return wordsList;
    }

    public String getSortByAlphabetString() {
	return sortByAlphabetString;
    }

    public String getTextForParsingString() {
	return textForParsingString;
    }

}
