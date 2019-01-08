package com.accenture.spm.oop;

public class TestInterface {

	public static void main(String[] args) {
		
		Angel v1 = new Angel();
		v1.helpOther();
		
		GoodMan m1 = new GoodMan();
		m1.helpOther();
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

class GoodMan implements Honest {

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("Help man!");
	}
	
}

class BirdMan implements Volant {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly man!");
	}
	
}
