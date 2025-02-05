package task.arrayproblem;

/**
 * 두 변수의 값을 교환하는 방법은 사용하지 않아야 한다.
 * 값을 직접 할당해 교환하는 방법은 사용하지 않아야 한다.
 */
public class Q1{
	public static void main(String[]args) {		
		int numberOne = 10;
		int numberTwo = 20;
		
		System.out.println("변경 전: numberOne->"+ numberOne+" numberTwo-> "+numberTwo);
		int change;
		
		change=numberOne;
		numberOne=numberTwo;
		numberTwo=change;
		
		System.out.println("변경 후: numberOne->"+ numberOne+" numberTwo-> "+numberTwo);		
	}
	
}
