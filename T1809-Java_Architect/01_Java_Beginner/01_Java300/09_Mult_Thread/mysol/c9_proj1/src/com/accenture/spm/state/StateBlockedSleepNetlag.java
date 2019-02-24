package com.accenture.spm.state;

public class StateBlockedSleepNetlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Web12306 implements Runnable {
	
	private int ticketNums = 99;
	
	@Override
	public void run() {
		while(true) {
			if(ticketNums<0) {
				break;
			}
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
	}	
}
