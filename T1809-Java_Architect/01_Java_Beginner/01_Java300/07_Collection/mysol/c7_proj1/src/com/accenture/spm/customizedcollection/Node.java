package com.accenture.spm.customizedcollection;

public class Node {

	Node previous, next;
	Object element;
	
	
	public Node(Node previous, Node next, Object element) {
		super();
		this.previous = previous;
		this.next = next;
		this.element = element;
	}
	
	
	
}
