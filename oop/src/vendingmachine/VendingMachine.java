package vendingmachine;

public class VendingMachine {
	DrinkItem type1;
	DrinkItem type2;
	DrinkItem type3;
	DrinkItem type4;
	
	public VendingMachine (DrinkItem type1,DrinkItem type2,DrinkItem type3,DrinkItem type4) {
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		this.type4 = type4;
	}
	
	public DrinkItem pressItemButton(String itemName, int orderCount) {
		//주문한 음료수가 있는지
		if(itemName==this.type1.name) {
			//주문한 음료수의 수량이 주문 수량보다 크거나 같은지.
			if(this.type1.stock >= orderCount) {
				//주문한 수 만큼 수량에서 빼기
				this.type1.stock -=orderCount;
				//주문 내용 인스턴스 생성.
				System.out.println("상품을 구매하였습니다.");
				return new DrinkItem(this.type1.name,this.type1.price,orderCount);
			}
		}else if(itemName==this.type2.name) {
			if(this.type2.stock >= orderCount) {
				this.type2.stock -=orderCount;
				return new DrinkItem(this.type2.name,this.type2.price,orderCount);
			}
		}else if(itemName==this.type3.name) {
			if(this.type3.stock >= orderCount) {
				this.type3.stock -=orderCount;
				return new DrinkItem(this.type3.name,this.type3.price,orderCount);
			}
		}else if(itemName==this.type4.name) {
			if(this.type4.stock >= orderCount) {
				this.type4.stock -=orderCount;
				return new DrinkItem(this.type4.name,this.type4.price,orderCount);
			}
		}
		System.out.println("상품이 없습니다.");
		return null;
	}
	
	public void addItem(String itemName, int addCount) {
		if(itemName==this.type1.name) {
			// 입고시키려는 음료수가 종류 중에 있다면 입고++
			this.type1.stock +=addCount;
		}
		else if(itemName==this.type2.name) {
			this.type2.stock +=addCount;
		}
		else if(itemName==this.type3.name) {
			this.type3.stock +=addCount;
		}
		else if(itemName==this.type4.name) {
			this.type4.stock +=addCount;
		}
	}
	public void printItem() {
		System.out.println(this.type1.name+"의 재고는:" +this.type1.stock);
		System.out.println(this.type2.name+"의 재고는:" +this.type2.stock);
		System.out.println(this.type3.name+"의 재고는:" +this.type3.stock);
		System.out.println(this.type4.name+"의 재고는:" +this.type4.stock);
	}
	
}
