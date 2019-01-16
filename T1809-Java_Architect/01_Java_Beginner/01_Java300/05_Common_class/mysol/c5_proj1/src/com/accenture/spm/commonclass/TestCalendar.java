package com.accenture.spm.commonclass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal1 = new GregorianCalendar(2020, 10, 12, 21, 11, 35);
		int year1 = cal1.get(Calendar.YEAR);
		int month1 = cal1.get(Calendar.MONTH);
		int day1 = cal1.get(Calendar.DATE);
		int weekday1 = cal1.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year1 + " / " + month1 + " / " + weekday1 + " / " + day1);
	
		Calendar cal2 = new GregorianCalendar();
		cal2.set(Calendar.YEAR, 2023);
		System.out.println(cal2);
		
		Calendar cal3 = new GregorianCalendar();
		cal3.add(Calendar.DATE, 100);
		System.out.println(cal3);
		
		Date date4 = cal3.getTime();
		Calendar cal4 = new GregorianCalendar();
		cal4.setTime(new Date());
		System.out.println(date4 + " / " + cal4);
		
		printCalendar(cal4);
	}
	
	public static void printCalendar(Calendar c) {
		
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH)+1;
		int day1 = c.get(Calendar.DAY_OF_MONTH);
		int weekday1 = c.get(Calendar.DAY_OF_WEEK);
		String dayweek = weekday1 == 0 ? "day" : weekday1 + "";
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year1 + " year," + month1 + " month," + day1 + " day," +
				hour + " hour," + minute + " min," + second + " sec. " + "Week of " + dayweek);
	}
	
}
