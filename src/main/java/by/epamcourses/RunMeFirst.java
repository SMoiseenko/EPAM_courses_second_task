package by.epamcourses;

import by.epamcourses.entity.Text;

public class RunMeFirst {

    public static void main(String[] args) {
	
	Text newText = new Text("src/main/resources/1.txt");
	System.out.println(newText.getText());
	System.out.println(newText.getText().length());

    }

}
