package hu.kalix.quizeapp;

import java.util.List;
import hu.kalix.quizeapp.data.QuestionWithOptions;
import hu.kalix.quizeapp.input.RangeValidator;
import hu.kalix.quizeapp.input.UserInput;
import hu.kalix.quizeapp.input.Validator;

public class Quize {
	private List<QuestionWithOptions> questionsWithOptions;
	private UserInput input;
	private int numberOfCorrectAnswers;
		
	public Quize(UserInput input, List<QuestionWithOptions> questionsWithOptions) {
		this.questionsWithOptions = questionsWithOptions;
		this.input = input;
		this.numberOfCorrectAnswers = 0;
	}
	
	public int getNumberOfCorrectAnswers() {
		return numberOfCorrectAnswers;
	}

	public void runQuize() {
		for (int questionIndex = 0; questionIndex < questionsWithOptions.size(); questionIndex++) {
			printQuestionWithOptions(questionIndex);
			
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
		return questionsWithOptions.get(index).isAnswearCorrect(userAnswerId);
	}
	

	private int getUserAnswerWithValidation(int index) {
		Validator rangeValidator;
		int userAnswerId;
		
		do {
			userAnswerId = input.getNumber("válasszon: ");
			int numberOfOptions = questionsWithOptions.get(index).getNumberOfOptions();
			rangeValidator = new RangeValidator(userAnswerId, 1, numberOfOptions);	
		
			if (!rangeValidator.isValid()) {
				System.out.println("Nem a tartományba eső számot adott meg!");
			}
		} while(!rangeValidator.isValid());
		return userAnswerId;
	}

	private void printQuestionWithOptions(int index) {
		questionsWithOptions.get(index).printQuestionWithOptions(index+1);
	}
}
