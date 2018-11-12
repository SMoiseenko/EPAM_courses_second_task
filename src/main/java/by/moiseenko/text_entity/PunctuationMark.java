package by.moiseenko.text_entity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The Class Paragraph implement {@link CompositeTextParts} to realize composite pattern.
 * Have one field of String type to storage punctuation symbol.
 * @author moiseenko-s
 * @see Text
 * @see Sentence
 * @see Word
 * @see Paragraph
 */
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
    public int hashCode() {
	return Objects.hash(punctchar);
    }
    
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (!(obj instanceof PunctuationMark))
	    return false;
	PunctuationMark other = (PunctuationMark) obj;
	if (punctchar == null) {
	    if (other.punctchar != null)
		return false;
	} else if (!punctchar.equals(other.punctchar))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return (String.valueOf(this.getClass())).substring(31) + ".class";
    }
    
    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	// NEWER USE THIS METHOD
	return null;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {
	// NEWER USE THIS METHOD
    }

}
