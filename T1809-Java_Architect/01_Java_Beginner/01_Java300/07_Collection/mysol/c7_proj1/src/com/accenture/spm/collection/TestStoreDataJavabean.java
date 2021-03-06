package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStoreDataJavabean {

	public static void main(String[] args) {
		
		User user1 = new User(1001, "James", 6500, "08/21/2017");
		User user2 = new User(1002, "Reno", 5500, "02/12/2018");
		User user3 = new User(1002, "Derro", 7500, "03/09/2014");
		User user4 = new User(1003, "Wendy", 23500, "07/11/2009");
		
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		
		for(User u : list) {
			System.out.println(u);
		}
		
		Map<Integer, User> map = new HashMap<>();
		map.put(001, user1);
		map.put(002, user2);
		map.put(003, user3);
		map.put(004, user4);
		
		Set<Integer> keyset = map.keySet();
		for(Integer key : keyset) {
			System.out.println(key + "---" + map.get(key));
		}
		
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
		return "id:" + id + ", name:" + name + ", salary:" + salary + ", hireDate:" + hireDate;
	}
	
	
}
