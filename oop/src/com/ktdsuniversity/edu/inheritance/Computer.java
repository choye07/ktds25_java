package com.ktdsuniversity.edu.inheritance;

public class Computer {
	
	public static void calculateAndDraw(Cpu cpu) {
		
 		System.out.println("=============Computer.calculateAndDraw==========");
   		cpu.calculate();
		if(cpu instanceof Apu apu) {
			apu.draw();
		}
	}
	
	public static void main(String[]args) {
		Cpu intelchip = new Cpu("in tel","i9");
//		intelchip.calculate();
		calculateAndDraw(intelchip);
		//Cpu
		//Apu is a Cpu
		//Cpu isnt a Apu
		//Cpu is a Apu => (Apu) cpu
		Cpu amdChip = new Apu("AMD","Rizen7");
//		amdChip.calculate();
		calculateAndDraw(amdChip);
//		
//		
////		Apu tempChip = (Apu) amdChip;
////		tempChip.draw();
		if(amdChip instanceof Apu tempAmpChip) {			
			tempAmpChip.draw();
		}
//
//		String tempString = "asdfas";
//		
		//is a 관계를 확인하는 코드
		System.out.println("amdChip is a Apu: "+( amdChip instanceof Apu));
		System.out.println( "tempString is a Apu: "+ ((Object)tempString instanceof Apu));
		
		
		// String is a Object
		//Apu is a Object
		//String is a Apu => 부모가 같기 때문에
		
		//is a
		//Sub cass is a Super class
		// => Super class is a Sub class(Type casting)
		
		/**
		 * 정수 -> 정수
		 * int -> long (int is a long => 묵시적 형변환.)
		 * long -> int 는 못했다. (int)longvalue : overflow 현상이 일어나지만 캐스팅해서 사용 가능했음.
		 * 
		 * type casting -> is a 관계가 성립할 때만 사용 가능.
		 * String -> int (x)
		 * int -> String (x)
		 */
		
		
//		System.out.println(intelchip);
	}
}
