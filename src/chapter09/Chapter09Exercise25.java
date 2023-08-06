package chapter09;

import java.util.Scanner;

public class Chapter09Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();

		String newString = addEggToVowels(input);
		System.out.println("Modified String: " + newString);

		scanner.close();
	}

	public static String addEggToVowels(String input) {
		StringBuilder result = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (isVowel(c)) {
				result.append("egg").append(c);
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static boolean isVowel(char c) {
		char lowerCaseChar = Character.toLowerCase(c);
		return lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o'
				|| lowerCaseChar == 'u';
	}
}
