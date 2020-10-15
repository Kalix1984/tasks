package hu.kalix.wordfinder;

public class WordFinder {
	public int getWordOccurrence(byte[] textFromFile, String wordToFind) {
		int occurence = 0;
		
		int  numberOfChars = textFromFile.length; 
		
		String text = new String(textFromFile);
		
		System.out.println(text);
		
		System.out.println(text.indexOf(wordToFind));
		
		return occurence;
	}
	
	public void printResult(String wordToFind, int wordOccurrence) {
		System.out.printf("%s '%s' %s %d", "A(z)", wordToFind, "szó előfordulása a szövegben",  wordOccurrence);
	}
}
