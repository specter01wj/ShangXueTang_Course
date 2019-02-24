package com.accenture.spm.state;

public class StateBlockedSleepSimsleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Racer implements Runnable {
	private  String winner;//胜利者
	@Override
	public void run() {
		for(int steps =1;steps<=100;steps++) {		
			//模拟休息
			if(Thread.currentThread().getName().equals("rabbit") && steps%10==0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"-->"+steps);
			//比赛是否结束
			boolean flag = gameOver(steps);
			if(flag) {
				break;
			}
		}
	}
	private boolean gameOver(int steps) {
		if(winner!=null) { //存在胜利者
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
	
	
}
