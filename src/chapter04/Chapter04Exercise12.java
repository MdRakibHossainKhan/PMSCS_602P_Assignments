package chapter04;

public class Chapter04Exercise12 {

	public static void main(String[] args) {
		double age = 30;
		double heightInCm = 170;

		double recommendedWeight = Height.calculateRecommendedWeight(heightInCm, age);

		System.out.println(String.format("Recommended Weight: %.2f", recommendedWeight));
	}

}

class Height {

	static public double calculateRecommendedWeight(double height, double age) {
		double recommendedWeight = (height - 100 + age / 10) * 0.90;

		return recommendedWeight;
	}

}
