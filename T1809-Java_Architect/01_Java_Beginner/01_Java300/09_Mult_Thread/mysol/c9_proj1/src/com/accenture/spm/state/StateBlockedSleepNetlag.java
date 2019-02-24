package com.accenture.spm.state;

public class StateBlockedSleepNetlag {

	public static void main(String[] args) {
		
		Web12306 web =new Web12306();
		System.out.println(Thread.currentThread().getName());
		
		new Thread(web,"James").start();
		new Thread(web,"Kim").start();
		new Thread(web,"Alicia").start();;

	}

}

class Web12306 implements Runnable {
	
	private int ticketNums = 60;
	private int c1 = 0, c2 = 0, c3 = 0; 
	
	@Override
	public void run() {
		while(true) {
			if(ticketNums<=0) {
				break;
			}
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			switch(Thread.currentThread().getName()) {
				case "James": 
					c1++;
					break;
				case "Kim": 
					c2++;
					break;
				case "Alicia": 
					c3++;
					break;
			}
			
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
		System.out.println("Total:" + c1 + "-->" + "-->" + c2 + "-->" + c3);
	}
	
	
}
