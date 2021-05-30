package com.research;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateConverter2 {

	public static void main(String[] args) {
		//sql.Date直接转换为LocalDate
		Date sqlDate1 = new Date(System.currentTimeMillis());
		System.out.println("sql date : "+sqlDate1);
		LocalDate localDate1 = sqlDate1.toLocalDate();
		System.out.println("localDate1："+localDate1);
		//sql.Timestamp 转换为LocalDateTime
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println("sql timestamp:"+timeStamp);
		LocalDateTime localDateTime = timeStamp.toLocalDateTime();
		System.out.println("localDatetime:"+localDateTime);
		
		//将util.Date转换为sql.Date，再转换为LocalDate
		java.util.Date date2 = new java.util.Date();
		System.out.println("date2:"+date2);
		Date sqlDate2 = new Date(date2.getTime());
		System.out.println("sqlDate2:"+sqlDate2);
		LocalDate localDate2 = sqlDate2.toLocalDate();
		System.out.println("localDate2:"+localDate2);
		
	}

}
