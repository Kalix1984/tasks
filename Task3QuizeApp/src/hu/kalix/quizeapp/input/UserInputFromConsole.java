package hu.kalix.quizeapp.input;

import java.util.Scanner;

public class UserInputFromConsole implements UserInput {
	private Scanner scan;
			
	public UserInputFromConsole(Scanner scan) {
		this.scan = scan;
	}

	public int getNumber(String message) {
		int number;

		System.out.print(message);
			
		while(!scan.hasNextInt()) {
			System.out.println("Nem számot adott meg!");
			System.out.print(message);
			scan.next();
		}
		number = scan.nextInt();
		
		return number;
	}
	
}
