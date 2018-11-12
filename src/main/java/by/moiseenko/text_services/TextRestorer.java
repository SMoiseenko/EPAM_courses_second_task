package by.moiseenko.text_services;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

/**
 * The Class that restore {@link Text} class object to String with all
 * whitespace, tabulators and new line symbols by: <br>
 * <i>String textRestorer(Text text)</i> method.
 * 
 * @author moiseenko-s
 * @see Text
 */
public class TextRestorer {
    private final static Logger logger = Logger.getLogger(TextRestorer.class);

    private TextRestorer() {

    }

    public static String textRestorer(Text text) {
	StringBuilder restoredText = new StringBuilder();

	ArrayList<CompositeTextParts> listParagraphs = TextManipulator.getAllParagraphs(text);
	// for all Paragraphs
	for (int par = 0; par < listParagraphs.size(); par++) {
	    restoredText.append("\t");
	    // for each sentences from paragraph[s]
	    for (int sen = 0; sen < listParagraphs.get(par).getListOfElements().size(); sen++) {
		if (sen != 0 && sen < listParagraphs.get(par).getListOfElements().size()) {
		    restoredText.append(' ');
		}
		// for each words or punctuation marks
		for (int wap = 0; wap < listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
			.size(); wap++) {

		    if (listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
			    .get(wap) instanceof Word) {
			if (wap != 0 && wap != listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
				.size()) {
			    restoredText.append(' ');
			}
			restoredText.append(listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
				.get(wap).returnAsString());
		    }

		    if (listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
			    .get(wap) instanceof PunctuationMark) {
			restoredText.append(listParagraphs.get(par).getListOfElements().get(sen).getListOfElements()
				.get(wap).returnAsString());
		    }
		} // end for WAP
	    } // end for sentences
	    if (par < listParagraphs.size() - 1) {
		restoredText.append("\n");
	    }
	} // end for paragraphs
	if (logger.isInfoEnabled()) {
	    StringBuffer forLogger = new StringBuffer();
	    text.getListOfElements().stream().forEach(el -> forLogger.append(el.returnAsString() + "\n"));
	    logger.info("Text object /n" + forLogger.toString() + "was restored to\n" + restoredText.toString());
	}
	return restoredText.toString();
    }

}
