package com.research;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatAndParse {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now:"+now);
		//DateTimeFormatterr�ṩ�˺ܶ��ʽ������ʹ����õ�
		String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("format1:"+format1);
		String format2 = now.format(DateTimeFormatter.ISO_DATE);
		System.out.println("format2:"+format2);
		//ʹ��FormatStyle��ʽ��
		DateTimeFormatter formatStyle1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("formatStyle1:"+now.format(formatStyle1));
		DateTimeFormatter formatStyle2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("formatStyle2:"+now.format(formatStyle2));
		//ʹ��DateTimeFormatter.ofPattern()�Զ����ʽ,��ʽ����д����SimpleDateFormatһ��
		DateTimeFormatter formatStyle3 = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
		System.out.println("formatStyle3:"+now.format(formatStyle3));
		//��һ���ַ���ת��ΪLocalDateTime
		LocalDateTime parseTime = LocalDateTime.parse(format1);
		System.out.println("parsetime:"+parseTime);
		
	}

}
