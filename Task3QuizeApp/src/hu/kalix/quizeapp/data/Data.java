package hu.kalix.quizeapp.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static List<QuestionWithOptions> questionsWithOptions = new ArrayList<>();

	static {
		QuestionWithOptions q1 = new QuestionWithOptions("Ki volt az, aki műsorában \"csak ült és mesélt\" ?");
		q1.addOptions(new Option(1, "Vitray Tamás", true));
		q1.addOptions(new Option(2, "Fiderikusz Sándor", false));
		q1.addOptions(new Option(3, "Rózsa György", false));
		questionsWithOptions.add(q1);

		QuestionWithOptions q2 = new QuestionWithOptions("A felsoroltak közül, mi Görögország jellegzetes itala?");
		q2.addOptions(new Option(1, "Beherovka", false));
		q2.addOptions(new Option(2, "Vodka", false));
		q2.addOptions(new Option(3, "Ouzo", true));
		questionsWithOptions.add(q2);

		QuestionWithOptions q3 = new QuestionWithOptions("Hová sorolható be a béka?");
		q3.addOptions(new Option(1, "Hüllők", false));
		q3.addOptions(new Option(2, "Kétéltű", true));
		q3.addOptions(new Option(3, "Puhatestű", false));
		questionsWithOptions.add(q3);

		QuestionWithOptions q4 = new QuestionWithOptions("Egy futó hét napon át napi 10 km-t fut. Mennyit fut egy hét alatt összesen?");
		q4.addOptions(new Option(1, "7000 m", false));
		q4.addOptions(new Option(2, "70 000 m", true));
		q4.addOptions(new Option(3, "700 000 m", false));
		questionsWithOptions.add(q4);

		QuestionWithOptions q5 = new QuestionWithOptions("Ki volt a gőzgép feltalálója?");
		q5.addOptions(new Option(1, "Robert Fulton", false));
		q5.addOptions(new Option(2, "George Stephenson", false));
		q5.addOptions(new Option(3, "James Watt", true));
		questionsWithOptions.add(q5);

		QuestionWithOptions q6 = new QuestionWithOptions("Melyik NEM a lúd elnevezése?");
		q6.addOptions(new Option(1, "liba", false));
		q6.addOptions(new Option(2, "gúnár", false));
		q6.addOptions(new Option(3, "gácsér", true));
		questionsWithOptions.add(q6);

		QuestionWithOptions q7 = new QuestionWithOptions("A felsoroltak közül melyik NEM Shakespeare műve?");
		q7.addOptions(new Option(1, "Elveszett paradicsom", true));
		q7.addOptions(new Option(2, "Szentivánéji álom", false));
		q7.addOptions(new Option(3, "Sok hűhó semmiért", false));
		q7.addOptions(new Option(4, "Ahogy tetszik", false));
		questionsWithOptions.add(q7);

		QuestionWithOptions q8 = new QuestionWithOptions("Melyik városon NEM folyik keresztül a Duna?");
		q8.addOptions(new Option(1, "Komárom", false));
		q8.addOptions(new Option(2, "Gödöllő", true));
		q8.addOptions(new Option(3, "Paks", false));
		questionsWithOptions.add(q8);

		QuestionWithOptions q9 = new QuestionWithOptions("Melyik elemnek áll egy betűből a vegyjele?");
		q9.addOptions(new Option(1, "hélium", false));
		q9.addOptions(new Option(2, "réz", false));
		q9.addOptions(new Option(3, "szén", true));
		q9.addOptions(new Option(4, "vas", false));
		questionsWithOptions.add(q9);

		QuestionWithOptions q10 = new QuestionWithOptions("Hány deciliter 7 és fél liter?");
		q10.addOptions(new Option(1, "75 dl", true));
		q10.addOptions(new Option(2, "750 dl", false));
		q10.addOptions(new Option(3, "7500 dl", false));
		questionsWithOptions.add(q10);
	}
}
