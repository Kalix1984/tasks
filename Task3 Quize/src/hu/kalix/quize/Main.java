package hu.kalix.quize;

import java.util.Scanner;

import hu.kalix.quize.data.Data;
import hu.kalix.quize.input.UserInput;
import hu.kalix.quize.input.UserInputFromConsole;

/***
 * 
 * @author Horváth István
 *
 */

public class Main {
	public static void main(String[] args) {
		UserInput input = new UserInputFromConsole(new Scanner(System.in));
		Quize quize = new Quize(input, Data.questionsWithAnswers);
		quize.runQuize();
		quize.printNumberOfCorrectAnswers();
	}
}
