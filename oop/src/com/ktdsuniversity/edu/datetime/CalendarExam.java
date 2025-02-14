package com.ktdsuniversity.edu.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[]args) {
		Calendar nowCal = Calendar.getInstance();
		
		//캘린더는 현재 월보다 적게 나온다.
		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH)+1);
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowCal.get(Calendar.HOUR));
		System.out.println(nowCal.get(Calendar.MINUTE));
		System.out.println(nowCal.get(Calendar.SECOND));
		System.out.println(nowCal.get(Calendar.DAY_OF_WEEK));
		
		// 현재 연월일만 문자열로 가져오기.
		// 현재 날짜/시간
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
		// 날짜 포멧 지정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 날짜를 포멧에 맞춰 변경
		String formatDate = format.format(now);
		System.out.println(formatDate);
		Calendar nowCal2 = Calendar.getInstance();
		nowCal2.set(2022, 01, 01);
		
		nowCal2.add(Calendar.DAY_OF_MONTH,10);
		System.out.println(nowCal2.get(Calendar.YEAR)+"년 "+nowCal2.get(Calendar.MONTH)+"월 "+nowCal2.get(Calendar.DAY_OF_MONTH)+"일 ");
		
		nowCal2.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println(nowCal2.get(Calendar.YEAR)+"년 "+nowCal2.get(Calendar.MONTH)+"월 "+nowCal2.get(Calendar.DAY_OF_MONTH)+"일 ");


		
		
	}
}
