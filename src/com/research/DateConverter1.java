package com.research;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateConverter1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("�ϰ汾date:"+date);
		//toInstant()��java8��date�����һ��������ר������������ת����
		Instant instant = date.toInstant();
		//������Ҫ���ʱ����Ϣ���ϰ汾û��ʱ����Ϣ
		ZonedDateTime atZone = instant.atZone(ZoneId.systemDefault());
		LocalDate localDate = atZone.toLocalDate();
		System.out.println("java�汾date:"+localDate);
	}

}
