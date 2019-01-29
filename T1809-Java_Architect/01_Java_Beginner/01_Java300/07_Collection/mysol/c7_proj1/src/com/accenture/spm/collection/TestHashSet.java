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
		
		set1.remove("bb1");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("James");
		set2.add("Kimmy");
		set2.addAll(set1);
		System.out.println(set2);
		
		
	}
	
}
