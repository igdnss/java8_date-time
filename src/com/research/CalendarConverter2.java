package com.research;

import java.time.LocalDateTime;
import java.util.Calendar;

public class CalendarConverter2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		//Calendar中month从0开始，所以需要加1
		LocalDateTime localDateTime = LocalDateTime.of(year,month+1, day, hour, min,seconds);
		System.out.println("localDateTime:"+localDateTime);
	}

}
