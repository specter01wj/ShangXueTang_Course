package com.accenture.spm.collection;

public class TestStoreDataJavabean {

	public static void main(String[] args) {
		
		User user1 = new User(1001, "James", 6500, "08/21/2017");
		User user2 = new User(1002, "Reno", 5500, "02/12/2018");
		User user3 = new User(1002, "Derro", 7500, "03/09/2014");
		User user4 = new User(1003, "Wendy", 23500, "07/11/2009");
		
	}
	
}

class User {
	
	private int id;
	private String name;
	private double salary;
	private String hireDate;
	
	public User() {
		
	}
	
	public User(int id, String name, double salary, String hireDate) {
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
