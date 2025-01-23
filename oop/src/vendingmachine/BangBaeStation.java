package vendingmachine;

public class BangBaeStation {
	public static void main(String[]args) {
		
		
		DrinkItem type1 = new DrinkItem("박카스",900,15);
		DrinkItem type2 = new DrinkItem("몬스터",1500,20);
		DrinkItem type3 = new DrinkItem("핫식스",1300,10);
		DrinkItem type4 = new DrinkItem("밀키스",1400,5);
		
		VendingMachine vm = new VendingMachine(type1,type2,type3,type4);
		
		System.out.println("음료수 수량");
		vm.printItem();
		
		
		String drinkName="박카스";
		int orderCount= 2;
		
		
		DrinkItem 영수증 = vm.pressItemButton(drinkName, orderCount);
		if(영수증 != null) {
		System.out.println(영수증.name+"를 "+orderCount+"개 샀습니다.");			
		}
		
		String addDrinkName ="밀키스";
		int addCount= 7;
		
		vm.addItem(addDrinkName, addCount);
		
		System.out.println("음료수 수량");
		vm.printItem();
		
		

	}
}
