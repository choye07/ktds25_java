package com.ktdsuniversity.edu.inheritance.abstractclass;

/**
 * 추상 클래스의 제약사항 - 어떻게 행동해야 할지 모르는 것을 표현하는 
 * 추상 메소드가 존재하는 추상 클래스는 인스턴스로 만들 수 없다. 
 * -> * 추상 클래스를 상속 받아서 모든 추상 메소드가 구현 되어있는 클래스만 인스턴스로 만들 수 있다. 
 * - 인스턴스로 만들 수 있는 것은 모든 것이 구현되어 있는 클래스 밖에 없다.
 */
public abstract class Animal {

	protected double temperature;
	protected double hungry;
	protected boolean isLive;
	protected String place;
	protected boolean haveEgo;

	public Animal(String place, double temperature) {
		this.isLive = true;
		this.haveEgo = true;
		this.place = place;
		this.temperature = temperature;
		this.hungry = (int) (Math.random() * 100);
	}
	
	
	//추상 클래스는 이러한 흐름들을 만들 수 있다.(프로세스 가능)
	public void live() {
		this.movement();
		this.breath();
		this.eat();
	}
	// 추상 메소드
	public abstract void movement();

	public abstract void breath();

	public abstract void eat();

}
