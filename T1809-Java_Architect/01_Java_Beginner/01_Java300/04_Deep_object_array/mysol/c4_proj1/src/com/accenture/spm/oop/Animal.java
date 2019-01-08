package com.accenture.spm.oop;

public abstract class Animal {

	abstract public void shout();
	
	public void run() {
		System.out.println("Run!");
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.shout();
	}
	
}

class Dog extends Animal {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("Wooo!");
	}
	
}
