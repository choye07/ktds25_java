package com.ktdsuniversity.edu.comicbookcafe;

public class Building {
	public static void main(String[]args) {
		ComicBook ironman = new ComicBook("아이언맨",false);
		ComicBook scarletwitch = new ComicBook("스칼렛위치",true);
		ComicBook hawkeye = new ComicBook("호크아이",false);
		ComicBook blckwidow = new ComicBook("블랙위도우",true);
		
		
		ComicBookCafe beoltun = new ComicBookCafe(ironman,scarletwitch,hawkeye,blckwidow,0);
		
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
		beoltun.printBooks();
		
		beoltun.rentalBook("아이언맨");
		beoltun.rentalBook("스칼렛위치");
		beoltun.rentalBook("호크아이");
		beoltun.rentalBook("블랙위도우");
		
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
		
		System.out.println("=================================================");
		beoltun.printBooks();
		
		beoltun.returnBook("아이언맨");
		beoltun.returnBook("블랙위도우");
		beoltun.returnBook("아이언맨");
		beoltun.returnBook("블랙위도우");
		
		System.out.println("=================================================");
		beoltun.printBooks();
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
	}
}
