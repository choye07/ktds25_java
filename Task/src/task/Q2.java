package task;

import java.util.Scanner;
/**
 * 무한 구구단을 출력합니다.
 * 사용자가 입려한 구구단의 결과를 출력한다.
 * 만약 3을 입력했다면, 구구단 3단을 출력합니다.
 * 만약, -1을 입력했다면 구구단 출력 프로그램을 종료해야한다.
 */
public class Q2 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		while(true) {			
			System.out.println("숫자를 입력하세요(종료: -1)");
			
			int num =in.nextInt();
			if(num ==-1) {
				System.out.println("출력을 종료합니다.");
				break;
			}else {			
				for(int i =num; i<=num; i++) {
					for(int j =1; j<10; j++) {
						System.out.println(i+" * "+j+" = "+i*j);
					}
				}
			}
		}
	}
}
