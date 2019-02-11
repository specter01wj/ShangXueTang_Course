package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IOProcessDataStream {

	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream baos =new ByteArrayOutputStream();
		DataOutputStream dos =new DataOutputStream(new BufferedOutputStream(baos));
		
		dos.writeUTF("James Wang!");
		dos.writeInt(18);
		dos.writeBoolean(false);
		dos.writeInt(55);
		dos.writeChar('a');
		dos.flush();
		byte[] datas =baos.toByteArray();
		System.out.println(datas);
		System.out.println(datas.length);
		
		DataInputStream dis =new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		String msg = dis.readUTF(); 
		int age = dis.readInt();
		boolean flag = dis.readBoolean();
		int age2 = dis.readInt();
		char ch = dis.readChar();
		System.out.println("msg: " + msg + "/ age: " + age2 + "/ flag: " + flag + "/ ch: " + ch);
	}
	
}
