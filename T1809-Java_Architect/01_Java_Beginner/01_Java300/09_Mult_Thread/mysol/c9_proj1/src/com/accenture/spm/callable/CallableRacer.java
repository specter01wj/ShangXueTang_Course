package com.accenture.spm.callable;

import java.util.concurrent.Callable;

public class CallableRacer implements Callable<Integer> {
	private  String winner;
	
	@Override
	public Integer call() throws Exception {
		for(int steps =1;steps<=100;steps++) {		
			//模拟休息
			if(Thread.currentThread().getName().equals("pool-1-thread-1") && steps%10==0) {
				Thread.sleep(100);
			}
			System.out.println(Thread.currentThread().getName()+"-->"+steps);
			//比赛是否结束
			boolean flag = gameOver(steps);
			if(flag) {
				return steps;
			}
		}
		return null;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
