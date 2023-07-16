package chapter05;

import java.util.Scanner;

public class Chapter05Exercise18 {
	private static final double COST_PER_BAG = 5.5;
	private static int numberOfBag;
	private static double totalCost;
	private static double discount;
	private static double discountAmount;
	private static double totalCharge;
	private static String discountPercentage;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of bags ordered.");
		numberOfBag = scanner.nextInt();

		while (numberOfBag <= 0) {
			System.out.println("The number of bags ordered must be greater than zero.");
			numberOfBag = scanner.nextInt();
		}

		scanner.close();

		findDiscountPercentage();

		calculateCost();

		printInvoice();
	}

	private static void findDiscountPercentage() {
		if (numberOfBag > 0 && numberOfBag < 25) {
			discountPercentage = "0%";
			discount = 0.0;
		} else if (numberOfBag >= 25 && numberOfBag < 50) {
			discountPercentage = "5%";
			discount = 0.05;
		} else if (numberOfBag >= 50 && numberOfBag < 100) {
			discountPercentage = "10%";
			discount = 0.1;
		} else if (numberOfBag >= 100 && numberOfBag < 150) {
			discountPercentage = "15%";
			discount = 0.15;
		} else if (numberOfBag >= 150 && numberOfBag < 200) {
			discountPercentage = "20%";
			discount = 0.2;
		} else if (numberOfBag >= 200 && numberOfBag < 300) {
			discountPercentage = "25%";
			discount = 0.25;
		} else {
			discountPercentage = "30%";
			discount = 0.3;
		}
	}

	private static void calculateCost() {
		totalCost = numberOfBag * COST_PER_BAG;
		discountAmount = totalCost * discount;
		totalCharge = totalCost - discountAmount;
	}

	private static void printInvoice() {
		System.out.format("Number of Bags Ordered: %d - $%.2f\n", numberOfBag, totalCost);
		System.out.format("Discount: %s - $%.2f\n", discountPercentage, discountAmount);
		System.out.format("Your total charge is: $%.2f", totalCharge);
	}
}
