package com.accenture.spm.commonclass;

public class TestWrappedClass {

	public static void main(String[] args) {
		
		Integer a1 = new Integer(3);
		Integer b1 = Integer.valueOf(30);
		
		int c1 = b1.intValue();
		double d1 = b1.doubleValue();
		
		Integer e1 = new Integer("9889");
		Integer f1 = Integer.parseInt("88993");
		
		System.out.println("Result: ");
	}
	
}
