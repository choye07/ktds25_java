
package school;

public class School {
	public static void main(String[] args) {
	
		Student student1 = new Student();
		
		student1.java = 100;
		student1.python = 97;
		student1.cpp = 81;
		student1.csharp = 99;
		
//		student1.java = (int)(Math.random()*100);
//		student1.python = (int)(Math.random()*100);
//		student1.cpp = (int)(Math.random()*100);
//		student1.csharp = (int)(Math.random()*100);
		
		System.out.println("합계: " + student1.getSumAllScore());;
		System.out.println("평균: " + student1.getAverage());
		System.out.println("학점: " + student1.getCourseCredit());
		System.out.println("등급: " + student1.getABCDF());
	}
}