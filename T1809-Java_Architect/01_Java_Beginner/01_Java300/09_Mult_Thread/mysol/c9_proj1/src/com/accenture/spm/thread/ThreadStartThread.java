package com.accenture.spm.thread;

public class ThreadStartThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Sing!");
		}
	}

	public static void main(String[] args) {
		
		ThreadStartThread st = new ThreadStartThread();
		st.start();
		//st.run();
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Dancing?");
		}

		
		
		
		
	}

}
