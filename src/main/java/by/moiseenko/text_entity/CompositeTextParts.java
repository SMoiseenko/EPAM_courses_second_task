package by.moiseenko.text_entity;

import java.util.ArrayList;
/**
 * The 
 * @author Sergei Moiseenko
 *
 */
public interface CompositeTextParts {

    public String returnAsString();
    public void addElementToList(CompositeTextParts element);   
    public ArrayList<CompositeTextParts> getListOfElements();
    
}
