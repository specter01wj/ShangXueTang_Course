package com.accenture.spm.oop;

public class TestInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
	
}

class Outer {
	
	private int age = 23;
	
	public void testOuter() {
		System.out.println("Test Outer!");
	}
	
	class Inner {
		int age = 34;
		public void show() {
			int age = 41;
			System.out.println("Show Outer age: " + Outer.this.age);
			System.out.println("Show Inner age: " + this.age);
			System.out.println("Show This age: " + age);
		}
	}
	
}
