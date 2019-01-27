package com.accenture.spm.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMapCommon {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "James", 6500);
		Employee emp2 = new Employee(1002, "Tim", 4500);
		Employee emp3 = new Employee(1003, "Kate", 3500);
		Employee emp4 = new Employee(1004, "Mike", 5500);
		
		Map<Integer, Employee> map1 = new HashMap<>();
		
		map1.put(001, emp1);
		map1.put(002, emp2);
		map1.put(003, emp3);
		map1.put(002, emp4);
		
		Employee human1 = map1.get(002);
		
		System.out.println(human1.getName());
		
		System.out.println(map1);
		
	}
	
}


class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id:" + id + "name:" + name + "salary:" + salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
