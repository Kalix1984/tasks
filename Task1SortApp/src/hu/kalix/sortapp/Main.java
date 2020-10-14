package hu.kalix.sortapp;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] texts = new String[10];
		texts[0] = "x";
		
		
				
		System.out.println(Arrays.toString(texts));
		Arrays.sort(texts);
		System.out.println(Arrays.toString(texts));
	}
}
