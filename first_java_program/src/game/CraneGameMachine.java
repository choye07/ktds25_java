package game;

public class CraneGameMachine {
		
		boolean isInsertCoin;
		
		int dolls;
		
		public void insertCoin() {
			if(dolls>0) {
				isInsertCoin = true;
			}
		}
		public int doGame() {
			return 0;
		}
}
