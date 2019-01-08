package com.accenture.spm.oop;

public class TestInterface {

	public static void main(String[] args) {
		
		
		
	}
	
}


interface Volant {
	int FLY_HEIGHT = 1000;
	void fly();
}

interface Honest {
	void helpOther();
}

class Angel implements Volant, Honest {

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("Help!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly!");
	}
	
}
