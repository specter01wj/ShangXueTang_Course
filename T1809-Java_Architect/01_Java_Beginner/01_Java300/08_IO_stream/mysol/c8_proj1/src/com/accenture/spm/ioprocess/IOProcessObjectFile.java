package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOProcessObjectFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 写出 -->序列化
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.txt")));
		// 操作数据类型 +数据
		oos.writeUTF("Accenture!");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		// 对象
		oos.writeObject("Federal Service?");
		oos.writeObject(new Date());
		Employee emp = new Employee("James", 400);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		// 读取 -->反序列化
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.txt")));
		// 顺序与写出一致
		String msg = ois.readUTF();
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(flag);
		// 对象的数据还原
		Object str = ois.readObject();
		Object date = ois.readObject();
		Object employee = ois.readObject();

		if (str instanceof String) {
			String strObj = (String) str;
			System.out.println(strObj);
		}
		if (date instanceof Date) {
			Date dateObj = (Date) date;
			System.out.println(dateObj);
		}
		if (employee instanceof Employee) {
			Employee empObj = (Employee) employee;
			System.out.println(empObj.getName() + "-->" + empObj.getSalary());
		}
		ois.close();
	}
	
}
