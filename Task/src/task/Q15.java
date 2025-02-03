package task;

public class Q15 {
	public static void main(String[] args) {
		double num1 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num2 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num3 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num4 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;
		double num5 = Math.round((Math.random() * 10 + 1) * 100) / 100.0;

		double avg = Math.round(((num1 + num2 + num3 + num5) / 4) * 100) / 100.0;

		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3 + " num4: " + num4 + " num5: " + num5);
		System.out.println("평균 값 :" + avg);
		System.out.println("평균 보다 큰 값: ");

		if (num1 > avg) {
			System.out.println(num1);
		}

		if (num2 > avg) {
			System.out.println(num2);
		}

		if (num3 > avg) {
			System.out.println(num3);
		}

		if (num4 > avg) {
			System.out.println(num4);
		}

		if (num5 > avg) {
			System.out.println(num5);
		}

	}
}
