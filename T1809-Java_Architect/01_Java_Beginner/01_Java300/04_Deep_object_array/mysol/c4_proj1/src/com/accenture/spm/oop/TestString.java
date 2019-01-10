package com.accenture.spm.oop;

public class TestString {

	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("def");
		String str3 = "abc" + "defg";
		String str4 = "19" + 21;
		System.out.println("str4: " + str4);
		
		String str5 = "James";
		String str6 = "James";
		String str7 = new String("James");
		System.out.println("str5 =? str6: " + (str5 == str6));
		System.out.println("str6 =? str7: " + (str6 == str7));
		System.out.println("str6 equals str7: " + (str6.equals(str7)));
		
	}
	
}
