package chapter03;

import javax.swing.JOptionPane;

public class Chapter03Exercise16 {

	public static void main(String[] args) {
		String weightInput = JOptionPane.showInputDialog("Enter your weight in kg.");

		double weightInEarth = Double.parseDouble(weightInput);
		double weightInMercury = 0.4 * weightInEarth;
		double weightInVenus = 0.9 * weightInEarth;
		double weightInJupiter = 2.5 * weightInEarth;
		double weightInSaturn = 1.1 * weightInEarth;

		String displayMessage = String.format(
				"Your weight on Mercury %.2f kg, Venus %.2f kg, Jupiter %.2f kg & Saturn %.2f kg.", weightInMercury,
				weightInVenus, weightInJupiter, weightInSaturn);
		JOptionPane.showMessageDialog(null, displayMessage);
	}

}
