
package task.bar;
import java.util.Scanner;

public class CafeAndBar {
    public static void main(String[] args) {
        Bartender menu = new Bartender();
        Consumer consumer = new Consumer(20, 50000);
        Scanner in = new Scanner(System.in);

        while (true) {
            if (Bartender.isTooDrunk(consumer) || Bartender.isTooFull(consumer)) {
                System.out.println("더 이상 주문할 수 없습니다. 귀가하여 주시기 바랍니다.");
                break;
            }
            menu.printMenu();
            System.out.println("주문하실 메뉴를 선택해주세요 (1: 주류, 2: 음료, 0: 종료)");
            int order = in.nextInt();

            if (order == 0) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
            boolean success = menu.sellMenu(order, consumer);
            consumer.printState();

            if (!success) {
                System.out.println("잔액이 부족하여 프로그램을 종료합니다.");
                break;
            }
        }
        in.close();
    }
}
