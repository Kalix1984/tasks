package hu.kalix.quizeapp;

import java.util.List;

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
		for (int i = 0; i < questionsWithOptions.size(); i++) {
			printQuestionWithOptions(i);
			
			int userAnswerId = getUserAnswerAndValidate(i);
			
			if (questionsWithOptions.get(i).isAnswearCorrect(userAnswerId)) {
				numberOfCorrectAnswers++;
			}
			
			System.out.println();
		}
	}
	
	public void printNumberOfCorrectAnswers() {
		System.out.println("A helyes válaszok száma: " + getNumberOfCorrectAnswers());
	}

	private int getUserAnswerAndValidate(int index) {
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
