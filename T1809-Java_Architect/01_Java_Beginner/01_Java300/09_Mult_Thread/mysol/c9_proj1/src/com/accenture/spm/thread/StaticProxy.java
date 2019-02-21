package com.accenture.spm.thread;

public class StaticProxy {

	public static void main(String[] args) {
		
		new WeddingCompany(new You()).happyMarry();
		//new Thread().start();
	}
	
}

interface Marry {
	void happyMarry();
}

class You implements Marry {

	@Override
	public void happyMarry() {
		// TODO Auto-generated method stub
		System.out.println("James Marry!!!");
	}
	
}

class WeddingCompany implements Marry {
	private Marry target;

	public WeddingCompany(Marry target) {
		this.target = target;
	}

	@Override
	public void happyMarry() {
		// TODO Auto-generated method stub
		ready();
		this.target.happyMarry();
		after();
	}
	
	private void ready() {
		System.out.println("Ready....");
	}
	
	private void after() {
		System.out.println("After-----");
	}
	
}
