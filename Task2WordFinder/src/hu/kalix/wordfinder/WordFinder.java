package hu.kalix.wordfinder;

public class WordFinder {
	public int countWordOccurrence(byte[] text, String wordToFind) {
		byte[] wordInBytes = wordToFind.getBytes();
		int wordOccurranceCounter = 0;
		
	    for (int i = 0; i < text.length; i++) {
	        int j = 0;
	        while (j < wordInBytes.length && text[i + j] == wordInBytes[j]) {
	            j++;
	        }
	        if (j == wordInBytes.length) {
	        	wordOccurranceCounter++;
	        }
	    }
	    return wordOccurranceCounter;
	}
	
	public void printResult(String wordToFind, int wordOccurrence) {
		System.out.printf("%s '%s' %s %d", "A(z)", wordToFind, "szó előfordulása a szövegben", wordOccurrence);
	}
}
