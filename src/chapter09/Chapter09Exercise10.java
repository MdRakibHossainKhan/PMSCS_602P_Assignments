package chapter09;

import java.util.Scanner;

public class Chapter09Exercise10 {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a sentence (or an empty string to exit): ");
			String sentence = scanner.nextLine();

			if (sentence.isEmpty()) {
				System.out.println("Exiting the program.");
				break;
			}

			// Create a StringBuffer object to store the reversed sentence
			StringBuffer reversedSentence = new StringBuffer(sentence);

			// Use the reverse method to reverse the sentence
			reversedSentence.reverse();

			System.out.println("Reversed sentence: " + reversedSentence);
		}

		scanner.close();
	}
}
