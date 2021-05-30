package com.research;

import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class NowExample2 {
	public static void main(String[] args) {
		Year year = Year.now();
		System.out.println("year:"+year);
		YearMonth yearMonth = YearMonth.now();
		System.out.println("yearMonth:"+yearMonth);
		MonthDay monthDay = MonthDay.now();
		System.out.println("monthDay:"+monthDay);
	}
}
