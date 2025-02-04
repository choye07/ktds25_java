package com.ktdsuniversity.edu.staticexam;

public class ClassMethodExamMain {

	public static void main(String[] args) {
		
		int age = 5;
		int min = 0;
		int max = 10;
		
		boolean isValidAge = ClassMethodExam.isValidAge(age, min, max);
		System.out.println(isValidAge);
		
		int score1 = (int) (Math.random()*100+1);
		int score2 = (int) (Math.random()*100+1);
		int score3 = (int) (Math.random()*100+1);
		int score4 = (int) (Math.random()*100+1);
		
		int sum = (score1+score2+score3+score4);
		double avg =((int)(sum / 4.0 * 100))/100.0;
		
		
		double CourseCredit = Math.abs(ClassMethodExam.getCourseCredit(avg));
		System.out.println(CourseCredit);
		
		
	}

}
