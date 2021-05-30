package com.research;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 *将日期改为当月的1号
 */
public class With {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now:"+now);
		//方法1
		LocalDate withDayOfMonth1 = now.withDayOfMonth(1);
		System.out.println("withDayOfMonth:"+withDayOfMonth1);
		//方法2
		LocalDate withDayOfMonth2 = now.with(ChronoField.DAY_OF_MONTH, 1);
		System.out.println("withDayOfMonth2:"+withDayOfMonth2);
		//方法3
		LocalDate withDayOfMonth3 = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("withDayOfMonth3:"+withDayOfMonth3);
		
	}

}
