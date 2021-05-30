package com.research;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateConverter1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("老版本date:"+date);
		//toInstant()是java8向date中添加一个方法，专门用来做日期转换的
		Instant instant = date.toInstant();
		//这里需要添加时区信息，老版本没有时区信息
		ZonedDateTime atZone = instant.atZone(ZoneId.systemDefault());
		LocalDate localDate = atZone.toLocalDate();
		System.out.println("java版本date:"+localDate);
	}

}
