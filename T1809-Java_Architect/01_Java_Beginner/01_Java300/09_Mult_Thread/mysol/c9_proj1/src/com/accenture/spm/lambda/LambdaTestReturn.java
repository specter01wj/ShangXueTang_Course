package com.accenture.spm.lambda;

public class LambdaTestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface IInterest{
	int lambda(int a,int b);
}

class Interest implements IInterest{

	@Override
	public int lambda(int a,int c) {
		System.out.println("James - lambda -->"+(a+c));
		return a+c;
	}
	
}
