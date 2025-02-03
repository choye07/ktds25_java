package task;


/**
 * 1부터 50중 30~39까지의 숫자만 출력한다.
 */
public class Q22 {

	public static void main(String[] arg) {
		for (int i = 1; i < 51; i++) {
			if (i >= 30 && i < 40) {
				System.out.print(i + " ");
			}
		}
	}
}
