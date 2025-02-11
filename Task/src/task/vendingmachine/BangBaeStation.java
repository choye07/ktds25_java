package task.vendingmachine;


/**
 * Main
 */
public class BangBaeStation {
	public static void main(String[]args) {
		
		        DrinkItem[] item = {
		        		 new DrinkItem(1, 1500, "콜라", 5, 10),
		                 new DrinkItem(2, 1400, "사이다", 2, 5),
		                 new DrinkItem(3, 1200, "커피", 0, 7),
		                 new DrinkItem(4, 3500, "샌드위치", 3, 0)  // 소비기한 지난 상품
		        };

		        VendingMachine vendingMachine = new VendingMachine(item);
		        Customer customer = new Customer(5000, 10);

		        vendingMachine.printStock();
		        customer.printStatus();;

		        try {
		            vendingMachine.purchase(1, 2000, customer);  // 콜라 구매 시도
		        } catch (Exception e) {
		            System.out.println("결제 실패: " + e.getMessage());
		        }
		        
		        try {
		            vendingMachine.purchase(3, 2000, customer);  // 품절된 커피 구매 시도
		        } catch (Exception e) {
		            System.out.println("결제 실패:" + e.getMessage());
		        }
		        
		        try {
		            vendingMachine.purchase(4, 2000, customer);  // 소비기한 지난 샌드위치 구매 시도
		        } catch (Exception e) {
		            System.out.println("결제 실패:" + e.getMessage());
		        }
		        
		        vendingMachine.printStock();
		        customer.printStatus();;
		    }
	
}
