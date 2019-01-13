package com.accenture.spm.oop;

public class TestBubbleSort {

	public static void main(String[] args) {
		
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		int temp = 0;
		
		for(int i = 0;i < values.length;i++) {
			
			if(values[i] > values[i+1]) {
				temp = values[i];
				values[i] = values[i+1];
				values[i+1] = temp;
			}
			
			
		}
		
	}
	
}
