package first_java_program;

public class ForStatmentProblem {
	public static void main(String[]args) {
		// 1. 1부터 100까지의 합을 구해 출력해보세요.
		int sum =0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
//		// 2. 1부터 100 중 홀수의 합을 구해 출력해보세요.
			int sum2=0;
			for(int i=1; i<100; i+=2) {
				sum2+=i;
			}
			System.out.println(sum2);
		// 3. 1부터 100 중 3, 5, 6의 배수만출력해보세요.
//			for(int i =1; i<101; i++) {
////				System.out.print(i+", ");
//				if(i%3==0 && i%5==0 &&i%6==0) {
//					System.out.print(i+", ");
//				}
//			}
			// 틀렸음 교집합 구해야하는데 모두를 구함. (||로 함.)
		// 4. 별찍기
//		for(int i =0; i<=5; i++) {
//			System.out.println("*");
//			for(int j =0; j<i; j+=1) {
//				System.out.print("*");
//			}
//		}
		
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			if(i<5) {
				System.out.println();
			}
		}
		// 5. 4자리수 하나씩 더해서 합 구하기.
		System.out.println(' ');
		System.out.println("===================================");
		int num = 7237;
		int length= (int) Math.log10(num)+1; //몇 자리 수인가?
		int sum3=0;
		
		for(int i =0; i<length;i++) {
			int n=num%10;
			sum3+=n;
			num/=10;
		}
		
		System.out.println("모든 자리를 더하면 "+sum2+" 입니다.");
		
		int num2 =7237;
		
		String numStr = num2+"";
		int sum4 =0;
		for(char n: numStr.toCharArray()) {
			sum4+=Integer.parseInt(n+"");
		}
		System.out.println("모든 자리를 더하면 "+sum4+" 입니다.");
	}
}
