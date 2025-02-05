package com.ktdsuniversity.edu.array.comiccafe;



public class Building {
	public static void main(String[]args) {
//		ComicBook ironman = new ComicBook("아이언맨",false);
//		ComicBook scarletwitch = new ComicBook("스칼렛위치",true);
//		ComicBook hawkeye = new ComicBook("호크아이",false);
//		ComicBook blckwidow = new ComicBook("블랙위도우",true);
		

		ComicBook[] bookGarage = new ComicBook[4];
		bookGarage[0] = new ComicBook("만화책1", false);
		bookGarage[1] = new ComicBook("만화책2", false);
		bookGarage[2] = new ComicBook("만화책3", false);
		bookGarage[3] = new ComicBook("만화책4", false);
		
		
		
		ComicBookCafe beoltun = new ComicBookCafe(bookGarage, 0);
		
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
		beoltun.printBooks();
		
		beoltun.rentalBook("만화책1");
		beoltun.rentalBook("만화책2");
		beoltun.rentalBook("만화책3");
		beoltun.rentalBook("만화책4");
		
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
		
		System.out.println("=================================================");
		beoltun.printBooks();
		
		beoltun.returnBook("만화책1");
		beoltun.returnBook("만화책2");
		beoltun.returnBook("만화책3");
		beoltun.returnBook("만화책4");
		
		System.out.println("=================================================");
		beoltun.printBooks();
		System.out.println("만화카페 보유 캐시: "+beoltun.getCafeCash()+"원");
	}
}
