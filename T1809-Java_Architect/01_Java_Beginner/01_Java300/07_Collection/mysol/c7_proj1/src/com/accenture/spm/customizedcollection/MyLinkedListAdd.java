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
	
	public static void main(String[] args) {
		
		
		
	}
	
}
