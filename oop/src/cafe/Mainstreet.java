package cafe;

public class Mainstreet {
	public static void main(String[] args) {
//		
//		CoffeShop megaCoffee = new CoffeShop(2500,2000);
//		
//		megaCoffee.iceAmericano +=500;
//		megaCoffee.hotAmericano +=500;
//		
//		System.out.println(megaCoffee);
//		
//		System.out.println(megaCoffee.hotAmericano);
//		System.out.println(megaCoffee.iceAmericano);
//		
//		CoffeShop starbucks = new CoffeShop(6000,6000);
//		
//		starbucks.iceAmericano =6000;
//		starbucks.hotAmericano =6000;
//		System.out.println(starbucks);
//		System.out.println(starbucks.hotAmericano);
//		System.out.println(starbucks.iceAmericano);
//		
//		int megaOrderPrice = megaCoffee.orderCoffee(1, 5);
//		System.out.println("메가커피에서 주문한 커피의 총 주문 금액은 "+megaOrderPrice+"원 입니다.");
//		
//		
//		int starbucksOrderPrice = starbucks.orderCoffee(2, 2);
//		System.out.println("스타벅스에서 주문한 커피의 총 주문 금액은 "+starbucksOrderPrice+"원 입니다.");
		
		Coffee ice = new Coffee("아이스 아메리카노",2500); // 객체 생성(인스턴스 변수) 및 생성자 메소드 호출. -> 커피 종류를 커피에 저장
		Coffee hot = new Coffee("따뜻한 아메리카노",2000);
		
		CoffeeShop cs = new CoffeeShop(ice,hot); //객체 생성(인스턴스 변수) Coffeshop에 메뉴를 저장. Coffeshop에 Coffee 객체를 값으로 할당한 것.
		int price = cs.orderCoffee(2, 5);// 커피숍에 있는 메소드 호출
		System.out.println("주문한 커피의 가격은:"+ price);
		
		
	}
}
