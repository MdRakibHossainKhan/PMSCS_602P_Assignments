package chapter07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class handles the Fermi game logic and user interactions.
 */
public class Chapter07Exercise17 {
	private static final int NUM_DIGITS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean playAgain = true;

		while (playAgain) {
			FermiNumber fermiNumber = new FermiNumber();
			int guessCount = 0;

			System.out.println("Welcome to the Fermi game!");
			System.out.println("Guess the three-digit Fermi number. Each digit is between 0 and 9.");

			while (true) {
				List<Integer> guessDigits = readGuess(scanner);

				if (guessDigits == null) {
					System.out.println("Goodbye! Thanks for playing!");
					playAgain = false;
					break;
				}

				guessCount++;

				String hint = fermiNumber.checkGuess(guessDigits);
				System.out.println("Hint: " + hint);

				if (hint.equals("Fermi Fermi Fermi")) {
					System.out.println("Congratulations! You guessed the Fermi number: " + fermiNumber);
					System.out.println("Number of guesses: " + guessCount);
					break;
				}
			}
		}
	}

	private static List<Integer> readGuess(Scanner scanner) {
		List<Integer> guessDigits = new ArrayList<>();

		for (int i = 1; i <= NUM_DIGITS; i++) {
			System.out.print("Enter digit for position " + i + ": ");

			if (scanner.hasNextInt()) {
				int digit = scanner.nextInt();

				if (digit < 0 || digit > 9) {
					System.out.println("Invalid input. Digits must be between 0 and 9.");
					return null;
				}

				guessDigits.add(digit);
			} else {
				System.out.println("Invalid input. Please enter a valid digit.");
				return null;
			}
		}

		return guessDigits;
	}
}
