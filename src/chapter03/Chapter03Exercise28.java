package chapter03;

import javax.swing.JOptionPane;

public class Chapter03Exercise28 {

	public static void main(String[] args) {
		String purchasePriceInput = JOptionPane.showInputDialog("Enter purchase price in cents.");
		String tenderedAmountInput = JOptionPane.showInputDialog("Enter amount tendered in cents.");

		int purchasePriceInCent = Integer.parseInt(purchasePriceInput);
		int tenderedAmountInCent = Integer.parseInt(tenderedAmountInput);

		float purchasePriceInDollar = convertCentToDollar(purchasePriceInCent);
		float tenderedAmountInDollar = convertCentToDollar(tenderedAmountInCent);
		float changeInDollar = tenderedAmountInDollar - purchasePriceInDollar;

		calculateChange(purchasePriceInCent, tenderedAmountInCent);

		String displayMessage = String.format(
				"Purchase Price: $ %.2f\n" + "Amount Tendered: $ %.2f\n\n" + "Your change is: $ %.2f\n\n"
						+ "%d one-dollar bill(s)\n" + "%d quarter(s)\n" + "%d dime(s)\n" + "%d nickel(s)\n"
						+ "%d penn(y/ies)\n\n" + "Thank you for your business. Come back soon.",
				purchasePriceInDollar, tenderedAmountInDollar, changeInDollar, BillAndCoinNumber.numberOfOneDollarBill,
				BillAndCoinNumber.numberOfQuarter, BillAndCoinNumber.numberOfDime, BillAndCoinNumber.numberOfNickel,
				BillAndCoinNumber.numberOfPenny);

		JOptionPane.showMessageDialog(null, displayMessage);
	}

	private static float convertCentToDollar(int cent) {
		float amountInCent = cent;
		float convertedAmount = amountInCent / CurrencyValue.DOLLAR.getValueInCent();

		return convertedAmount;
	}

	private static void calculateChange(int purchasePriceInCent, int tenderedAmountInCent) {
		int remainingChangeInCent = tenderedAmountInCent - purchasePriceInCent;

		int numberOfOneDollarBill = remainingChangeInCent / CurrencyValue.DOLLAR.getValueInCent();
		remainingChangeInCent = remainingChangeInCent - (numberOfOneDollarBill * CurrencyValue.DOLLAR.getValueInCent());

		int numberOfQuarter = remainingChangeInCent / CurrencyValue.QUARTER.getValueInCent();
		remainingChangeInCent = remainingChangeInCent - (numberOfQuarter * CurrencyValue.QUARTER.getValueInCent());

		int numberOfDime = remainingChangeInCent / CurrencyValue.DIME.getValueInCent();
		remainingChangeInCent = remainingChangeInCent - (numberOfDime * CurrencyValue.DIME.getValueInCent());

		int numberOfNickel = remainingChangeInCent / CurrencyValue.NICKEL.getValueInCent();
		remainingChangeInCent = remainingChangeInCent - (numberOfNickel * CurrencyValue.NICKEL.getValueInCent());

		int numberOfPenny = remainingChangeInCent / CurrencyValue.PENNY.getValueInCent();
		remainingChangeInCent = remainingChangeInCent - (numberOfPenny * CurrencyValue.PENNY.getValueInCent());

		/*
		 * We can access a static variable from another class using the class name,
		 * without creating an instance of the class.
		 */
		BillAndCoinNumber.numberOfOneDollarBill = numberOfOneDollarBill;
		BillAndCoinNumber.numberOfQuarter = numberOfQuarter;
		BillAndCoinNumber.numberOfDime = numberOfDime;
		BillAndCoinNumber.numberOfNickel = numberOfNickel;
		BillAndCoinNumber.numberOfPenny = numberOfPenny;
	}

}

enum CurrencyValue {
	DOLLAR("Dollar", 100), QUARTER("Quarter", 25), DIME("Dime", 10), NICKEL("Nickel", 5), PENNY("Penny", 1);

	private final String label;
	private int valueInCent;

	public String getLabel() {
		return this.label;
	}

	public int getValueInCent() {
		return this.valueInCent;
	}

	private CurrencyValue(String label, int valueInCent) {
		this.label = label;
		this.valueInCent = valueInCent;
	}
}

class BillAndCoinNumber {
	static int numberOfOneDollarBill;
	static int numberOfQuarter;
	static int numberOfDime;
	static int numberOfNickel;
	static int numberOfPenny;
}
