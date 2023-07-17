package chapter06;

import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class Chapter06Exercise27 {

	public static void main(String[] args) {
		float n1 = 90;
		float n2 = 30;

		calSin(n1);
		calCos(n2);
	}

	static void calSin(float n) {
		float accuracy = (float) 0.0001, denominator, sinx, sinval;

		// Converting degrees to radians
		n = n * (float) (3.142 / 180.0);
		float x1 = n;

		// Maps the sum along the series
		sinx = n;

		// Holds the actual value of sin(n)
		sinval = (float) sin(n);

		int i = 1;
		do {
			denominator = 2 * i * (2 * i + 1);
			x1 = -x1 * n * n / denominator;
			sinx = sinx + x1;
			i = i + 1;
		} while (accuracy <= sinval - sinx);

		System.out.println("sinx = " + sinx);
	}

	static void calCos(float n) {
		float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;

		// Converting degrees to radians
		n = n * (float) (3.142 / 180.0);
		x1 = 1;

		// Maps the sum along the series
		cosx = x1;

		// Holds the actual value of sin(n)
		cosval = (float) cos(n);

		int i = 1;
		do {
			denominator = 2 * i * (2 * i - 1);
			x1 = -x1 * n * n / denominator;
			cosx = cosx + x1;
			i = i + 1;

		} while (accuracy <= cosval - cosx);

		System.out.println("cosx = " + cosx);
	}

}
