package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list1.add("James: " + i);
		}
		System.out.println(list1);

		Collections.shuffle(list1);
		System.out.println(list1);
		
		
	}
	
}
