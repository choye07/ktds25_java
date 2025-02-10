package com.ktdsuniversity.edu.errorhandle;

import java.util.Scanner;

public class UnsafeCode {

	public static void throwNullPointerException() {
		String age = "40";
		boolean isSameAge = age.equals("40");
		System.out.println(isSameAge);
	
		
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "name" is null
//		at com.ktdsuniversity.edu.errorhandle.UnsafeCode.throwNullPointerException(UnsafeCode.java:11)
//		at com.ktdsuniversity.edu.errorhandle.UnsafeCode.main(UnsafeCode.java:24)

		String name = null;
		//Null pointer access: The variable name can only be null at this location
		boolean isSameName = name.equals("admin");
		System.out.println(isSameName);
	}

	public static void throwArrayIndexOutOfBoundsException() {
		
		int[] numbers = {10, 20, 30};
		int n = numbers[0];
		System.out.println(n);
		
		n=numbers[1];
		System.out.println(n);
		
		n=numbers[2];
		System.out.println(n);
		
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		 * at com.ktdsuniversity.edu.errorhandle.UnsafeCode.throwArrayIndexOutOfBoundsException(UnsafeCode.java:38)
		 * at com.ktdsuniversity.edu.errorhandle.UnsafeCode.main(UnsafeCode.java:49)
		 */
		n=numbers[3]; //ArryIndexOutOfBoundsException 발생
		System.out.println(n);
		
		n = numbers[0];
		System.out.println(n);
		
	}

	public static void throwNumberFormatException() {
		String str = "5000";
		int number = Integer.parseInt(str);
		System.out.println(number);
		
		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "오천"
			 * at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			 * at java.base/java.lang.Integer.parseInt(Integer.java:588)
			 * at java.base/java.lang.Integer.parseInt(Integer.java:685)
			 * at com.ktdsuniversity.edu.errorhandle.UnsafeCode.throwNumberFormatException(UnsafeCode.java:57)
			 * at com.ktdsuniversity.edu.errorhandle.UnsafeCode.main(UnsafeCode.java:64)
		 */
		str="오천";
		number = Integer.parseInt(str); //app kill 
		System.out.println(number);
	}
	
	public static void throwInputMismatchException() {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * 안전하지 않은 이유
		 * 1. int 약 21억까지 쓸 수 있음. 범위를 벗어난 숫자를 입력하면 에러를 발생시킨다. 
		 * -> Exception in thread "main" java.util.InputMismatchException: For input string: "21000000000000"
				at java.base/java.util.Scanner.nextInt(Scanner.java:2290)
				at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
				at com.ktdsuniversity.edu.errorhandle.UnsafeCode.throwInputMismatchException(UnsafeCode.java:79)
				at com.ktdsuniversity.edu.errorhandle.UnsafeCode.main(UnsafeCode.java:87)
		 */
		System.out.println("숫자를 입력하세요.");
		
		int number = keyboard.nextInt();
		System.out.println("입력한 숫자는 "+ number +" 입니다.");
	}
	
	public static void main(String[]args) {
//		throwNullPointerException();
//		throwArrayIndexOutOfBoundsException();
//		throwNumberFormatException();
		throwInputMismatchException();
	}

}
