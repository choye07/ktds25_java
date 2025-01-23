package first_java_program;

public class WhileStatement {
	public static void main(String[]args) {
		
		// 1. 1 부터 10까지 출력하자.
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);
			
		// 2. 1 부터 10까지 출력하자 (++이용)
			System.out.println("======= ++ 이용해서 출력하기 ========");
			
			int number = 0;
			System.out.println(++number);// 1 number++ => 0부터 시작
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			System.out.println(++number);
			
		// 3. 1 부터 10까지 출력하자 (while 이용)
			
			System.out.println("while 이용");
			
			int counter = 0;
			
			while(counter < 10) {
				System.out.println(++counter);
			}
			
			
		// 4. 1 부터 10까지 출력하자 (무한 반복 이용)
			
			System.out.println("while 이용(조건 true)");
			
			System.out.println("출력이 시작됩니다.");
			int numbers = 0;
			while(true) {
				System.out.println(++numbers);
				// 종료 조건 명시(반드시!!)
				if(numbers >=10) {
					//무한 반복 종료
//					break;
				}
			}
			
//			System.out.println("출력이 끝났습니다.");
	}
}
