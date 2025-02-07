package com.ktdsuniversity.edu.interfaceexam;

public class SamsungTV {

	public void welcom(RemoteControl signal) {
		
		signal.powerOn();
		System.out.println("SAMSUNG");
		if (signal instanceof DanawaTvSignal drc) {
			drc.openDanawaPage(); //인터페이스에 있는 메소드만 사용할 수 있음.
			
		}
	}
	
	public void goodbye(RemoteControl signal) {
		
		signal.powerOff();
	}
}
