package com.accenture.spm.oop;

public class LocalInnerClass {

	public static void main(String[] args) {
		new LocalInnerClass().show();
	}
	
	public void show() {
		class Inner {
			public void fun() {
				System.out.println("Inner Fun!");
			}
		}
		new Inner().fun();
	}
	
}
