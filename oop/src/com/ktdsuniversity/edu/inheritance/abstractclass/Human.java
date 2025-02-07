package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Human extends Animal {

	private String name;
	private int age;

	public Human(String place, String name, int age) {
		super(place, 36.5);
		this.name = name;
		this.age = age;
	}

	@Override
	public void movement() {
		
		super.hungry += 10;
		if(super.hungry > 99) {
			super.hungry = 99;
		}

		super.temperature += 0.1;
		
		if (super.temperature > 37.5) {
			super.temperature = 36;
		}
		System.out.println("사람 " + this.name + "이(가) 두 발로 " + this.place +"에서 걸어다닙니다.");
		System.out.println("사람" + this.name + " 생존여부: " + super.isLive);
		System.out.println("사람 " + this.name + " 자아여부: " + super.haveEgo);
	}

	@Override
	public void breath() {
		super.hungry +=5;
		if(super.hungry > 99) {
			super.hungry = 99;
		}
		if(super.temperature >37) {
			System.out.println("사람 " + this.name + "이(가) 거칠게 호흡 합니다.");
		}else {
			System.out.println("사람 "+ this.name + "이(가) 정상적으로 호흡 합니다.");
		}
		
		System.out.println("현재 체온은 "+super.temperature+"도 입니다.");
		
		super.temperature -= 0.1;
		if (super.temperature < 36.5) {
			super.temperature = 36.5;
		}
	}

	@Override
	public void eat() {
		if(super.hungry > 90 ) {
			System.out.println("사람 "+ this.name + " 이(가) 매우 배가 고픕니다. 고기를 허겁지겁 먹습니다.");
		} else if(super.hungry > 70) {
			System.out.println("사람 "+ this.name + " 이(가) 배고픔을 느낍니다. 김치찌개를 먹습니다.");
		} else if(super.hungry > 50) {
			System.out.println("사람 "+ this.name +" 이(가) 출출함을 느낍니다. 샌드위치를 먹습니다.");
		}else {
			System.out.println("사람 "+ this.name +" 이(가) 입이 심심함을 느낍니다. 젤리를  먹습니다.");
		}
		
		System.out.println("개: " + this.name + " 배고픔 정도: "+ super.hungry);
		
		super.hungry -=10;
		if (super.hungry < 0) {
			super.hungry = 0;
		}
	}

}
