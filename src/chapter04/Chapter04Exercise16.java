package chapter04;

import javax.swing.JOptionPane;

public class Chapter04Exercise16 {

	public static void main(String[] args) {
		String bagWeightInput = JOptionPane.showInputDialog("Enter the unit weight of a coffee bag in pounds.");
		String numberOfBagsInput = JOptionPane.showInputDialog("Enter the number of coffee bags sold.");

		double bagWeight = Double.parseDouble(bagWeightInput);
		double numberOfBags = Double.parseDouble(numberOfBagsInput);

		double totalPriceWithTax = CoffeeBag.calculateTotalPrice(bagWeight, numberOfBags);

		String displayMessage = String.format(
				"Number of bags sold: %.0f\n" + "Weight per bag: %.2f lb\n" + "Price per pound: $%.2f\n"
						+ "Sales tax: %.2f%%\n\n" + "Total price: $%.2f",
				numberOfBags, bagWeight, CoffeeBag.pricePerLb, CoffeeBag.salesTax, totalPriceWithTax);

		JOptionPane.showMessageDialog(null, displayMessage);
	}

}

class CoffeeBag {
	static final double pricePerLb = 5.99;
	static final double salesTax = 7.25;
	static final double taxRate = salesTax / 100;

	static double calculateTotalPrice(double bagWeight, double numberOfBags) {
		double totalPrice = bagWeight * numberOfBags * pricePerLb;
		double totalPriceWithTax = totalPrice + totalPrice * taxRate;

		return totalPriceWithTax;
	}
}
