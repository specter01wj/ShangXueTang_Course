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



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
