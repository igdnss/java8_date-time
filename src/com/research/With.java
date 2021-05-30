package com.research;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 *�����ڸ�Ϊ���µ�1��
 */
public class With {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now:"+now);
		//����1
		LocalDate withDayOfMonth1 = now.withDayOfMonth(1);
		System.out.println("withDayOfMonth:"+withDayOfMonth1);
		//����2
		LocalDate withDayOfMonth2 = now.with(ChronoField.DAY_OF_MONTH, 1);
		System.out.println("withDayOfMonth2:"+withDayOfMonth2);
		//����3
		LocalDate withDayOfMonth3 = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("withDayOfMonth3:"+withDayOfMonth3);
		
	}

}
