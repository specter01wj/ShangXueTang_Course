package com.accenture.spm.collection;

public class TestMapCommon {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "James", 6500);
		Employee emp2 = new Employee(1002, "Tim", 4500);
		Employee emp3 = new Employee(1003, "Kate", 3500);
		
		
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
