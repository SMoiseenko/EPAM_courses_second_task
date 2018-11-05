package by.epamcourses.text_entity;

import java.util.ArrayList;

public interface CompositeTextParts {

    public String returnAsString();
    public void addElementToList(CompositeTextParts element);   
    public ArrayList<CompositeTextParts> getListOfElements();
    
}
