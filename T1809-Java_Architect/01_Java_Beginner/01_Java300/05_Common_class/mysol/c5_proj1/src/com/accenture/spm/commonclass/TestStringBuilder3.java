package com.accenture.spm.commonclass;

public class TestStringBuilder3 {

	public static void main(String[] args) {
		
		String str1 = "";
		long num1 = Runtime.getRuntime().freeMemory();
		long time1 = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
			str1 += i;
		}
		System.out.println("CPU Memory: " + (num1));
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
		System.out.println("String Memory: " + (num1 - num2));
		System.out.println("String Time: " + (time2 - time1));
		
		StringBuilder sb1 = new StringBuilder("");
		long num3 = Runtime.getRuntime().freeMemory();
		long time3 = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
			sb1.append(i);
		}
		System.out.println("CPU Memory: " + (num3));
		long num4 = Runtime.getRuntime().freeMemory();
		long time4 = System.currentTimeMillis();
		System.out.println("StringBuilder Memory: " + (num3 - num4));
		System.out.println("StringBuilder Time: " + (time4 - time3));
		
	}
	
}
