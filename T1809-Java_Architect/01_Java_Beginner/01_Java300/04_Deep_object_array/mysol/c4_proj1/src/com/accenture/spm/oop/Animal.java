package com.accenture.spm.oop;

public abstract class Animal {

	abstract public void shout();
	
	public void run() {
		System.out.println("Run!");
	}
	
}

class Dog extends Animal {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		
	}
	
}
