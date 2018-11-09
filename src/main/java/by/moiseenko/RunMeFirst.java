package by.moiseenko;

import by.moiseenko.text_entity.Text;
import by.moiseenko.text_services.FileReaderWriter;
import by.moiseenko.text_services.TextManipulator;
import by.moiseenko.text_services.TextRestorer;

public class RunMeFirst {

    public static void main(String[] args) {

	Text text = new Text("src/test/resources/1984.txt");
	
	TextManipulator textManipulator = new TextManipulator();
	
	//System.out.print(textManipulator.sortByAlphabet(text));
	
	//FileReaderWriter.writeToFile("log/result.txt", textManipulator.sortByAlphabet(text));
	
	System.out.println(TextRestorer.textRestorer(text));
	
	
    }
}
