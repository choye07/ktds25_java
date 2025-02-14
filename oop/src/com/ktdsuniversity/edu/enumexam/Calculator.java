package com.ktdsuniversity.edu.enumexam;

public class Calculator {
	
	public static int clac (OperType operator, int n1, int n2) {
		
		return switch (operator) {
		case OperType.ADD -> n1+n2;
		case OperType.SUB -> n1-n2;
		case OperType.MUL -> n1*n2;
		case OperType.DIV -> n1/n2;
		default ->  0;
		};
	
	}
	
	public static void main(String[]args) {
		
		// 값은 같지만 의미가 다르게 전달될 수 있다.
		// 만든 사람이 아니라 다른 사람이 보게 되면 의미가 다르게 받아들일 수 있다.
		String contcat = "+";
		String negative = "-";
		String exponets = "*";
		String slice = "/";
		
		String male = "+";
		String female ="-";
		
		//완전히  의미를 부여한 상속을 분리시키는 것 = enum
		
		int result = 0 ;
		result =clac(OperType.ADD,1,2);
		System.out.println(result);
		
		result =clac(OperType.SUB,1,2);
		System.out.println(result);
		
		result =clac(OperType.MUL,1,2);
		System.out.println(result);
		
		result =clac(OperType.DIV,1,2);
		System.out.println(result);
	}
	
}
