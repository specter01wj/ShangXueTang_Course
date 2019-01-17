package com.accenture.spm.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar3 {

	public static void main(String[] args) throws ParseException {
		
		String str1 = "2019-01-23";
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = df1.parse(str1);
		Calendar cal1 = new GregorianCalendar();
		//cal1.setTime(date1);
		
		int today = cal1.get(Calendar.DAY_OF_MONTH);
		System.out.print("Today: " + today + "\n");
		
		System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
		
		cal1.set(Calendar.DAY_OF_MONTH, 1);
		
		for(int i = 0; i < cal1.get(Calendar.DAY_OF_WEEK)-1; i++) {
			System.out.print("\t");
		}
		
		int maxDay = cal1.getActualMaximum(Calendar.DATE);
		
		for(int i = 1; i <= maxDay; i++) {
			if( today == cal1.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(cal1.get(Calendar.DAY_OF_MONTH) + "*\t");
			} else {
				System.out.print(cal1.get(Calendar.DAY_OF_MONTH) + "\t");
			}
			
			if(cal1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println();
			}
			cal1.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
}
