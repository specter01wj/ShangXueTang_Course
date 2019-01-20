package com.accenture.spm.exception;

public class TestSelfException {

	public static void main(String[] args) {
		
		
		
	}
	
}

class IllegalAgeException extends RuntimeException {
	
	public IllegalAgeException() {
		
	}
	
	public IllegalAgeException(String msg) {
		super(msg);
	}
	
}
