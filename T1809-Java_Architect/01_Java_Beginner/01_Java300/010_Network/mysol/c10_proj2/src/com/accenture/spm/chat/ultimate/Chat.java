package com.accenture.spm.chat.ultimate;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Channel;
import java.util.concurrent.CopyOnWriteArrayList;

public class Chat {
	
	private static CopyOnWriteArrayList<Channel> all =new CopyOnWriteArrayList<Channel>();

	public static void main(String[] args) {
		System.out.println("-----Server-----");
		// 1、指定端口 使用ServerSocket创建服务器
		ServerSocket server =new ServerSocket(8888);
		// 2、阻塞式等待连接 accept
		while(true) {
			Socket  client =server.accept(); 
			System.out.println("一个客户端建立了连接");
			Channel c =new Channel(client);
			all.add(c); //管理所有的成员
			new Thread(c).start();			
		}	
	}

}
