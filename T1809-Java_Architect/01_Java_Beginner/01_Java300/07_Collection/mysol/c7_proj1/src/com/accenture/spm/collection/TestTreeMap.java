package com.accenture.spm.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> tm1 = new TreeMap<>();
		
		tm1.put(1001, "aa1");
		tm1.put(1002, "bb1");
		tm1.put(1003, "cc1");
		
		for(Integer key : tm1.keySet()) {
			System.out.println(key + "---" + tm1.get(key));
		}
		
	}
	
}
