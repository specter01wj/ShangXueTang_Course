package com.accenture.spm.ioprocess;

public class IOProcessDecorateCoffee {

	public static void main(String[] args) {
		
		Drink coffee = new Coffee();
		Drink sugar = new Sugar(coffee);
		System.out.println(sugar.info() + "--->" + sugar.cost());
		
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

abstract class Decorate implements Drink {
	
	private Drink drink;

	public Decorate(Drink drink) {
		this.drink = drink;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.drink.cost();
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return this.drink.info();
	}
	
}

class Milk extends Decorate {

	public Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*6;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + " add Mile!";
	}
	
}

class Sugar extends Decorate {

	public Sugar(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*2;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + " add Sugar!!";
	}
	
}
