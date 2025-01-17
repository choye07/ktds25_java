package first_java_program;

public class ArtithmaticProblem1 {
	public static void main(String[]arg) {
		/*
		 * 산술연산자를 이용해
		 * minutes와 seconds의 값을 초로 변환해
		 * time 변수에 할당하고 출력해보세요.
		 */
		
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = (minutes * 60)+(seconds %  60);
		System.out.println(time);
//		System.out.println(time+"초");
		
		//=================================================================================
		
		//강사님 답//
		//int time = minutes * 60 + seconds;
//		System.out.println(minutes + "분 " + seconds + "초는 "+ time + "초 입니다.");
		
	}
}
