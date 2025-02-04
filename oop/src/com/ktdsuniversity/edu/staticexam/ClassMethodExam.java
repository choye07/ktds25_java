package com.ktdsuniversity.edu.staticexam;

public class ClassMethodExam {

	public static boolean isValidAge(int age, int min, int max) {

		boolean isValidAge = age > min;
		isValidAge &= age < max;
		
		if(!isValidAge) {
			return false;
		}
		return isValidAge;
		
	}
	public static double getCourseCredit(double average) {
		int courseCredit = (int)((average- 55) / 10.0 * 100); // 392
		return courseCredit / 100.0; // 3.92
	}
}
