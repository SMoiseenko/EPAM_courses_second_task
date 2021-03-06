package by.moiseenko.text_entity;

import java.util.ArrayList;
import java.util.Objects;
/**
 * The Class Word implement {@link CompositeTextParts} to realize composite pattern.
 * Have one field of String type to storage one word.
 * @author moiseenko-s
 * @see Text
 * @see Sentence
 * @see PunctuationMark
 * @see Paragraph
 */
public class Word implements CompositeTextParts, Comparable<Word> {
    private String word;

    public Word(String word) {
	this.word = word;
    }

    @Override
    public String returnAsString() {
	return word;
    }

    @Override
    public int hashCode() {
	return Objects.hash(word);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (!(obj instanceof Word))
	    return false;
	Word other = (Word) obj;
	if (word == null) {
	    if (other.word != null)
		return false;
	} else if (!word.equals(other.word))
	    return false;
	return true;
    }

    @Override
    public int compareTo(Word word) {
	return this.word.compareToIgnoreCase(word.returnAsString());
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
    public void addElementToList(CompositeTextParts word) {
	// NEWER USE THIS METHOD
    }

}
