package task;


/**
 * 정수형 변수 2개를 선언하고 값을 할당한다.
 * 값이 할당된 정수형 변수 2개의 나누기 나머지를 구해 새로운 정수형 변수에 할당한다.
 * 나누기 나머지가 할당된 변수의 값을 출력해본다.
 */
public class Q10 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10) + 1;
		int num2 = (int) (Math.random() * 10) + 1;

		int share = num1 % num2;

		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("나누기의 나머지: " + share);
	}
}
