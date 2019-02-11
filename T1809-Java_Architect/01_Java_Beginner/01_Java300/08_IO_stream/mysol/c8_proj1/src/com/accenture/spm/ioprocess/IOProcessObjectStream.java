package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOProcessObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ByteArrayOutputStream baos =new ByteArrayOutputStream();
		ObjectOutputStream oos =new ObjectOutputStream(new BufferedOutputStream(baos));
		
		oos.writeUTF("James Wang!");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		
		oos.writeObject("Lebron?");
		oos.writeObject(new Date());
		Employee emp =new Employee("Kim",400);
		oos.writeObject(emp);
		oos.flush();
		byte[] datas =baos.toByteArray();
		System.out.println(datas.length);
		
		ObjectInputStream ois =new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		String msg = ois.readUTF(); 
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(flag);

		Object str = ois.readObject();
		Object date = ois.readObject();
		Object employee = ois.readObject();
		
		if(str instanceof String) {
			String strObj = (String) str;
			System.out.println(strObj);
		}
		if(date instanceof Date) {
			Date dateObj = (Date) date;
			System.out.println(dateObj);
		}
		if(employee instanceof Employee) {
			Employee empObj = (Employee) employee;
			System.out.println(empObj.getName()+"-->"+empObj.getSalary());
		}
	}
	
}

class Employee implements java.io.Serializable {
	
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
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



