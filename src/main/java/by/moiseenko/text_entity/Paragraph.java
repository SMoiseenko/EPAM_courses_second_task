package by.moiseenko.text_entity;

import java.util.ArrayList;

public class Paragraph implements CompositeTextParts{

    private ArrayList<CompositeTextParts> listOfSentences = new ArrayList<>();
        
    @Override
    public void addElementToList (CompositeTextParts sentence) {
	listOfSentences.add(sentence);
    }
    
   

    @Override
    public String returnAsString() {
	StringBuilder paragraph = new StringBuilder();
	for(CompositeTextParts elements: listOfSentences) {
	    paragraph.append(elements.returnAsString());
	}
	return String.valueOf(paragraph);
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	return listOfSentences;
    }
    @Override
    public String toString() {
	
	return (String.valueOf(this.getClass())).substring(31)+".class";
    }
    
}
