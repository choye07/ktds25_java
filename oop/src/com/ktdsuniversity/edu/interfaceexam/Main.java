package com.ktdsuniversity.edu.interfaceexam;

public class Main {
	public static void main(String[]args) {
		
		/**
		 * RemoteControl(interface)
		 * -> (extends) DanawaTvSignal(interface)
		 * 
		 * StandardTvRemoteControl (class)
		 * -> (implements) Remote Control (interface)
		 * 
		 * DanawaRemoteControl (class)
		 * -> (implements) DanawaTvSignal(interface)
		 *  -> (extends) RemoteControl (interface)
		 *  
		 *  DanawaTvSignal (interface) is RemoteControl(interface)
		 *  StandardTvRemoteControl (class) is a RemoteControl(interface)
		 *  DanawaRemoteControl (class) is a DanawaTvSignal(interface)
		 *  DanawaRemoteControl (class) is a RemoteControl(interface) because DanawaTvSignal is RemoteControl(interface) 
		 */
		
		
		// 아무런 관계가 없어서 오류가 뜸.
		LgTvRemoteControl lgRemoteControl  = new LgTvRemoteControl();
		
		//StandardTvRemoteControl은 RemoteControl 타입.
		RemoteControl godRemoteControl = new StandardTvRemoteControl();
		RemoteControl danawaRemoteControl = new DanawqRemoteControl();
		
		SamsungTV ahdTV = new SamsungTV();
		ahdTV.welcom(danawaRemoteControl);
		ahdTV.goodbye(danawaRemoteControl);
		
		LgTV oledTV = new LgTV();
		oledTV.on(godRemoteControl);
		oledTV.off(godRemoteControl);
		
		
		
		
		
	}
}
