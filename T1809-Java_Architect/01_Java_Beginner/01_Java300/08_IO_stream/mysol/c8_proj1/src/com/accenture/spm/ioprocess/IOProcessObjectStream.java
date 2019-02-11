package com.accenture.spm.ioprocess;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOProcessObjectStream {

	public static void main(String[] args) {
		
		ByteArrayOutputStream baos =new ByteArrayOutputStream();
		ObjectOutputStream oos =new ObjectOutputStream(new BufferedOutputStream(baos));
		//操作数据类型 +数据
		oos.writeUTF("编码辛酸泪");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		//对象
		oos.writeObject("谁解其中味");
		oos.writeObject(new Date());
		Employee emp =new Employee("马云",400);
		oos.writeObject(emp);
		oos.flush();
		byte[] datas =baos.toByteArray();
		System.out.println(datas.length);
		
	}
	
}
