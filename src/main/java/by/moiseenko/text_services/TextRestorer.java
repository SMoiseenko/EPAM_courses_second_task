package by.moiseenko.text_services;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

public class TextRestorer {
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

	return restoredText.toString();
    }

}
