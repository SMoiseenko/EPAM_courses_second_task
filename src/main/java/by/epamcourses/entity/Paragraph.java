package by.epamcourses.entity;

import java.util.ArrayList;

public class Paragraph implements WorkAsString{

    private ArrayList<WorkAsString> listOfSentences = new ArrayList<>();
        
    @Override
    public void addElementToList (WorkAsString sentence) {
	listOfSentences.add(sentence);
    }
    
   

    @Override
    public String returnAsString() {
	StringBuilder paragraph = new StringBuilder();
	for(WorkAsString elements: listOfSentences) {
	    paragraph.append(elements.returnAsString());
	}
	return String.valueOf(paragraph);
    }

    @Override
    public ArrayList<WorkAsString> getListOfElements() {
	return listOfSentences;
    }
    
    
}
