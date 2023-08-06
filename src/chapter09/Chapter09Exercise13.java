package chapter09;

import java.util.Scanner;

public class Chapter09Exercise13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a string (or an empty string to exit): ");
			String input = scanner.nextLine();

			if (input.isEmpty()) {
				System.out.println("Exiting the program.");
				break;
			}

			int uppercaseCount = countUppercaseLetters(input);
			System.out.println("Number of uppercase letters: " + uppercaseCount);
		}

		scanner.close();
	}

	private static int countUppercaseLetters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}

		return count;
	}
}
