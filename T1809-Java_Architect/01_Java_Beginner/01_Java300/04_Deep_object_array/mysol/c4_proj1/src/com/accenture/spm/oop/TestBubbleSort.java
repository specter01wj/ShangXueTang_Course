package com.accenture.spm.oop;

import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		int temp = 0;
		
		for(int j = 0;j < values.length - 1;j++) {
			boolean flag = true;
			for(int i = 0;i < values.length-1-j;i++) {
				if(values[i] > values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			if(flag) {
				break;
			}
			System.out.println("=======================");
		}
		
		
		
		
	}
	
}
