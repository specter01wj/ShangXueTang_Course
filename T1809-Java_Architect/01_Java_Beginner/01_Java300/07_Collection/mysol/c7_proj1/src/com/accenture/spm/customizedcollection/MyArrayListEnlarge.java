package com.accenture.spm.customizedcollection;

public class MyArrayListEnlarge<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayListEnlarge() {
		elementData = new Object[DEFAULT_CAPACITY];
		
	}
	
	public MyArrayListEnlarge(int capacity) {
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
		
		MyArrayListEnlarge s1 = new MyArrayListEnlarge(20);
		
		for(int i = 0; i < 40; i++) {
			s1.add("We_" + i);
		}
		
		System.out.println(s1);
		
	}
	
}
