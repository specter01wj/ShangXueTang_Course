package com.accenture.spm.state;

public class StateTerminateThread implements Runnable {

	private boolean flag = true;
	private String name;
	
	public StateTerminateThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int i=0;
		
		while(flag) {
			System.out.println(name + "-->" + i++);
		}
		
	}

	public void terminate() {
		this.flag = false;
	}

	public static void main(String[] args) {
		StateTerminateThread tt = new StateTerminateThread("James!");
		new Thread(tt).start();
		
		for(int i=0;i<=99;i++) {
			if(i==18) {
				tt.terminate();
				System.out.println("tt game over");
			}
			System.out.println("main-->"+i);
		}
	}

}
