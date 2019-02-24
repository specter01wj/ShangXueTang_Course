package com.accenture.spm.state;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StateBlockedSleepCountdown {

	public static void main(String[] args) throws InterruptedException {
		test();
		test2();
	}
	
	public static void test() throws InterruptedException {
		
		int num = 10;
		
		while(true) {
			Thread.sleep(200);
			System.out.println(num--);
		}
	}
	
	public static void test2() throws InterruptedException {
		
		Date endTime=new Date(System.currentTimeMillis()+1000*10);
		long end = endTime.getTime();
		
		while(true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			Thread.sleep(1000);
			 endTime=new Date(endTime.getTime()-1000);		
			 if(end-10000 >endTime.getTime() ) {
				 break;
			 }
		}
	}

}
