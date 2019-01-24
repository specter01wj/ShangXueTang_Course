package com.accenture.spm.customizedcollection;

public class MyArrayListRemove<E> {

	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayListRemove() {
		elementData = new Object[DEFAULT_CAPACITY];
		
	}
	
	public MyArrayListRemove(int capacity) {
		
		if(capacity < 0) {
			throw new RuntimeException("Cannot be Negative!");
		} else if(capacity == 0) {
			elementData = new Object[DEFAULT_CAPACITY];
		} else {
			elementData = new Object[capacity];
		}
		
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
		checkRange(index);
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
		
		/*if(index < 0 || index > size - 1) {
			throw new RuntimeException("Illegal! " + index);
		}*/
		checkRange(index);
		
		elementData[index] = element;
	}
	
	public void checkRange(int index) {
		if(index < 0 || index > size - 1) {
			throw new RuntimeException("Illegal! " + index);
		}
	}
	
	public void remove(E element) {
		for(int i = 0; i < size; i++) {
			if(element.equals(get(i))) {
				remove(i);
			}
		}
	}
	
	public void remove(int index) {
		int numMoved = elementData.length - index - 1;
		if(numMoved > 0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		} 
		
		elementData[--size] = null;
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false; 
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
		
		MyArrayListRemove s1 = new MyArrayListRemove(20);
		
		for(int i = 0; i < 40; i++) {
			s1.add("We_" + i);
		}
		
		System.out.println(s1);
		
		s1.set("James_01", 10);
		System.out.println(s1.get(10));
		System.out.println(s1.get(39));
		
		s1.remove(3);
		s1.remove("We_6");
		System.out.println(s1);
		
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
	}
	
}
