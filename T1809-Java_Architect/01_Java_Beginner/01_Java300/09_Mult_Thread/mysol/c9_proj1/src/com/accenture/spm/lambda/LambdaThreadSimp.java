package com.accenture.spm.lambda;

public class LambdaThreadSimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("James - Lambda!");
			}
		}) .start();
		
		new Thread(()->	System.out.println("Alica = Lambda2?")) .start();
	}

}
