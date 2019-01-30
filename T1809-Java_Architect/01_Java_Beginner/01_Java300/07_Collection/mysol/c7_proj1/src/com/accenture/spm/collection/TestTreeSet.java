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
		
		Set<Employee02> set2 = new TreeSet<>();
		
		set2.add(new Employee02(2001, "James", 3500));
		set2.add(new Employee02(2002, "Mike", 4500));
		set2.add(new Employee02(2004, "Michelle", 4500));
		set2.add(new Employee02(2003, "Kyo", 6500));
		
	}
	
}


class Employee02 implements Comparable<Employee02> {
	
	int id;
	String name;
	double salary;
	
	public Employee02(int id, String name, double salary) {
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
	public int compareTo(Employee02 o) {
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
