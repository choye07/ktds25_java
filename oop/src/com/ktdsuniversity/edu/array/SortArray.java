package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[]args) {
		
		/* 시작  [ 56, 12, 58, 80, 1, 2 ]
				* [ 1, 2, 12,56, 58, 80 ]
		* 1. 반복 0,1 비교 56 > 12
		*        56과 12의 자리를 교환
		*    결과[12,56,58,80,1,2]
		* 2. 반복       1, 2 비교 56>58
		* 	  아무런 일도 하지 않는다.
		* 3. 반복      2,3을 비교 58>80
		*    아무런 일도 하지 않는다.
		* 4. 반복              3,4 비교 80>1
		*            80과 1의 자리를 교환.
		* 5. 반복              4,5를 비교 80>2
		* 			80과 2의 자리를 교환
		*    결과 [ 12,56,58,1,2,80]
		* 6. 반복 0,1 비교 
		* 아무런 일도 하지 않음.
		* 
		* 7. 반복 [12,56,58,1,2,80]
		* 
		*/
		int[] numbers = { 56, 12, 58, 80, 1,2};
		System.out.println(	Arrays.toString(numbers)); //반복문 없이 배열 결과 출력.	
		for(int i =0; i<numbers.length; i++) {
			for(int j =0; j<numbers.length-1-i; j++) {
				System.out.println(numbers[j]+ " > "+numbers[j+1]);
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
			System.out.println(i + "=> "+ Arrays.toString(numbers));
		}
		
		System.out.println(	Arrays.toString(numbers)); //반복문 없이 배열 결과 출력.
	
	}
}
