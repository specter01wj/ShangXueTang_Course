package com.accenture.spm.commonclass;

public class TestAutoBox {

	public static void main(String[] args) {
		
		Integer a1 = 234;
		Integer a2 = Integer.valueOf(234);
		
		int b1 = a1;
		int b2 = a1.intValue();
		
		//Integer in1 = -128;
		Integer in1 = Integer.valueOf(-128);
		Integer in2 = -128;
		System.out.println(in1 == in2);
		System.out.println(in1.equals(in2));
		
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.println(in3 == in4);
		System.out.println(in3.equals(in4));
		
	}
	
}
