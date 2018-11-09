package by.moiseenko.text_services;

import java.util.ArrayList;

import by.moiseenko.text_entity.CompositeTextParts;
import by.moiseenko.text_entity.PunctuationMark;
import by.moiseenko.text_entity.Text;
import by.moiseenko.text_entity.Word;

public class TextRestorer {

    public static String textRestorer(Text text) {
	StringBuilder restoredText = new StringBuilder();

	TextManipulator textManipulator = new TextManipulator();
	ArrayList<CompositeTextParts> listParagraphs = textManipulator.getAllParagraphs(text);

	for (int s = 0; s < listParagraphs.size(); s++) {
	    restoredText.append("\t");
	    for (int wap = 0; wap < listParagraphs.get(s).getListOfElements().size(); wap++) {
		if (listParagraphs.get(s).getListOfElements().get(wap) instanceof Word) {
		    if (wap != 0
			    || wap != listParagraphs.get(s).getListOfElements().get(wap).getListOfElements().size()) {
			restoredText.append(' ');
		    }
		    restoredText.append(listParagraphs.get(s).getListOfElements().get(wap).returnAsString());
		}
		
		if (listParagraphs.get(s).getListOfElements().get(wap) instanceof PunctuationMark) {
		    restoredText.append(listParagraphs.get(s).getListOfElements().get(wap).returnAsString());
		}

	    }
	    if (s < listParagraphs.size()) {
		restoredText.append("\n");
	    }

	}

	return restoredText.toString();
    }

}
