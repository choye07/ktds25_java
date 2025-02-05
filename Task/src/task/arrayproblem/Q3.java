package task.arrayproblem;

/**
 * 아래와 같이 정수 10개로 이루어진 배열이 있습니다. [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] for 반복을 이용해 위
 * 배열에 있는 정수를 순서를 바꾸어 아래와 같이 새로운 배열로 만들어 출력해보세요. [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 */
public class Q3 {
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] numArr = new int[10];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;
		numArr[5] = 6;
		numArr[6] = 7;
		numArr[7] = 8;
		numArr[8] = 9;
		numArr[9] = 10;

		int change;
		int length = numArr.length;

		System.out.print("변경 전: ");
		printArray(numArr);

		for (int i = 0; i < length / 2; i++) {
			change = numArr[i];
			numArr[i] = numArr[length - 1 - i];
			numArr[length - 1 - i] = change;
		}
		System.out.print("변경 후: ");
		printArray(numArr);

	}
}
