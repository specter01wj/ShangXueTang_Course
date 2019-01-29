package com.accenture.spm.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("aa1");
		set1.add("bb1");
		set1.add("cc1");
		set1.add("bb1");
		
		System.out.println(set1);
	}
	
}
