package first_java_program;

/**
 * 묵시적 형변환 실습
 */
public class TypeCasting {

	public static void main(String[]args) {
		
//		// 1. int (4byte) 타입 변수 정의 및 값 할당.
//		int intNumber = Integer.MAX_VALUE;
//		
//		// 2. long (8byte) 타입 변수 정의 및 값 할당. ( int 타입의 값을 할당).
//		long longNumber = intNumber; // 아무런 문제 없이 할당( 묵시적 형변환: 작은 바이트에 큰 바이트로 자연스러운 이동)
//		
//		// 3. 각 변수들의 값을 출력
//		System.out.println(intNumber);
//		System.out.println(longNumber);
//		
		
//		// 의사 코드 -> 우리만의 논리를 주석으로 넣어놓고 코드 작성.
//		System.out.println("----------------------------------------------------");
//		// ======================================================================
		
//		// 반대 케이스 실습.
		
//		// 1. long (8byte) 타입의 변수 정의 및 값 할당(30억 이상의 값으로 할당)
//		long longNumber2 = 3_000_000_000L;
//	
//		// 2. int (4byte) 타입의 변수 저의 및 값 할당(int 타입의 값을 할당)
//		// int intNumber2 = longNumber2; // 에러 발생! int의 바이트가 부족해서 생기는 문제. 값을 인트값으로 바꾸어도 같은 오류 발생.
//		// 묵시적 형변환이 불가능하므로, 개발자가 직접 형변환을 해주어야 한다.
//		// --> long 타입의 값을 int 타입으로 명시해서 변환이 필요 ==> 명시적 형변환
//		int intNumber2 = (int)longNumber2; 
//		
//		// 3. 각 변수들의 값을 출력.
//		System.out.println(longNumber2);
//		System.out.println(intNumber2);
		
		
		// 실습: 정수 -> 부동소수점 (83슬라이드)		
 
		int num = 10;
//		long num = Long.MAX_VALUE; -> float, double 로 바꾼 애들은 다 지수 처리.
		float fnum= num;
		double dnum = num;
		
		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println("--------------------------------------------------------");

		
		// 실습: 부동소수점 -> 정수 (84슬라이드)
		
		float fnum2 = 10.9F;
		int num2 = (int)fnum2;
		System.out.println(fnum2);
		System.out.println(num2);
		
		System.out.println("--------------------------------------------------------");
		double dnum2 =11.15;
//		num2=(float)dnum2; // error! Type mismatch: cannot convert from float to int -> float으로 바꾸려면  num2를 int가 아닌 float으로 바꿔야한다.
		num2=(int)dnum2;
		System.out.println(dnum2);
		System.out.println(num2);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("소수점 처리");
		// 실습: 부동소수점 소수점 처리 (85슬라이드)
		double dnum3 = 10.1;
		dnum3 = Math.ceil(dnum3);
		System.out.println(dnum3)
		;
		dnum3 = 10.9;
		dnum3 = Math.floor(dnum3);
		System.out.println(dnum3);
		
		//반올림 -> 정확하게 처리하려면 따로 나누고 곱하는 연산이 있어야한다.
		dnum3 = 15.18;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3);
		
		dnum3 = 10.56;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("소수점 이동시키기");		
		// 실습: 부동소수점 소수점 올림처리 (86슬라이드) --> 29.4로 올림 처리하기.
		 dnum = 29.37;
		dnum2 = dnum*10;
		System.out.println(dnum2);
		
		dnum2= Math.round(dnum2); // 
		System.out.println(dnum2 );
		
		dnum3 = dnum2 / 10;
		System.out.println(dnum3);
		// 그냥 라운드 시키면 29.0이 됨.
		
		System.out.println("--------------------------------------------------------");
		
		// 실습: 문자열 -> 정수 변환 (88슬라이드)
			String numberString ="10";
			byte byteNumber = Byte.parseByte(numberString);
			System.out.println(byteNumber);
			
			numberString ="1000";
			short shortNumber = Short.parseShort(numberString);
			System.out.println(shortNumber);
			
			numberString ="1000000";
			int intNumber =  Integer.parseInt(numberString);
			System.out.println(intNumber);
			
			numberString ="100000000";
			long longNumber = Long.parseLong(numberString);
			System.out.println(longNumber);
			
		System.out.println("--------------------------------------------------------");
		
		// 실습: 문자열 -> 정수 오류 실습(89슬라이드)
//			numberString ="A";
//			byteNumber = Byte.parseByte(numberString);
//			System.out.println(byteNumber);
//		
//			numberString = "10.5"; // 숫자가 아닌 값이 있으면 (공백 포함) 모두 오류
//			byteNumber = Byte.parseByte(numberString);
//			System.out.println(byteNumber);
		
		System.out.println("--------------------------------------------------------");
		// 실습: 문자열 -> 부동소수점 변환 (90슬라이드)
			numberString ="10.5";
			float floatNumber = Float.parseFloat(numberString);
			System.out.println(floatNumber);
		
//			numberString ="11.533333333";
//			double doubleNumber = Double.parseDouble(numberString);
//			System.out.println(doubleNumber); --> 11.533334 
//			--> 이유는: 소수점을 맞추기 위해 탈락 시키고 이진법적으로 계산이 되어 올림이 되어 출력이 된다./ window
			
//			numberString ="11.1234567890123456789"; 소수점 이하 16자리 까지 지원.
//			double doubleNumber = Double.parseDouble(numberString);
//			System.out.println(doubleNumber);
		

			numberString ="11.577777777";
			double doubleNumber = Double.parseDouble(numberString);
			System.out.println(doubleNumber);
		
			numberString ="12";
			double doubleNumber2 = Double.parseDouble(numberString);
			System.out.println(doubleNumber2);
		
		System.out.println("--------------------------------------------------------");
		// 실습: 문자열 -> 불린 변환 (91슬라이드 ~ 92슬라이드)
		
			String str= "true";
			boolean bool = Boolean.parseBoolean(str);
			System.out.println(bool);
			str= "TRUE";
			bool = Boolean.parseBoolean(str);
			System.out.println(bool);
			
			str= "tRue";
			bool = Boolean.parseBoolean(str);
			System.out.println(bool);
			
			// 대문자 소문자 상관 없음.
			System.out.println("-----");
			
			str= "false"; // true가 아니면 무조건 false다.
			bool = Boolean.parseBoolean(str);
			System.out.println(bool);
			
			str= "";
			bool = Boolean.parseBoolean(str);
			System.out.println(bool);
			
			str= "anything";
			bool = Boolean.parseBoolean(str);
			System.out.println(bool); 
			// 3가지 모두 false가 나오는 이유는 기본값이 true or false이기 때문에 두 값이 아닌 다른 값을 넣으면 false로 출력이 된다.
			
			
			
			// 숫자를 문자로 변경하기
			// 1. String.valueOf() 사용
			int age = 30;
			String ageString = String.valueOf(age);
			System.out.println(age+1); // 31 
			
			// 2. ' 숫자 + "" ' => String으로 변환
			int count = 16;
			String countString = count+"";
			System.out.println(count+1); // 17
			System.out.println(countString+1); // "161"
			
			
	}
}
