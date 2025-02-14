package com.ktdsuniversity.edu.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {
	public static void main(String[] args) {

		LocalDateTime nowDateTime = LocalDateTime.of(2022, 2, 1, 11, 39, 11);
		nowDateTime = nowDateTime.plusYears(3);
		nowDateTime = nowDateTime.plusMonths(2);
		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusHours(10);
		nowDateTime = nowDateTime.plusMinutes(5);
		nowDateTime = nowDateTime.plusSeconds(55);
		DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:ss");
		String strNowDateTime = dateTimeformatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 5, 20);
		Period between = Period.between(startDate, endDate);
		System.out.println(between.getYears() +", "+between.getMonths()+", "+between.getDays());
	}
}
