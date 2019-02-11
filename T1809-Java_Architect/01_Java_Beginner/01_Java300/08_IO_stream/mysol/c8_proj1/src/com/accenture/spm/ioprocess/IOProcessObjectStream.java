package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOProcessObjectStream {

	public static void main(String[] args) {
		
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
		
	}
	
}

class Employee {
	
	private String name;
	private double salary;
	
	
	
}



