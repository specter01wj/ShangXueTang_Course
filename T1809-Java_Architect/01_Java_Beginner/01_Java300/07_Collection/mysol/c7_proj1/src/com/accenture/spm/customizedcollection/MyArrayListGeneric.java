package com.accenture.spm.customizedcollection;

public class MyArrayListGeneric<E> {

	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayListGeneric() {
		elementData = new Object[DEFAULT_CAPACITY];
		
	}
	
	public MyArrayListGeneric(int capacity) {
		elementData = new Object[capacity];
		
	}
	
	public void add(E element) {
		elementData[size++] = element;
	}
	
	@Override
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
		
		MyArrayListGeneric s1 = new MyArrayListGeneric(20);
		s1.add("aa1");
		s1.add("bb1");
		
		
		
		
		
		
		
		
		
		System.out.println(s1);
	}
	
}
