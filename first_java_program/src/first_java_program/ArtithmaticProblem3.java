package first_java_program;

public class ArtithmaticProblem3 {
	public static void main(String[]arg) {
		 /*
		 * 섭씨온도를 나타내는 celsius 변수와
		 * 화씨온도를 나타내는 fahrenheit 변수가 있습니다.
		 * celsius 변수에는 30 이 할당되어 있습니다.
		 * 섭씨 30도를 화씨온도로 변경하면
		 * 화씨 86도가 됩니다.
		 * 섭씨온도를 화씨온도로 변경해
		 * fahrenheit 변수에 할당하고 출력해보세요.
		 * 변경공식: (섭씨 × 9/5) + 32 = 화씨
		 */
		 
		int celsius =32;
		 int fahrenheit  = (celsius *  9 / 5 ) + 32;
		
//		double celsius =32;
//		
//		double fahrenheit = (celsius *  9 / 5 ) + 32; --> 실수로 변환해서 사용하면 딱 떨어지는 숫자들도 정확하게 출력 가능.
//		System.out.println(fahrenheit);
		System.out.println("섭씨 "+celsius+" 도는 화씨 "+fahrenheit +"도 입니다.");
		
	}
}
