package com.research;

import java.time.LocalDate;
import java.time.Month;

public class PlusDate {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2025, Month.JUNE, 1);
		System.out.println("localDate : "+localDate);
		 //增加5天
		 LocalDate localDatePlus5Days = localDate.plusDays(5); 
		 System.out.println("localDatePlus5Days : "+localDatePlus5Days);
		 //增加1周
		 LocalDate localDatePlus1Week = localDate.plusWeeks(1);
		 System.out.println("localDatePlus1Week : "+localDatePlus1Week );
		 //增加1月
		 LocalDate localDatePlus1Month = localDate.plusMonths(1);
		 System.out.println("localDatePlus1Month : "+localDatePlus1Month );
		 //增加1年
		 LocalDate localDatePlus1Year = localDate.plusYears(1);
		 System.out.println("localDatePlus1Year : "+localDatePlus1Year);
		//增加1年1个月
		 LocalDate localDatePlus1YearAnd1Month = localDate.plusYears(1).plusMonths(1);
		 System.out.println("localDatePlus1Year : "+localDatePlus1YearAnd1Month);
	}

}
