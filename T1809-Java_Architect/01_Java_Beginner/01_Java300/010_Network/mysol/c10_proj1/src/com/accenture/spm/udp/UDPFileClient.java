package com.accenture.spm.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPFileClient {

	public static void main(String[] args) throws Exception {
		System.out.println("Sending in progress.....");
		 // 1、使用DatagramSocket  指定端口 创建发送端
		DatagramSocket client =new DatagramSocket(8888);
		 //2、准备数据 一定转成字节数组
		byte[] datas =IOUtils.fileToByteArray("src/logo.png");		
		 //3、 封装成DatagramPacket 包裹，需要指定目的地
		DatagramPacket packet =new DatagramPacket(datas,0,datas.length,
				new InetSocketAddress("localhost",6666));
		//4、发送包裹send​(DatagramPacket p) * 
		client.send(packet);
		// 5、释放资源
		client.close();
	}

}
