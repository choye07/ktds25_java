package first_java_program;

public class VariableScope {
	public static void main(String[]args) {
		//변수의 범위
		// Top-down방식 모든 코드는 위에서 아래로 실행된다.
		// 변수가 정의되고 나서 후의 나오는 중괄호 까지는 변수를 쓸 수 있음.
		int age = 41;
		
		{
			System.out.println(age);
			
			int limit = 30;
			System.out.println(limit);
		}
		{
			System.out.println(age);
//			System.out.println(limit);
		}
	}	
}
