package com.accenture.spm.oop;

import java.util.Arrays;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8, 90};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int result = myBinarySearch(arr, 40);
		System.out.println("Result: " + result);
		
		
	}
	
	public static int myBinarySearch(int[] arr, int value) {
		
		int low = 0, high = arr.length - 1;
		int searchTimes = 0;
		
		while(low <= high) {
			searchTimes++;
			int mid = (low + high) / 2;
			
			if(value == arr[mid]) {
				System.out.println("Search times: " + searchTimes);
				return mid;
			}
			
			if(value >= arr[mid]) {
				low = mid + 1;
			}
			if(value <= arr[mid]) {
				high = mid - 1;
			}
			
		}
		System.out.println("Search times: " + searchTimes);
		return -1;
		
	}
	
}
