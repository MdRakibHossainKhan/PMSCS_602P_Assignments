package class_02;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class Chapter02Exercise34 {

	public static void main(String[] args) {
		String stringInput = JOptionPane.showInputDialog("Enter your birth date in yyyy-MM-dd format.");
		
		java.util.Date birthDate = java.sql.Date.valueOf(stringInput);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		String day = simpleDateFormat.format(birthDate);
		
		String displayMessage = "You were born on " + day + ".";
		JOptionPane.showMessageDialog(null, displayMessage);
	}

}
