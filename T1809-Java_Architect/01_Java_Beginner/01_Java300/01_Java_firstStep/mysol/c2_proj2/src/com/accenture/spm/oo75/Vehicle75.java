package com.accenture.spm.oo75;

import com.accenture.spm.oo2.*;

public class Vehicle75 {

	public void run() {
		System.out.println("Run!");
	}
	
	public void stop() {
		System.out.println("Stop!");
	}
	
	public Person1 whoIsPsg() {
		return new Person1();
	}
	
}
