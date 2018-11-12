package by.moiseenko.text_entity;

import java.util.ArrayList;
/**
 * The common Interface for {@link Text} and its parts.
 * Consist 3 signature of methods:
 * <br><i>String returnAsString()</i>,
 * <br><i>void addElementToList(CompositeTextParts element)</i>, and
 * <br><i>ArrayList<CompositeTextParts> getListOfElements()</i>
 * <br>that give possibility to realize composite pattern. 
 * @author Sergei Moiseenko
 * @see Text
 * @see Paragraph
 * @see Sentence
 * @see Word
 * @see PunctuationMark
 */
public interface CompositeTextParts {

    public String returnAsString();
    public void addElementToList(CompositeTextParts element);   
    public ArrayList<CompositeTextParts> getListOfElements();
    
}
