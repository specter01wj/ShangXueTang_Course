package com.accenture.spm.oop;

public class TestString2 {

	public static void main(String[] args) {
		
		String s1 = "core Java", s2 = "Core Java";
		
		System.out.println(s1.charAt(3));
		System.out.println(s2.length());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("apple"));
		
		String s = s1.replace(' ', '$');
		System.out.println(s);
		
		
		String s3 = "", s4 = "How are you?";
		System.out.println(s4.startsWith("How"));
		System.out.println(s4.endsWith("?"));
		
		
	}
	
}
