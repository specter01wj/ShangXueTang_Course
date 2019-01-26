package com.accenture.spm.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		Map<String, Integer> m2 = new HashMap<>();
		Map<Integer, String> m3 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		
		m2.put("James", 1001);
		m2.put("Kim", 1002);
		
		m3.put(3, "three-some");
		m3.put(4, "four");
		m3.put(5, "five");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("two"));
		
		m1.putAll(m3);
		System.out.println(m1);
		
	}
	
}
