package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list1.add("James:" + i);
		}
		System.out.println("Orig: " + list1);

		Collections.shuffle(list1);
		System.out.println("Shuffle: " + list1);
		
		Collections.reverse(list1);
		System.out.println("Reverse: " + list1);
		
		Collections.sort(list1);
		System.out.println("Sort: " + list1);
		
		System.out.println("BS: " + Collections.binarySearch(list1, "James:2"));
		
	}
	
}
