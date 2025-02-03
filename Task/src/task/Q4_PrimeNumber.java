package task;

import java.util.Scanner;
/**
 * 소수가 있는지 세어 출력하는 메소드 만들기
 * 1 부터 10000 사이에 몇 개의 소수가 있는지.
 * 
 */
public class Q4_PrimeNumber {

	public void primeNumber() {
		int count = 0;
		for (int i = 2; i < 10001; i++) { // 1은 소수가 아니므로 2부터 시작
			boolean isPrime = true; // 소수 여부 체크

			for (int j = 2; j <= i / 2; j++) { // 2부터 i/2까지만 나누어 떨어지는지 확인
				if (i % j == 0) { // 나누어 떨어지면 소수가 아님
					isPrime = false;
					break; // 하나라도 나누어 떨어지면 더 검사할 필요 없음
				}
			}

			if (isPrime) { // 소수라면 count ++, i 출력
				System.out.print(i + " ");
				count++;
			}
		}
		// 줄넘긴 후 count 갯수 출력
		System.out.println(" ");
		System.out.println("count: " + count);
	}

	public static void main(String[] args) {

		Q4_PrimeNumber primeNumber = new Q4_PrimeNumber();
		primeNumber.primeNumber();
	}
}
