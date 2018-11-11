package by.moiseenko.text_entity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The Class Sentence.
 */
public class Sentence implements CompositeTextParts {
    private ArrayList<CompositeTextParts> listPartsOfSentence = new ArrayList<>();

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	return listPartsOfSentence;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {
	listPartsOfSentence.add(element);
    }

    @Override
    public String returnAsString() {
	StringBuilder sentence = new StringBuilder();
	for (CompositeTextParts c : listPartsOfSentence) {
	    sentence.append(c.returnAsString());
	}
	return String.valueOf(sentence);
    }

    @Override
    public int hashCode() {
	return Objects.hash(listPartsOfSentence);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Sentence other = (Sentence) obj;
	if (listPartsOfSentence == null) {
	    if (other.listPartsOfSentence != null) {
		return false;
	    }
	} else if (!listPartsOfSentence.equals(other.listPartsOfSentence)) {
	    return false;
	}
	return true;
    }
    
    @Override
    public String toString() {
	return (String.valueOf(this.getClass())).substring(31) + ".class";
    }
}
