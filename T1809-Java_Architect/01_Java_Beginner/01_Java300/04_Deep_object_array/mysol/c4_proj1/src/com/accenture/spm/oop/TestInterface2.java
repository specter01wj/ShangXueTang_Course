package com.accenture.spm.oop;

public class TestInterface2 {

	public static void main(String[] args) {
		
		MySubClass ms1 = new MySubClass();
		ms1.testb();
		
	}
	
	
}


interface A {
	void testa();
}

interface B {
	void testb();
}

interface C extends A, B {
	void testc();
}

class MySubClass implements C {

	@Override
	public void testa() {
		// TODO Auto-generated method stub
		System.out.println("Test A!");
	}

	@Override
	public void testb() {
		// TODO Auto-generated method stub
		System.out.println("Test B!");
	}

	@Override
	public void testc() {
		// TODO Auto-generated method stub
		System.out.println("Test C!");
	}
	
}
