package com.accenture.spm.customizedcollection;

public class MyLinkedListGet {

	private Node first, last;
	private int size;
	
	public Object get(int index) {
		if(index < 0 || index > size - 1) {
			throw new RuntimeException("LinkedList overflow!" + index);
		}
		
		Node temp = null;
		
		if(index <= (size>>1)) {
			temp = first;
			for(int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = last;
			for(int i = size - 1; i > index; i--) {
				temp = temp.previous;
			}
		}
		
		return temp.element;
		
	}
	
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
		size++;
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
		
		MyLinkedListGet list1 = new MyLinkedListGet();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		
		System.out.println(list1);
		
		System.out.println(list1.get(5));
	}
	
}
