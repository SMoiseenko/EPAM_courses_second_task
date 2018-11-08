package by.moiseenko;

import by.moiseenko.text_entity.Text;
import by.moiseenko.text_services.TextManipulator;
import by.moiseenko.text_services.TextRestorer;


public class RunMeFirst {

    public static void main(String[] args) {

	Text text = new Text("src/main/resources/1984.txt");
	TextManipulator textMAnipulator = new TextManipulator();
	
	System.out.println(textMAnipulator.getAllParagraphs(text).stream().count() + " - Paragraphs");
	System.out.println(textMAnipulator.getAllSentences(text).stream().count() + " - Sentences");
	
	System.out.println(textMAnipulator.getAllWordsAndPunctchars(text).stream().count() + " - Words & Punctchars");
	
	System.out.println(textMAnipulator.getAllWords(text).stream().count() + " - Words");
	
	textMAnipulator.sortByAlphabet(text).stream().forEach(el -> System.out.println(el.returnAsString()));

	/*
	 * This part of code create composite text and return each possible elements
	 * list
	 * 
	 * 
	 * CompositeTextParts text = new Text();
	 * 
	 * CompositeTextParts firstParagraph = new Paragraph(); CompositeTextParts
	 * secondParagraph = new Paragraph();
	 * 
	 * CompositeTextParts firstSentence = new Sentence(); CompositeTextParts
	 * secondSentence = new Sentence();
	 * 
	 * firstSentence.addElementToList(new Word("This"));
	 * firstSentence.addElementToList(new PunctuationMark("-"));
	 * firstSentence.addElementToList(new Word("is"));
	 * firstSentence.addElementToList(new PunctuationMark("-"));
	 * firstSentence.addElementToList(new Word("first"));
	 * firstSentence.addElementToList(new PunctuationMark("-"));
	 * firstSentence.addElementToList(new Word("sentence"));
	 * firstSentence.addElementToList(new PunctuationMark("."));
	 * 
	 * secondSentence.addElementToList(new Word("Second"));
	 * secondSentence.addElementToList(new PunctuationMark("-"));
	 * secondSentence.addElementToList(new Word("sentence"));
	 * secondSentence.addElementToList(new PunctuationMark("-"));
	 * secondSentence.addElementToList(new Word("is"));
	 * secondSentence.addElementToList(new PunctuationMark("-"));
	 * secondSentence.addElementToList(new Word("this"));
	 * secondSentence.addElementToList(new PunctuationMark("."));
	 * 
	 * firstParagraph.addElementToList(firstSentence);
	 * firstParagraph.addElementToList(secondSentence);
	 * 
	 * secondParagraph.addElementToList(secondSentence);
	 * secondParagraph.addElementToList(firstSentence);
	 * 
	 * text.addElementToList(firstParagraph);
	 * text.addElementToList(secondParagraph);
	 * 
	 * System.out.println("********TEXT*********"); System.out.println(text + "   "
	 * + text.returnAsString()); System.out.println("*****************");
	 * 
	 * System.out.println("********PARAGRAPH*********");
	 * text.getListOfElements().stream().forEach((el) -> System.out.println(el +
	 * "   " + el.returnAsString())); System.out.println("*****************");
	 * 
	 * System.out.println("*******SENTENCES**********");
	 * text.getListOfElements().stream().forEach((el) ->
	 * el.getListOfElements().stream() .forEach((elm) -> System.out.println(elm +
	 * "   " + elm.returnAsString())));
	 * 
	 * System.out.println("*****************");
	 * 
	 * System.out.println("*******WORD'S*AND*PUNCTUATION*MARK'S*******");
	 * text.getListOfElements().stream().forEach((el) ->
	 * el.getListOfElements().stream().forEach((elm) -> elm
	 * .getListOfElements().stream().forEach((elem) -> System.out.println(elem +
	 * "   " + elem.returnAsString())
	 * 
	 * )));
	 * 
	 * System.out.println("*****************");
	 * 
	 */

    }
}
