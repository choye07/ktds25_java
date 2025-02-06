package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Lotto {
	public static void makeLottoNumbers() {
		
		//로또 복권
		//1 ~ 45 6개 찍기 (중복불가)-> 1게임 1,000원
		//내가 찍은 6개의 번호와 주관사가 랜덤하게 찍은 6개의 번호와 정확하게 일치하면 1등
		// 1등 당첨자가 적립금을 다 먹는 게임(400억)
		
		//로또 번호 6개를 모아보기
		/*
		 * 시작: [0, 0, 0, 0, 0, 0]
		 * 1. 1~45 중 랜덤하게 하나만 뽑기 => 결과 37
		 * 	  =>배열에 37이 존재하는지 확인. => 존재할 경우는 아무것도 하지 않는다.
		 *    => 존재하지 않을 경우에만 => 첫 번째 인덱스에 37을 할당
		 *    => [37, 0, 0, 0, 0, 0]
		 *    => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * 2. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 15
		 *  => 배열에 15가 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 *  => 존재하지 않는 경우 => 두 번째 인덱스에 15를 할당
		 *  => [37, 15, 0, 0, 0, 0]
		 *  => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.ㄴ
		 * 3. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 3
		 * => 배열에 3이 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 세 번째 인덱스에 3를 할당
		 * => [37, 15, 3, 0, 0, 0]
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * 4. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 37
		 * => 배열에 37이 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 네 번째 인덱스에 37을 할당
		 * => [37, 15, 3, 0, 0, 0]
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * 5. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 33
		 * => 배열에 33이 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 네 번째 인덱스에 33을 할당
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * => [37, 15, 3, 33, 0, 0]
		 * 6. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 15
		 * => 배열에 15이 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 다섯 번째 인덱스에 15을 할당
		 * => [37, 15, 3, 33, 0, 0]
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.    
		 * 7. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 22
		 * => 배열에 22가 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 다섯 번째 인덱스에 22을 할당
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * => [37, 15, 3, 33, 22, 0]    
		 * 8. 1~45 중 랜덤하게 하나만 뽑기 => 결과: 45
		 * => 배열에 45가 존재하는지 확인 => 존재할 경우는 아무것도 하지 않는다.
		 * => 존재하지 않는 경우 => 여섯 번째 인덱스에 45을 할당
		 * => 인덱스 카운트가 7인지 확인 => 7이라면 반복을 종료한다.
		 * => [37, 15, 3, 33, 22, 45]    
		 */ 
		
		
		int[] lottoNumbers = new int[6];
		int indexCount = 0;
		int randomNumber=0;
		boolean isDuplicated = false;
		while(indexCount < 6) {
			//매 반복마다 중복 여부값 초기화 시켜주기
			isDuplicated = false;
			
			// 로또번호 랜덤하게 뽑기
			randomNumber = (int)(Math.random() * 45 + 1);
			
			//lottoNumbers에 randomNumber가 존재하는지 확인하기.
			for(int i =0; i < indexCount; i++) {
				if(lottoNumbers[i]==randomNumber) {
					isDuplicated = true;
					break;
				}
			}
			//중복되 숫자가 아니라면
			if(!isDuplicated) {
				//lottoNumbers[indexCount]에 랜덤값을 할당한다.
				lottoNumbers[indexCount]=randomNumber;
				//indexCount를 1 증가시킨다.
				indexCount++;
			}
		}
		System.out.println(Arrays.toString(lottoNumbers));
		sortNumbers(lottoNumbers);
		
	}

	public static void sortNumbers(int[]arr) {
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr.length-1-i; j++) {
				System.out.println(arr[j]+ " > "+arr[j+1]);
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(i + "=> "+ Arrays.toString(arr));
		}
		
		System.out.println(	Arrays.toString(arr)); //반복문 없이 배열 결과 출력.
	}

	public static void main(String[]args) {
		makeLottoNumbers();
	}

	
}
