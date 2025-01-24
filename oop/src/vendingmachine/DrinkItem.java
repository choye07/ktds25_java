package vendingmachine;

public class DrinkItem {
	
	
	 /**
	  * 상품의 이름
	  */
	String name;
	/**
	 * 상품의 단가
	 */
	int price;
	/**
	 * 상품 재고 수량
	 */
	int stock;
	
	/**
	 * 자판기의 상품을 생성한다.
	 * @param name 판매할 상품의 이름
	 * @param price 판매할 상품의 단가
	 * @param stock 판매할 상품 입고 수량
	 */
	public DrinkItem(String name, int price, int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
