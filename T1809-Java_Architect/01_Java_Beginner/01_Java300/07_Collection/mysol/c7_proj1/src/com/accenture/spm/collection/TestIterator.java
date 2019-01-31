package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {
		
		testIteratorList();
		testIteratorSet();
		
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
	
}
