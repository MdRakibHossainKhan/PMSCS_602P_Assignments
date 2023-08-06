package chapter09;

import java.util.Scanner;

public class Chapter09Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a sentence (or empty string to quit): ");
			String input = scanner.nextLine().trim();

			if (input.isEmpty()) {
				System.out.println("Goodbye!");
				break;
			}

			boolean isPalindrome = isPalindrome(input);

			if (isPalindrome) {
				System.out.println("It's a palindrome!");
			} else {
				System.out.println("It's not a palindrome.");
			}
		}

		scanner.close();
	}

	public static boolean isPalindrome(String sentence) {
		sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

		int left = 0;
		int right = sentence.length() - 1;

		while (left < right) {
			if (sentence.charAt(left) != sentence.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}
}
