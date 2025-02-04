package com.ktdsuniversity.edu.frutseller;

public class Mart {
	public static void main(String[]args) {
		FruitSeller coupang = new FruitSeller(100,1000);
		
		coupang.sell(10); // money, fruitStock이 변경
		coupang.sell(5); // money, fruitStock이 변경
		coupang.sell(7); // money, fruitStock이 변경
		coupang.sell(20); // money, fruitStock이 변경
		coupang.sell(1); // money, fruitStock이 변경
		coupang.sell(30); // money, fruitStock이 변경
		
		coupang.sell();
		coupang.sell();
		coupang.sell();
		coupang.sell();
		
		System.out.println(coupang.getMoney());
		System.out.println(coupang.getFruitStock());
		
	}
}
