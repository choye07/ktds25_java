package com.ktdsuniversity.edu.bbs.management;

import java.util.Scanner;

import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	/**
	 * Member 클래스를 멤버변수로 선언.
	 */
	private Member author;
	/**
	 * Aticle 멤버변수 제목
	 */
	private String title;
	/**
	 * 생성자
	 * @param author
	 * @param title
	 */
	public Article(Member author, String title) {
		this.author = author;
		this.title=title;
	}
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String id= keyboard.next();
		String name = keyboard.next();
		String title = keyboard.next();
		
		
		Member member = new Member(id,name);
		Article notice = new Article(member,title);
		
		System.out.println("게시글 제목: "+notice.title);
		System.out.println("작성자 아이디: "+ notice.author.getId());
		System.out.println("작성자: "+ notice.author.getName());
		

		
	}
}
