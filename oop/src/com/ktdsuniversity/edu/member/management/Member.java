
// Member 클래스가 존재하는 폴더 경로.
package com.ktdsuniversity.edu.member.management;

public class Member {
	private String id;
	
	private String name;// default 접근제어지시자여서 다른 패키기와 클래스에서 사용할 수 없음.
	
	public Member(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public void hello() {
		System.out.println("Hi "+this.name);
	}
	public String getId() {
		return id;
	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
}
