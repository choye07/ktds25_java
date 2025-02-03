package task.store;

import java.util.Scanner;

public class Consumer {
	
	/**
	 * 장바구니
	 */
	private int shoppingBasket;
	
	/**
	 * 구매자 지갑
	 */
	private int wallet;
	
	
	public Consumer(int shoppingBasket, int wallet) {
		this.shoppingBasket = shoppingBasket;
		this.wallet = wallet;
	}

	
	public void printBasket() {
		System.out.println("장바구니");
		System.out.println("========================");
		System.out.println("상품 갯수: "
		+this.shoppingBasket);
		System.out.println("지갑: "+this.wallet);
	}
	
	public void buyProduct(	Seller seller, int stock) {
			int sellStock =seller.getStock();
			
			int totalPrice = seller.sellProduct(this.wallet,stock); // 판매자에게 구매 요청
		    if (totalPrice > 0 && this.wallet >= totalPrice) { // 구매자가 돈이 충분할 때만 구매 진행
		        this.wallet -= totalPrice; // 구매자의 지갑에서 돈 차감
		        if(sellStock<stock) {
		        	this.shoppingBasket+=sellStock;
		        }else {
		        	this.shoppingBasket += stock; // 장바구니에 추가
		        	System.out.println("구매 완료");
		        }
		    }else {
		    	System.out.println("잔액 부족! 구매할 수 없습니다.");
		    }
	}
	
	public static void main(String[]args) {
		Seller seller1 = new Seller("책상",100,28_000,0);
		Seller seller2 = new Seller("아이패드케이스",10,32_000,0);
		Seller seller3 = new Seller("에어팟케이스",3,18_900,0);
		Scanner in = new Scanner(System.in);

		Consumer con1 = new Consumer(0,0);

		String product ="";
		
		
		System.out.println("=======<판매자 목록>=======");
		seller1.printList();
		seller2.printList();
		seller3.printList();
		System.out.println("구매하실 상품을 고르세요: ");
		
		product = in.next();
		int quantity = in.nextInt();
		
		if(product.equals(seller1.getProduct())) {
			con1.buyProduct(seller1, quantity);
		}else if(product.equals(seller2.getProduct())) {
			con1.buyProduct(seller2, quantity);
		}else if(product.equals(seller3.getProduct())) {
			con1.buyProduct(seller3, quantity);
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		seller1.printList();
		seller2.printList();
		seller3.printList();
		
		con1.printBasket();
		
	}
}
