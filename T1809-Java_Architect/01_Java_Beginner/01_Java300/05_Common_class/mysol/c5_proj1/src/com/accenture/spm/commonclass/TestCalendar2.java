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
		
	}
	
}
