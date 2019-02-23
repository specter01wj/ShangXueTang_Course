package com.accenture.spm.lambda;

public class LambdaTestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IInterest interest = (int a,int c)-> {
			System.out.println("i like lambda -->"+(a+c));
			return a+c;
		};
		interest.lambda(100,200);
		
		interest = (a,c)-> {
			System.out.println("i like lambda -->"+(a+c));
			return a+c;
		};
		
		interest.lambda(200,200);
		
		interest = (a,c)-> {
			return a+c;
		};
		
		//interest = (a,c)-> a+c;
		
		//interest = (a,c)-> 100;
		
		System.out.println(interest.lambda(10, 20));
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
