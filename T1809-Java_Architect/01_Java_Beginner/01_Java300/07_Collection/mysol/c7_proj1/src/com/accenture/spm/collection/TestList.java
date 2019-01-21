package com.accenture.spm.collection;

import java.util.*;

public class TestList {

	public static void main(String[] args) {
		
		Collection<String> c1 = new ArrayList<>();
		
		c1.add("Jin");
		c1.add("Kate");
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		System.out.println(c1);
		System.out.println(c1.contains("Jin"));
		
		Object[] objs1 = c1.toArray();
		System.out.println(objs1);
		
		c1.remove("Jin");
		System.out.println(c1);
		
		c1.clear();
		System.out.println(c1.size());
		System.out.println(c1);
		
		
		
	}
	
}
