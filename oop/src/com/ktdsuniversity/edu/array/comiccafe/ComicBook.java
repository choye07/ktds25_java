package com.ktdsuniversity.edu.array.comiccafe;

public class ComicBook {
	/**
	 * 만화책 이름
	 */
	private String bookName;
	
	/**
	 * 만화책 대여 상태  true: 대여, false: 대여X
	 */
	private Boolean rentalState;
	
	
	public ComicBook(String bookName, boolean rentalState) {
		this.bookName = bookName;
		this.rentalState=rentalState;
		
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public Boolean getRentalState() {
		return this.rentalState;
	}
	
	public void  setRentalState(boolean rentalState) {
		this.rentalState=rentalState;
	}

}
