package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.List;

public class TestListAll {

	public static void main(String[] args) {
		
		test02();
		
	}
	
	public static void test01() {
		
	}
	
	public static void test02() {
		
		List<String> list1 = new ArrayList<>();
		list1.add("aa1");
		list1.add("aa2");
		list1.add("aa3");
		list1.add("bb2");
		
		List<String> list2 = new ArrayList<>();
		list2.add("bb1");
		list2.add("bb2");
		list2.add("bb3");
		
		System.out.println("List1: " + list1);
		
		//list1.addAll(list2);
		System.out.println("List1: " + list1);
		//list1.removeAll(list2);
		System.out.println("List1: " + list1);
		list1.retainAll(list2);
		System.out.println("List1: " + list1);
		
	}
	
}
