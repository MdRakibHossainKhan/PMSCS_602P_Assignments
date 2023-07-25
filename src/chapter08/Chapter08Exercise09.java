package chapter08;

import myutils.Fraction;
import myutils.Fraction.InvalidFractionException;

public class Chapter08Exercise09 {

	public static void main(String[] args) {
		try {
			Fraction fraction = new Fraction(3, 0);
			System.out.println(fraction);
		} catch (IllegalArgumentException e) {
			System.err.println("Caught IllegalArgumentException: " + e.getMessage());
		} catch (InvalidFractionException e) {
			System.err.println("Caught InvalidFractionException: " + e.getMessage());
		}
	}

}
