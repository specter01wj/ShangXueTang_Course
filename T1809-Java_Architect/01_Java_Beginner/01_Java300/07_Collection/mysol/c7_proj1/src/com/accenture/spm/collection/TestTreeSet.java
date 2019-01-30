package com.accenture.spm.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new TreeSet<>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		
		for(Integer m : set1) {
			System.out.println(m);
		}
		
	}
	
}
