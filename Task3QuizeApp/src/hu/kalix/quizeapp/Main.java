package hu.kalix.quizeapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserInput input = new UserInputFromConsole(new Scanner(System.in));
		
		Quize quize = new Quize(input);
		quize.takeQuestions(Data.questionsWithOptions);
		quize.printNumberOfCorrectAnswers();
	}
}
