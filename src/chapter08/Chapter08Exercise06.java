package chapter08;

import java.util.*;

class Chapter08Exercise06 {
	private static final String DEFAULT_MESSAGE = "Your age: ";
	private static final int DEFAULT_LOWER_BOUND = 0;
	private static final int DEFAULT_UPPER_BOUND = 99;

	private int lowerBound;
	private int upperBound;

	private Scanner scanner;

	public Chapter08Exercise06() {
		init(DEFAULT_LOWER_BOUND, DEFAULT_UPPER_BOUND);
	}

	public Chapter08Exercise06(int low, int high) throws IllegalArgumentException {
		if (low > high) {
			throw new IllegalArgumentException("Low (" + low + ") was " + "larger than high(" + high + ")");
		} else {
			init(low, high);
		}
	}

	public int getAge() throws Exception {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) throws Exception {
		int age;

		while (true) {
			System.out.print(prompt);

			try {
				age = scanner.nextInt();

				if (age < lowerBound || age > upperBound) {
					throw new Exception("Input out of bound");
				}

				return age; // input okay so return the value & exit
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Input is invalid.\n" + "Please enter digits only");
			} catch (IllegalArgumentException e) {
				System.out.println("Illegal value: negative age is invalid.");
			}
		}
	}

	private void init(int low, int high) {
		lowerBound = low;
		upperBound = high;

		scanner = new Scanner(System.in);
	}
}
