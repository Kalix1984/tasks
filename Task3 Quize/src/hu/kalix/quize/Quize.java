package hu.kalix.quize;

import java.util.List;

import hu.kalix.quize.data.QuestionWithAnswers;
import hu.kalix.quize.input.RangeValidator;
import hu.kalix.quize.input.UserInput;
import hu.kalix.quize.input.Validator;

public class Quize {
	private List<QuestionWithAnswers> questionsWithAnswers;
	private UserInput input;
	private int numberOfCorrectAnswers;
		
	public Quize(UserInput input, List<QuestionWithAnswers> questionsWithAnswers) {
		this.questionsWithAnswers = questionsWithAnswers;
		this.input = input;
		this.numberOfCorrectAnswers = 0;
	}
	
	public int getNumberOfCorrectAnswers() {
		return numberOfCorrectAnswers;
	}

	public void runQuize() {
		for (int questionIndex = 0; questionIndex < questionsWithAnswers.size(); questionIndex++) {
			printQuestionWithAnswers(questionIndex);
			
			int userAnswerId = getUserAnswerWithValidation(questionIndex);
			
			if (isAnswerCorrect(questionIndex, userAnswerId)) {
				incrementNumberOfCorrectAnswers();
			}
			
			System.out.println();
		}
	}
	
	public void printNumberOfCorrectAnswers() {
		System.out.println("A helyes válaszok száma: " + getNumberOfCorrectAnswers());
	}

	private void incrementNumberOfCorrectAnswers() {
		numberOfCorrectAnswers++;
	}

	private boolean isAnswerCorrect(int index, int userAnswerId) {
		return questionsWithAnswers.get(index).isAnswearCorrect(userAnswerId);
	}
	

	private int getUserAnswerWithValidation(int index) {
		Validator rangeValidator;
		int userAnswerId;
		
		do {
			userAnswerId = input.getNumber("Kérem a válaszát: ");
			int numberOfAnswers = questionsWithAnswers.get(index).getNumberOfAnswers();
			rangeValidator = new RangeValidator(userAnswerId, 1, numberOfAnswers);	
		
			if (!rangeValidator.isValid()) {
				System.out.println("Nem a tartományba eső számot adott meg!");
			}
		} while(!rangeValidator.isValid());
		return userAnswerId;
	}

	private void printQuestionWithAnswers(int index) {
		questionsWithAnswers.get(index).printQuestionWithAnswers(index+1);
	}
}
