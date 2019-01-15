package com.accenture.spm.commonclass;


public class TestStringBuilder2 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
		for(int i = 0; i < 26; i++) {
			char temp = (char)('a' + i);
			sb1.append(temp);
		}
		System.out.println(sb1);
		
	}
	
}
