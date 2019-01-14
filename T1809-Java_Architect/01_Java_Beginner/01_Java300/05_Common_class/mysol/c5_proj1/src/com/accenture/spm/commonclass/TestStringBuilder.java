package com.accenture.spm.commonclass;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb1.hashCode()));
		System.out.println(sb1);
		
		sb1.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(sb1.hashCode()));
		System.out.println(sb1);
		
	}
	
}
