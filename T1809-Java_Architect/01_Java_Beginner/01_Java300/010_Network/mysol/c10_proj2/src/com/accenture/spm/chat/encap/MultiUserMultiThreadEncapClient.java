package com.accenture.spm.chat.encap;

import java.net.Socket;

public class MultiUserMultiThreadEncapClient {

	public static void main(String[] args) throws IOException {
		System.out.println("-----Client-----");
		//1、建立连接: 使用Socket创建客户端 +服务的地址和端口
		Socket client =new Socket("localhost",8888);
		//2、客户端发送消息
		new Thread(new Send(client)).start();  
		new Thread(new Receive(client)).start();
	}

}
