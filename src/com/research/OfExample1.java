package com.research;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OfExample1 {

	public static void main(String[] args) {
		// 创建指定的LocalDate对象-- 2025-06-01
		LocalDate localDate = LocalDate.of(2025, 06, 01);
		System.out.println("localDate:"+localDate);
		//创建指定的LocalTime对象--17:00
		LocalTime localTime = LocalTime.of(17, 0);//还有其它的形式，读都可以自己试试
		System.out.println(localTime);
		//第一种方法，创建指定的LocalDateTime对象--2025-06-01 17:00
		LocalDateTime localDateTime1 = LocalDateTime.of(2025, 06, 01, 17, 0);
		System.out.println("localDateTime1:"+localDateTime1);
		//第二种方法，创建指定的LocalDateTime对象--2025-06-01 17:00
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime2:"+localDateTime2);
		//为LocalDateTime添加时区
		ZonedDateTime atZone = localDateTime2.atZone(ZoneId.of("Asia/Shanghai"));//zoneId可以通过ZoneId.getAvailableZoneIds()获取
		System.out.println("atZone: "+atZone);		
	}
}
