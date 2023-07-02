package chapter04;

import java.util.Scanner;

public class Chapter04Exercise06 {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);

		final int pricePerA_Seat = 300;
		final int pricePerB_Seat = 200;
		final int pricePerC_Seat = 100;

		System.out.print("Enter the Number of Tickets Sold in Category A: ");
		int numberOfA_Seats = keyBoard.nextInt();

		System.out.print("Enter the Number of Tickets Sold in Category B: ");
		int numberOfB_Seats = keyBoard.nextInt();

		System.out.print("Enter the Number of Tickets Sold in Category C: ");
		int numberOfC_Seats = keyBoard.nextInt();

		keyBoard.close();

		int totalSales = numberOfA_Seats * pricePerA_Seat + numberOfB_Seats * pricePerB_Seat
				+ numberOfC_Seats * pricePerC_Seat;

		System.out.println("The Total Sales: " + totalSales);
	}

}
