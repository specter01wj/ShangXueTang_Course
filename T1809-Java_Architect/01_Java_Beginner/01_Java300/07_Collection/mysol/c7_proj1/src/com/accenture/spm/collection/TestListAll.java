package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.List;

public class TestListAll {

	public static void main(String[] args) {
		
		//test02();
		test03();
		
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
		System.out.println(list1.containsAll(list2));
		
	}
	
	public static void test03() {
		List<String> list3 = new ArrayList<>();
		list3.add("a1");
		list3.add("b2");
		list3.add("c3");
		list3.add("d4");
		System.out.println("List3: " + list3);
		
		list3.add(2, "Jim");
		System.out.println("List3: " + list3);
		
		list3.remove(3);
		System.out.println("List3: " + list3);
		
		list3.set(1, "Kate");
		System.out.println("List3: " + list3);
		
		System.out.println(list3.get(2));
		
	}
	
}
