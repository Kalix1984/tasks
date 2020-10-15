package hu.kalix.wordfinder;

import java.io.IOException;

/***
 * 
 * @author Horváth István
 *
 */

public class Main {
	public static void main(String[] args) {
		byte[] textFromFile;
		
		try {
			String wordToFind = "Nulla";
			String path = "src/hu/kalix/wordfinder/valami.txt";

			textFromFile = new FileLoader().load(path);
			WordFinder wordFinder = new WordFinder();
			int wordOccurrence = wordFinder.countWordOccurrence(textFromFile, wordToFind);
			wordFinder.printResult(wordToFind, wordOccurrence);
		} catch (IOException e) {
			System.out.println("Hiba a file betöltésekor!");
		} catch (Exception e) {
			System.out.println("Hiba történt");
		}
	}
}
