package com.accenture.spm.customizedcollection;

public class MyArrayList {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
		
	}
	
	public MyArrayList(int capacity) {
		elementData = new Object[capacity];
		
	}
	
	public void add(Object obj) {
		elementData[size++] = obj;
	}
	

	public static void main(String[] args) {
		
		MyArrayList s1 = new MyArrayList(20);
		s1.add("aa1");
		s1.add("bb1");
		
		
		System.out.println(s1);
	}
	
}
