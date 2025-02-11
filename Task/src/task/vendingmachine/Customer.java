package task.vendingmachine;
public class Customer {
	/**
	 * 지갑
	 */
    private int wallet;
    /**
     * 상품
     */
    private DrinkItem[] item;
    /**
     * 결제 카운트
     */
    private int payCount;
    
    /**
     * 소비자 생성자
     * @param wallet
     * @param maxProducts
     */
    public Customer(int wallet, int maxProducts) {
        this.wallet = wallet;
        this.item = new DrinkItem[maxProducts];
        this.payCount = 0;
    }
    
    /**
     * 지갑 getter
     * @return
     */
    public int getWallet() {
        return this.wallet;
    }
    /**
     * 결제 메소드
     * @param totalmoney
     */
    public void pay(int totalmoney) {
        if (totalmoney > this.wallet) {
            System.out.println("지갑에 있는 돈보다 많은 금액을 지불할 수 없습니다.");
            return;
        }
        this.wallet -= totalmoney;
    }

    /**
     * 상품 받기
     * @param product
     */
    public void receiveProduct(DrinkItem product) {
        for (int i = 0; i < this.payCount; i++) {
            if (item[i].getProductCode() == product.getProductCode()) {
                return; // 이미 구매한 상품이면 추가하지 않음
            }
        }
        if (this.payCount < this.item.length) {
        	this.item[this.payCount] = product;
            this.payCount++;  // 새로운 상품이 추가되면 purchaseCount 증가
        }
    }

    /**
     * 결제 후 남은 금액
     * @param amount
     */
    public void receiveChange(int amount) {
        this.wallet += amount;
    }

    /**
     * 구매 내역
     */
    public void printStatus() {
        System.out.println("현재 지갑 잔액: " + this.wallet + "원");
        System.out.println("구매한 상품 목록:");
        for (int i = 0; i < this.payCount; i++) {
            System.out.println(this.item[i]);
        }
    }
}
