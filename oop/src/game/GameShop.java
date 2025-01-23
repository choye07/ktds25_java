package game;

public class GameShop {
	public static void main(String[]args) {
		CraneGameMachine cgm  = new CraneGameMachine();
		cgm.isInsertCoin=true;
		cgm.dolls=10;
		int result = 0;
		while(true) {
			cgm.insertCoin();
			result += cgm.doGame();
			System.out.println(result);
			if(cgm.dolls==0) {
				break;
			}
		}

		
		
		System.out.println("isInsertCoin: "+cgm.isInsertCoin);
		System.out.println("남은 인형 수: "+cgm.dolls);
		System.out.println("뽑은 인형개수: "+result);
	}
}
