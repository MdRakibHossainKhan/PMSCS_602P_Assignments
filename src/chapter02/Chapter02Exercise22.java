package chapter02;

import javax.swing.JFrame;
import java.util.Scanner;

public class Chapter02Exercise22 {

	public static void main(String[] args) {
		JFrame myFrame;
		myFrame = new JFrame();

		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("Enter frame width.");
		int frameWidth = scanner.nextInt();

		System.out.println("Enter frame height.");
		int frameHeight = scanner.nextInt();

		System.out.println("Enter frame title.");
		scanner.nextLine();
		String frameTitle = scanner.nextLine();

		scanner.close();

		myFrame.setSize(frameWidth, frameHeight);
		myFrame.setTitle(frameTitle);
		myFrame.setVisible(true);
	}

}
