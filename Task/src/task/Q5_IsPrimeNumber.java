package task;

/**
 * 파라미터로 정수를 전달하면 해당 숫자가 소수인지 확인하고
 * 소수라면 true, 아니면 false를 반환하는 메소드 만들고 실행 
 */
public class Q5_IsPrimeNumber {
	public boolean primeNumber(int number){
		if(number <2) {	
			return false;
		}else {
			  // 2부터 number/2까지 나눠서 소수 확인
			for(int i =2; i<=number/2; i++) {
				if(number % i ==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		Q5_IsPrimeNumber primeNumber = new Q5_IsPrimeNumber();
		
		int number = (int)(Math.random()*100+1);
		boolean isPrime = primeNumber.primeNumber(number);
		System.out.println(number);
		System.out.println(isPrime);
		
	}
}
