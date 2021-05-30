package com.research;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NowExample1 {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("instant:"+instant);
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate:"+localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime:"+localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime:"+localDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime:"+zonedDateTime);
		
	}

}
