package com.research;

import java.time.LocalTime;

public class PlusTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(11, 49, 11, 500);
		System.out.println("localTime : "+localTime);
		//增加100纳秒
		LocalTime plus100Nanos = localTime.plusNanos(100);
		System.out.println("plus100Nanos : "+plus100Nanos);
		//增加9秒
		LocalTime plus9Seconds = localTime.plusSeconds(9);
		System.out.println("plus9Seconds : "+plus9Seconds);
		//增加1分钟
		LocalTime plusMinutes = localTime.plusMinutes(1);
		System.out.println("plusMinutes : "+plusMinutes);
		//增加1小时
		LocalTime plus1Hours = localTime.plusHours(1);
		System.out.println("plus1Hours : "+plus1Hours);
		//增加1小时1分钟
		LocalTime plus1Hour1Minute = localTime.plusHours(1).plusMinutes(1);
		System.out.println("plus1Hour1Minute : "+plus1Hour1Minute);

	}

}
