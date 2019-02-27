package com.accenture.spm.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class UDPObjServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Receiving in progress.....");
		// 1、使用DatagramSocket  指定端口 创建接收端
		DatagramSocket server =new DatagramSocket(6666);
		// 2、准备容器 封装成DatagramPacket 包裹
		byte[] container =new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container,0,container.length);
		// 3、阻塞式接收包裹receive​(DatagramPacket p)
		server.receive(packet); //阻塞式
		// 4、分析数据    将字节数组还原为对应的类型
		//    byte[]  getData​()
		//                getLength​()
		byte[]  datas =packet.getData();
		int len = packet.getLength();		 
		//读取 -->反序列化
		ObjectInputStream ois =new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//顺序与写出一致
		String msg = ois.readUTF(); 
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(flag);
		//对象的数据还原  
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
		 
		// 5、释放资源
		 server.close();
	}

}
