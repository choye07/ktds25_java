package task.vendingmachine;

import task.vendingmachine.exceptions.ExpiredProductException;
import task.vendingmachine.exceptions.NeedMoreMoneyException;
import task.vendingmachine.exceptions.SoldOutException;

/**
 * 자판기 자판기가 상품을 판매한다. 자판기 has a 상품(VandingMachine has a DrinkItem)
 */
public class VendingMachine {
	/**
	 * 아이템 배열
	 */
	private DrinkItem[] drinkItem;
	/**
	 * 금고
	 */
	private int moneyBox;
	/**
	 * 소비자가 넣은 금액
	 */
	private int insertedMoney;
	
	/**
	 * 생성자
	 * @param drinkItem
	 */
	public VendingMachine(DrinkItem[] drinkItem) {
		this.drinkItem = drinkItem;
		this.moneyBox = 0;
		this.insertedMoney = 0;
	}

	/**
	 * 판매
	 * @param productCode
	 * @param money
	 * @param customer
	 * @throws Exception
	 */
	public void purchase(int productCode, int money, Customer customer) throws Exception {
		insertedMoney = money;
		customer.pay(money); // 고객이 돈을 지불

		DrinkItem selectedItem = null;
		for (DrinkItem drinkItem : this.drinkItem) {
			if (drinkItem.getProductCode() == productCode) {
				selectedItem = drinkItem;
				break;
			}
		}
		
		if (selectedItem == null) {
			refund(customer);
			throw new Exception("존재하지 않는 상품입니다.");
		}

		if (selectedItem.getUseByDate() <= 0) {
			refund(customer);
			throw new ExpiredProductException("죄송합니다. 소비기한이 지난 상품입니다.");
		}

		if (selectedItem.getStock() <= 0) {
			refund(customer);
			throw new SoldOutException("죄송합니다. 해당 상품이 품절되었습니다.");
		}

		if (selectedItem.getPrice() > this.insertedMoney) {
			refund(customer);
			throw new NeedMoreMoneyException("금액이 부족합니다. 더 많은 돈을 넣어주세요.");
		}

		// 거래 완료
		moneyBox += selectedItem.getPrice();
		selectedItem.getStock();
		customer.receiveProduct(selectedItem);

		int change = this.insertedMoney - selectedItem.getPrice();
		if (change > 0) {
			customer.receiveChange(change);
		}
		this.insertedMoney = 0;
	}

	/**
	 * 환불 메소드
	 * @param customer
	 */
	private void refund(Customer customer) {
		customer.receiveChange(this.insertedMoney);
		this.insertedMoney = 0;
	}

	/**
	 * 판매자 재고 내역
	 */
	public void printStock() {
		System.out.println("자판기 재고 현황:");
		for (DrinkItem drinkItem : this.drinkItem) {
			System.out.println(drinkItem);
		}
		System.out.println("자판기 돈통 잔액: " + this.moneyBox + "원");
	}

}
