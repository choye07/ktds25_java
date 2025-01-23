package first_java_program;

import java.util.Scanner;

public class UpDownGame2 {
	public static void main(String[]args) {
		//1. 정수(난수) 생성
		int quiz = (int)(Math.random()*100)+1; // 0~ 100
		
		//2. 사용자에게 값을 입력 받는다.
		Scanner keyboard = new Scanner(System.in);
		int failCount=0;
		
		while(true) {
			
			int answer = keyboard.nextInt();
			
			//3. 정수와 사용자가 입력한 값이 같은지 비교.
			if(quiz == answer) {
				System.out.println("정답입니다.");
				break;
			}// break가 있기 때문에  else 사용 하지 않음.
			// break는 while문 자체를 벗어나기 때문에 else 생략.
			
			// 난수와 사용자가 입력한 값이 틀렸을 때
			// 실패 횟수를 1 증가 시킨다.
			// 실패횟수가 3보다 크거나 같다면, 게임을 종료 시킨다.
			failCount++;
			
			if(failCount >=3) {
				System.out.println("3회 이상 틀려서 게임을 종료합니다.");
				System.out.println("정답은 "+quiz+" 이였습니다.");
				break;
			}
			//4. 난수가 사용자가 입력한 값도다 더 큰지 비교
			if(quiz > answer) {
				System.out.println("더 큰수를 입력하세요.");
				
			}//5. 난수가 사용자가 입력한 값도다 더 작은지 비교
			else {
//				count ++;
				System.out.println("더 작은수를 입력하세요.");
			}
		}
	}
}
