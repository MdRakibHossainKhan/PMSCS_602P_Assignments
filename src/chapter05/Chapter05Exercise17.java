package chapter05;

import java.util.Scanner;

public class Chapter05Exercise17 {
	private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static final String[] ROMAN_LITERALS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
			"I" };

	public static void main(String[] args) {
		int year;
		String yearInRoman;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year.");
		year = scanner.nextInt();
		scanner.close();

		yearInRoman = integerToRoman(year);

		System.out.println("Year in Roman Numerals: " + yearInRoman);
	}

	public static final String integerToRoman(int number) {
		StringBuilder sB = new StringBuilder();

		for (int i = 0; i < VALUES.length; i++) {
			while (number >= VALUES[i]) {
				number -= VALUES[i];
				sB.append(ROMAN_LITERALS[i]);
			}
		}

		return sB.toString();
	}

}
