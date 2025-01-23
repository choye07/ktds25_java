package first_java_program;

public class Compare {
	public static void main(String[]args) {
		
		int a = 10;
		
		// a가 10보다 큰 수 인가?
		
		boolean isGreateThan10 = a > 10;
		System.out.println(a+"는 10보다 큰가요?: "+isGreateThan10);
		
		// a가 20보다 작은 수 인가?
		
		boolean isLessThan20 = a<20;
		System.out.println(a+"는 20보다 작은가요?: " +isLessThan20);
		
		
		// a가 10보다 크고 20보다 작은 수 인가?	
		
		boolean isBetweenNumber = a > 10 && a<20;
		System.out.println(a+"는 10보다 크고 20보다 작은 수 인가요?: "+isBetweenNumber);
		
		int b = (int)(Math.random()*10); // 난수
		
		//b의 값이 짝수인가?
		boolean isEven = b % 2 == 0;
		System.out.println(b+"는 짝수인가요?: "+isEven);
		
		int c = (int)(Math.random()*6); // 0 ~ 5
		//c의 값이 0보다 큰 짝수인가?
		
		boolean isEvenGreateThan0 = c % 2 == 0 && c > 0; //연산결과의 값이 많이 나올 가능성이 조금 더 큰 조건을 앞에 두는 것이 좋다. 
		System.out.println(c +"는 0보다 큰 짝수인가요?: "+isEvenGreateThan0);
		
		
		System.out.println("=======================================================");
		
		int d = 18;
		boolean isMultiple20r5 = d % 2 ==0 || d % 5 ==0;
		System.out.println(d+"의 값은 2 또는 5의 배수인가요?: "+isMultiple20r5);
		
		int son = 7;
		int parent = 11;
		
//		boolean isAvailable = son >= 12 || parent >= 12;
		boolean isAvailable = parent >= 12 || son >= 12; // 부모가 12세 이상이기 때문에 연산 시간이 줄어들 수 있다.
		System.out.println("아이는 부모님과 함께 12세 이상 관람과의 영화를 볼수 있나?: "+isAvailable);
		
		int e = (int)(Math.random()*100);
//		int e = 27;
		// 변수 e의 값이 2 또는 3의 배수 이면서 50 보다 큰가?
		
//		boolean isGreateThan50 = (e % 2== 0 || e % 3 == 0) && (e >50);
		boolean isGreateThan50 = e > 50 && (e % 2== 0 || e % 3 == 0) ; // 연산순위가 &&가 빠름. 
		System.out.println(e+"는 2 또는 3의 배수이면서 50보다 큰가?: "+isGreateThan50);
		
		//!(e > 50) && !(!(e % 2== 0) || e % 3 == 0) => 2의 배수이면서 50이하의 수.
		
		System.out.println("============================================");
		
		int f = (int)(Math.random()*1000);
//		1. 변수 f가 3의 배수가 아닌가?(!=)사용
		int isMultiple3 = (f & 3);
		boolean isMultiple3_2 = (f & 3) != 0;
		System.out.println(isMultiple3);
		System.out.println(f+"는 3의 배수가 아닌가?: "+isMultiple3_2);
		
//		2. 변수 f가 5의 배수가 아닌가?(not)사용
		int isMultiple5 = (f & 3);
		boolean isMultiple5_2 = !(f % 5 == 0);
		System.out.println(isMultiple5);
		System.out.println(f+"는 5의 배수가 아닌가?: "+isMultiple5_2);
		
//		3. 변수 f가 7의 배수 혹은 9의 배수가 아닌가?(!=)사용

		boolean isMultiple7or9 = !(f % 7 == 0) || !(f % 9 == 0);
		System.out.println((f % 7==0)+", "+(f % 9==0));
		System.out.println(f+"는 7의 배수  혹은 9의 배수가 아닌가?: "+isMultiple7or9);

//		4. 변수 f가 7의 배수 혹은 9의 배수가 아닌가?(not)사용
		boolean isMultiple7or9_2 = !(f % 7 == 0 || f % 9 == 0);
		System.out.println(f+"는 7의 배수  혹은 9의 배수가 아닌가?: "+isMultiple7or9_2);
	}
}
