package com.ktdsuniversity.edu.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExam {
	public static void main(String[]args) {

		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate);
		System.out.println(strNowDate);
	}
}
