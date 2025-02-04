package task.bar;

public class Bartender {

    private String cafeMenu;
    private String alcoholMenu;

    // 메뉴 가격을 상수로 선언
    private final static int CAFE_MENU_PRICE = 5100;
    private final static int ALCOHOL_MENU_PRICE = 8000;
    private final static double FULL_LIMIT = 20.0;
    private final static double DRUNK_LIMIT = 10.0;

    public Bartender() {
        this.cafeMenu = "CafeMocha";
        this.alcoholMenu = "WhiteRussian";
    }

    public String getCafeMenu() {
        return cafeMenu;
    }

    public String getAlcoholMenu() {
        return alcoholMenu;
    }

    // 취한 정도가 10 이상이면 true 반환
    public static boolean isTooDrunk(Consumer consumer) {
        return consumer.getDrunkFigure() >= DRUNK_LIMIT;
    }

    // 포만감이 20 이상이면 true 반환
    public static boolean isTooFull(Consumer consumer) {
        return consumer.getFullnessFigure() >= FULL_LIMIT;
    }

    // 메뉴 출력
    public void printMenu() {
        System.out.println("1. 알코올 메뉴: " + this.alcoholMenu + ", 가격: " + ALCOHOL_MENU_PRICE + "원");
        System.out.println("2. 카페 메뉴: " + this.cafeMenu + ", 가격: " + CAFE_MENU_PRICE + "원");
    }

    // 음료 판매 메서드
    public boolean sellDrink(Consumer consumer) {
        if (isTooFull(consumer)) {
            System.out.println("귀가하여 주시기 바랍니다. (포만감 수치: " + consumer.getFullnessFigure() + ")");
            return false;
        }
        if (consumer.getWallet() >= CAFE_MENU_PRICE) {
            consumer.setWallet(consumer.getWallet() - CAFE_MENU_PRICE);
            consumer.setFullnessFigure(consumer.getFullnessFigure() + 0.2);
            System.out.println("주문하신 음료가 나왔습니다.");
            return true;
        } else {
            System.out.println("잔액이 부족하여 결제하실 수 없습니다.");
            return false;
        }
    }

    // 주류 판매 메서드
    public boolean sellAlcohol(Consumer consumer) {
        if (consumer.getAge() < 19) {
            System.out.println("알코올 메뉴는 미성년자에게 판매 불가합니다.");
            return false;
        }
        if (isTooDrunk(consumer)) {
            System.out.println("귀가하여 주시기 바랍니다. (알코올 수치: " + consumer.getDrunkFigure() + ")");
            return false;
        }
        if (consumer.getWallet() >= ALCOHOL_MENU_PRICE) {
            consumer.setWallet(consumer.getWallet() - ALCOHOL_MENU_PRICE);
            consumer.setDrunkFigure(consumer.getDrunkFigure() + 0.5);
            System.out.println("주문하신 주류가 나왔습니다.");
            return true;
        } else {
            System.out.println("잔액이 부족하여 결제하실 수 없습니다.");
            return false;
        }
    }

    // 메뉴 판매 메서드 (음료 혹은 주류)
    public boolean sellMenu(int order, Consumer consumer) {
        switch (order) {
            case 1:  // 주류
                return sellAlcohol(consumer);
            case 2:  // 음료
                return sellDrink(consumer);
            default:
                System.out.println("잘못된 메뉴 번호입니다. 다시 시도해주세요.");
                return false;
        }
    }
}