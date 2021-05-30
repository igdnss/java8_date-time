package com.research;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateThreadSafe {

	final static SimpleDateFormat TEST = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

	public static void main(String[] args) {
		// 20个线程，创建日期
		for (int i = 0; i < 20; i++) {
			Runnable runnable = () -> {
				Date date = null;
				try {
					date = TEST.parse("2020-11-11 10:10:10");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				System.out.println(date);
			};

			new Thread(runnable).start();
		}

	}

}
