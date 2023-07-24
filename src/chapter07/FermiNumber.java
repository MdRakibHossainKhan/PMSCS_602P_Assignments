package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This class represents a three-digit Fermi number.
 */
public class FermiNumber {
	private List<Integer> digits;

	/**
	 * Constructs a FermiNumber object with three distinct random digits between 0
	 * and 9.
	 */
	public FermiNumber() {
		generateRandomDigits();
	}

	private void generateRandomDigits() {
		List<Integer> allDigits = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			allDigits.add(i);
		}

		Collections.shuffle(allDigits, new Random());
		digits = allDigits.subList(0, 3);
	}

	/**
	 * Checks the player's guess against the Fermi number and returns the hint.
	 *
	 * @param guessDigits The digits provided by the player's guess.
	 * @return The hint containing "Fermi", "Pico", or "Nano" for each position.
	 */
	public String checkGuess(List<Integer> guessDigits) {
		StringBuilder hint = new StringBuilder();

		for (int i = 0; i < digits.size(); i++) {
			int guessDigit = guessDigits.get(i);
			int fermiDigit = digits.get(i);

			if (guessDigit == fermiDigit) {
				hint.append("Fermi ");
			} else if (digits.contains(guessDigit)) {
				hint.append("Pico ");
			} else {
				hint.append("Nano ");
			}
		}

		return hint.toString().trim();
	}

	@Override
	public String toString() {
		return digits.get(0) + " " + digits.get(1) + " " + digits.get(2);
	}
}
