package com.accenture.spm.state;

public class StateBlockedSleepSimsleep {

	public static void main(String[] args) {
		Racer racer = new Racer();
		new Thread(racer,"tortoise").start();
		new Thread(racer,"rabbit").start();
	}

}

class Racer implements Runnable {
	private  String winner;
	
	@Override
	public void run() {
		for(int steps =1;steps<=1000;steps++) {		
			
			if(Thread.currentThread().getName().equals("rabbit") && steps%10==0) {
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"-->"+steps);
			
			boolean flag = gameOver(steps);
			if(flag) {
				break;
			}
		}
	}
	
	private boolean gameOver(int steps) {
		if(winner!=null) {
			return true;
		}else {
			if(steps ==1000) {
				winner = Thread.currentThread().getName();
				System.out.println("winner==>"+winner);
				return true;
			}
		}
		return false;
	}
	
	
}
