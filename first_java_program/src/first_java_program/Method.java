package first_java_program;

public class Method { 
	
	public static int getTestNumber() {
		int number1 = (int)(Math.random()*100);
		if(number1>90) {
			return 100;
		}else if(number1>50) {
			return 30;
		}
		return -1; 
		//해소 되지 않은 경우의 수 처리.
		//반환시려는 타입과 반환하는 타입이 다르면 오류가 난다.
	}
	
	/**
	 * 파라미터는 없다.
	 * 임의의 숫자 두개를 만들어서 값을 할당하고, 두 숫자의 합을 반환시킨다.
	 */
	
	public static int getAdditionResult() {
		int number1 = (int)(Math.random()*100);
		int number2 = (int)(Math.random()*100);
		
		
		return number1 + number2; //실행을 마칠 때 값을 보내주는 것.
	}
	
	/**
	 * 숫자 두개를 랜덤하게 생성을 하고 두 숫자를 더한 결과를 변환시키는데
	 * 숫자 중 하나라도 5보다 작은 숫자가 있다면 -1을 반환 시킨다.
	 */
	public static int getConditionalAdditionResult() {
		int number1 = (int)(Math.random()*100);
		int number2 = (int)(Math.random()*100);
		
		if(number1 <5 ) {
			return -1;
		}
		if(number2 <5 ) {
			return -1;
		}
		
		
		return number1+number2;
		
	}
	
	public static void prinNumbers() {
		for(int i =1; i<11; i++) {
			if(i%2 ==1) {
				System.out.println(i);
				return; // 반환타입이 void인 메소드에서 return은 printNumber 메소드를 즉시 종료시켜버린다.
			}
		}
	}
	/**
	 * 정수 파라미터 두개를 받아서, 첫 번째 파라미터 정수에 두 번째 파라미터 정수만큼 곱해서
	 * 문자열 파라미터와 함께 출력.
	 * @param number 정수
	 * @param time 제곱 할 횟수w
	 * @param message 결과와 함께 출력해주고 싶은 문자열
	 */
	public static void printPowerNumberwithMessage( int number, int time, String message ) {
		//메소드는 짧은 것 보다 서술된 형식이 좋다.
		long result = 1;
		
		for(int i =0; i<time; i++) {
			result *=number;
		}
		
		System.out.println(message+result);
	}
	
	/**
	 * Math.pow() 제곱근 구하는 함수 사용하는 메소드
	 * @param number
	 */
	public static void printPowerNumber(int number) {
		//아래에 메소드와 다른점은 파라미터가 있냐 없느냐에 차이이다.
		int result = (int)Math.pow(number, 2); // 지역변수라고 한다.
		// 메소드 안 쪽에 있는 변수는 모두 지역 변수이다.
		// 소괄호안에 있느 파라미터는 파라미터라고 한다, argument, 인자 => 통칭하는 것은 임시변수이다. 
		System.out.println(number+"의 제곱수는"+result+"입니다.");
		
	}
	
	
	/**
	 * 정해진 숫자 두 개를 더해 출력하는 메소드
	 * 숫자를 더하는 방법과 출력하는 방법이 기술.
	 * 코드를 반복하지 않아도 되는 장점이 있다.
	 * 호출 방식이 짧다.
	 */
	public static void add() {
		int number1 = 1;
		int number2 = 3;
		
		int addResult = number1+number2;
		
		System.out.println(number1+" + "+number2+" = "+addResult);
		
	}
	/**
	 * 숫자(정수)를 담는 변수 두개에 임의 값을 할당하고
	 * 두 숫자 중에서 더 큰 숫자만 출력한다.
	 * 
	 */
	public static void compare() {
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		
		if(i<j) {
			System.out.println(j);
		}else if(i>j){
			System.out.println(i);
		}
		//else 붙여서 두 값이 같다라고 출력. (강사님은)
	}
	
	/**
	 * 숫자 (정수)를 담는 변수 두개에 임의의 값을 할당하고
	 * 두 숫자를 뺐을 때 음수가 나오는 경우만 출력한다.
	 */
	
	public static void lessthan0() {
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		
		boolean isGreateThan = i>j;
		if(isGreateThan) {
			System.out.println(j-i);
		}else {
			System.out.println(i-j);
		}
	}
	
	/**
	 * 1부터 1000까지의 숫자중에 소수(Prime Number: 자신과 1로만 나누어지는 수)를 찾아서 출력한다.
	 */
	public static void primenumber() {
		for(int i=1; i<1001; i++) {
			boolean isPrimeNumber=true;
			
			for(int j =2; j<=i; j++) {
				//1과 자신의 수로는 나누지 않는다.
				if(j!=1 && j !=i) {
					if(i%j == 0 ) {
						isPrimeNumber=false;
						break; // 소수가 아님. 
						// for문안에서 break는 어느 블럭에 있는지 확인.
					}
					// j for가 끝까지 반복했을 때, 0으로 나누어진 수가 존재했는가?
				}
			}
			if(isPrimeNumber) {
				// boolean 타입은 true, false 인데, isPrimeNumber -> true 이기 때문에 true가 true 비교는 불필요한 것.
				// isPrimeNumber == ture -> isPrimeNumber 로 수정해야한다.
				// isPrimeNumber가 기본이 false이면 !isPrimeNumber로 하면 된다.
				System.out.println(i);
			}
			
		}
		
		//한 숫자를 2~10까지 나눳을 때 나머지가 한 번이라도 0이 떨어지면 소수가 아닌 것.
	}
	
	/**
	 * Method 클래스를 실행시키기 위한 특별한 메소드.
	 * 이 메소드는 JVM이 실행시킨다.
	 * @param args main 메소드를 실행할 때 필요한 인자 (파라미터)
	 */
	public static void main(String []args) {
		System.out.println("add 메소드를 호출하는 코드입니다.");
		add();
		compare(); 
		lessthan0();
		primenumber();
		
		printPowerNumber(10);
		printPowerNumber(30);
		printPowerNumber(55);
		
		printPowerNumberwithMessage(10,10,"1. 결과는 ");
		printPowerNumberwithMessage(30,20,"2. 결과는 ");
		printPowerNumberwithMessage(55,100,"3. 결과는 ");
		
		int addResult =getAdditionResult();
		System.out.println(addResult);
		
		int addResult2 = getConditionalAdditionResult();
		System.out.println(addResult2);
	}
}
