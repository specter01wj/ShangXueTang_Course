package com.accenture.spm.customizedcollection;

public class MyLinkedListAdd {

	private Node first, last;
	private int size;
	
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if(first == null) {
			node.previous = null;
			node.next = null;
			
			first = node;
			last = node;
		} else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
	}
	
/*	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}*/
	
	public static void main(String[] args) {
		
		MyLinkedListAdd list1 = new MyLinkedListAdd();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		System.out.println(list1);
	}
	
}
