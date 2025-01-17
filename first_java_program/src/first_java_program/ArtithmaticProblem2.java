package first_java_program;

public class ArtithmaticProblem2 {
	public static void main(String[]arg) {
		/*
		 * 산술 연산자를 이용해
		 * processTime을 분(Minute), 초(Second)
		 * 를 구한다음 minutes, seconds 변수에 할당하고
		 * 출력해보세요.
		 */
		 
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		minutes = processTime / 60;
		seconds = processTime % 60;
		
		System.out.println(minutes+"분 "+ seconds+"초");
		//=================================================================================
		
		// 위는 동일
		// 강사님 답//
//		System.out.println(processTime+"초는 "+minutes+"분 "+ seconds+"초 입니다.");
	}
}
