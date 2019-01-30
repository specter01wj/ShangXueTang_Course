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


	public static void main(String[] args) {
		
		
		
	}
	
}
