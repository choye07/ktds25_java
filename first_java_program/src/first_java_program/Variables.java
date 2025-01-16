package first_java_program;

public class Variables {
	public static void main(String [] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE+1);
		System.out.println("----------------------------");
		
		// 변수의 이름은 클래스와 구분을 위해 첫 번째 글자는 소문자. 그다음부터 나오는 단어의 첫 번째 글자만 대문자.
		// 클래스와 동일하게 숫자는 안씀, 언더바도 잘 안씀, 띄어쓰기는 당연히 안됨.
		// = -> 메모리에 값을 넣는 것. 같다라는 뜻이 아님. (할당연산자) 

		byte byteNumberVariable = Byte.MAX_VALUE;
		System.out.println(byteNumberVariable);
		
		int intNumberVariable;
		intNumberVariable = 50;
		System.out.println(intNumberVariable);
		
		double doubleNumberVariable =3.14;
		float floatNumberVariable =3.14F;
		//int처럼 double로 무조건적으로 생각하기 때문에 float으로 인식시키기 위해서는 F를 꼭 적어야한다.
		System.out.println(doubleNumberVariable);
		
		System.out.println("----------------------------");
		
		byte firstNumber =100;
		byte secondNumber=110;
		byte thirdNumber=(byte)(firstNumber+secondNumber);
		System.out.println(thirdNumber);
		
		System.out.println("----------------------------");
		
		long hugeNumber= 3_000_000_000L;
		System.out.println(hugeNumber);
		//숫자형은 int로 받아들임 int가 아니라 long이라는 자료형으로 알려주기 위해서는 숫자에 끝에다가 L,l을 적어야한다.
		
		System.out.println("----------------------------");
		
		boolean yesOrNo = true;
		boolean yesOrNo2 = false;
		
		boolean isGreateThan = 3>1;
		System.out.println(isGreateThan);
		
		System.out.println("----------------------------");
		
		char letter = 'a';
		System.out.println(letter);
		System.out.println((char)(letter+1));
	}
}
