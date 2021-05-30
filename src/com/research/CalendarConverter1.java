package com.research;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarConverter1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("calendar:"+calendar);
		TimeZone timeZone = calendar.getTimeZone();
		ZoneId zoneId = timeZone.toZoneId();
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(calendar.toInstant(), zoneId);
		System.out.println("zonedDateTime:"+zonedDateTime);
	}

}
