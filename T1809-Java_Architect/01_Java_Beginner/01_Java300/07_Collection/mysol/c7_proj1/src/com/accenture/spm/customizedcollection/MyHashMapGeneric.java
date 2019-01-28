package com.accenture.spm.customizedcollection;

public class MyHashMapGeneric<K, V> {

	Node_HashMapGeneric[] table;
	int size;
	
	
	public MyHashMapGeneric() {
		this.table = new Node_HashMapGeneric[16];
	}
	
	public V get(K key) {
		
		int hash = myHash(key.hashCode(), table.length);
		V value = null;
		
		if(table[hash] != null) {
			Node_HashMapGeneric temp = table[hash];
			
			while(temp != null) {
				if(temp.key.equals(key)) {
					value = (V)temp.value;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
		
		return value;
	}
	
	public void put(K key, V value) {
		Node_HashMapGeneric newNode1 = new Node_HashMapGeneric();
		newNode1.hash = myHash(key.hashCode(), table.length);
		newNode1.key = key;
		newNode1.value = value;
		newNode1.next = null;
		
		Node_HashMapGeneric temp = table[newNode1.hash];
		Node_HashMapGeneric iterLast = null;
		boolean keyRepeat = false;
		
		if(temp == null) {
			table[newNode1.hash] = newNode1;
			size++;
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
				size++;
			}
			
			
		}
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("{");
		
		for(int i = 0; i < table.length; i++) {
			Node_HashMapGeneric temp = table[i];
			
			while(temp != null) {
				sb1.append(temp.key + ":" + temp.value + ",");
				temp = temp.next;
			}
		}
		sb1.setCharAt(sb1.length()-1, '}');
		
		return sb1.toString();
	}

	public static void main(String[] args) {
		
		MyHashMapGeneric<Integer, String> m1 = new MyHashMapGeneric();
		m1.put(101, "Jim");
		m1.put(102, "Yebo");
		m1.put(103, "Zion");
		m1.put(102, "Kate");
		
		m1.put(42, "R1");
		m1.put(58, "R2");
		m1.put(74, "R3");
		
		System.out.println(m1);
		
		
		System.out.println(m1.get(58));
		
		
	}
	
	public static int myHash(int v, int length) {
		return v & (length - 1);
	}
	
}
