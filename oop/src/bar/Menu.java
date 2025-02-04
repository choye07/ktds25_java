package bar;

public class Menu {

	private String beverageMenu;
	private static final int beveragePrice = 0;
	private String alcoholMenu;
	private static final int alcoholPrice = 0;

	public String getBeverageMenu() {
		return beverageMenu;
	}

	public void setBeverageMenu(String beverageMenu) {
		this.beverageMenu = beverageMenu;
	}

	public String getAlcoholMenu() {
		return alcoholMenu;
	}

	public void setAlcoholMenu(String alcoholMenu) {
		this.alcoholMenu = alcoholMenu;
	}

	public int getAlcoholPrice() {
		return alcoholPrice;
	}


	public static int getBeverageprice() {
		return beveragePrice;
	}

}
