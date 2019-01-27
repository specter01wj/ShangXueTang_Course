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
		
		Node_HashMap temp = table[newNode1.hash];
		Node_HashMap iterLast = null;
		boolean keyRepeat = false;
		
		if(temp == null) {
			table[newNode1.hash] = newNode1;
		} else {
			while(temp != null) {
				
				if(temp.key.equals(key)) {
					keyRepeat = true;
					System.out.println("Duplicate key!!!");
					temp.value = value;
					break;
				} else {
					iterLast = temp;
					temp = temp.next;
				}
				
			}
			
			if(!keyRepeat) {
				iterLast.next = newNode1;
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		MyHashMapPut m1 = new MyHashMapPut();
		m1.put(101, "Jim");
		m1.put(102, "Yebo");
		m1.put(103, "Zion");
		
		System.out.println(m1);
	}
	
	public int myHash(int v, int length) {
		System.out.println("&: " + (v & (length - 1)));
		System.out.println("%: " + (v % (length - 1)));
		return v & (length - 1);
	}
	
}
