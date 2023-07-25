package chapter08;

import java.util.HashMap;
import java.util.Map;

public class Dorm {
	private Map<String, Club> clubs;

	public Dorm() {
		clubs = new HashMap<>();
		clubs.put("Computer Science Club", new Club("Computer Science Club"));
		clubs.put("Biology Club", new Club("Biology Club"));
		clubs.put("Billiard Club", new Club("Billiard Club"));
		clubs.put("No Sleep Club", new Club("No Sleep Club"));
		clubs.put("Wine Tasting Club", new Club("Wine Tasting Club"));
	}

	public void addMemberToClub(String clubName, Resident resident) {
		Club club = clubs.get(clubName);

		if (club != null) {
			club.addMember(resident);
		} else {
			System.out.println("Club not found!");
		}
	}

	public void removeMemberFromClub(String clubName, Resident resident) {
		Club club = clubs.get(clubName);

		if (club != null) {
			boolean removed = club.removeMember(resident);

			if (!removed) {
				System.out.println("Resident not found in the club!");
			}
		} else {
			System.out.println("Club not found!");
		}
	}

	public void saveAllClubsData() {
		for (Club club : clubs.values()) {
			club.saveMembersToFile();
		}
	}

	public void loadAllClubsData() {
		for (Club club : clubs.values()) {
			club.loadMembersFromFile();
		}
	}

}
