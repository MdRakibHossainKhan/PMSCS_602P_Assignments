package chapter03;

public class Chapter03Exercise07 {

	public static void main(String[] args) {
		int lengthInCm = 100;

		convertCmToInch(lengthInCm);
		convertCmToFoot(lengthInCm);
	}

	private static double convertCmToInch(int cm) {
		double lengthInInch = (1 / 2.54) * cm; // Given, 1 inch = 2.54 cm

		System.out.printf("Inches: %.2f \n", lengthInInch);

		return lengthInInch;
	}

	private static double convertCmToFoot(int cm) {
		double lengthInFeet = ((1 / 2.54) / 12) * cm;

		System.out.printf("Feet: %.2f \n", lengthInFeet);

		return lengthInFeet;
	}

}
