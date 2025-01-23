package game;

import java.util.Random;

public class CraneGameMachine {
		
		boolean isInsertCoin;
		
		int dolls;
		
		public void insertCoin() {
			if(dolls>0) {
				isInsertCoin = true;
			}
		}
		
		public int doGame() {
			if(isInsertCoin) {
				Random random = new Random();
				
				int result = random.nextInt(2);
				dolls -= result;
				isInsertCoin =false;
				return result;
			}
			
			return 0;
		}
		
}
