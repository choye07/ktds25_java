package com.ktdsuniversity.edu.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam {
	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);

		LocalTime nowTime2 = LocalTime.of(00, 00, 01);
		nowTime2 = nowTime2.plusHours(10);
		nowTime2 = nowTime2.plusMinutes(5);
		nowTime2 = nowTime2.plusSeconds(55);
		DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime2 = timeFormatter2.format(nowTime2);
		System.out.println(nowTime2);
		System.out.println(strNowTime2);
	}
}
