package task;

import java.util.Scanner;
/**
 * 무한 구구단을 출력합니다.
 * 사용자가 입려한 구구단의 결과를 출력한다.
 * 만약 3을 입력했다면, 구구단 3단을 출력합니다.
 * 만약, -1을 입력했다면 구구단 출력 프로그램을 종료해야한다.
 */
public class Q2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 반복문장 내부에서는 변수 선언을 자제.
		int num = 0;// Reference Type을 제어할 때 유용하다.
		while (true) {
			System.out.println("숫자를 입력하세요(종료: -1)");

//			int num =in.nextInt(); // 새롭게 메모리를 사용하기 때문에 메모리 사용공간이 줄어든다. 그렇기 때문에 되도록 반복문 밖에서 변수 선언하여 사용하는 것이 좋다.
			num = in.nextInt();
			if (num == -1) {
				System.out.println("출력을 종료합니다.");
				break; // -> return이 더 좋다.
			} else {
//				for (int i = num; i <= num; i++) {
					for (int j = 1; j < 10; j++) {
						System.out.println(num + " * " + j + " = " + num * j);
					}
//				}
			}
		}
	}
}
