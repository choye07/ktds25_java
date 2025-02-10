package com.ktdsuniversity.edu.interfaceexam;

public class DanawaRemoteControl implements DanawaTvSignal,RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("켜져라!!");
	}

	@Override
	public void powerOff() {
		System.out.println("꺼져라!!");
	}
	
	/**
	 * 비표준 기능
	 * 티비를 켜면 다나와 홈페이지를 티비에 띄운다.
	 */
	public void openDanawaPage() {
		System.out.println("브라우저를 실행해서 다나와 사이트에 접속한다.");
	}

}
