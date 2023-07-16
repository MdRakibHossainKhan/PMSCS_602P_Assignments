package chapter05;

import java.util.Scanner;

public class Chapter05Exercise09 {

	public static void main(String[] args) {
		int powerOfTen;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the power of 10.");
		powerOfTen = scanner.nextInt();
		scanner.close();

		switch (powerOfTen) {
		case 2:
			System.out.println("Hundred");
			break;
		case 3:
			System.out.println("Thousand");
			break;
		case 6:
			System.out.println("Million");
			break;
		case 9:
			System.out.println("Billion");
			break;
		case 12:
			System.out.println("Trillion");
			break;
		case 15:
			System.out.println("Quadrillion");
			break;
		case 18:
			System.out.println("Quintillion");
			break;
		case 21:
			System.out.println("Sextillion");
			break;
		case 30:
			System.out.println("Nonillion");
			break;
		case 100:
			System.out.println("Googol");
			break;
		default:
			System.out.println("No corresponding word for the number.");
		}
	}

}
