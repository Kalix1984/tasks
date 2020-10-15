package hu.kalix.wordfinder;

public class Main {

	public static void main(String[] args) {
		byte[] textFromFile = new FileLoader().load("src/hu/kalix/wordfinder/valami.txt");
		
		String wordToFind = "Nulla";
		WordFinder wordFinder = new WordFinder();
		int wordOccurrence = wordFinder.getWordOccurrence(textFromFile, wordToFind);
		wordFinder.printResult(wordToFind, wordOccurrence);
	}
}
