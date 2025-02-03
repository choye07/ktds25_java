
// Member 클래스가 존재하는 폴더 경로.
package com.ktdsuniversity.edu.member.management;

public class Member {
	/**
	 * 아이디
	 */
	private String id;
	/**
	 * 이름
	 * default 접근제어지시자여서 다른 패키기와 클래스에서 사용할 수 없음.
	 */
	private String name;

	/**
	 * 생성자
	 * @param id 아이디
	 * @param name 이름
	 */
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 인사하는 메소드
	 */
	public void hello() {
		System.out.println("Hi " + this.name);
	}
	
	/**
	 * id getter
	 * @return
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * name getter
	 * @return
	 */
	public String getName() {
		return this.name;
	}

}
