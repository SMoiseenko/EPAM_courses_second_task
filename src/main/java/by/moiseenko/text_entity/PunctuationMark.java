package by.moiseenko.text_entity;

import java.util.ArrayList;

public class PunctuationMark implements CompositeTextParts {
    private String punctchar;

    public PunctuationMark(String punctchar) {
	this.punctchar = punctchar;
    }

    @Override
    public String returnAsString() {
	return punctchar;
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
    @Override
    public String toString() {
	
	return (String.valueOf(this.getClass())).substring(31)+".class";
    }

}
