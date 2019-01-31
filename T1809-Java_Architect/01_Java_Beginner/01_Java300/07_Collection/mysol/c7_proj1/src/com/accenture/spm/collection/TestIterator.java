package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		
		testIteratorList();
		
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
	
}
