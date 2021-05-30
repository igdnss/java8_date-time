package com.research;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OfExample1 {

	public static void main(String[] args) {
		// ����ָ����LocalDate����-- 2025-06-01
		LocalDate localDate = LocalDate.of(2025, 06, 01);
		System.out.println("localDate:"+localDate);
		//����ָ����LocalTime����--17:00
		LocalTime localTime = LocalTime.of(17, 0);//������������ʽ�����������Լ�����
		System.out.println(localTime);
		//��һ�ַ���������ָ����LocalDateTime����--2025-06-01 17:00
		LocalDateTime localDateTime1 = LocalDateTime.of(2025, 06, 01, 17, 0);
		System.out.println("localDateTime1:"+localDateTime1);
		//�ڶ��ַ���������ָ����LocalDateTime����--2025-06-01 17:00
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime2:"+localDateTime2);
		//ΪLocalDateTime���ʱ��
		ZonedDateTime atZone = localDateTime2.atZone(ZoneId.of("Asia/Shanghai"));//zoneId����ͨ��ZoneId.getAvailableZoneIds()��ȡ
		System.out.println("atZone: "+atZone);		
	}
}
