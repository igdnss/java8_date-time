package com.research;

import java.time.LocalDate;
import java.time.Period;

public class Plus1 {
	public static void main(String[] args) {
		//�ڵ�ǰʱ��Ļ����ϼ�1����������3��
		LocalDate now = LocalDate.now();
		System.out.println("now:"+now);
		//����1
		LocalDate plusPeriod1 = now.plusYears(1).plusMonths(2).plusDays(3);
		System.out.println("plusPeriod1: " +plusPeriod1);
		//����2
		Period period = Period.of(1, 2, 3);
		LocalDate plusPeriod2 = now.plus(period);
		System.out.println("plusPeriod2: " +plusPeriod2);
	}
}
