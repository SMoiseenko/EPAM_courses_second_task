package by.moiseenko.text_entity;

import java.util.ArrayList;

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
	return (String.valueOf(this.getClass())).substring(31) + ".class";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((word == null) ? 0 : word.hashCode());
	return result;
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

}
