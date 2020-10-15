package hu.kalix.quizeapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserInput input = new UserInputFromConsole(new Scanner(System.in));
		Quize quize = new Quize(input, Data.questionsWithOptions);
		quize.runQuize();
		quize.printNumberOfCorrectAnswers();
	}
}
