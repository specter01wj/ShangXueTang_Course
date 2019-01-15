package com.accenture.spm.commonclass;

public class TestStringBuilder3 {

	public static void main(String[] args) {
		
		String str1 = "";
		long num1 = Runtime.getRuntime().freeMemory();
		long time1 = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++) {
			str1 += i;
		}
		
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
		System.out.println("String Memory: " + (num1 - num2));
		System.out.println("String Time: " + (time2 - time1));
		
	}
	
}
