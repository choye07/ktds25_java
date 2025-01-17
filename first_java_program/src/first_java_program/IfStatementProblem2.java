package first_java_program;

public class IfStatementProblem2 {
	public static void main(String[]args) {
		// 3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다.
		 // 부모님의 나이는 각각 40, 36세입니다.
		 // 딸의 나이는 11세입니다.
		 // 성인의 비행요금은 30만원
		// 아동의 비행요금은 12만원입니다. 성인 판단 기준은 19세 이상입니다.
		 // 3인 가족은 여행을 떠날 수 있을까요?
		 // 여행을 떠날 수 있다면 "여행가자!"
		 // 여행을 떠날 수 없다면 "다음에가자"
		 // 를 출력해보세요.
		
		int money=(int)(Math.random()*1000000);
		
		int father=(int)(Math.random()*100) +20; // 20 ~ 99 
		int mother=(int)(Math.random()*100) +20;
		int daughter=(int)(Math.random()*10);
		
		System.out.println("아빠 나이: "+father+", 엄마 나이: "+mother+", 자녀 나이: "+Math.abs(daughter));
		System.out.println("경비 금액: "+money);
		
		int adultOneWayFlightFare=300_000;
		int kidOneWayFlightFare=120_000;
		int totalFilghtMoney = 0;
		
		int adultCount = 0; //각각 따로 해서 ++; count 세기.
		int kidCount = 0;
		
		if (mother >= 12 && father >= 12 && Math.abs(daughter) <=12) {
			adultCount = 2;
			kidCount = 1;
			System.out.println("성인 "+ adultCount+" 명"+" 어린이 "+kidCount+" 명이 선택되었습니다.");
			totalFilghtMoney = adultOneWayFlightFare*adultCount+kidOneWayFlightFare*kidCount;
			
			System.out.println(adultOneWayFlightFare*adultCount);
			System.out.println("총 금액: "+totalFilghtMoney);
			
			if(totalFilghtMoney >=money) {
				System.out.println("다음에 가자");
			}else {
				System.out.println("여행가자");
			}
		}else {
			adultCount = 0;
			kidCount=3;
			totalFilghtMoney = kidOneWayFlightFare*kidCount;
			
			System.out.println("성인 "+ adultCount+" 명"+" 어린이 "+kidCount+" 명이 선택되었습니다.");
			totalFilghtMoney =kidOneWayFlightFare*kidCount;
			System.out.println(kidOneWayFlightFare*kidCount);
			System.out.println("총 금액: "+totalFilghtMoney);
			
			if(totalFilghtMoney >=money) {
				System.out.println("다음에 가자");
			}else {
				System.out.println("여행가자");
			}
		}

	}
}
