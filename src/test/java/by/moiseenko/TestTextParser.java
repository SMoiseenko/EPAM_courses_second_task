package by.moiseenko;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_services.TextParser;

/**
 * The Class to testing <i>textParser</i> method of {@link TextParser} class.
 * @author Sergei Moiseenko
 **/
public class TestTextParser {
    private String textParserString;
    private ArrayList<CompositeTextParts> exepcedParserResult;

    @BeforeMethod
    public void beforeMethod() {
	InitDataForTests initData = new InitDataForTests();
	exepcedParserResult = initData.getParagraphsList();
	textParserString = initData.getTextForParsingString();
    }

    @Test
    public void testTextParser() {
	// WHEN
	ArrayList<CompositeTextParts> actualParserResult = TextParser.textParser(textParserString);
	// THEN
	Assert.assertEquals(actualParserResult, exepcedParserResult);
    }

}
