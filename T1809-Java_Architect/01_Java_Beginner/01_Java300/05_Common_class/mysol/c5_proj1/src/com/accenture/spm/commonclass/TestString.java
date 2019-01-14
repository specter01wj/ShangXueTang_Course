package com.accenture.spm.commonclass;

public class TestString {

	public static void main(String[] args) {
	
		String str1 = "abcdefg", str2 = str1.substring(2, 5);
		
		System.out.println(str1 + " / " + str2);
		
		String str3 = "WJ" + " LEE", str4 = "WJ LEE";
		System.out.println(str3 == str4);
		String str5 = "WJ", str6 = " LEE";
		System.out.println(str5 == str6);
		
	}
	
}
