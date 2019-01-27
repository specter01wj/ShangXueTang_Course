package com.accenture.spm.collection;

public class TestHashMap {

	public static void main(String[] args) {
		int h = 25860399;
		int len = 16;
		
		myHash(h, len);
		
	}
	
	public static int myHash(int h, int len) {
		System.out.println(h & (len - 1));
		System.out.println(h % len);
		
		return h & (len - 1);
	}
	
}
