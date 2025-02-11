package task.vendingmachine.exceptions;



/**
 * 자판기
 * 자판기가 상품을 판매한다.
 * 자판기 has a 상품(VandingMachine has a DrinkItem)
 */
public class VendingMachine {
	
	/**
	 * 자판기가 판매할 상품 1
	 * 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	DrinkItem type1;
	
	/**
	 * 자판기가 판매할 상품 2
	 * 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	DrinkItem type2;
	
	/**
	 * 자판기가 판매할 상품 3
	 * 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	DrinkItem type3;
	
	
	/**
	 * 자판기가 판매할 상품 4
	 * 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	DrinkItem type4;
	
	
	/**
	 * 자판기 인스턴스를 만들어줄 생성자
	 * @param type1 자판기가 판매할 구체적인 상품 정보를 가지고 있는 DrinkItem 타입의 인스턴스.
	 * @param type2 자판기가 판매할 구체적인 상품 정보를 가지고 있는 DrinkItem 타입의 인스턴스.
	 * @param type3 자판기가 판매할 구체적인 상품 정보를 가지고 있는 DrinkItem 타입의 인스턴스.
	 * @param type4 자판기가 판매할 구체적인 상품 정보를 가지고 있는 DrinkItem 타입의 인스턴스.
	 */
	public VendingMachine (DrinkItem type1,DrinkItem type2,DrinkItem type3,DrinkItem type4) {
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		this.type4 = type4;
	}
	
	/**
	 * 자판기 상품 버튼을 눌러 구매한다.
	 * @param itemName 자판기에서 구매할 상품 이름.
	 * @param orderCount 버튼을 누른 횟수.
	 * @return 구매한 상품의 정보(DrinkItem type) - DrinkItem(구매한 상품의 이름, 구매한 상품의 단가, 구매한 상품의 수량)
	 */
	public DrinkItem pressItemButton(String itemName, int orderCount) {
		//주문한 음료수가 있는지
		/// 구매가자가 구매하려는 상품의 이름과 type1의 이름이 같은지 비교한다.
		///같다면 type1은 구매자가 구매하려는 상품이다.
		if(itemName==this.type1.name) {
			//type1의 재고수량이 버튼을 누른 횟수보다 크거나 같은지 비교한다.
			//크거나 같다면 구매하려는 수량이 충분하다. => 구매 가능하다.
			//주문한 음료수의 수량이 주문 수량보다 크거나 같은지.
			if(this.type1.stock >= orderCount) {
				//버튼을 누른 횟수 만큼 type1읜 재고 수량을 감소시킨다.
				//주문한 수 만큼 수량에서 빼기
				this.type1.stock -=orderCount;
				//주문 내용 인스턴스 생성.
				System.out.println("상품을 구매하였습니다.");
				
				//구매자가 구매한 이름과 단가, 버튼을 누른 횟수를 저장해 놓은 상품 인스턴스를 반환 시킨다.
				return new DrinkItem(this.type1.name,(orderCount*this.type1.price),orderCount);
			}else {
				System.out.println("상품이 품절되었습니다.");// 수량체크해서 없으면 구분해야한다! 내 코드느 그게 없었다!
				//null의 의미
				// 메모리에 어떠한 정보도 등록되어 있지 않은 상태 == 메모리에 정보가 쓰여져 있지 않다. == 메모리 주소도 없다.
				return null; //아무것도 반환시키지 마라!
			}
		}else if(itemName==this.type2.name) {
			if(this.type2.stock >= orderCount) {
				this.type2.stock -=orderCount;
				return new DrinkItem(this.type2.name,(orderCount*this.type2.price),orderCount);
			}else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}else if(itemName==this.type3.name) {
			if(this.type3.stock >= orderCount) {
				this.type3.stock -=orderCount;
				return new DrinkItem(this.type3.name,(orderCount*this.type3.price),orderCount);
			}
		}else if(itemName==this.type4.name) {
			if(this.type4.stock >= orderCount) {
				this.type4.stock -=orderCount;
				return new DrinkItem(this.type4.name,(orderCount*this.type4.price),orderCount);
			}else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		System.out.println("존재하지 않는 상품입니다.");
		return null;
		/** scanner로 입력 받은 string은 equals를 사용해야해서
		if(itemName.equals(this.type1.name)) {
			//주문한 음료수의 수량이 주문 수량보다 크거나 같은지.
			if(this.type1.stock >= orderCount) {
				//주문한 수 만큼 수량에서 빼기
				this.type1.stock -=orderCount;
				//주문 내용 인스턴스 생성.
				System.out.println("상품을 구매하였습니다.");
				return new DrinkItem(this.type1.name,(orderCount*this.type1.price),orderCount);
			}
		}else if(itemName.equals(this.type2.name)) {
			if(this.type2.stock >= orderCount) {
				this.type2.stock -=orderCount;
				return new DrinkItem(this.type2.name,(orderCount*this.type2.price),orderCount);
			}
		}else if(itemName.equals(this.type3.name)) {
			if(this.type3.stock >= orderCount) {
				this.type3.stock -=orderCount;
				return new DrinkItem(this.type3.name,(orderCount*this.type3.price),orderCount);
			}
		}else if(itemName.equals(this.type4.name)) {
			if(this.type4.stock >= orderCount) {
				this.type4.stock -=orderCount;
				return new DrinkItem(this.type4.name,(orderCount*this.type4.price),orderCount);
			}
		}
		System.out.println("상품이 없습니다.");
		return null;
		**/
	}
	
	/**
	 * 자판기에 재고를 입고시킨다.
	 * 단, 판매중인 상품에 대해서만 입고 처리 된다.
	 * 
	 * @param itemName 자판기에 입고시키려는 상품의 이름
	 * @param addCount 자판기에 입고시키려는 상품의 수량
	 */
	public void addItem(String itemName, int addCount) {
		// 입고 시키려는 상품의 이름이 type1의 이름과 같다면
		// type1은 자판기가 판매 중인 상품이다.
		// 입고시키려는 음료수가 종류 중에 있다면 입고
		if(itemName==this.type1.name) {
			// type1의 재고 수량을 입고수량만큼 증가 시킨다.
			this.type1.stock +=addCount;
			System.out.println(this.type1.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName==this.type2.name) {
			this.type2.stock +=addCount;
			System.out.println(this.type2.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName==this.type3.name) {
			this.type3.stock +=addCount;
			System.out.println(this.type3.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName==this.type4.name) {
			this.type4.stock +=addCount;
			System.out.println(this.type4.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}else {
			System.out.println("존재하지 않는 상품입니다.");	
		}
		/** scanner로 입력 받은 string은 equals를 사용해야해서
		if(itemName.equals(this.type1.name)) {
			// 입고시키려는 음료수가 종류 중에 있다면 입고
			this.type1.stock +=addCount;
			System.out.println(this.type1.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName.equals(this.type2.name)) {
			this.type2.stock +=addCount;
			System.out.println(this.type2.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName.equals(this.type3.name)) {
			this.type3.stock +=addCount;
			System.out.println(this.type3.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}
		else if(itemName.equals(this.type4.name)) {
			this.type4.stock +=addCount;
			System.out.println(this.type4.name+" 상품이 "+addCount+"개 입고 되었습니다.");
		}else {
			System.out.println("상품이 없어 입고 불가합니다.");			
		}
		**/
	}
	
	/**
	 * 자판기가 판매중인 상품들의 이름고 재고 수량을 출력한다.
	 */
	public void printItem() {
		System.out.println(this.type1.name+"의 재고는:" +this.type1.stock);
		System.out.println(this.type2.name+"의 재고는:" +this.type2.stock);
		System.out.println(this.type3.name+"의 재고는:" +this.type3.stock);
		System.out.println(this.type4.name+"의 재고는:" +this.type4.stock);
	}
	
}
