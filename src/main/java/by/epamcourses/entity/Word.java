package by.epamcourses.entity;

public class Word implements ReturnAsString {
    private String word;

    public Word(String word) {
	this.word = word;
    }

    public String getWord() {
	return word;
    }

    @Override
    public String returnAsString() {
	return String.valueOf(word);
    }
}
