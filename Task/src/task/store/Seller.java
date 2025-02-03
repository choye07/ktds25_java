package task.store;

public class Seller {
	
	/**
	 * 상품 이름
	 */
	private String product;
	
	/**
	 * 상품 재고
	 */
	private int stock;
	
	/**
	 * 상품 가격
	 */
	private int price;
	
	/**
	 * 금고
	 */
	private int moneyBox;
	
	/**
	 * Seller 생성자
	 * @param product 상품
	 * @param stock 재고
	 * @param price 가격
	 * @param moneyBox pos기 같은거
	 */
	public Seller(String product, int stock, int price, int moneyBox) {
		this.product = product;
		this.stock = stock;
		this.price = price;
		this.moneyBox = moneyBox;
		
	}

	public String getProduct() {
		return this.product;
	}

	public int getStock() {
		return this.stock;
	}
	
	/**
	 * 판매자의 상품 수, 상품 가격, 금고 현황
	 */
	public void printList() {
	
			System.out.println("=============================");
			System.out.println("상품: "+this.product+" 갯수: "+this.stock+" 가격: "+this.price);
			System.out.println("금고: "+this.moneyBox);
		
	}
	/**
	 * 판매자가 상품을 판매하고 moneyBox를 증가
	 * @param quantity
	 * @return totalPrice 총 moneyBox에 들어갈 총 금액
	 */
	public int sellProduct( int wallet, int quantity) {
		int totalPrice =0;
		
	    if (this.stock >= quantity) {
	    	totalPrice = quantity * this.price;
	    	if(totalPrice > wallet) {
	    		totalPrice=0;
	    		return totalPrice;
	    	}
	    	this.moneyBox += totalPrice;
	    	this.stock -= quantity;
	        return totalPrice; // 구매자에게 총 금액 반환
	    } else 
	        totalPrice = this.stock * this.price;
	    	if(totalPrice > wallet) {
	    		totalPrice=0;
	    		return totalPrice;
	    	}
	        this.moneyBox += totalPrice;
	        this.stock = 0;
	        return totalPrice; // 남은 수량만큼의 가격 반환
	    }
	}
		

