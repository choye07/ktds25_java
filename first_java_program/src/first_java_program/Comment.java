package first_java_program;



/**   
 * 주석을 설명하기 위한 실행가능한 파일입니다.
 * 
 * @author 최예진
 * */ 
// --> (Document라 부를 수 있다.) 주석이지만 파일에 대한 정보를 기록하기 위해 쓰는 주석 방법 Eclipse에서 제공하는 것.
public class Comment {
	/**
	 * 하나의 클래스 파일을 실행시키기 위한 코드.
	 * @param args 매개변수
	 */
	public static void main(String[]args) {
		//주석? 코드에 대한 설명을 기록하는 방법. 실행되지 않는 코드 
		//-> single line comment / 한 줄 주석
		//<-- 한줄짜리 주석.
		//System.out.println("안녕하세요.");
		
		/* <-- multi line comment / 여러 줄 주석
		System.out.println("Java 기초를 배우고 있습니다.");
		*/
		
		System.out.println("절차적 코드를 작성하는 주제입니다.");
		
	}
}
