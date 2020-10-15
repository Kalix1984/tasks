package hu.kalix.quizeapp.data;

import java.util.ArrayList;
import java.util.List;

public class QuestionWithOptions {
	private String question;
	private List<Option> options;
	
	public QuestionWithOptions(String question) {
		this.question = question;
		this.options = new ArrayList<>();
	}

	public String getQuestion() {
		return question;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void addOptions(Option option) {
		this.options.add(option);
	}
	
	public void printQuestionWithOptions(int index) {
		System.out.println(index + ". kérdés: " + getQuestion());
		for (Option option : options) {
			System.out.print("  " + option.getId() + ". ");
			System.out.println(option.getText());
		}
	}
	
	public boolean isAnswearCorrect(int userAnswerId) {
		for (Option option : options) {
			if (option.getId() == userAnswerId && option.isCorrect()) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getNumberOfOptions() {
		return options.size();
	}
}
