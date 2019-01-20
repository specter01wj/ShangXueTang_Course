package com.accenture.spm.exception;

public class TestSelfException {

	public static void main(String[] args) throws IllegalAgeException {
		
		Person p = new Person();
		p.setAge(-10);
		
	}
	
}

class Person {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException {
		if(age < 0) {
			throw new IllegalAgeException("Age cannot be negative!");
		}
		
		this.age = age;
	}
	
	
	
}

//class IllegalAgeException extends RuntimeException {
class IllegalAgeException extends Exception {
	
	public IllegalAgeException() {
		
	}
	
	public IllegalAgeException(String msg) {
		super(msg);
	}
	
}
