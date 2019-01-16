package com.accenture.spm.commonclass;

import java.util.Calendar;
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
		cal2.add(Calendar.DATE, 100);
		System.out.println(cal3);
		
	}
	
}
