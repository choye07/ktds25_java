package task;

import java.util.Scanner;
/**
 * 계산기 문제
 * 메소드를 만들어 호출
 * 문자열: (+,-,*,/), 숫자: 정수, 부동소수점
 */
public class Q3_Calculator {
// 다 sign 없애도 됨.
	public void calculatorPlus(String sign, int number1, int number2) {
//		System.out.println(number1 + " + " + number2 + " = " + (number2 + number1));
		System.out.println(number1 + " " + sign + " " + number2 + " = " + (number2 + number1));
	}

	public void calculatorMinus(String sign, int number1, int number2) {
		System.out.println(number1 + " " + sign + " " + number2 + " = " + (number2 - number1));
	}

	public void calculatorMultiple(String sign, int number1, int number2) {
		System.out.println(number1 + " " + sign + " " + number2 + " = " + (number2 * number1));
	}

	public void calculatorDivision(String sign, int number1, int number2) {
		System.out.println(number1 + " " + sign + " " + number2 + " = " + (number2 / number1));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Q3_Calculator calculator = new Q3_Calculator();
		while (true) {
			System.out.println("계산기 프로그램 시작 (종료: exit)");
			String sign = in.next();

			if (sign.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; // -> 여기도 마찬가지로 return이 더 좋음.
			} else {
				int number1 = in.nextInt();
				int number2 = in.nextInt();

				if (sign.equals("+")) {
					calculator.calculatorPlus(sign, number1, number2);
				} else if (sign.equals("-")) {

					calculator.calculatorMinus(sign, number1, number2);
				} else if (sign.equals("*")) {

					calculator.calculatorMultiple(sign, number1, number2);
				} else if (sign.equals("/")) {

					calculator.calculatorDivision(sign, number1, number2);
				}
				// 아예 다른 부호를 입력 받으면 종료 되는 것을 하지 않음.
			}
		}

	}
}
