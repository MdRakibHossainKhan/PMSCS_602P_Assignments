package chapter03;

import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Chapter03Exercise27 {

	public static void main(String[] args) {
		String birthdayInput = JOptionPane.showInputDialog("Enter your birthday in the MM/dd/yyyy format.");

		DateTimeFormatter patternDTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate formattedBirthday = LocalDate.now();

		try {
			formattedBirthday = LocalDate.parse(birthdayInput, patternDTF);
		} catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "Enter your birthday in the right format.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();

			return;
		}

		LocalDate dateToday = LocalDate.now();

		long ageInDay = ChronoUnit.DAYS.between(formattedBirthday, dateToday);

		String displayMessage = String.format("You are %s days old.", ageInDay);
		JOptionPane.showMessageDialog(null, displayMessage);
	}

}
