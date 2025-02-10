package com.ktdsuniversity.edu.interfaceexam;


public interface RemoteControl {
	//private String manufactor=" ";
	String manufactor=" ";
	// interface에서 정의하는 모든 메소들은 추상 메소드이다.
	// abstract를 생략하더라도 추상 메소드가 된다.
	
	//추상 메소드
	public void powerOn();
	
	public void powerOff();
	
	public default void process() {
		this.powerOn();
		this.powerOff();
	}

}
