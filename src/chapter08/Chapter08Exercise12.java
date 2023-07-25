package chapter08;

import java.util.Scanner;

public class Chapter08Exercise12 {
	public static void main(String[] args) {
		Dorm dorm = new Dorm();
		Scanner scanner = new Scanner(System.in);

		// Load existing club members from files (if any)
		dorm.loadAllClubsData();

		while (true) {
			System.out.println("---- Social Clubs in Dormitory ----");
			System.out.println("1. Add Member to a Club");
			System.out.println("2. Remove Member from a Club");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (1/2/3): ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character after reading the integer

			switch (choice) {
			case 1:
				System.out.print("Enter the club name (e.g., Computer Science Club): ");
				String clubName = scanner.nextLine();

				System.out.print("Enter the resident's name: ");
				String name = scanner.nextLine();

				System.out.print("Enter the resident's ID: ");
				int id = scanner.nextInt();

				scanner.nextLine(); // Consume the newline character after reading the integer

				Resident resident = new Resident(name, id);
				dorm.addMemberToClub(clubName, resident);

				break;

			case 2:
				System.out.print("Enter the club name (e.g., Computer Science Club): ");
				clubName = scanner.nextLine();

				System.out.print("Enter the resident's name: ");
				name = scanner.nextLine();

				System.out.print("Enter the resident's ID: ");
				id = scanner.nextInt();

				scanner.nextLine(); // Consume the newline character after reading the integer

				resident = new Resident(name, id);
				dorm.removeMemberFromClub(clubName, resident);

				break;

			case 3:
				dorm.saveAllClubsData();
				System.out.println("Exiting program.");

				scanner.close();
				System.exit(0);

				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
