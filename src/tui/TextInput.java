package tui;

import java.util.Scanner;


/**
 * Handles the reading of textInput from the user.
 * 
 * @author Penrose
 * @version 08/12/2023
 * @since 08/12/2023
 */
public class TextInput {
	
	private Scanner scanner;
	private static TextInput instance;
	
	private TextInput() {
		scanner = new Scanner(System.in);
	}
	
	public static TextInput getInstance() {
		if (instance == null) {
			instance = new TextInput();
		}
		return instance;
	}
	
	public int readInt() {
		while(!scanner.hasNextInt()) {
			System.out.println("input må kun være et helt tal, prøv igen.");
			scanner.nextLine();
		}
		int res = scanner.nextInt();
		scanner.nextLine();
		return res;
	}
	
	public double readDouble() {
		while(!scanner.hasNextDouble()) {
			System.out.println("input må kun være et tal, prøv igen.");
			scanner.nextLine();
		}
		double res = scanner.nextDouble();
		scanner.nextLine();
		return res;
	}
	
	public String readString() {
		return scanner.nextLine();
	}
	
}
