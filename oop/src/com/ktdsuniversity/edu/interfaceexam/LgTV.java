package com.ktdsuniversity.edu.interfaceexam;

public class LgTV {

	public void on(RemoteControl signal) {
		signal.powerOn();
		System.out.println("Life is Good");
		if (signal instanceof DanawaTvSignal drc) {
			drc.openDanawaPage(); //인터페이스에 있는 메소드만 사용할 수 있음.
			
		}
	}
	
	public void off(RemoteControl signal) {
		signal.powerOff();
	}
}
