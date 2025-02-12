package task.arrayproblem;

/**
 * 정수 4개로 이루어진 배열의 값을 교환하여 출력하는 코드를 작성하세요. 
 * 조건:
 * 		- 값을 직접 할당해 교환하는 방법은 사용하지 않아야 합니다.
		- 새로운 배열을 만들지 않아야 합니다.
 */
public class Q2 {
	
	public static void changeValue(int[]arr,int index1, int index2) {
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=arr[index1];
		//배열은 레퍼런스타입이라 반환하지 않아도 된다.
		
	}
	
	public static void printValue(int[]arr) {
		StringBuffer textBuffer = new StringBuffer();
		textBuffer.append("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		textBuffer.append("]");
	}
	
	public static void main(String[]args) {
//		int change1;
//		int change2;
		int[] numberArray = new int[4];
		
		numberArray[0]= 10;
		numberArray[1]= 5;
		numberArray[2]= 20;
		numberArray[3]= 4;

		System.out.println("변경 전: ");
		for(int i=0; i<numberArray.length; i++) {
			System.out.print("["+ numberArray[i]+"]");
		}

		changeValue(numberArray,0,1);
		changeValue(numberArray,2,3);
//		change1 = numberArray[0];
//		change2 = numberArray[2];
//		
//		numberArray[0] = numberArray[1];
//		numberArray[1] = change1;
//		
//		numberArray[2] = numberArray[3];
//		numberArray[3] = change2;
		
		
		System.out.println("\n변경 후: ");
		for(int i=0; i<numberArray.length; i++) {
			System.out.print("["+ numberArray[i]+"]");
		}

		
	}
}
