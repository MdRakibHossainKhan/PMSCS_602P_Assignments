package chapter05;

import java.util.Scanner;

public class Chapter05Exercise13 {
	static double basicHourlyWage = 7.25;
	static double overtimeHourlyWage = basicHourlyWage * 1.5;

	public static void main(String[] args) {
		double wage;
		double basicHour;
		double overtimeHour;
		double totalSale;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of basic hours worked.");
		basicHour = scanner.nextDouble();

		System.out.println("Enter the number of overtime hours worked.");
		overtimeHour = scanner.nextDouble();

		System.out.println("Enter the total sales.");
		totalSale = scanner.nextDouble();

		scanner.close();

		wage = computeWage(basicHour, overtimeHour, totalSale);

		System.out.println("Wage is: " + wage);
	}

	private static double computeWage(double basicHour, double overtimeHour, double totalSale) {
		double wage;
		double commission;
		double commissionPercentage;

		if (totalSale >= 1 && totalSale < 100) {
			commissionPercentage = 0.05;
		} else if (totalSale >= 100 && totalSale < 300) {
			commissionPercentage = 0.1;
		} else if (totalSale >= 300) {
			commissionPercentage = 0.15;
		} else {
			commissionPercentage = 0;
		}

		commission = totalSale * commissionPercentage;

		wage = basicHour * basicHourlyWage + overtimeHour * overtimeHourlyWage + commission;

		return wage;
	}

}
