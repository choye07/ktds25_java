package first_java_program;

public class IfStatement {
	public static void main(String[]args) {
		
		// 커피 가격
		int coffee = 1500;
		
		//내가 가진 돈
		int myWallet = (int)(Math.random()*10_000); // 0 ~ 9,999
		int friendsWallet = (int)(Math.random()*5000); // 0 ~ 4,999
		
		//내가 커피 5잔을 사 먹을 수 있을까?
		 boolean canBuy = coffee * 5 <= myWallet;
		 boolean needLoan = friendsWallet >= (coffee * 5) -myWallet;
		 System.out.println("내가 가진 돈: "+myWallet);
		 System.out.println("커피를 사먹을 수 있나요? "+canBuy);
		 
		//내가 커피를 사먹을 수 있으면, "커피 주문했습니다" 라고 출력하고, 내가 가진 돈에서 커피가격을 뺀다.
		//내가 커피를 사먹을 수 없으면, "커피를 주문할 돈이 부족합니다." 를 출력하고 모자란 금액을 출력한다. 
		//내가 커피를 사먹을 수 없느네 친구가 모자란 돈만큼 가지고 있으면 돈을 빌려서 커피를 주문한다.
		// "친구에게 돈을 빌려서 커피를 주문했습니다." 를 출력하고 빌린 돈을 출력한다.
		 
		//내가 커피를 사먹을 수 없는데, 친구가 모자란 돈만큼 가지고 있지도 않는 상황
		 // 그런데, 4잔까지는 사 먹을 수 있는 돈이 친구에게 있다면 "친구에게 모자란 금액만큼 빌려서 4잔을 주문 했습니다."
		 
		 if(canBuy) { //기본적으로 true! 
			 System.out.println("커피 주문했습니다.");
			 myWallet = myWallet - coffee * 5;
		 }
		 else if(needLoan) {
			 //나는 커피를 주문할 돈이 없는 상황이고
			 //친구가 내가 모자란 돈만큼 가지고 있을 때 실행되는 영역
			 System.out.println("친구가 가진 돈: "+friendsWallet);
			 int loan = Math.abs((coffee * 5) - myWallet); //절대값으로 출력할 수 있는 함수.
			 System.out.println("친구에게 돈을 빌려서 주문했습니다.");
			 System.out.println("빌린 돈: "+loan);
		 }
		 else if(friendsWallet >= ((coffee * 4) -myWallet)) {
			 System.out.println("친구에게 모자란 금액만큼 빌려서 4잔을 주문 했습니다.");
			 int loan =(coffee * 4) -myWallet;
			 System.out.println("빌린 돈: "+loan);
		 }
		 else {
			 // if(canBuy)의 결과가 false이고, 친구의 돈ㄷ도 부족할 때만 실행되는 영역.
			 System.out.println("친구가 가진 돈: "+friendsWallet);
			 System.out.println("커피를 주문할 돈이 부족합니다.");
			 int needMoney = (coffee *5) - myWallet;
			 System.out.println(needMoney+"만큼 부족합니다.");	 
		 }
	}
}
