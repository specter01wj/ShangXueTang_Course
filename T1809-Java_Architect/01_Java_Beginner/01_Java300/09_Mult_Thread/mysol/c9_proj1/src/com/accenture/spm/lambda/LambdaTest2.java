package com.accenture.spm.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILove love =(int a) -> {
			System.out.println("i like lambda -->"+a);
		};
		
		love.lambda(100);
		
		love =(a) -> {
			System.out.println("i like lambda2 -->"+a);
		};
		love.lambda(50);
		
		love =a -> {
			System.out.println("i like lambda3 -->"+a);
		};
		
		love.lambda(5);
		
		love =a ->System.out.println("i like lambda4 -->"+a);
		love.lambda(0);
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