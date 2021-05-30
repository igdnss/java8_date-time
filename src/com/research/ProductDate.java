package com.research;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ProductDate {
	public static void main(String[] args) {
		//当前日期
		Date currentDate = new Date();
		//将日期转为long,方便计算（以格林维治为基础）
		long currentTime = currentDate.getTime();
		
		//定义商品生产日期
		Calendar productDate1 = Calendar.getInstance();
		//calendar中月份从0开始的，所以10月对应的应该是9，炸了。。。
		productDate1.set(2019, 9, 12);
		//将calendar 转换为date
		Date productDateFinal = productDate1.getTime();
		long productDateFinalTime = productDateFinal.getTime();
		//计算相隔的天数，算了算去，结果还不知道对不对。又炸一次
		long intervalDay1 = (currentTime-productDateFinalTime)/1000/60/60/24;
		System.out.println("老版本实现商品距离今日有："+intervalDay1+"天");
		
		//java8 实现,一行代码
		long intervalDay2 = ChronoUnit.DAYS.between(LocalDate.of(2019, 10, 12), LocalDate.now());
		System.out.println("java8实现商品距离今日有："+intervalDay2+"天");
	}
}
