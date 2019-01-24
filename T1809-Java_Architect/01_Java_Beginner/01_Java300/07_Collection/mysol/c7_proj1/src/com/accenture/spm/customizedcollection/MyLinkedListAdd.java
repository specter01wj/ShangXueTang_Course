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
	
	@Override
	public String toString() {
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.element);
			temp = temp.next;
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		MyLinkedListAdd list1 = new MyLinkedListAdd();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		System.out.println(list1);
	}
	
}
