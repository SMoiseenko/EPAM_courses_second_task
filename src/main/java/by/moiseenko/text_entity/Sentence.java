package by.moiseenko.text_entity;

import java.util.ArrayList;

public class Sentence implements CompositeTextParts {
    private ArrayList<CompositeTextParts> listPartsOfSentence = new ArrayList<>();

    // *************************************************************************
    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	return listPartsOfSentence;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {
	
	listPartsOfSentence.add(element);
	
	
    }

    // *************************************************************************

    @Override
    public String returnAsString() {
	StringBuilder sentence = new StringBuilder();
	for (CompositeTextParts c : listPartsOfSentence) {
	    sentence.append(c.returnAsString());
	}
	return String.valueOf(sentence);
    }
    @Override
    public String toString() {
	
	return (String.valueOf(this.getClass())).substring(31)+".class";
    }
}
