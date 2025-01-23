package vendingmachine;

public class DrinkItem {
	String name;
	
	int price;
	
	int stock;
	
	public DrinkItem(String name, int price, int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
