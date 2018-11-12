package by.moiseenko;

import by.moiseenko.text_entity.Text;
import by.moiseenko.text_services.TextManipulator;

/**
 * This Class made for visualization (console output) result of the task.
 * @author Sergei Moiseenko
 * @see Text
 * @see TextManipulator
 */
public class RunMeFirst {

    public static void main(String[] args) {
	Text text = new Text("src/main/resources/1984.txt");
	System.out.println(TextManipulator.sortByAlphabet(text));
	
    }
}
