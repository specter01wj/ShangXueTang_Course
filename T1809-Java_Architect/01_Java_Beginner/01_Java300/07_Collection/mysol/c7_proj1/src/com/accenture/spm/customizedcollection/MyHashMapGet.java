package com.accenture.spm.customizedcollection;

public class MyHashMapGet {

	Node_HashMap[] table;
	int size;
	
	
	public MyHashMapGet() {
		this.table = new Node_HashMap[16];
	}
	
	public Object get(Object key) {
		
		int hash = myHash(key.hashCode(), table.length-1);
		Object value = null;
		
		if(table[hash] != null) {
			Node_HashMap temp = table[hash];
			
			while(temp != null) {
				if(temp.key.equals(key)) {
					value = temp.value;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
		
		return value;
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
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("{");
		
		for(int i = 0; i < table.length; i++) {
			Node_HashMap temp = table[i];
			
			while(temp != null) {
				sb1.append(temp.key + ":" + temp.value + ",");
				temp = temp.next;
			}
		}
		sb1.setCharAt(sb1.length()-1, '}');
		
		return sb1.toString();
	}

	public static void main(String[] args) {
		
		MyHashMapGet m1 = new MyHashMapGet();
		m1.put(101, "Jim");
		m1.put(102, "Yebo");
		m1.put(103, "Zion");
		m1.put(102, "Kate");
		
		m1.put(42, "R1");
		m1.put(58, "R2");
		m1.put(74, "R3");
		
		System.out.println(m1);
		
		
		System.out.println(m1.get(42));
		
		
	}
	
	public static int myHash(int v, int length) {
		return v & (length - 1);
	}
	
}
