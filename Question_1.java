package assignments.assignments_3;

import java.text.DecimalFormat;

public class Question_1 {

	public static void main(String[] arr) {

		double gallons, liter;
		gallons = 15;
		liter = gallons * 3.785411784;

		System.out.println(gallons + " gallon is " + new DecimalFormat("##.####").format(liter) + " liter");

	}
}
