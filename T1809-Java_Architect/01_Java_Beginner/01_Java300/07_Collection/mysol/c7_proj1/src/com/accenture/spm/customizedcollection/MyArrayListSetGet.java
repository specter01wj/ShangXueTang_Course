package com.accenture.spm.customizedcollection;

public class MyArrayListSetGet<E> {

	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayListSetGet() {
		elementData = new Object[DEFAULT_CAPACITY];
		
	}
	
	public MyArrayListSetGet(int capacity) {
		elementData = new Object[capacity];
		
	}
	
	public void add(E element) {
		
		if(size == elementData.length) {
			Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		
		elementData[size++] = element;
	}
	
	public E get(int index) {
		
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
		
		MyArrayListSetGet s1 = new MyArrayListSetGet(20);
		
		for(int i = 0; i < 40; i++) {
			s1.add("We_" + i);
		}
		
		System.out.println(s1);
		
	}
	
}
