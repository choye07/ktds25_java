package com.ktdsuniversity.edu.inheritance;

public class CotactMain {
	public static void main(String[]args) {
		
		Contact contact1 = new EmailContact("최예진","010-1111-2222","gmail@gmail.com");
		Contact contact2 = new EmailContact("최예진","010-1111-2222","gmail@gmail.com");
		
//		메모리 주소가 아닌 안에 들어있는 값을 출력했으면 좋겠다.
		//tostring을 쓸 수 있는 이유는 Object를 상속 받고 있기 때문에.
		System.out.println(contact1); 
		System.out.println(contact2);
		//toString()을 오버라이딩을 했기 때문에 contact2.toString()을 하지 않아도
		//원하는 값을 출력할 수 있음.
		
		System.out.println(contact1 == contact2); // 메모리주소 비교
		System.out.println(contact1.equals(contact2)); //값 비교
		
		// false를 true로 바꾸려면 contact에 equals 메소드를 오버라이딩 해야한다.
		
//		contact1.printContact();
//		contact2.printContact();
//		
//		EmailContact emailContact1 = new EmailContact("친구1","010-2222-3333","friends1@gmail.com");
//		EmailContact emailContact2 = new EmailContact("친구2","010-4444-5555","friends2@gmail.com");
//		
//		emailContact1.printContact();
//		emailContact2.printContact();
//		
//		System.out.println(emailContact1.getName());
//		System.out.println(emailContact1.getPhone());
//		System.out.println(emailContact1.getEmail());
	}

}
