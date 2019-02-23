package com.accenture.spm.lambda;

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILike like = new Like();
		like.lambda();
	}

}

interface ILike {
	void lambda();
}

class Like implements ILike {

	@Override
	public void lambda() {
		// TODO Auto-generated method stub
		System.out.println("James - Lambda (out)!");
	}
	
}
