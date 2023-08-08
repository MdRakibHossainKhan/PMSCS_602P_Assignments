package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter10Exercise19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Read the input DNA (or RNA) sequence from the user
			System.out.print("Enter DNA (or RNA) sequence (or empty string to exit): ");
			String inputSequence = scanner.nextLine().toUpperCase();

			// Check if the input is empty, if yes, break out of the loop
			if (inputSequence.isEmpty()) {
				break;
			}

			// Extract and store codons in an ArrayList
			ArrayList<String> codonsList = new ArrayList<>();
			int codonLength = 3;

			for (int i = 0; i < inputSequence.length(); i += codonLength) {
				// Ensure we have enough characters to form a codon
				if (i + codonLength <= inputSequence.length()) {
					String codon = inputSequence.substring(i, i + codonLength);
					codonsList.add(codon);
				}
			}

			// Output the extracted codons using a for-each loop
			System.out.println("Codons extracted from the sequence:");
			for (String codon : codonsList) {
				System.out.println(codon);
			}
		}

		scanner.close();
	}
}
