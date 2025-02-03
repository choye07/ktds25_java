package task;


/**
 * 1 부터 1000중 소수(1과 자신으로만 나눌 수 있는 수)만 출력한다.
 */
public class Q25 {
	public static void main(String[] args) {
		for (int i = 2; i < 1001; i++) { // 1은 소수가 아니므로 2부터 시작
			boolean isPrime = true; // 소수 여부 체크

			for (int j = 2; j <= i / 2; j++) { // 2부터 i/2까지만 나누어 떨어지는지 확인
				if (i % j == 0) { // 나누어 떨어지면 소수가 아님
					isPrime = false;
					break; // 하나라도 나누어 떨어지면 더 검사할 필요 없음
				}
			}

			if (isPrime) { // 소수라면 출력
				System.out.print(i + " ");
			}
		}
	}
}