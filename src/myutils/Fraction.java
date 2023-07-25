package myutils;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int denom) {
		if (denom == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero.");
		}

		denominator = denom;
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	public String toString() {
		return getNumerator() + "/" + getDenominator();
	}

	// Custom Exception for handling invalid Fraction
	public static class InvalidFractionException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public InvalidFractionException(String message) {
			super(message);
		}
	}

}
