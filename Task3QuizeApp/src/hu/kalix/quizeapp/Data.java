package hu.kalix.quizeapp;

import java.util.ArrayList;
import java.util.List;

public class Data {
		
	public List<QuestionWithOptions> loadQuestionsAndOptions() {
		List<QuestionWithOptions> testCases = new ArrayList<>();
		
		QuestionWithOptions case1 = new QuestionWithOptions("Milyen színű az ég?");
		case1.addOptions(new Option(1, "kék", true));
		case1.addOptions(new Option(2, "zöld", false));
		case1.addOptions(new Option(3, "sárga", false));
		testCases.add(case1);
		
		QuestionWithOptions case2 = new QuestionWithOptions("Milyen színű az ég?");
		case2.addOptions(new Option(1, "kék", true));
		case2.addOptions(new Option(2, "zöld", false));
		case2.addOptions(new Option(3, "sárga", false));
		testCases.add(case2);
		
		QuestionWithOptions case3 = new QuestionWithOptions("Milyen színű az ég?");
		case3.addOptions(new Option(1, "kék", true));
		case3.addOptions(new Option(2, "zöld", false));
		case3.addOptions(new Option(3, "sárga", false));
		testCases.add(case3);
		
		QuestionWithOptions case4 = new QuestionWithOptions("Milyen színű az ég?");
		case4.addOptions(new Option(1, "kék", true));
		case4.addOptions(new Option(2, "zöld", false));
		case4.addOptions(new Option(3, "sárga", false));
		testCases.add(case4);
		
		QuestionWithOptions case5 = new QuestionWithOptions("Milyen színű az ég?");
		case5.addOptions(new Option(1, "kék", true));
		case5.addOptions(new Option(2, "zöld", false));
		case5.addOptions(new Option(3, "sárga", false));
		testCases.add(case5);
		
		QuestionWithOptions case6 = new QuestionWithOptions("Milyen színű az ég?");
		case6.addOptions(new Option(1, "kék", true));
		case6.addOptions(new Option(2, "zöld", false));
		case6.addOptions(new Option(3, "sárga", false));
		testCases.add(case6);
		
		QuestionWithOptions case7 = new QuestionWithOptions("Milyen színű az ég?");
		case7.addOptions(new Option(1, "kék", true));
		case7.addOptions(new Option(2, "zöld", false));
		case7.addOptions(new Option(3, "sárga", false));
		testCases.add(case7);
		
		QuestionWithOptions case8 = new QuestionWithOptions("Milyen színű az ég?");
		case8.addOptions(new Option(1, "kék", true));
		case8.addOptions(new Option(2, "zöld", false));
		case8.addOptions(new Option(3, "sárga", false));
		testCases.add(case8);
		
		QuestionWithOptions case9 = new QuestionWithOptions("Milyen színű az ég?");
		case9.addOptions(new Option(1, "kék", true));
		case9.addOptions(new Option(2, "zöld", false));
		case9.addOptions(new Option(3, "sárga", false));
		testCases.add(case9);
		
		QuestionWithOptions case10 = new QuestionWithOptions("Milyen színű az ég?");
		case10.addOptions(new Option(1, "kék", true));
		case10.addOptions(new Option(2, "zöld", false));
		case10.addOptions(new Option(3, "sárga", false));
		testCases.add(case10);
		
		return testCases;
	}
}
