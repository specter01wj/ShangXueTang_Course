package com.accenture.spm.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ILove{
	void lambda(int a);
}

class Love implements ILove{

	@Override
	public void lambda(int a) {
		System.out.println("James - lambda -->"+a);
	}
	
}