package com.accenture.spm.oop;

public class TestMultArray {

	public static void main(String[] args) {
		
		int[][] a1 = new int[3][];
		
		a1[0] = new int[] {20,30};
		a1[1] = new int[] {10,15,80};
		a1[2] = new int[] {50,60};
		
		int[][] b1 = {
				{20,30,40},
				{50,20},
				{100,200,300,400},
		};
		
		System.out.println("a1: " + a1[1][2] + " / b1: " + b1[2][3]);
		
	}
	
}
