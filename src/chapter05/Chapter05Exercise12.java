package chapter05;

import java.util.Scanner;

public class Chapter05Exercise12 {

	public static void main(String[] args) {
		int year;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an year.");
		year = scanner.nextInt();
		scanner.close();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}

}
