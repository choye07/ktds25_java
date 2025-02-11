package com.ktdsuniversity.edu.errorhandle;

import com.ktdsuniversity.edu.fruitseller.FruitSeller;

public class HandleExceptionType {
	
	
	public static void loadClass(String classPath) {
		
		try {			
			Class loadedClass = Class.forName(classPath);// 동적으로 사용하고 싶을 때, 클래스 path를 인스턴스로 주면 동적 코드가 아님.(?)                                     
			System.out.println(loadedClass);
			System.out.println(FruitSeller.class);
		}catch (ClassNotFoundException cnfe ){
			// classPath가 존재하지 않는 클래스일 때 던져진 예외
			// 존재하지 않는 클래스를 로딩하려 했을 때 우리는 무엇을 해줘야 하는가?
			// 명시.
			System.out.println("Error Message: "+cnfe.getMessage()); // 에러가 발생할 때까지 진행된 콜 스택을 출력.
			cnfe.printStackTrace();
			return;
			/**
			 * Error Message: com.ktdsuniversity.edu.frutseller.FruitSeller2
				java.lang.ClassNotFoundException: com.ktdsuniversity.edu.frutseller.FruitSeller2
					at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
					at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
					at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:528)
					at java.base/java.lang.Class.forName0(Native Method)
					at java.base/java.lang.Class.forName(Class.java:462)
					at java.base/java.lang.Class.forName(Class.java:453)
					at com.ktdsuniversity.edu.errorhandle.HandleExceptionType.loadClass(HandleExceptionType.java:9)
					at com.ktdsuniversity.edu.errorhandle.HandleExceptionType.main(HandleExceptionType.java:36)
			 */
		}
		
		
	}
	
	public static void main(String[]args) {
		loadClass("com.ktdsuniversity.edu.fruitseller.FruitSeller");
	}
	
}
