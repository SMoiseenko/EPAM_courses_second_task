package by.epamcourses.entity;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<ReturnAsString> listPartsOfSentence = new ArrayList<>();

    public ArrayList<ReturnAsString> getListPartsOfSentence() {
	return listPartsOfSentence;
    }

    public void addPunctcharToListOfSentence(String setMe) {
	listPartsOfSentence.add(new PunctuationMark(setMe));
    }

    public void addWordToListOfSentence(String setMe) {
	listPartsOfSentence.add(new Word(setMe));
    }
}
