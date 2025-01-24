package com.ktdsuniversity.edu.comicbookcafe;

public class ComicBookCafe {
	
	ComicBook comicBook1;
	ComicBook comicBook2;
	ComicBook comicBook3;
	ComicBook comicBook4;
	
	
	private final int CAFE_RENTAL_CASH = 10000;
	private int cafeCash;
	
	
	
	public ComicBookCafe(ComicBook comicBook1,ComicBook comicBook2,ComicBook comicBook3,ComicBook comicBook4,int cafeCash) {
		this.comicBook1 = comicBook1;
		this.comicBook2 = comicBook2;
		this.comicBook3 = comicBook3;
		this.comicBook4 = comicBook4;
		this.cafeCash = cafeCash;
		
	}
	
	public int getCAFE_RENTAL_CASH() {
		return this.CAFE_RENTAL_CASH;
	}
	
	public int getCafeCash() {
		return this.cafeCash;
	}
	
	public void printBooks() {
		System.out.println("<책 목록>");
		System.out.println("이름: "+this.comicBook1.getBookName()+" | 대여  상태: "+this.comicBook1.getRentalState());
		System.out.println("이름: "+this.comicBook2.getBookName()+" | 대여  상태: "+this.comicBook2.getRentalState());
		System.out.println("이름: "+this.comicBook3.getBookName()+" | 대여  상태: "+this.comicBook3.getRentalState());
		System.out.println("이름: "+this.comicBook4.getBookName()+" | 대여  상태: "+this.comicBook4.getRentalState());
		System.out.println(" ");
		System.out.println("======================================");
	}
	
	public void rentalBook(String comicbook) {
		if(comicbook == this.comicBook1.getBookName()) {
			if(!(this.comicBook1.getRentalState())) {
				this.comicBook1.setRentalState(true);
				this.cafeCash += this.getCAFE_RENTAL_CASH();
				System.out.println(this.comicBook1.getBookName()+"을 대여 하셨습니다. 대여비는 "+this.cafeCash+"원 입니다.");
			}else {
				System.out.println("("+this.comicBook1.getRentalState()+") 이미 대여 중인 책은 대여가 불가합니다. ");
			}
		}
		else if(comicbook == this.comicBook2.getBookName()) {
			if(!(this.comicBook2.getRentalState())) {
				this.comicBook2.setRentalState(true);
				this.cafeCash += this.getCAFE_RENTAL_CASH();
				System.out.println(this.comicBook2.getBookName()+"을 대여 하셨습니다. 대여비는 "+this.cafeCash+"원 입니다.");
			}else {
				System.out.println("("+this.comicBook2.getRentalState()+") 이미 대여 중인 책은 대여가 불가합니다. ");
			}
		}
		else if(comicbook == this.comicBook3.getBookName()) {
			if(!(this.comicBook3.getRentalState())) {
				this.comicBook3.setRentalState(true);
				this.cafeCash += this.getCAFE_RENTAL_CASH();
				System.out.println(this.comicBook3.getBookName()+"을 대여 하셨습니다. 대여비는 "+this.cafeCash+"원 입니다.");
			}else {
				System.out.println("("+this.comicBook3.getRentalState()+") 이미 대여 중인 책은 대여가 불가합니다. ");
			}
		}
		else if(comicbook == this.comicBook4.getBookName()) {
			if(!(this.comicBook4.getRentalState())) {
				this.comicBook4.setRentalState(true);
				this.cafeCash += this.getCAFE_RENTAL_CASH();
				System.out.println(this.comicBook4.getBookName()+"을 대여 하셨습니다. 대여비는 "+this.cafeCash+"원 입니다.");
			}else {
				System.out.println("("+this.comicBook4.getRentalState()+") 이미 대여 중인 책은 대여가 불가합니다. ");
			}
		} else {
			System.out.println("일치하는 책이 없습니다.");
		}
	}
	
	public void returnBook(String comicbook) {
		if(comicbook == this.comicBook1.getBookName()) {
			if(!(this.comicBook1.getRentalState())) {
				System.out.println(this.comicBook1.getBookName()+"는(은) 대여 중인 책이 아닙니다.");
			}else {
				this.comicBook1.setRentalState(false);
				System.out.println(this.comicBook1.getBookName()+"을 반납하셨습니다.");

			}
		}
		else if(comicbook == this.comicBook2.getBookName()) {
			if(!(this.comicBook2.getRentalState())) {
				System.out.println(this.comicBook2.getBookName()+"는(은) 대여 중인 책이 아닙니다.");
			}else {
				this.comicBook2.setRentalState(false);
				System.out.println(this.comicBook2.getBookName()+"을 반납하셨습니다.");

			}
		}
		else if(comicbook == this.comicBook3.getBookName()) {
			if(!(this.comicBook3.getRentalState())) {
				System.out.println(this.comicBook3.getBookName()+"는(은) 대여 중인 책이 아닙니다.");
			}else {
				this.comicBook3.setRentalState(false);
				System.out.println(this.comicBook3.getBookName()+"을 반납하셨습니다.");

			}
		}
		else if(comicbook == this.comicBook4.getBookName()) {
			if(!(this.comicBook4.getRentalState())) {
				System.out.println(this.comicBook4.getBookName()+"는(은) 대여 중인 책이 아닙니다.");
			}else {
				this.comicBook4.setRentalState(false);
				System.out.println(this.comicBook4.getBookName()+"을 반납하셨습니다.");
			}
		} else {
			System.out.println("일치하는 책이 없습니다.");
		}
	}
}
