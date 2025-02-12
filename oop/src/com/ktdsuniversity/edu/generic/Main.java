package com.ktdsuniversity.edu.generic;

import school.Student;

public class Main {
	public static void main(String[]args) {
		ScoreArray<Integer> sa = new ScoreArray<>("abc");
		for(int i =0; i<100; i++) {			
			sa.add((int)(Math.random()*101)); //반드시  int
		}
		
		Object[]intScoreArray = sa.getScoreArray();
		int intSize = sa.getSize();
		int sum = 0;
		for(int i = 0; i<intSize; i++) {
			//is a 규칙 위반.  parseInt가 받을 수 있는 타입은 String이어서.
			// String is a Object
			// 지금 우리는 Object is a String을 하고 있는 것이다.
			//Integer.parseInt(intScoreArray[i]);
			
			sum += Integer.parseInt(intScoreArray[i].toString()); //nullpointerexception이 날 위험이 있다.
		}
		System.out.println("====int====");
		System.out.println(sum);
		double avg = sum / (double) intSize;
		System.out.println(avg);

		ScoreArray<String>  sa2 = new ScoreArray<>("abc");
		for(int i =0; i<100; i++) {			
			sa2.add((int)(Math.random()*101)+""); //반드시  int
		}
		
		Object[]stringScoreArray = sa2.getScoreArray();
		int stringSize = sa2.getSize();
		int stringSum = 0;
		for(int i = 0; i<stringSize; i++) {
			//is a 규칙 위반.  parseInt가 받을 수 있는 타입은 String이어서.
			// String is a Object
			// 지금 우리는 Object is a String을 하고 있는 것이다.
			//Integer.parseInt(intScoreArray[i]);
			
			stringSum += Integer.parseInt(stringScoreArray[i].toString()); //nullpointerexception이 날 위험이 있다.
		}
		System.out.println("====String====");
		System.out.println(stringSum);
		double stringAvg = stringSum / (double) stringSize;
		System.out.println(stringAvg);
		

		ScoreArray<Student>  sa3 = new ScoreArray<>("abc");
		for(int i =0; i<100; i++) {		
			int score1 = (int)(Math.random()*101);
			int score2 = (int)(Math.random()*101);
			int score3 = (int)(Math.random()*101);
			int score4 = (int)(Math.random()*101);
			sa3.add(new Student(score1, score2, score3, score4));
		}
		
		Object[]studentScoreArray = sa3.getScoreArray();
		int studentSize = sa3.getSize();
		int studentSum = 0;
		for(int i = 0; i<studentSize; i++) {
			//is a 규칙 위반.  parseInt가 받을 수 있는 타입은 String이어서.
			// String is a Object
			// 지금 우리는 Object is a String을 하고 있는 것이다.
			//Integer.parseInt(intScoreArray[i]);
			
			studentSum += ((Student)studentScoreArray[i]).getSumAllScore(); //nullpointerexception이 날 위험이 있다.
		}
		System.out.println("====Student====");
		System.out.println(studentSum);
		double studentAvg = studentSum / (double) studentSize;
		System.out.println(studentAvg);
	}
}
