package com.ktdsuniversity.edu.inheritance.abstractclass;

public class RealWorld {

	public static void behavior(Animal animal) {
		for(int i=0; i<50; i++) {
			animal.movement();
			animal.movement();
			animal.movement();
			animal.breath();
			animal.eat();
			
		}
		
	}
	
	public static void main(String[]args) {
		
//		Animal dog = new Animal("hour");
//		Animal dog = new Dog("뿌꾸","두치 집");
//		behavior(dog);

		Animal human = new Human("집","최예진",27);
		behavior(human);
		
		
		
	}
}
