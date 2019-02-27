package com.accenture.spm.udp;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;

public class UDPObjClient {

	public static void main(String[] args) throws IOException {
		System.out.println("Sending in progress.....");
		 // 1、使用DatagramSocket  指定端口 创建发送端
		DatagramSocket client =new DatagramSocket(8888);
		 //2、准备数据 一定转成字节数组
		//写出
		ByteArrayOutputStream baos =new ByteArrayOutputStream();
		ObjectOutputStream oos =new ObjectOutputStream(new BufferedOutputStream(baos));
		//操作数据类型 +数据
		oos.writeUTF("James Wang!!!");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		//对象
		oos.writeObject("Tim Duncan???");
		oos.writeObject(new Date());
		Employee emp =new Employee("Kim",400);
		oos.writeObject(emp);
		oos.flush();
		byte[] datas =baos.toByteArray();	
		
		 //3、 封装成DatagramPacket 包裹，需要指定目的地
		DatagramPacket packet =new DatagramPacket(datas,0,datas.length,
				new InetSocketAddress("localhost",6666));
		//4、发送包裹send​(DatagramPacket p) * 
		client.send(packet);
		// 5、释放资源
		client.close();
	}

}
