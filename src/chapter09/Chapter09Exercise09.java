package chapter09;

import java.util.Scanner;

public class Chapter09Exercise09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a character (or @ to exit): ");
			String input = scanner.nextLine();

			if (input.length() != 1) {
				System.out.println("Error: Please enter only one character.");
			} else {
				char ch = input.charAt(0);
				int asciiValue = (int) ch;

				System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);

				if (ch == '@') {
					System.out.println("Exiting the program.");
					break;
				}
			}
		}

		scanner.close();
	}
}
