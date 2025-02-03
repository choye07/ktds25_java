package task;

import java.util.Scanner;

/**
 * Scanner 이용.
 * 2의 배수만 입력하는 문제를 만든다.
 * 만약, 2의 배수가 아니거나 0 또는 음수를 입력하면 "게임을 마칩니다"를 출력하며 반복문을 종료한다.
 */
public class Q19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 한 번 만들고 계속 쓸거면 처음 정의하고 사용하는게 좋다. (반복문에서 쓸거면)
		int num = 0;
		while (true) {

			// 레퍼런스인 scanner를 반복문에 넣으면 반복문이 계속 돌면서 메모리에 할당된 자리에 null값을 넣고 다른 주소에 메모리를 또 쌓는다.
			// 그러다 임시로 넣어준 null 메모리를 찾아서 GC가 처리해주는데 그게 언제인지 알 수 없음.
			System.out.println("숫자를 입력하세요: ");
			num = in.nextInt();

			if (num % 2 != 0 || num <= 0) {
				System.out.println("게임을 마칩니다.");
				break; // -> return으로 완전히 종료 시키면 좋다. 뒤에 코드가 없을 시에(?)
			}

			System.out.println("2의 배수입니다.");

		}
		
	}
}
