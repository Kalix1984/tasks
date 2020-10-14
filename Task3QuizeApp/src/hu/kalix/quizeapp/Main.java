package hu.kalix.quizeapp;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<QuestionWithOptions> questionsWithOptions = new Data().loadQuestionsAndOptions();
		UserInput input = new UserInputFromConsole(new Scanner(System.in));
		
		Quize quize = new Quize(input);
		quize.runAll(questionsWithOptions);
		
		System.out.println("A helyes válaszok száma: " + quize.getNumberOfCorrectAnswers());
	}
}
