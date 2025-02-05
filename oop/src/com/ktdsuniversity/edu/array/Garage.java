package com.ktdsuniversity.edu.array;

import java.util.Scanner;

import com.ktdsuniversity.edu.comicbookcafe.ComicBook;

public class Garage {

	public static void main(String[] args) {
		
		String a ="최예진";
		String b = "최예진";
		
		System.out.println(a==b);
		
		System.out.println("====================");
		
		Scanner keyboard = new Scanner(System.in);
		String c = keyboard.next();
		
		System.out.println(c);
		System.out.println(c.equals(a));
		System.err.println(c.equals(b));
		
		
		// 정수형 배열 => int[], long[]
		// 실수형 배열 => float[], double[]
		// 불린형 => boolean[]
		// 문자열 배열 => String[] stringArr= new String[4];
		// stringArr[0] = "최예진";

		ComicBook[] bookGarage = new ComicBook[4];
		bookGarage[0] = new ComicBook("만화책1", false);
		bookGarage[1] = new ComicBook("만화책2", false);
		bookGarage[2] = new ComicBook("만화책3", false);
		bookGarage[3] = new ComicBook("만화책4", false);

		for (int i = 0; i < bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			System.out.println(book.getBookName());
			book.setRentalState(true);
			
		}
		// 반복이 끝난 이후에 book[0], book[1], book[2], book[3]의 RentalState 값은 무엇일까요? 모두 true!
		
		// 배열에서 만화책 이름이 "만화책2" 인 것과 "만화책3"인 것의 이름만 출력.
		// 전부다 true!
		
		System.out.println("=================");
		// bookGarage 배열에서 만화책 이름이  "만화책2" 인 것과 "만화책3"인 것의 이름만 출력.
		for(int i =0; i<bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			if(book.getBookName() == "만화책2"|| book.getBookName()=="만화책3") {
				System.out.println(book.getBookName());
				System.out.println(book.getRentalState());
			}
		}
	}
}
