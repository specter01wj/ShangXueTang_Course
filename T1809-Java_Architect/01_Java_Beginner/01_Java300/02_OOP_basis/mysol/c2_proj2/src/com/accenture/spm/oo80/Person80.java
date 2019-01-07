package com.accenture.spm.oo80;

public class Person80 {

	private int id, age;
	private String name;
	private boolean man;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 1 && age <= 110) {
			this.age = age;
		} else {
			System.out.println("Age out of range!");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}
