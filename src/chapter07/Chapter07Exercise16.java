package chapter07;

import myutils.MealCard;

public class Chapter07Exercise16 {

	public static void main(String[] args) {
		// Create a meal card with default initial balance (100 points)
		MealCard card1 = new MealCard();
		System.out.println("Card 1 Balance: " + card1.getBalance());

		// Create a meal card with custom initial balance (500 points)
		MealCard card2 = new MealCard(500);
		System.out.println("Card 2 Balance: " + card2.getBalance());

		// Purchase additional points for card 1
		card1.purchasePoints(50);
		System.out.println("Card 1 Balance after purchasing 50 points: " + card1.getBalance());

		// Purchase food items with card 1
		card1.buyFood(30); // This should succeed
		System.out.println("Card 1 Balance after purchasing food: " + card1.getBalance());

		card1.buyFood(100); // This should fail due to insufficient balance

		// Purchase food items with card 2
		card2.buyFood(200); // This should succeed
		System.out.println("Card 2 Balance after purchasing food: " + card2.getBalance());

		card2.buyFood(400); // This should fail due to insufficient balance
	}

}
