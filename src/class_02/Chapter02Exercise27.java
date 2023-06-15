package class_02;

import java.util.Scanner;

public class Chapter02Exercise27 {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Enter string input.");
		String stringInput = scanner.nextLine();
		
		scanner.close();
		
		int charNumber = stringInput.length();
		char firstChar = stringInput.charAt(0);
		char lastChar = stringInput.charAt(charNumber-1);
		
		System.out.println(charNumber);
		System.out.println(firstChar);
		System.out.println(lastChar);
	}

}
