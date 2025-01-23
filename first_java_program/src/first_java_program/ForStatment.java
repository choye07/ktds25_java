package first_java_program;

public class ForStatment {
	public static void main(String[]args) {
		//1. 1 부터 10 까지를 출력하기
		
			for(int i =1; i<=10; i++) {
				System.out.println(i);
			}//for 안에 조건문에 있는 변수는 for문 안에서만 적용 가능.
			// i -> 인덱스, increament(값이 증가한다)는 뜻인 단어에 약자라고 한다. (정답이 뭔지는 모름)
			
			System.out.println("==========================================");
		//2. 1 부터 10 사이에 있는 홀수만 출력하기
			for(int i =1; i<10; i+=2) {
				System.out.println(i);
			}
		//3. 2 부터 100_000 사이에 있는 짝수만 출력하기
			for(int i=2; i<100_000;i+=2) {
				if(i%2==0)
				System.out.println(i);
			}
			
			for(int i =2; i<=3; i++) {
				for(int j=1; j<10; j++) {
					System.out.println("");
				}
//				System.out.println(i+"X"+1+"="+i*1);
//				System.out.println(i+"X"+1+"="+i*2);
//				System.out.println(i+"X"+1+"="+i*3);
//				System.out.println(i+"X"+1+"="+i*4);
//				System.out.println(i+"X"+1+"="+i*5);
//				System.out.println(i+"X"+1+"="+i*6);
//				System.out.println(i+"X"+1+"="+i*7);
//				System.out.println(i+"X"+1+"="+i*8);
//				System.out.println(i+"X"+1+"="+i*9);
			}
			
			
	}
}
