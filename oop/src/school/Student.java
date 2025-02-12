package school;

public class Student {
	int java; // 멤버변수 선언
	int python;
	int cpp;
	int csharp;
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java=java;
		this.python =python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	public int getSumAllScore() {
		return java + python + cpp + csharp; // 377
	}
	
	public double getAverage() {
//		double average = (double)(getSumAllScore() / 4);
//		// 소수점 아래 두자리 까지만 반환
//		average = ((int)(average*100.0)/100.0);
//		return average;
		
		// 소수점 아래 두자리 까지만 반환
		//getSumAllScores() / 4.0 => 12.23431212
		//getSumAllScores() / 4.0 => 12.23431212 => 1223
		
		int average = (int)(getSumAllScore() / 4.0 * 100); // 9425
		return average / 100.0; // 94.25
	}
	
	public double getCourseCredit() {
//		double courseCredit = (double)((getAverage() - 55 ) / 10);
		// 소수점 아래 두자리 까지만 반환
		int courseCredit = (int)((getAverage() - 55) / 10.0 * 100); // 392
		return courseCredit / 100.0; // 3.92
	}
	
	public String getABCDF() {
		double courseCredit =  getCourseCredit();
		// if (courseCredit >= 4.1){ } 로 가능
		if(courseCredit >= 4.1 && courseCredit <= 4.5) {
			return "A+";
		}
		// if (courseCredit >= 3.6){ } 로 가능
		else if(courseCredit >= 3.6 && courseCredit <= 4.0) {
			return "A";
		}
		else if(courseCredit >= 3.5 && courseCredit <= 3.1) {
			return "B+";
		}
		else if(courseCredit >= 2.6 && courseCredit <= 3.0) {
			return "B";
		}
		else if(courseCredit >= 1.6 && courseCredit <= 2.5) {
			return "C";
		}
		else if(courseCredit >= 0.6 && courseCredit <= 1.5) {
			return "D";
		}
		else {
			return "F";
		}
	}
}
