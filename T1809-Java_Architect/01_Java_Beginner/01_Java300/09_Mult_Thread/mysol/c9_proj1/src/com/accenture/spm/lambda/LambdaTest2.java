package com.accenture.spm.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILove love =(int a) -> {
			System.out.println("i like lambda -->"+a);
		};
		
		love.lambda(100);
		
		
		
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