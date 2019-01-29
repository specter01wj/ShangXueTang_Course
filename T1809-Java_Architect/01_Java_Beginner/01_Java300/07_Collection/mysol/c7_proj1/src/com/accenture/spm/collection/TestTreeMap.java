package com.accenture.spm.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> tm1 = new TreeMap<>();
		
		tm1.put(1001, "aa1");
		tm1.put(1002, "bb1");
		tm1.put(1003, "cc1");
		
		for(Integer key : tm1.keySet()) {
			System.out.println(key + "---" + tm1.get(key));
		}
		
		Map<Employee01, String> tm2 = new TreeMap<>();
		
		tm2.put(new Employee01(2001, "James", 3500), "Chinese");
		tm2.put(new Employee01(2002, "Mike", 4500), "USA");
		tm2.put(new Employee01(2003, "Kyo", 3500), "Japanese");
		
		for(Employee01 key : tm2.keySet()) {
			System.out.println(key + "---" + tm2.get(key));
		}
		
	}
	
}

class Employee01 implements Comparable<Employee01> {
	
	int id;
	String name;
	double salary;
	
	public Employee01(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:" + id + ",name:" + name + ",salary:" + salary;
	}


	@Override
	public int compareTo(Employee01 o) {
		// TODO Auto-generated method stub
		if(this.salary > o.salary) {
			return 1;
		} else if(this.salary < o.salary) {
			return -1;
		} else {
			if(this.id > o.id) {
				return 1;
			} else if(this.id < o.id) {
				return -1;
			} else {
				return 0;
			}
		}
		

	}
	
	
	
}
