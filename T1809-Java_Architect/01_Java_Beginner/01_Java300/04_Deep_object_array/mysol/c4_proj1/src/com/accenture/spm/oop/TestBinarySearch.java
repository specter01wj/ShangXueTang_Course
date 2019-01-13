package com.accenture.spm.oop;

import java.util.Arrays;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8, 88};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int result = myBinarySearch(arr, 40);
		System.out.println("Result: " + result);
		
		
	}
	
	public static int myBinarySearch(int[] arr, int value) {
		
		int low = 0, high = arr.length - 1;
		
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(value == arr[mid]) {
				return mid;
			}
			
			if(value >= arr[mid]) {
				low = mid + 1;
			}
			if(value <= arr[mid]) {
				high = mid - 1;
			}
			
		}
		return -1;
		
	}
	
}
