package com.accenture.spm.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar2 {

	public static void main(String[] args) throws ParseException {
	
		String str1 = "2020-10-23";
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = df1.parse(str1);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(date1);
		
		System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
		
		cal1.set(Calendar.DAY_OF_MONTH, 1);
		
		for(int i = 1; i <= 31; i++) {
			System.out.print(cal1.get(Calendar.DAY_OF_MONTH) + "\t");
			cal1.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
}
