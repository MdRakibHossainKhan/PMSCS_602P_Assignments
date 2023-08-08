package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter10Exercise12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of real numbers (N) from the user
		System.out.print("Enter the number of real numbers (N): ");
		int N = scanner.nextInt();

		// Read N real numbers from the user
		ArrayList<Double> numbers = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			System.out.print("Enter real number " + (i + 1) + ": ");
			numbers.add(scanner.nextDouble());
		}

		// Calculate the mean
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		double mean = sum / N;

		// Calculate the sum of squared differences between each number and the mean
		double squaredDifferencesSum = 0;
		for (double num : numbers) {
			double difference = num - mean;
			squaredDifferencesSum += difference * difference;
		}

		// Calculate the variance
		double variance = squaredDifferencesSum / N;

		// Calculate the standard deviation
		double standardDeviation = Math.sqrt(variance);

		// Display the result
		System.out.println("The standard deviation is: " + standardDeviation);

		scanner.close();
	}
}
