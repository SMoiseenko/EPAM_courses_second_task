package by.moiseenko;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_services.TextManipulator;
/**
 * The Class to testing all methods of {@link TextManipulator} class.
 * @author Sergei Moiseenko
 * @see TextManipulator
 */
public class TestTextManipulator {
    private Text testedText; 
    private String expectedSortByAlphabetString;
    private ArrayList<CompositeTextParts> expectedWordsList;
    private ArrayList<CompositeTextParts> expectedWordsAndPunctcharsList;
    private ArrayList<CompositeTextParts> expectedSentencesList;
    private ArrayList<CompositeTextParts> expectedParagraphsList;

    @BeforeClass
    public void beforeClass() {
	InitDataForTests initData = new InitDataForTests();
	expectedSortByAlphabetString = initData.getSortByAlphabetString();
	expectedWordsList = initData.getWordsList();
	expectedWordsAndPunctcharsList = initData.getWordsAndPunctcharsList();
	expectedSentencesList = initData.getSentencesList();
	expectedParagraphsList = initData.getParagraphsList();
	testedText = new Text("src/test/resources/FOR_TEST.txt");
	
    }

    @Test
    public void testSortByAlphabet() {
	// WHEN
	String actualSortByAlphabetString = TextManipulator.sortByAlphabet(testedText);
	// THEN
	Assert.assertEquals(actualSortByAlphabetString, expectedSortByAlphabetString);
    }
    @Test
    public void testGetAllWords() {
	// WHEN
	ArrayList<CompositeTextParts> actualWordsList = TextManipulator.getAllWords(testedText);
	// THEN
	Assert.assertEquals(actualWordsList, expectedWordsList);
    }
    @Test
    public void testGetAllWordsAndPunctchars() {
	// WHEN
	ArrayList<CompositeTextParts> actualWordsAndPunctcharsList = TextManipulator.getAllWordsAndPunctchars(testedText);
	//THEN
	Assert.assertEquals(actualWordsAndPunctcharsList, expectedWordsAndPunctcharsList);
    }
    @Test
    public void testGetAllSentences() {
	// WHEN
	ArrayList<CompositeTextParts> actualSentencesList = TextManipulator.getAllSentences(testedText);
	// THEN
	Assert.assertEquals(actualSentencesList, expectedSentencesList);
    }
    @Test
    public void testGetAllParagraphs() {
	// WHEN
	ArrayList<CompositeTextParts> actualParagraphsList = TextManipulator.getAllParagraphs(testedText);
	// THEN
	Assert.assertEquals(actualParagraphsList, expectedParagraphsList);
    }
    
}
