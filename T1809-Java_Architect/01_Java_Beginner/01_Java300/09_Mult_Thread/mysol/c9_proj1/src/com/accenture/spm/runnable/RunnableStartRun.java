package com.accenture.spm.runnable;

public class RunnableStartRun implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			System.out.println("Sing!!!");
		}
	}

	public static void main(String[] args) {
		RunnableStartRun sr = new RunnableStartRun();
		Thread th1 = new Thread(sr);
		th1.start();
		
	}
	
}
