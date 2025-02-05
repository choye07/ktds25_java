
package com.ktdsuniversity.edu.array.comiccafe;

public class ComicBookCafe {

	private ComicBook[] books;

	// 클래스 상수를 초기화 시키는 방법
	// 1. 클래스 상수 선언과 동시에 값 초기화
	public static final int CAFE_RENTAL_CASH = 1_000;

	// 2. 클래스 상수만 선언해두고 static scope에서 값 초기화 static{}

	public static final int VIP_RENTAL_FEE;

	// 과거의 추세
	// 클래스 상수를 클래스에 정의.

	// 현재의 추세
	// 인터페이스에 변수를 정의. (인터페이스의 변수 => 상수)
	// static{} -> 잘 쓰지 않음.

	// 클래스 상수/변수 들을 초기화 하기 위한 영역
	// 한 클래스에 하나의 static scope만 사용할 수 있음.
	static {
		// Static scope은 자신의 클래스가 가지고 있는 클래스 상수/변수들을 초기화 하는 목적.
		// 자신의 변수/상수를 초기화하기에 클래스명은 생략.
		VIP_RENTAL_FEE = 100;
	}

	private int cafeCash;

	public ComicBookCafe(ComicBook[] books, int cafeCash) {
		this.books = books;
		this.cafeCash = cafeCash;

	}

	public ComicBook[] getBooks() {
		return this.books;
	}

	public void setBooks(ComicBook[] books) {
		this.books = books;
	}

	public int getCafeCash() {
		return this.cafeCash;
	}

	public void printBooks() {
		System.out.println("<책 목록>");
		for (int i = 0; i < this.books.length; i++) {
			System.out.println("이름: " + this.books[i].getBookName() + " | 대여  상태: " + this.books[i].getRentalState());
		}

		System.out.println(" ");
		System.out.println("======================================");
	}

	public void rentalBook(String comicbook) {
		ComicBook book = null;
		for (int i = 0; i < this.books.length; i++) {
			book=this.books[i];
			if (comicbook.equals(book.getBookName())) {
				if (!(book.getRentalState())) {
					book.setRentalState(true);
					this.cafeCash += ComicBookCafe.CAFE_RENTAL_CASH;
					System.out.println(book.getBookName() + "을 대여 하셨습니다. 대여비는 " + this.cafeCash + "원 입니다.");
				} else {
					System.out.println("(" +book.getRentalState() + ") 이미 대여 중인 책은 대여가 불가합니다. ");
				}
				return;
			}
		}
		System.out.println("일치하는 책이 없습니다.");
	}

	public void returnBook(String comicbook) {
		ComicBook book = null;
		for (int i = 0; i < this.books.length; i++) {
			book =this.books[i];
			if (comicbook.equals(book.getBookName())) {
				if (!(book.getRentalState())) {
					System.out.println(book.getBookName() + "는(은) 대여 중인 책이 아닙니다.");
				} else {
					book.setRentalState(false);
					System.out.println(book.getBookName() + "을 반납하셨습니다.");
				}
				return;
			} 
		}
		System.out.println("일치하는 책이 없습니다.");
	}
}
