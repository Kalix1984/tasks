package hu.kalix.quizeapp.data;

import java.util.ArrayList;
import java.util.List;

public class QuestionWithAnswers {
	private String question;
	private List<Answer> answers;

	public QuestionWithAnswers(String question) {
		this.question = question;
		this.answers = new ArrayList<>();
	}

	public String getQuestion() {
		return question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void addOptions(Answer answer) {
		this.answers.add(answer);
	}

	public void printQuestionWithAnswers(int index) {
		System.out.println(index + ". kérdés: " + getQuestion());
		for (Answer answer : answers) {
			System.out.print("  " + answer.getId() + ". ");
			System.out.println(answer.getText());
		}
	}

	public boolean isAnswearCorrect(int userAnswerId) {
		for (Answer answer : answers) {
			if (answer.getId() == userAnswerId && answer.isCorrect()) {
				return true;
			}
		}

		return false;
	}

	public int getNumberOfAnswers() {
		return answers.size();
	}
}
