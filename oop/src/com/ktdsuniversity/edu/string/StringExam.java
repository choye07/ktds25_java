package com.ktdsuniversity.edu.string;

import java.awt.geom.Path2D;

public class StringExam {

	public static void printFileName() {

//		String escape = "1. My nmae is \"Min chang jang\" ";
//		System.out.println(escape);
//
//		escape = "2.   My name is 'Min chang jang' ";
//		System.out.println(escape);
//
//		escape = "3.   My\n name\t is 'Min chang\n       \r\tjang' ";
//		System.out.println(escape);
		
		/**
		 * lastIndexOf, substring을 이용해 "eclipse.exe"만 출력.
		 * "eclipse.exe"에서 indexOf, substring을 이용해 "eclipse"만 출력
		 * "eclipse.copy.exe"에서 indexOf, lastIndexOf, substring을 이용해 "copy"만 출력.
		 */
		String path = "C:\\devpograms\\eclipse-workplace\\eclipse.exe";
		
		//1. lastIndexOf, substring을 이용해 "eclipse.exe"만 출력.
		int findIndex1 = path.lastIndexOf("\\");
		path =path.substring(findIndex1+1);
		System.out.println(path);
		
		//2."eclipse.exe"에서 indexOf, substring을 이용해 "eclipse"만 출력.
		int findIndex2 = path.indexOf("\\");
		int findIndex3 = path.indexOf(".");
		path =path.substring(findIndex2+1,findIndex3);
		System.out.println(path);
		
		
		//3."eclipse.copy.exe"에서 indexOf, lastIndexOf, substring을 이용해 "copy"만 출력.
		String path2 = "C:\\devpograms\\eclipse-workplace\\eclipse.copy.exe";
		int findIndex4 = path2.indexOf(".");
		int findIndex5 = path2.lastIndexOf(".");
		path2 =path2.substring(findIndex4+1,findIndex5);
		System.out.println(path2);
		
	}

	public static void isContains() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println(isSeoul);

		System.out.println("=====================");
	}

	public static void isEndWith() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.endsWith("176");
		System.out.println(isSeoul);

		System.out.println("=====================");
	}

	public static void isEquals() {
		String name = "ktdsuniversity";
		boolean isEquals = name.equals("ktdsuniversity");
		System.out.println(isEquals);

		System.out.println("=====================");
	}

	public static void isEqualsIgnore() {
		String name = "ktdsuniversity";
		boolean isEquals = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEquals);

		System.out.println("=====================");
	}

	public static void pastFormat() {
		String format = "%s에서 교육하는 %s과정";
		String str = String.format(format, "ktdsuniversity", "Java");
		System.out.println(str);

		System.out.println("=====================");
	}

	public static void java15Format() {
		String format = "%s에서 교육하는 %s과정";
		String str = format.formatted("ktdsuniversity", "Java");
		System.out.println(str);

		System.out.println("=====================");
	}

	public static void toUpper() {
		String name = "ktdsUniversity";
		String upperName = name.toUpperCase();
		System.out.println(upperName);

		System.out.println("=====================");
	}

	public static void toLower() {
		String name = "KtDsUniversity";
		String lowerName = name.toLowerCase();
		System.out.println(lowerName);
		
		System.out.println("=====================");
	}

	
	public static void findIndexLowerC() {
		String alphabets = "asbcdefg";
		int letterCIndex= alphabets.indexOf("c");
		System.out.println(letterCIndex);
		
		System.out.println("=====================");
	}
	
	public static void findIndexUpperC() {
		String alphabets = "asbcdefg";
		int letterCIndex= alphabets.indexOf("C");
		System.out.println(letterCIndex);
		
		System.out.println("=====================");
	}
	
	public static void findIndexDEF() {
		String alphabets = "asbcdefg";
		int letterDEFIndex= alphabets.indexOf("def");
		System.out.println(letterDEFIndex);
		
		System.out.println("=====================");
	}
	
	public static void isBlank() {
		String str ="  ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		
		System.out.println("=====================");
		
	}
	
	public static void isEmpty() {
		String str ="  ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("=====================");
		
	}
	
	public static void joinString() {
		String message = "안녕하세요";
		String name = "홍길동님";
		String helloMessage = String.join(", ",message, name);
		System.out.println(helloMessage);
		
		System.out.println("=====================");
	}
	
	public static void lastIndexA() {
		String message ="abcdefgaijkb";
		int letterALastIndex=message.lastIndexOf("a");
		System.out.println(letterALastIndex);
		
		System.out.println("=====================");
		
	}
	
	public static void lastIndexJJ() {
		String message ="abcdefgaijkb";
		int letterJJLastIndex=message.lastIndexOf("jj");
		System.out.println(letterJJLastIndex);
		
		
		System.out.println("=====================");
		}
	
	public static void messageLength () {
		String message ="abcdefgaijkb";
		int length =message.length();
		System.out.println(length);
		
		System.out.println("=====================");
	}
	
	public static void checkNumber() {
		String phone = "01012341234";
		boolean isNubmer = phone.matches("^[0-9]+$");
		System.out.println(isNubmer);
		
		System.out.println("=====================");
	}
	
	public static void changeMessage() {
		String message = "안녕하세요, 홍길동님, 안녕히가세요, 홍길동님";
		message = message.replace("홍길동","ktds");
		System.out.println(message);
		
		System.out.println("=====================");
	}
	
	public static void changSign() {
		String phone ="010-1234-1234";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println(phone);
		
		System.out.println("=====================");
	}

	public static void splitNumber() {
		String phone = "010-1234-1234";
		String [] phoneArea = phone.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
		
		System.out.println("=====================");
	}

	public static void startWith() {
		String phone = "+82-010-1234-1234";
		boolean isKoreaNum = phone.startsWith("+82");
		System.out.println(isKoreaNum);
		
		System.out.println("=====================");
	}
	public static void substringYear() {
			String datetime = "2023-05-02 14:56:13";
			String year = datetime.substring(0,4);
			System.out.println(year);
			
			System.out.println("=====================");
		}
	public static void substringHour() {
		String datetime = "2023-05-02 14:56:13";
		String hour = datetime.substring(11,13);
		System.out.println(hour);
		
		System.out.println("=====================");
	}
	public static void printTime() {
		String datetime = "2023-05-02 14:56:13";
		String time = datetime.substring(11);
		System.out.println(time);
		
		System.out.println("=====================");
	}
	public static void delBlank() {
		String datetime = "2023-05-02 14:56:13";
		System.out.println(datetime.length());
		System.out.println(datetime);
		datetime = datetime.trim();
		System.out.println(datetime.length());
		System.out.println(datetime);
		
		System.out.println("=====================");
	}
	public static void changeType() {
		String iStr = String.valueOf(1);
		System.out.println(iStr);
		
		System.out.println("=====================");
	}


	public static void main(String[] args) {

//		isContains();
//		isEndWith();
//		isEquals();
//		isEqualsIgnore();
//		
//		pastFormat();
//		java15Format();
//		
//		toUpper();
//		toLower();
//		
//		findIndexLowerC();
//		findIndexUpperC();
//		findIndexDEF();
//		
//		isBlank();
//		isEmpty();
//		
//		joinString();
//		
//		lastIndexA();
//		lastIndexJJ();
//		
//		messageLength();
//		checkNumber();
//		changeMessage();
//		changSign();
//		
//		startWith();
//		splitNumber();
//		startWith();
//		
//		substringYear();
//		substringHour();
//		
//		delBlank();
//		changeType();
//		printTime();
		printFileName();
	}
}
