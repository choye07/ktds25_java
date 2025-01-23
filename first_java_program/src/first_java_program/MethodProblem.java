package first_java_program;

public class MethodProblem {
	/**
	 * 반복문 문제1
	 */
	public static void problem1() {
		int sum =0;
		for(int i=0; i<101; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	/**
	 * 반복문 문제2
	 */
	public static void problem2() {
		int sum =0;
		for(int i=1; i<100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	/**
	 * 반복문 문제3
	 */
	public static void problem3() {
		int sum =0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	/**
	 * 반복문 문제4
	 */
	public static void problem4() {
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			if(i<5) {
				System.out.println();
			}
		}

	}
	/**
	 * 분초 변환
	 * @param minutes
	 * @param seconds
	 * @return 몇 초인지 반환
	 */
	public static int getTime(int minutes, int seconds) {
		int time;
		time = (minutes * 60)+(seconds %  60);
		
		return time;
	}
	/**
	 * 초 -> 분 변환
	 * @param time
	 * @return 분
	 */
	public static int getMinutes(int time) {
		int minutes = time / 60;
		
		return time;
	}	
	/**
	 * 초 -> 분,초 변환
	 * @param time
	 * @return 몇 초인지
	 */
	public static int getSeconds(int time) {
		int seconds = time % 60;
		
		return seconds;
	}
	/**
	 * 화씨->섭씨
	 * @param celsiusc
	 * @return
	 */
	public static int getCelsius(int celsiusc) {
		int result = (celsiusc *  9 / 5 ) + 32;
		return result;
		
	}
	
	/**
	 * 점수 합계
	 * @param korScore
	 * @param engScore
	 * @param mathScore
	 * @param progScore
	 * @return
	 */
	public static int getSum(int korScore,int engScore,int mathScore,int progScore) {
		int sum=0;
		sum = korScore+engScore+mathScore+progScore;
		return sum;
		
	}
	/**
	 * 점수 평균
	 * @param sum
	 * @param subject
	 * @return
	 */
	public static int getAvg(int sum, int subject) {
		int avg= sum/subject;
		return avg;
		
	}
	
	/**
	 * 점수 등급
	 * @param avg
	 * @return
	 */
	public static String getScore(int avg) {
		String result = "F";
		
		if (avg >=95) {
			result= "A+";
		}else if(avg >=90) {
			result= "A";
		}else if(avg >=85) {
			result= "B+";
		}else if(avg >=80) {
			result= "B";
		}else if(avg >=70) {
			result= "C";
		}
		
		return result;
		
	}
	/**
	 * 
	 * @param age
	 * @return
	 */
	public static int getFlightMoney(int age) {
		if( age >=19) {
			return 300_000;
			
		}else {
			return 120_000;
		}
	}
	
	public static void main(String[]args) {
		// 1. 반복문 연습문제 (1)
		problem1();
		
		// 2. 1부터 100 중 홀수의 합을 구해 출력해보세요.
		problem2();
		
		// 3. 1부터 100 중 3, 5, 6의 배수만출력해보세요.
		problem3();
		
		// 4. 별찍기
		problem4();
		
		System.out.println(" ");
		System.out.println("=======반복문 문제 끝=====");
		
		
		// 산술연산자 문제 1. 분,초를 초로 변환하기
		int time =getTime(5,50);
		System.out.println(time);
		
		// 산술연산자 문제 2. 초를 분,초로 변환하기 145초
		int processTime=145;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		System.out.println(processTime+"초는 "+minutes+"분 "+ seconds+"초 입니다.");
		
		// 산술연산자 문제 3. 섭씨를 화씨 온도 변경.
		int celsius =32;
		 int fahrenheit  = getCelsius(celsius);
		 System.out.println("섭씨 "+celsius+" 도는 화씨 "+fahrenheit +"도 입니다.");
		
		 System.out.println("========산술 연산자 끝============");
		 
		 // 조건문 문제 1. 과복멸 점수 -> 합계, 평균, 등급 반환 메소드
		int korScore=(int)(Math.random()*100);
		int engScore=(int)(Math.random()*100);
		int mathScore=(int)(Math.random()*100);
		int progScore=(int)(Math.random()*100);
		 
		int sum = getSum(korScore,engScore,mathScore,progScore);
		int avg = getAvg(sum,4);
		 String score = getScore(avg);
		 System.out.println("합계: "+sum+" 평균: "+avg+" 등급: "+score);
		 
		 //조건문 문제 2.나이를 파라미터로 받아 편도 비행 용금을 계산해 반환하는 메소드
		 
		int money=(int)(Math.random()*1000000);
			
		int father=(int)(Math.random()*100) +20; // 20 ~ 99 
		int mother=(int)(Math.random()*100) +20;
		int daughter=(int)(Math.random()*10);
		
		int fatherFlightMoney = getFlightMoney(father);
		int motherFlightMoney = getFlightMoney(mother);
		int daughterFlightMoney = getFlightMoney(daughter);
		
		int totalFlightMoney =fatherFlightMoney+motherFlightMoney+daughterFlightMoney;
		if(totalFlightMoney >=money) {
			System.out.println("다음에 가자");
		}else {
			System.out.println("여행가자");
		}
		
		
		 
	}
}
