package com.ktdsuniversity.edu.inheritance;

public class EmailContact extends Contact {
	
	private String email;
	
	public EmailContact(String name, String phone, String email) {
		super(name, phone);
		this.email= email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public void printContact() {
		System.out.println("=========emailContact printContact=========");
		super.printContact();
		System.out.println("이메일: "+ this.email);
	}
	
	@Override
	public boolean equals(Object obj) {
		//파라미터가 object라면 뭐든 들어올 수 있다.
		if(obj instanceof Contact other) {		
			boolean isEquals = super.getName().equals(other.getName());
			isEquals &= super.getPhone().equals(other.getPhone());
			if(other instanceof EmailContact emailother) {				
				isEquals &= this.email.equals(emailother.getEmail());
			}
			return isEquals;
		}
		
		return super.equals(obj);//object에서 가져옴.
	}
	@Override
	public String toString() {
		return "이름: " + super.getPhone() + ", 연락처: " 
		+ super.getPhone()+" 이메일: "+this.email;
	}
}
