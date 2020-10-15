package hu.kalix.quize.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static List<QuestionWithAnswers> questionsWithAnswers = new ArrayList<>();

	static {
		QuestionWithAnswers q1 = new QuestionWithAnswers("Ki volt az, aki műsorában \"csak ült és mesélt\" ?");
		q1.addOptions(new Answer(1, "Vitray Tamás", true));
		q1.addOptions(new Answer(2, "Fiderikusz Sándor", false));
		q1.addOptions(new Answer(3, "Rózsa György", false));
		questionsWithAnswers.add(q1);

		QuestionWithAnswers q2 = new QuestionWithAnswers("A felsoroltak közül, mi Görögország jellegzetes itala?");
		q2.addOptions(new Answer(1, "Beherovka", false));
		q2.addOptions(new Answer(2, "Vodka", false));
		q2.addOptions(new Answer(3, "Ouzo", true));
		questionsWithAnswers.add(q2);

		QuestionWithAnswers q3 = new QuestionWithAnswers("Hová sorolható be a béka?");
		q3.addOptions(new Answer(1, "Hüllők", false));
		q3.addOptions(new Answer(2, "Kétéltű", true));
		q3.addOptions(new Answer(3, "Puhatestű", false));
		questionsWithAnswers.add(q3);

		QuestionWithAnswers q4 = new QuestionWithAnswers(
				"Egy futó hét napon át napi 10 km-t fut. Mennyit fut egy hét alatt összesen?");
		q4.addOptions(new Answer(1, "7000 m", false));
		q4.addOptions(new Answer(2, "70 000 m", true));
		q4.addOptions(new Answer(3, "700 000 m", false));
		questionsWithAnswers.add(q4);

		QuestionWithAnswers q5 = new QuestionWithAnswers("Ki volt a gőzgép feltalálója?");
		q5.addOptions(new Answer(1, "Robert Fulton", false));
		q5.addOptions(new Answer(2, "George Stephenson", false));
		q5.addOptions(new Answer(3, "James Watt", true));
		questionsWithAnswers.add(q5);

		QuestionWithAnswers q6 = new QuestionWithAnswers("Melyik NEM a lúd elnevezése?");
		q6.addOptions(new Answer(1, "liba", false));
		q6.addOptions(new Answer(2, "gúnár", false));
		q6.addOptions(new Answer(3, "gácsér", true));
		questionsWithAnswers.add(q6);

		QuestionWithAnswers q7 = new QuestionWithAnswers("A felsoroltak közül melyik NEM Shakespeare műve?");
		q7.addOptions(new Answer(1, "Elveszett paradicsom", true));
		q7.addOptions(new Answer(2, "Szentivánéji álom", false));
		q7.addOptions(new Answer(3, "Sok hűhó semmiért", false));
		q7.addOptions(new Answer(4, "Ahogy tetszik", false));
		questionsWithAnswers.add(q7);

		QuestionWithAnswers q8 = new QuestionWithAnswers("Melyik városon NEM folyik keresztül a Duna?");
		q8.addOptions(new Answer(1, "Komárom", false));
		q8.addOptions(new Answer(2, "Gödöllő", true));
		q8.addOptions(new Answer(3, "Paks", false));
		questionsWithAnswers.add(q8);

		QuestionWithAnswers q9 = new QuestionWithAnswers("Melyik elemnek áll egy betűből a vegyjele?");
		q9.addOptions(new Answer(1, "hélium", false));
		q9.addOptions(new Answer(2, "réz", false));
		q9.addOptions(new Answer(3, "szén", true));
		q9.addOptions(new Answer(4, "vas", false));
		questionsWithAnswers.add(q9);

		QuestionWithAnswers q10 = new QuestionWithAnswers("Hány deciliter 7 és fél liter?");
		q10.addOptions(new Answer(1, "75 dl", true));
		q10.addOptions(new Answer(2, "750 dl", false));
		q10.addOptions(new Answer(3, "7500 dl", false));
		questionsWithAnswers.add(q10);
	}
}
