package com.accenture.spm.runnable;

public class RunnableWeb12306 implements Runnable {

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
	public static void main(String[] args) {
		//一份资源
		RunnableWeb12306 web =new RunnableWeb12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"James").start();
		new Thread(web,"Kim").start();
		new Thread(web,"Lee").start();;
	}

}
