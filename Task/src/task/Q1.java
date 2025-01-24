package task;
/**
 * 고객: 10_000, 영화비용:18_000
 * 관람이 가능하다면 "관람가능", 지불하고 남은 금액
 * 관람 불가능이면 "관람 불가능", 모자란 금액 출력
 */
public class Q1 {
	public static void main(String[]args) {
		int cust = 12_000;
		int ticket = 18_000;
		
		if(cust == ticket || cust>ticket) {
			System.out.println("관람 가능");
			System.out.println("결제 후 남은 금액은 "+(cust-ticket)+"원 입니다.");
			
		}else {
			System.out.println("관람 불가능");
			System.out.println((ticket-cust)+"원 만큼 모자랍니다.");
		}	
		
	}
}
