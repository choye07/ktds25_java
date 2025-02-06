package com.ktdsuniversity.edu.array;

public class MatrixExam {

	/**
	 * 가변 이차원 배열(5 X n)
	 */
	public static void variableMatrix() {
		
		// 인덱스마다 크기가 다른 배열들을 만들어 할당한다.
		int[][] matrix = new int[5][];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new int[(int) (Math.random() * 10 + 1)]; //0을 넣으면 아무 값도 넣을 수 없는 배열이 됨.
		}

		// 데이터 채우기 
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = j + 1;
			}
		}

		// 데이터 출력
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(i + " 배열 정보입니다.");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 고정 이차원 배열 (5 X 5) 이차원 배열은 반드시 중첩 for문을 이용해야한다.
	 */
	public static void matrix() {
		int[][] matrix = new int[5][5];

		// 데이터 채우기
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = j + 1;
			}
		}

		// 데이터 출력
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(i + " 배열 정보입니다.");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [] n = new int [0]; //아무 것도 넣을 수 없는 배열
		System.out.println(n.length); // 0 출력
		
//		matrix();
//		variableMatrix();
	}
}
