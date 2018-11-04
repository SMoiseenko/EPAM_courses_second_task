package by.epamcourses.entity;

import java.util.ArrayList;

public class Sentence implements WorkAsString {
    private ArrayList<WorkAsString> listPartsOfSentence = new ArrayList<>();

    // *************************************************************************
    @Override
    public ArrayList<WorkAsString> getListOfElements() {
	return listPartsOfSentence;
    }

    @Override
    public void addElementToList(WorkAsString element) {
	
	listPartsOfSentence.add(element);
	
	
    }

    // *************************************************************************

    @Override
    public String returnAsString() {
	StringBuilder sentence = new StringBuilder();
	for (WorkAsString c : listPartsOfSentence) {
	    sentence.append(c.returnAsString());
	}
	return String.valueOf(sentence);
    }
}
