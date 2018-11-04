package by.epamcourses.entity;

import java.util.ArrayList;

public class Word implements WorkAsString {
    private String word;

    public Word(String word) {
	this.word = word;
    }

    @Override
    public String returnAsString() {
	return word;
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
