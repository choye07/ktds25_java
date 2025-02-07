package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Snake extends Animal {

	private String color;
	public Snake(String place, double temperature, String color) {
		super(place, 27.0);
	}

	@Override
	public void movement() {
		super.hungry += 5;
		if(super.hungry > 99) {
			super.hungry = 99;
		}

		super.temperature += 0.1;
		
		if (super.temperature < 27.0) {
			super.temperature = 27.0;
		}
		System.out.println(this.color + " 계열의 뱀 이"+  this.place +"에서 기어다닙니다.");
		System.out.println("뱀의 생존여부: " + super.isLive);
		System.out.println("뱀의 자아여부: " + super.haveEgo);
	}

	@Override
	public void breath() {

		
	}

	@Override
	public void eat() {

		
	}

}	
