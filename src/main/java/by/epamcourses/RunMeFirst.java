package by.epamcourses;

import by.epamcourses.entity.Paragraph;
import by.epamcourses.entity.Text;

public class RunMeFirst {

    public static void main(String[] args) {
	
	Text newText = new Text("src/main/resources/1.txt");
	for (int i=0; i<newText.getListOfParagraphs().size(); i++) {
	    System.out.println(newText.getListOfParagraphs().get(i).getParagraph());
	}
	
	System.out.println("FIN");
	//System.out.println(newText.getTestText());
	//System.out.println(newText.getTestText().length());

    }

}
