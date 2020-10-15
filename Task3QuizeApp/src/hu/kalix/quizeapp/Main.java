package hu.kalix.quizeapp;

import java.util.Scanner;
import hu.kalix.quizeapp.data.Data;
import hu.kalix.quizeapp.input.UserInput;
import hu.kalix.quizeapp.input.UserInputFromConsole;

public class Main {
	public static void main(String[] args) {
		UserInput input = new UserInputFromConsole(new Scanner(System.in));
		Quize quize = new Quize(input, Data.questionsWithOptions);
		quize.runQuize();
		quize.printNumberOfCorrectAnswers();
	}
}
