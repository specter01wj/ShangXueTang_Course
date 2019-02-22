package com.accenture.spm.lambda;

public class LambdaThread {

	static class Test implements Runnable{		
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("Singing!!!");
			}
		}
	}
	
	public static void main(String[] args) {
		//new Thread(new Test()).start();

		class Test2 implements Runnable{		
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("Singing 2!!!");
				}
			}
		}		
		//new Thread(new Test2()).start();
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("Singing 3!!!");
				}
			}
		}).start();
		
	}

}
