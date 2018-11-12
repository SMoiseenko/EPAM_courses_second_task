package by.moiseenko.text_entity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The Class Paragraph implement {@link CompositeTextParts} to realize composite pattern.
 * Have one field of collection type of list to  storage all {@link Sentence}.
 * @author moiseenko-s
 * @see Text
 * @see Sentence
 * @see Word
 * @see PunctuationMark
 */
public class Paragraph implements CompositeTextParts {

    private ArrayList<CompositeTextParts> listOfSentences = new ArrayList<>();

    @Override
    public void addElementToList(CompositeTextParts sentence) {
	listOfSentences.add(sentence);
    }

    @Override
    public String returnAsString() {
	StringBuilder paragraph = new StringBuilder();
	for (CompositeTextParts elements : listOfSentences) {
	    paragraph.append(elements.returnAsString());
	}
	return String.valueOf(paragraph);
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
	return listOfSentences;
    }

    @Override
    public int hashCode() {
	return Objects.hash(listOfSentences);
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
	Paragraph other = (Paragraph) obj;
	if (listOfSentences == null) {
	    if (other.listOfSentences != null) {
		return false;
	    }
	} else if (!listOfSentences.equals(other.listOfSentences)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return (String.valueOf(this.getClass())).substring(31) + ".class";
    }

}
