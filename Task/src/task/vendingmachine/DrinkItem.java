package task.vendingmachine;

/**
 * 상품 클래스
 */
public class DrinkItem {

	/**
	 * 상품 번호
	 */
	private int productCode;
	/**
	 * 상품의 이름
	 */
	private String name;
	/**
	 * 상품의 단가
	 */
	private int price;
	/**
	 * 상품 재고 수량
	 */
	private int stock;

	/**
	 * 남은 소비기한
	 */
	private int useByDate;

	public int getProductCode() {
		return productCode;
	}


	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}


	public int getStock() {
		return stock;
	}


	public int getUseByDate() {
		return useByDate;
	}


/**
 * 자판기의 상품을 생성한다.
 * @param price 가격
 * @param name 상품 이름
 * @param stock 재고
 * @param useByDate 남은 소비기한
 */
	public DrinkItem(int productCode, int price, String name, int stock, int useByDate) {
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.useByDate =useByDate;
	}
	
	/**
	 * 배열에 들어온 객체 출력해주기 위한 메소드
	 */
    @Override
    public String toString() {
        return "상품번호: " + this.productCode + ", 이름: " + this.name + ", 가격: " + this.price+", 재고: "+ this.stock +", 남은 소비기한: "+ this.stock +"일";
    }
}
