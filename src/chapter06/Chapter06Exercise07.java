package chapter06;

import java.util.Scanner;

public class Chapter06Exercise07 {
	private static int number;

	public static void main(String[] args) {
		boolean isPrime = false;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a number.");
			number = scanner.nextInt();

			isPrime = isPrime(number);

			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		} while (number >= 0);

		scanner.close();
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
