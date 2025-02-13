package com.ktdsuniversity.edu.file.recursion;

/**
 * Recursive Call(재귀호출) - 메소드가 자신을 다시 호출 하는 것. - a() 메소드 내부에서 a() 메소드를 다시 호출.
 * 오류: at
 * com.ktdsuniversity.edu.file.recursion.RecursiveCallExam.printHello(RecursiveCallExam.java:15)Error
 * -> exception이 아닌 이유는 심각한 오류이기 때문이다. -> 손댈 수 없는 영역에서 발생한 오류. -> 콜스택은 무한하게 쌓일
 * 수가 없기 때문에 스택에 쌓일 수 있는 수가 한정되어있다.
 */
public class RecursiveCallExam {
	// 2.
	public static void printHello() {

		int randomNumber = (int) (Math.random() * 10);
		System.out.println("재귀호출 중입니다." + randomNumber);
		// 3. (계속 호출)
		// 0~9
		// 억지로 만든 재귀호출 종료 조건 재귀호출의 종료는 printHello()를 다시 호출 하지 않는 것.

		if (randomNumber < 9) {
			printHello();
		}
		System.out.println("재귀호출이 끝나는 중입니다: " + randomNumber);
	}

	/**
	 * startNumber에서 0 까지 재귀호출을 이용해서 출력한다.
	 * 
	 * @param sartNumber
	 */
	public static void printNumbers(int startNumber) {

		// Call stack Push 할 때 실행
		System.out.println("현재 번호: " + startNumber);
		if (startNumber > 0) {
			printNumbers(startNumber - 1);
		}
		// Call stack Pop 할 때 실행
		System.out.println("현재 번호 출력 끝: " + startNumber);

	}

	/**
	 * startNumber 부터 1까지 모두 더한 값을 조회 (재귀호출)
	 * 
	 * @param startNumber
	 * @return
	 */
	public static int addAllNumbers(int startNumber) {
		System.out.println("현재번호: " + startNumber);

		int addResult = 0;
		if (startNumber > 0) {
			addResult = addAllNumbers(startNumber - 1);
		}
		System.out.println("더한 결과: " + addResult); //내가 준 숫자까지 더한 값.

		return startNumber + addResult;
//		return startNumber + addAllNumbers(startNumber-1); //메소드 먼저 실행 후 더하기 실행 -> 스택 마지막 부터 계산 시작
	}

	public static void main(String[] args) {
		// 1.
//		printHello();
//		printNumbers(10);
		int result = addAllNumbers(3);
		System.out.println(result);
	}
}
