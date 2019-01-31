package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {
		
		testIteratorList();
		testIteratorSet();
		testIteratorMap();
	}
	
	public static void testIteratorList() {
		List<String> list1 = new ArrayList<>();
		list1.add("aa1");
		list1.add("bb1");
		list1.add("cc1");
		
		for(Iterator<String> iter = list1.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}
	
	public static void testIteratorSet() {
		Set<String> set1 = new HashSet<>();
		set1.add("aa2");
		set1.add("bb2");
		set1.add("cc2");
		
		for(Iterator<String> iter = set1.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}
	
	public static void testIteratorMap() {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1001, "aa3");
		map1.put(1002, "bb3");
		map1.put(1003, "cc3");
		
		Set<Entry<Integer, String>> ss1 = map1.entrySet();
		
		for(Iterator<Entry<Integer, String>> iter = ss1.iterator(); iter.hasNext();) {
			Entry<Integer, String> temp = iter.next();
			System.out.println(temp.getKey() + "--" + temp.getValue());
		}
		
		System.out.println("+++++++++++++++");
		
		Set<Integer> keyset1 = map1.keySet();
		
		for(Iterator<Integer> iter = keyset1.iterator(); iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key + "--" + map1.get(key));
		}
		
	}
	
}
