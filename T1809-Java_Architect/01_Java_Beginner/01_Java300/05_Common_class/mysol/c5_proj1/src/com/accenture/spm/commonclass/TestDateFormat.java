package com.accenture.spm.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) throws ParseException {
		
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String str1 = df1.format(new Date(400000000));
		
		System.out.println(str1);
		
		DateFormat df2 = new SimpleDateFormat("MM-dd-yy hh:mm:ss");
		Date date = df2.parse("05-14-98 23:12:33");
		System.out.println(date);
	}
	
}
