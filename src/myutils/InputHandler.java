package myutils;

import java.util.Scanner;

public class InputHandler {
	private static final String BLANK = "";
	private String name;
	private String room;
	private String pwd;
	private Scanner scanner;

	public InputHandler() {
		name = BLANK;
		room = BLANK;
		pwd = BLANK;

		scanner = new Scanner(System.in);
	}

	public void getInput() throws EmptyInputException {
		System.out.print("Enter Name: ");
		name = scanner.next();

		if (name.trim().isEmpty()) {
			throw new EmptyInputException("Name cannot be blank.");
		}

		System.out.print("Enter Room No.: ");
		room = scanner.next();

		if (room.trim().isEmpty()) {
			throw new EmptyInputException("Room number cannot be blank.");
		}

		System.out.print("Enter Password: ");
		pwd = scanner.next();

		if (pwd.trim().isEmpty()) {
			throw new EmptyInputException("Password cannot be blank.");
		}
	}

	public String getName() {
		return name;
	}

	public String getRoom() {
		return room;
	}

	public String getPassword() {
		return pwd;
	}
}
