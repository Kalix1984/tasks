package hu.kalix.sorting;

import java.util.Arrays;

/***
 * 
 * @author Horváth István
 *
 */

public class Main {
	public static void main(String[] args) {
		String[] texts = new String[10];

		texts[0] = "alma";
		texts[1] = "10";
		texts[2] = "5";
		texts[3] = "5répa";
		texts[4] = "autó";
		texts[5] = "béka";
		texts[6] = "122";
		texts[7] = "pc";
		texts[8] = "laptop5";
		texts[9] = "java";

		System.out.println("Eredeti tömb: " + Arrays.toString(texts));
		Arrays.sort(texts);
		System.out.println("Rendezett tömb: " + Arrays.toString(texts));
	}
}
