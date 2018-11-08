package by.moiseenko.text_services;

import by.moiseenko.text_entity.Text;

public class TextRestorer {
    
    public String textRestorer (Text text) {
	
	int qtyParagraphs = text.getListOfElements().size();
	System.out.println(qtyParagraphs + " - Paragraphs");
	
	long qtySentences = 0;
		text.getListOfElements().stream()
		.forEach(el -> el.getListOfElements().stream().count());
		
		
	System.out.println(qtySentences + " - Sentences");
	
	
	
	return " ";
    }

}
