package com.accenture.spm.state;

public class StateBlockedSleepYieldLambda {

	public static void main(String[] args) {
		new Thread(()->{
			for(int i=0;i<40;i++) {
				System.out.println("lambda...."+i);
			}
		}) .start();
		
		for(int i=0;i<20;i++) {
			if(i%3==0) {
				Thread.yield();
			}
			System.out.println("main...."+i);
		}
	}

}
