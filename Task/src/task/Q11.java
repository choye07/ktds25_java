package task;


/**
 * 정수형 변수 2개를 선언하고 값을 할당한다.
 * 값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
 * 나누기 결과가 할당된 변수의 값을 출력해본다.
 */
public class Q11 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10) + 1;
		int num2 = (int) (Math.random() * 10) + 1;

		double division = (double) num1 / num2;

		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("나누기의 몫: " + division);

	}

}
