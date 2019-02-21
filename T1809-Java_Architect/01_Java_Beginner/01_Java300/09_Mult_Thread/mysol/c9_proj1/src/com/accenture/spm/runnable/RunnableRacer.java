package com.accenture.spm.runnable;

public class RunnableRacer implements Runnable {
	private String winner;
	
	@Override
	public void run() {
		for(int steps =1;steps<=100;steps++) {		
			
			if(Thread.currentThread().getName().equals("Alicia") && steps%10==0) {
				try {
					Thread.sleep(5);
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
			if(steps ==100) {
				winner = Thread.currentThread().getName();
				System.out.println("winner==>"+winner);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		RunnableRacer racer = new RunnableRacer();
		
		new Thread(racer,"James").start();
		new Thread(racer,"Alicia").start();
	}

}
