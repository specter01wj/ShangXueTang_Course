package com.accenture.spm.collection;

public class TestStoreDataJavabean {

}

class User {
	
	private int id;
	private String name, hireDate;
	private double salary;
	
	public User() {
		
	}
	
	public User(int id, String name, String hireDate, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.hireDate = hireDate;
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

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
