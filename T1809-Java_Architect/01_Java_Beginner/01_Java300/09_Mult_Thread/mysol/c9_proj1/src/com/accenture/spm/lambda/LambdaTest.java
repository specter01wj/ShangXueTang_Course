package com.accenture.spm.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILike like = new Like();
		like.lambda();
		
		ILike like2 = new Like2();
		like2.lambda();
		
		ILike like3 = new ILike() {
			public void lambda() {
				System.out.println("i like lambda3!");
			}
		};
		like3.lambda();
		
		ILike like4 = ()-> {
			System.out.println("i like lambda4!");
		};
		like4.lambda();
		
		class Like5 implements ILike{
			public void lambda() {
				System.out.println("i like lambda5!");
			}
			
		}
		
		ILike like5 = new Like5();
		like5.lambda();
	}
	
	static class Like2 implements ILike {

		@Override
		public void lambda() {
			// TODO Auto-generated method stub
			System.out.println("James - Lambda2 (in)!");
		}
		
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
