package com.accenture.spm.oop;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30}, a2 = {13, 61, 51, 6, 141, 41, 3, 11};
		
		System.out.println(a1);
		
		System.out.println(Arrays.toString(a1));
		
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		
		System.out.println(Arrays.binarySearch(a2, 61));
		
	}
	
}
