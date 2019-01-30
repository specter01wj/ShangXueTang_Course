package com.accenture.spm.customizedcollection;

import java.util.HashMap;

public class MyHashSet {

	HashMap map1;
	
	private static final Object PRESENT = new Object();
	
	public MyHashSet() {
		this.map1 = new HashMap();
	}

	public void add(Object o) {
		map1.put(o, PRESENT);
	}

	public int size() {
		return map1.size();
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(Object key : map1.keySet()) {
			sb.append(key + ",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}

	public static void main(String[] args) {
		MyHashSet set1 = new MyHashSet();
		
		set1.add("aa1");
		set1.add("bb1");
		set1.add("cc1");
		
		System.out.println(set1);
	}
	
}
