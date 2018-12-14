package com.accenture.spm.oo2;

import static java.lang.Math.PI;

public class Person1 {

	String name;
	int height;
	
	public void rest() {
		System.out.println("Rest for 2 hours!");
	}
	
}

class Student extends Person1 {
	String major;
	
	public void study() {
		System.out.println("Study for 2 hours!");
	}
	
}
