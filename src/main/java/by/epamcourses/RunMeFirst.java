package by.epamcourses;

import java.io.FileNotFoundException;

import by.epamcourses.entity.Text;

public class RunMeFirst {

    public static void main(String[] args) throws FileNotFoundException {
	
	Text newText = new Text();
	newText.setText("src/main/resources/1.txt");
	System.out.println(newText.getText());

    }

}
