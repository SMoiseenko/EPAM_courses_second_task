package by.epamcourses.entity;

import java.util.ArrayList;

public class PunctuationMark implements WorkAsString {
    private String punctchar;

    public PunctuationMark(String punctchar) {
	this.punctchar = punctchar;
    }

    @Override
    public String returnAsString() {
	return punctchar;
    }

   
    @Override
    public ArrayList<WorkAsString> getListOfElements() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addElementToList(WorkAsString element) {
	// TODO Auto-generated method stub
	
    }

}
