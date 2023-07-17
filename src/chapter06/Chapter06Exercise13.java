package chapter06;

import java.util.Scanner;
import java.util.Date;

public class Chapter06Exercise13 {
	private static int number;

	public static void main(String[] args) {
		int numberOfPrime = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a positive integer greater than 2.");
			number = scanner.nextInt();
		} while (number <= 2);

		scanner.close();

		Date startTime = new Date();

		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				numberOfPrime++;
			}
		}

		Date endTime = new Date();

		long elapsedTimeInMilliseconds = endTime.getTime() - startTime.getTime();

		System.out.format("Number of primes between 2 and %d: %d\n", number, numberOfPrime);
		System.out.format("Amount of time it took to compute: %d ms", elapsedTimeInMilliseconds);
	}

	private static boolean isPrime(int number) {
		boolean isNotPrime = false;

		if (number < 2) {
			isNotPrime = true;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isNotPrime = true;
					break;
				}
			}
		}

		boolean isPrime = !isNotPrime;

		return isPrime;
	}

}
