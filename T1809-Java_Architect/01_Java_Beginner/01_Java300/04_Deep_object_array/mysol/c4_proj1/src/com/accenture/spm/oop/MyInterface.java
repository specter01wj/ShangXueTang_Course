package com.accenture.spm.oop;

public interface MyInterface {

	/*public static final*/ int MAX_AGE = 100;
	
	/*public abstract*/ void test01();
	
}


class MyClass implements MyInterface {

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("My Interface!");
		System.out.println(MAX_AGE);
	}
	
}