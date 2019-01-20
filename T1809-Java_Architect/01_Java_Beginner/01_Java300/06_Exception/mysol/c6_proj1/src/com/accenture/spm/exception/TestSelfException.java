package com.accenture.spm.exception;

public class TestSelfException {

	public static void main(String[] args) {
		
		
		
	}
	
}

class Person {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

class IllegalAgeException extends RuntimeException {
	
	public IllegalAgeException() {
		
	}
	
	public IllegalAgeException(String msg) {
		super(msg);
	}
	
}
