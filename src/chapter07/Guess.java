package chapter07;

import java.util.List;

/**
 * This class represents a player's guess containing three digits.
 */
public class Guess {
	private List<Integer> digits;

	/**
	 * Constructs a Guess object with the given digits.
	 *
	 * @param digits The digits representing the player's guess.
	 */
	public Guess(List<Integer> digits) {
		this.digits = digits;
	}

	/**
	 * Gets the digits of the player's guess.
	 *
	 * @return The digits representing the player's guess.
	 */
	public List<Integer> getDigits() {
		return digits;
	}
}
