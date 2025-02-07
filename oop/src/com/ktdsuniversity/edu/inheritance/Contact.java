package com.ktdsuniversity.edu.inheritance;

public class Contact {
	private String name;
	private String phone;

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void printContact() {
		System.out.println("=========Contact printContact=========");
		System.out.println("이름: " + this.name + ", 연락처: " + this.phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		//파라미터가 object라면 뭐든 들어올 수 있다.
		if(obj instanceof Contact other) {		
			boolean isEquals = this.name.equals(other.getName());
			isEquals = this.phone.equals(other.getPhone());
			return isEquals;
		}
		
		return super.equals(obj);//object에서 가져옴.
	}
	@Override
	public String toString() {
		
		return "이름: " + this.name + ", 연락처: " + this.phone;
	}
}
