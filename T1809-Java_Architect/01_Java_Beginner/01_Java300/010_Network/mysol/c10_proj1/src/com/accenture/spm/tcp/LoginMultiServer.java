package com.accenture.spm.tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class LoginMultiServer {

	public static void main(String[] args) {
		System.out.println("-----Server-----");
		// 1、指定端口 使用ServerSocket创建服务器
		ServerSocket server =new ServerSocket(8888);
		boolean isRunning =true;;
		// 2、阻塞式等待连接 accept
		while(isRunning) {
			Socket  client =server.accept(); 
			System.out.println("一个客户端建立了连接");
			new Thread(new Channel(client)).start();
		}
		server.close();
	}

}
