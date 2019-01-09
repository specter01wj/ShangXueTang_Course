package com.accenture.spm.oop;

public class TestAnonymousInnerClass {

	public static void main(String[] args) {
		TestAnonymousInnerClass.test01(new AA(){

			@Override
			public void aa() {
				// TODO Auto-generated method stub
				System.out.println("Show Anonymous Class!");
			}
			
		});
	}
	
	public static void test01(AA a) {
		a.aa();
	}
	
}

interface AA {
	void aa();
}
