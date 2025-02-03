package task;

/**
 * 실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
 * 두 값 중 큰 수만 출력한다.
 */
public class Q13 {
	public static void main(String[] args) {

		double num1 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num2 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;

		if (num1 > num2) {
			System.out.println("num1: " + num1 + "  num2: " + num2);
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println("num1: " + num1 + " num2: " + num2);
			System.out.println(num2);
		} else {
			System.out.println("num1: " + num1 + " num2: " + num2);
			System.out.println("두 수가 같습니다.");
		}
	}
}
