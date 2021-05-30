package com.research;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatAndParse {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now:"+now);
		//DateTimeFormatterr提供了很多格式，这里使用最常用的
		String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("format1:"+format1);
		String format2 = now.format(DateTimeFormatter.ISO_DATE);
		System.out.println("format2:"+format2);
		//使用FormatStyle格式化
		DateTimeFormatter formatStyle1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("formatStyle1:"+now.format(formatStyle1));
		DateTimeFormatter formatStyle2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("formatStyle2:"+now.format(formatStyle2));
		//使用DateTimeFormatter.ofPattern()自定义格式,格式化的写法与SimpleDateFormat一样
		DateTimeFormatter formatStyle3 = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
		System.out.println("formatStyle3:"+now.format(formatStyle3));
		//将一个字符串转换为LocalDateTime
		LocalDateTime parseTime = LocalDateTime.parse(format1);
		System.out.println("parsetime:"+parseTime);
		
	}

}
