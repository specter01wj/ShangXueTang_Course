package com.accenture.spm.ioprocess;

public class IOProcessDecorateCoffee {

	public static void main(String[] args) {
		
		
		
	}
	
}

interface Drink {
	double cost();
	String info();
}

class Coffee implements Drink {
	private String name = "Mocha";
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 12.5;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
