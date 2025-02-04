package com.ktdsuniversity.edu.staticexam;

public class AnimalMain {

	int numberOne = 10;
	int numberTwo = 20;
	
	
	// static 메소드안에서 인스턴스 변수를 사용하려면
	// 클래스의 인스턴스를 만들어서 접근할 수 있다.
	// 혹은 인스턴스 변수 앞에 static을 붙인다. 다만, 값이 어떻게 변할지 모르기 때문에 모든 변수들을
	// static으로 바꾸는 건 안됨.
	public static void carculator() {
		AnimalMain anim = new AnimalMain();
		System.out.println(anim.numberOne+anim.numberTwo);
	}

	public static void main(String[] args) {
		
		int number = NumberUtils.canvertToInt("123456");
		System.out.println(number);
		
		boolean isDecimal =NumberUtils.isDecimalFormat("123789");
		System.out.println(isDecimal);
		
		isDecimal = NumberUtils.isDecimalFormat("1234ss56");
		System.out.println(isDecimal );

		Animal cat = new Animal("춘봉", "2015-01-01", 10);
		cat.printMyInformation(); // 인스턴스 메소드

		Animal cat2 = Animal.createNewAnimal("첨지", "2016-01-01", 9); // 클래스 메소드 호출
		cat2.printMyInformation(); // 인스턴스 메소드 호출

	}
}
