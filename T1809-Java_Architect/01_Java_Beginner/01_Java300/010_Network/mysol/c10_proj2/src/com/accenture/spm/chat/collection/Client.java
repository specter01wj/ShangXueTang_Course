package com.accenture.spm.chat.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		System.out.println("-----Client-----");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Your name:");
		String name =br.readLine();
		//1、建立连接: 使用Socket创建客户端 +服务的地址和端口
		Socket client =new Socket("localhost",8888);
		//2、客户端发送消息
		new Thread(new Send(client,name)).start();  
		new Thread(new Receive(client)).start();
		
		
		
		
		
		
	}

}
