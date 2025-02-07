package com.ktdsuniversity.edu.inheritance.abstractclass;

/**
 * Animal 추상 클래스를 상속 받아서 movement, breath, eat 추상 메소드를 구현시키는 "구현 클래스"로 작성
 * 
 * 상속 받은(확장한) 클래스가 추상 클래스라면 "구현 클래스"는 아래 두 케이스 중 하나를 선택해서 작성. - "구현 클래스"를 "추상
 * 클래스"로 만든다. - "구현 클래스"에서 "추상 메소드"를 만든다.
 * 
 * 
 */
public class Dog extends Animal {

	private String name;

	public Dog(String name, String place) {
		super(place, 37.5);
		this.name = name;
	}

	@Override
	public void movement() {	
		System.out.println("개 : " + this.name + " 배고픔 정도: "+ super.hungry);
		super.hungry +=10;
		
		if(super.hungry > 99) {
			super.hungry = 99;
		}
		
		super.temperature += 0.3;
		
		if (super.temperature > 42) {
			super.temperature = 42;
		}
		// "개 this.name이 이 네 발과 꼬리를 이용해 super.place에서 움직입니다."
		System.out.println("개 " + this.name + " 이 네 발과 꼬리를 이용해 " + super.place + "에서 움직입니다.");
		System.out.println("개 " + this.name + " 생존여부: " + super.isLive);
		System.out.println("개 " + this.name + " 자아여부: " + super.haveEgo);
	}

	@Override
	public void breath() {
		super.hungry +=5;
		if(super.hungry > 99) {
			super.hungry = 99;
		}
		if (super.temperature >= 40 ) {
			System.out.println("개 "+this.name+" 이 거칠게 개구호흡을 합니다.");
		} else {
			System.out.println("개 "+this.name+" 코로 호흡을 합니다.");
		}
		
		System.out.println("현재 체온은 "+super.temperature+"도 입니다.");
		
		//this.으로 해도되는데 상속 받아온 것을 나타내기 위해 super.으로 표시한다.
		super.temperature -= 0.1;
		if (super.temperature < 37.5) {
			super.temperature = 37.5;
		}
	}

	@Override
	public void eat() {
		
		if(super.hungry > 90 ) {
			System.out.println("개 "+ this.name + "이 매우 배가 고픕니다. 사료를 허겁지겁 먹습니다.");
		} else if(super.hungry > 70) {
			System.out.println("개 "+ this.name + "이 배고픔을 느낍니다. 사료를 먹습니다.");
		} else if(super.hungry > 50) {
			System.out.println("개 "+ this.name + "이 출출함을 느낍니다. 사료를 먹습니다.");
		}else {
			System.out.println("개 "+ this.name + "이 입이 심심함을 느낍니다. 개껌을  먹습니다.");
		}
		
		System.out.println("개: " + this.name + " 배고픔 정도: "+ super.hungry);
		
		super.hungry -=10;
		if (super.hungry < 0) {
			super.hungry = 0;
		}
		

	}
}
