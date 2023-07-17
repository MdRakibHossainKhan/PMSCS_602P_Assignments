package chapter06;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter06Exercise31 {
	static final double g = 9.8;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");

		double v;
		double angle;
		int t = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter initial velocity v (m/s): ");
		v = sc.nextDouble();

		System.out.print("Enter initial angle alpha (degrees): ");
		angle = sc.nextDouble();

		sc.close();

		double alpha = Math.toRadians(angle);

		double vCosAlpha = v * Math.cos(alpha);
		double vSinAlpha = v * Math.sin(alpha);

		double x = 0.0;
		double y = 0.0;

		while (y >= 0) {
			x = vCosAlpha * t;
			y = (vSinAlpha * t) - ((g * Math.pow(t, 2)) / 2);

			t++;

			if (y >= 0) {
				System.out.println("(x, y) = (" + df.format(x) + ", " + df.format(y) + ")");
			}
		}
	}

}
