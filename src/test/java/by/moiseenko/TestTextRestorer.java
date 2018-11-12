package by.moiseenko;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.moiseenko.text_entity.Text;
import by.moiseenko.text_services.TextRestorer;
/**
 * The Class to testing <i>testRestorer</i> method of {@link TextRestorer}
 * @author moiseenko-s
 */
public class TestTextRestorer {
    private Text testedText;
    private String exepedTextRestoredString;
    
    @BeforeMethod
    public void beforeMethod() {
	InitDataForTests initData = new InitDataForTests();
	exepedTextRestoredString = initData.getTextForParsingString();
	testedText = new Text("src/test/resources/FOR_TEST.txt");
	
    }
    
    @Test
    public void testTextRestorer() {
	// WHEN
	String actualTextRestoredString = TextRestorer.textRestorer(testedText);
	// THEN
	Assert.assertEquals(actualTextRestoredString, exepedTextRestoredString);
    }
        
}
