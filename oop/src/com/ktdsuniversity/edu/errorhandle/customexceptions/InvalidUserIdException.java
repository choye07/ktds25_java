package com.ktdsuniversity.edu.errorhandle.customexceptions;

public class InvalidUserIdException extends RuntimeException{
	
	public InvalidUserIdException (String message) {
		super(message); // -> throwasble 클래스의 멤버변수의 값으로 정의 됨.
	}
	
}
