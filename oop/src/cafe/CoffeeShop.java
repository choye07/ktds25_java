package cafe;

/**
 * 아이스 아메리카노와 따듯한 아메리카노만 판매하는 커피숍
 * 
 * 클래스를 작성하는 순서
 * 1.상수 2.멤버변수 3.생성자 4.메소드 
 * 
 */
public class CoffeeShop {
	
	//Coffee라는 객체를 정의만 내렸고 그안에 있는 멤버변수들은 null, 0이다. 즉, 별도의 값이 할당되어있지 않은 상태.
	Coffee iceAmericano;   // 멤버 변수(레퍼런스 타입)
	
	Coffee hotAmericano;
	
	// 생성사 == 메소드.
	// 생성자 메소드는 반환 타입이 없다.
	// 생성자 메소드의 이름은 클래스 이름과 완전하게 동일해야한다.
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano){
		System.out.println("커피숍 인스턴스를 만들었습니다.");
		System.out.println("커피숍 인스턴스: "+this);
		this.iceAmericano = iceAmericano; //여기에서의 this는 cs
		this.hotAmericano = hotAmericano; 
		//같은 명에 파라미터를 전달할 때에 멤버 변수앞에 this. 붙이면 오류 해결 가능.
		// 붙이지 않으면 멤버변수에 멤버변수를 할당하는 것과 같다.
	}

	/**
	 * 커피숍에서 커피를 주문한다.
	 * 
	 * @param menu 1번: 아이스아메리카노, 2번: 핫아메리카노
	 * @param quantity 컴피 주문 수량(한 번에 하나의 ㅓ피 종류만 주문할 수 있다.)
	 * @return 결제해야하는 금액
	 */
	// 객체의 값을 가지고 계산하기 전 금액을 연산하는 메소드이다.
			
	public int orderCoffee(int menu, int quantity) {
		
		if(menu==1) {
			return this.iceAmericano.price * quantity; // this는 메소드 커피
		}else if(menu==2) {
			return this.hotAmericano.price * quantity;
		}
		// 판매 하지 않는 커피를 주문하면 결제할 금액은 0원이다.
		return 0;
	}
}
