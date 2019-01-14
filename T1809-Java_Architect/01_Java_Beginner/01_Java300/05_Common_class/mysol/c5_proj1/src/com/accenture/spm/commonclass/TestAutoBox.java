package com.accenture.spm.commonclass;

public class TestAutoBox {

	public static void main(String[] args) {
		
		Integer a1 = 234;
		Integer a2 = Integer.valueOf(234);
		
		int b1 = a1;
		int b2 = a1.intValue();
		
	}
	
}
