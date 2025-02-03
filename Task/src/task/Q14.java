package task;


/**
 * 실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
 * 세 값 중 가장 작은 수만 출력한다.
 */
public class Q14 {
	public static void main(String[] args) {
		double num1 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num2 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num3 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println(num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
			System.out.println(num3);
		}

	}
}
