package com.accenture.spm.oop;

public class TestStaticInnerClass {

	public static void main(String[] args) {
		Outer2.Inner2 inner2 = new Outer2.Inner2();
		inner2.show();
	}
	
}

class Outer2 {
	private int age = 23;
	
	static class Inner2 {
		int age = 34;
		public void show() {
			int age = 41;
			//System.out.println("Show Outer age: " + Outer2.this.age);
			System.out.println("Show Inner age: " + this.age);
			System.out.println("Show This age: " + age);
		}
	}
	
}
