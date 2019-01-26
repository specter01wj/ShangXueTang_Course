package com.accenture.spm.customizedcollection;

public class MyLinkedListGeneric<E> {

	private Node first, last;
	private int size;
	
	public void insert(int index, E element) {
		checkRange(index);
		
		Node newNode = new Node(element);
		Node temp = getNode(index);
		
		if(temp != null) {
			Node up = temp.previous;
			
			up.next = newNode;
			newNode.previous = up;
			
			newNode.next = temp;
			temp.previous = newNode;
		}
		
	}

	public void remove(int index) {
		checkRange(index);
		
		Node temp = getNode(index);
		
		if(temp != null) {
			Node up = temp.previous;
			Node down = temp.next;
			
			if(up != null) {
				up.next = down;
			}
			if(down != null) {
				down.previous = up;
			}
			if(index == 0) {
				first = down;
			}
			if(index == size - 1) {
				last = up;
			}
			
			size--;
		}
		
	}
	
	public E get(int index) {
		checkRange(index);
		
		Node temp = getNode(index);
		
		return temp != null ? (E)temp.element : null;
		
	}
	
	private void checkRange(int index) {
		
		if(index < 0 || index > size - 1) {
			throw new RuntimeException("LinkedList overflow!" + index);
		}
	}
	
	public void add(E element) {
		Node node = new Node(element);
		
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
	
	private Node getNode(int index) {
		checkRange(index);
		
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
		
		return temp;
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
		
		MyLinkedListGeneric<String> list1 = new MyLinkedListGeneric<>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		
		System.out.println(list1);
		
		System.out.println(list1.get(3));
		
		list1.remove(5);
		System.out.println(list1);
		
		list1.insert(2, "Tim");
		System.out.println(list1);
		
	}
	
}
