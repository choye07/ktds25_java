package vendingmachine;

//import java.util.Scanner;


/**
 * 자판기를 생성하고 판매/운영 수행.
 */
public class BangBaeStation {
	public static void main(String[]args) {
		
		/**
		 * 지판기가 판매할 상품의 구체적인 정보를 가지고 있는 인스턴스들 생성.
		 */
		DrinkItem type1 = new DrinkItem("박카스",900,15);
		DrinkItem type2 = new DrinkItem("몬스터",1500,20);
		DrinkItem type3 = new DrinkItem("핫식스",1300,10);
		DrinkItem type4 = new DrinkItem("밀키스",1400,5);
		
		// 자판기 인스턴스를 생성
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 상품 인스턴스도 함께 전달한다.
		VendingMachine vm = new VendingMachine(type1,type2,type3,type4);
		
//		Scanner in = new Scanner(System.in);
		
//		System.out.println("자판기 기능을 골라주세요.");
//		System.out.println("1.구매하기 2.입고하기 3.종료");
//		while(true) {
//			int option = in.nextInt();
			
//			if(option ==1) {
				System.out.println("구매할 음료수를 선택해주세요.");
				vm.printItem();
//				String drinkName =in.next();
//				int orderCount = in.nextInt();
				
				
		
				String drinkName="미에로 화이봐";
				int orderCount= 80;
		
				//자판기에서 상품 버튼을 눌러 구매한다.
				// 반환된 정보는 구매가자 구매한 상품 정보.
				DrinkItem 영수증 = vm.pressItemButton(drinkName, orderCount);
				//pressItemButton("메이로화이바",0,2);
				if(영수증 != null) {
					System.out.println(영수증.name+"를 "+orderCount+"개 샀습니다. 결제 금액은 "+영수증.price+"원 입니다.");			
				}
				//null 값을 반활 할 때에 조치를 하지 않으면  
				//java.lang.NullPointerException: Cannot read field "name" because "영수증" is null
				// 오류 발생
				vm.printItem();
				
//				System.out.println("1.구매하기 2.입고하기 3.종료");
//			}else if(option==2) {
//				System.out.println("입고할 제품을 고르세요");
//				System.out.println("박카스, 몬스터, 핫식스, 밀키스");
//				String addDrinkName =in.next();
//				int addCount = in.nextInt();

			 	String addDrinkName ="미에로화이바";
				int addCount= 7;
				
				vm.addItem(addDrinkName, addCount);
				System.out.println("음료수 수량");
				vm.printItem();
//				System.out.println("1.구매하기 2.입고하기 3.종료");
//			}else {
//				System.out.println("이용해주셔서 감사합니다.");
//				break;
//			}
			
//		}
		
	
		
		

	}
}
