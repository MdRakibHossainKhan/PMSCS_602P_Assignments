package chapter04;

import java.util.Random;

public class Chapter04Exercise05 {

	// Simulates the rolling of three dice
	public static void main(String[] args) {
		int numberOfRoll = 3;
		int numberOnDie[] = new int[numberOfRoll];

		Die die = new Die();

		for (int i = 0; i < numberOfRoll; i++) {
			die.roll();

			numberOnDie[i] = die.getNumber();
		}

		System.out.println("Results are " + numberOnDie[0] + " " + numberOnDie[1] + " " + numberOnDie[2]);
	}

}

class Die {
	// Data Members

	// The largest number on a die
	private static final int MAX_NUMBER = 6;

	// The smallest number on a die
	private static final int MIN_NUMBER = 1;

	// To represent a die that is not yet rolled
	private static final int NO_NUMBER = 0;

	private int number;

	private Random random;

	// Constructor
	public Die() {
		random = new Random();

		number = NO_NUMBER;
	}

	// Rolls the die
	public void roll() {
		number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	}

	// Returns the number on this die
	public int getNumber() {
		return number;
	}
}
