package myutils;

public class MealCard {
	private int balance;

	// Constructor with default initial balance (100 points)
	public MealCard() {
		this.balance = 100;
	}

	// Constructor with custom initial balance
	public MealCard(int initialBalance) {
		this.balance = initialBalance;
	}

	// Method to purchase additional points
	public void purchasePoints(int points) {
		this.balance += points;
	}

	// Method to buy food items and deduct points from the balance
	public void buyFood(int foodPoints) {
		int totalCost = foodPoints;

		if (this.balance >= totalCost) {
			this.balance -= totalCost;
			System.out.println("Purchase successful. Remaining balance: " + this.balance + " points.");
		} else {
			System.out.println("Insufficient balance. Please add more points.");
		}
	}

	// Method to get the current balance
	public int getBalance() {
		return this.balance;
	}
}
