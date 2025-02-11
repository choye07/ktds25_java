package com.ktdsuniversity.edu.errorhandle.customexceptions;

public class Main {
	
	public static void registNewMember(String id, String password) {
		if(id == null || id.isEmpty()) {
			throw new InvalidUserIdException("아이디는 필수 입력값입니다. 올바르게 입력해주세요.");
//			System.out.println("아이디는 필수 입력값입니다. 올바르게 입력해주세요.");
		}else if( id.equals("admin")) {
//			System.out.println("admin은 사용할 수 없습니다. 다른 아이디를 사용해주세요.");
			throw new InvalidUserIdException("admin은 사용할 수 없습니다. 다른 아이디를 사용해주세요.");
		}
//		else {
//			System.out.printf("아이디는 %s, 비밀번호:%s: 가입이 완료되었습니다.\n", id, password);
//		}
	}
	public static void main(String[]args) {
		
		try {
			registNewMember(null,"asdjfldksjfldkjfs");			
		}catch(InvalidUserIdException iuie) {
			System.out.println("실패 사유: "+ iuie.getMessage());
		}
		
		try {
			registNewMember("","asdjfldksjfldkjfs");
		}catch(InvalidUserIdException iuie) {
			System.out.println("실패 사유: "+ iuie.getMessage());
		}

		try {
			registNewMember("admin","asdjfldksjfldkjfs");
		}catch(InvalidUserIdException iuie) {
			System.out.println("실패 사유: "+ iuie.getMessage());
		}
		
		try {
			registNewMember("sdfjsdkfsljf","asdjfldksjfldkjfs");
		}catch(InvalidUserIdException iuie) {
			System.out.println("실패 사유: "+ iuie.getMessage());
		}
		
		
//		InvalidUserIdException iuie = new InvalidUserIdException("사용할 수  없는 아이디입니다. 다른 아이디를 사용해주세요.");
//
//		//일반 클래스와 다른 점: RuntiemException을 상속했다.
//		System.out.println(iuie.getMessage());
//		
////		Exception in thread "main" java.lang.NumberFormatException: For input string: "asldkjflasdkjfsla"
////		Integer.parseInt("asldkjflasdkjfsla");
//		
//		// RuntimeException을 상속했을 때 할 수 있는 것?
//		// iuie 예외를 던져서 애플리케이션을 강제로 죽일 수 있다.
////		throw iuie;
//		throw new InvalidUserIdException ("메시지 메시지 메시지");
//		
//		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: Unreachable code
//		//throw가 던져지면 애플리케이션이 종료 되기 때문에 deadcode'
	}
}
