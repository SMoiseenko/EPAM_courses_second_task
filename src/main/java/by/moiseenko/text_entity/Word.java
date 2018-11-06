package by.moiseenko.text_entity;

import java.util.ArrayList;

public class Word implements CompositeTextParts {
    private String word;

    public Word(String word) {
	this.word = word;
    }

    @Override
    public String returnAsString() {
	return word;
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {
	// TODO Auto-generated method stub
	
    }
}
