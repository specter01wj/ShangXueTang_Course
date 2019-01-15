package com.accenture.spm.commonclass;


public class TestStringBuilder2 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
		for(int i = 0; i < 26; i++) {
			char temp = (char)('a' + i);
			sb1.append(temp);
		}
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.setCharAt(3, '&');
		System.out.println(sb1);
		sb1.insert(1, '+');
		System.out.println(sb1);
		sb1.delete(20, 23);
		System.out.println(sb1);
		
	}
	
}
