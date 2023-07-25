package chapter08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Club {
	private String clubName;
	private List<Resident> members;

	public Club(String clubName) {
		this.clubName = clubName;
		this.members = new ArrayList<>();
	}

	public void addMember(Resident resident) {
		members.add(resident);
	}

	public boolean removeMember(Resident resident) {
		return members.remove(resident);
	}

	public List<Resident> getMembers() {
		return members;
	}

	// Save club members to a file
	public void saveMembersToFile() {
		String fileName = clubName + ".txt";

		try (FileWriter writer = new FileWriter(fileName)) {
			for (Resident resident : members) {
				writer.write(resident.getName() + "," + resident.getId() + System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Load club members from a file
	public void loadMembersFromFile() {
		String fileName = clubName + ".txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				int id = Integer.parseInt(parts[1]);
				Resident resident = new Resident(name, id);
				members.add(resident);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
