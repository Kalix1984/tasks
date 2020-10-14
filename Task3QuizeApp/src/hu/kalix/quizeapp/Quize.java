package hu.kalix.quizeapp;

import java.util.List;

public class Quize {
	private UserInput input;
	private int numberOfCorrectAnswers;
		
	public Quize(UserInput input) {
		this.input = input;
		this.numberOfCorrectAnswers = 0;
	}
	
	public int getNumberOfCorrectAnswers() {
		return numberOfCorrectAnswers;
	}

	public void runAll(List<QuestionWithOptions> questionsWithOptions) {
		for (int i = 0; i < questionsWithOptions.size(); i++) {
			questionsWithOptions.get(i).printQuestionWithOptions(i+1);
			
			Validation rangeValidation;
			int userAnswerId;
			
			do {
				userAnswerId = input.getNumber("válasszon: ");
				int numberOfOptions = questionsWithOptions.get(i).getNumberOfOptions();
				rangeValidation = new RangeValidator(userAnswerId, 1, numberOfOptions);	
			
				if (!rangeValidation.isValid()) {
					System.out.println("Nem a tartományba eső számot adott meg!");
				}
			} while(!rangeValidation.isValid());
			
			if (questionsWithOptions.get(i).isAnswearCorrect(userAnswerId)) {
				numberOfCorrectAnswers++;
			}
			
			System.out.println();
		}
	}
}
