package com.accenture.spm.commonclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) {
		
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String str1 = df1.format(new Date(400000000));
		
		System.out.println(str1);
	}
	
}
