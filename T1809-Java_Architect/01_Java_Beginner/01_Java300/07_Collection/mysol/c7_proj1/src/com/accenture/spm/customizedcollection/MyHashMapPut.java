package com.accenture.spm.customizedcollection;

public class MyHashMapPut {

	Node_HashMap[] table;
	int size;
	
	
	public MyHashMapPut() {
		this.table = new Node_HashMap[16];
	}
	
	public void put(Object key, Object value) {
		Node_HashMap newNode1 = new Node_HashMap();
		newNode1.hash = myHash(key.hashCode(), table.length);
		newNode1.key = key;
		newNode1.value = value;
		newNode1.next = null;
		
		
	}
	
	public int myHash(int v, int length) {
		System.out.println(v & (length - 1));
		System.out.println(v % (length - 1));
		return v & (length - 1);
	}
	
}
