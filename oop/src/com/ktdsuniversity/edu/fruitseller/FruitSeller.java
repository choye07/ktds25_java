package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {
	/**
	 * 과일 단가
	 */
	private final int FRUIT_PRICE = 500;

	/**
	 * 과일 판매자의 소지금(영업 준비금)
	 */
	private int money;

	/**
	 * 과일 판매자의 재고
	 */
	private int fruitStock;

	public FruitSeller() {
	
	}

	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}

	// getter/setter는 생성자 아래

	public int getFRUIT_PRICE() {
		return FRUIT_PRICE;
	}

	public int getMoney() {
		return this.money;
	}

	public int getFruitStock() {
		return this.fruitStock;
	}

	/**
	 * 과일을 판매한다. 과일을 판매하면 판매개수만큼 재고가 줄어야 하며, 판매 개수만큼 소지금이 증가해야 한다.
	 * 
	 * @param quantity 판매 개수
	 */
	public void sell(int quantity) {
		if (this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += quantity * this.FRUIT_PRICE;
		}
	}

	// 때때로 파라미터 타입이 다르거나, 파라미터 개수가 다르고 이름이 같은 메소드를 사용한다.
	// Java에서는 String.vlaueOf() 함수가 그렇다.
	public void sell() {
		this.sell(1);
		// if (this.fruitStock >= 1) {
//			this.fruitStock -= 1;
//			this.money += 1 * this.FRUIT_PRICE;
//		}
	}

}
