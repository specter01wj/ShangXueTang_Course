package com.accenture.spm.customizedcollection;

public class MyLinkedListGet {

	private Node first, last;
	private int size;
	
	public Object get(int index) {
		
		Node temp = first;
		
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		
		return temp.element;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		
		while(temp != null) {
			//System.out.println(temp.element);
			sb.append(temp.element + ",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		MyLinkedListAdd list1 = new MyLinkedListAdd();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		
		System.out.println(list1);
		
		System.out.println(list1.get(2));
	}
	
}
