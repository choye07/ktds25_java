package task;


/**
 * 정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
 * 다섯 값 중 2 또는 5 또는 6의 배수인 것들만 출력한다.
 */
public class Q17 {
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 100 + 1);
		int num2 = (int) (Math.random() * 100 + 1);
		int num3 = (int) (Math.random() * 100 + 1);
		int num4 = (int) (Math.random() * 100 + 1);
		int num5 = (int) (Math.random() * 100 + 1);

		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

		// 16번 문제에 있는 조건 사용해서 조건문 줄여서 사용 가능

		if (num1 % 2 == 0 || num1 % 5 == 0 || num1 % 6 == 0) {
			System.out.println(num1);
		}
		if (num2 % 2 == 0 || num2 % 5 == 0 || num2 % 6 == 0) {
			System.out.println(num2);
		}
		if (num3 % 2 == 0 || num3 % 5 == 0 || num3 % 6 == 0) {
			System.out.println(num3);
		}
		if (num4 % 2 == 0 || num4 % 5 == 0 || num4 % 6 == 0) {
			System.out.println(num4);
		}
		if (num5 % 2 == 0 || num5 % 5 == 0 || num5 % 6 == 0) {
			System.out.println(num5);
		}

	}
}
