package com.accenture.spm.commonclass;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		Date d1 = new Date(2000);
		
		System.out.println(d1);
		
		System.out.println(d1.getTime());
		
		Date d2 = new Date();
		System.out.println(d2.getTime());
		System.out.println(d2.after(d1));
		
		Date d3 = new Date(120, 2, 12);
		System.out.println(d3);
		
	}
	
}
