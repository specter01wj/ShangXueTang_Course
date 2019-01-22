package com.accenture.spm.customizedcollection;

import java.util.Arrays;

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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		/*for(Object obj : elementData) {
			sb.append(obj + ",");
		}*/
		for(int i = 0; i < size; i++) {
			sb.append(elementData[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']');
		//sb.append("]");
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		MyArrayList s1 = new MyArrayList(20);
		s1.add("aa1");
		s1.add("bb1");
		
		
		System.out.println(s1);
	}
	
}
