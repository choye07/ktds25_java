package task;

import java.util.Scanner;

/**
 * Scanner 이용
 * 정수형 변수 enemyHealthPoint를 만들고  Scanner의 nextInt()함수를 이용해 값을 할당한다.
 * 무한히 반복을 하면서 난수를 생성해 enemyHelthPint의 값을 감소시킨다.
 * 만약 enemyHelthPoint의 값이 0이 되거나 음수가 되면 "Victory!"를 출력하며 반복문을 종료한다.
 */
public class Q20 {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int enemyHealthPoint = in.nextInt();
		while (true) {
			int num =(int) (Math.random()*100+1);
			
			enemyHealthPoint -=num;
			
			// 감소된 체력 출력
	        System.out.println("감소할 숫자: " + num + " | HP: " + enemyHealthPoint);
	        
			if(enemyHealthPoint<=0) {
				System.out.println("Victory!");
				break;
			}
			
		}
		in.close();
	}
}
