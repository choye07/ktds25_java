package first_java_program;

public class ArithmaticOperator {
	public static void main(String[]args) {
		
		int number = 1_500_000_000;
		int number2 = 1_500_000_000;
		long number3 =  number + (long)number2;
		
		System.out.println(number3);
		
		System.out.println("----------------------");
		
		int number4 =10;
		int number5 =3;
		int number6 = number4/number5;
		System.out.println(number6);
		
		double number7 = (double) number4/number5; // (number4 *1.0) -> 같은 표현.
		System.out.println(number7);
		
		System.out.println("----------------------");
		
		int number8 = 9;
		int remain = number8%2; // % 나머지를 구하는 연산자.
		System.out.println(remain);
		
		System.out.println("----------------------");
		
		// 셀프 연산.
		// - 스스로에게 연산하기.
		int count = 0;
		
		//count 변수의 값을 1 증가 시키려면?
		count = count+1;
		count = count+1;
		count = count+1;
		System.out.println("count: "+count);
		
		int count2 =0;
		
		count2 += 1;
		count2 += 1;
		count2 += 1;

		System.out.println("count2: "+count2);
		
		int count3 = 0;
		count3++;
		count3++;
		count3++;
		System.out.println("count3: "+count3);
		
		
		System.out.println("----------------------");
		
		int count4 =0;
		count4++; 
		System.out.println(count4);
		count4--;
		System.out.println(count4);
		
		--count4; 
		System.out.println(count4);
		++count4;
		System.out.println(count4);
		
		System.out.println("====================================");
		
		int count5 =0;
		
		System.out.println(count5++); //--> 출력을 먼저 하고 1을 더한다.
		System.out.println(count5--); //--> 위에서 더했기 때문에 1인 채로 출력 후 빼진다.
		System.out.println(--count5); // --> 빼진 채로 값이 저장 되어서 0인데 앞에 -- 이게 있기 때문에 빼진 후에 값이 -1이 출력.
		System.out.println(++count5); // --> -1 값이 저장 되어있어서 ++ 1 더해져서 0으로 출력.
		
		
		System.out.println("----------------------");
	}
}
