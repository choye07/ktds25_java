package com.ktdsuniversity.edu.string;

import java.util.Scanner;

public class RelayGame {

	public static void testStringBuffer() {

		StringBuffer textBuffer = new StringBuffer(); // import 별도로 필요하지 않음.

		// Buffer = 임시공간에 문자열들을 채운다.
		textBuffer.append(10.0f); // append는 textBuffer가 반환돼서 자기자신 반환이라 간략화해서 사용할 수 있다.
		textBuffer.append(textBuffer).append("this").append("12345");
		textBuffer.append(false);
		textBuffer.append(true);
		textBuffer.append('a');
		textBuffer.append("fdshjfdskj");

		// 버퍼에 있는 내용들을 하나의 String으로 모아준다.
		String text = textBuffer.toString();

		// 출력
		System.out.println(text);
	}

	public static void main(String[] args) {

		testStringBuffer();

		// 1. 시작 단어 제시
		String startWord = "자전거";

		// 반복문에서 선언문 빼기.
		int wordLength = 0;
		String endLetter = null;
		String nextWord = null;
		Scanner keyboard = new Scanner(System.in);
		int relayCount = 0; // 이어나간 단어의 수를 나타낸다.
		StringBuffer wordBuffer = new StringBuffer();

		while (true) {
			// 2. 시작 단어에서 마지막 글자를 추출하기.
			wordLength = startWord.length(); // 시작 단어의 길이를 구한다.
			endLetter = startWord.substring(wordLength - 1); // 시작 단어의 마지막 글자를 추출한다.

			// 3. 사용자로부터 다음 단어를 입력받는다.
			System.out.println("제시 단어: " + startWord);
			System.out.print("다음 단어를 입력해주세요: ");

			nextWord = keyboard.nextLine(); // 다음 단어를 입력 받는다.
			nextWord = nextWord.trim(); // 좌우 공백을 제거한 다음 단어를 할당받는다.

			// 4. 다음 단어가 시작 단어의 마지막 글자로 시작하는가?
//         if (nextWord.startsWith(endLetter)) {
//
//            // 5. 다음 단어가 3글자 이상인가?
//            if (nextWord.length() >= 3) {
//               // 6. 다음 단어를 시작 단어로 옮긴다.
//               startWord = nextWord;
//               // 7. 이어나간 단어의 수를 증가시킨다.
//               relayCount++;
//            } 
//            else {
//               System.out.println("게임이 종료되었습니다.");
//               System.out.println("총 " + relayCount +"번 이어나갔습니다.");
//               return;
//            }
//         } 
//         else {
//            System.out.println("게임이 종료되었습니다.");
//            System.out.println("총 " + relayCount +"번 이어나갔습니다.");
//            return;
//         }

			// 4. ~ 7.간략화
			if (nextWord.startsWith(endLetter) && nextWord.length() >= 3) {
				// 6. 다음 단어를 시작 단어로 옮긴다.
				startWord = nextWord;
				// 7. 이어나간 단어의 수를 증가시킨다.
				relayCount++;
				// 8. 다음 단어를 버퍼에 넣는다.
				wordBuffer.append(startWord);
				wordBuffer.append("\n");
				
			} else {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총 " + relayCount + "번 이어나갔습니다.");
				System.out.println("이어나간 단어들 입니다.");
				System.out.println(wordBuffer.toString());
				return;
			}
		}

	}
}
