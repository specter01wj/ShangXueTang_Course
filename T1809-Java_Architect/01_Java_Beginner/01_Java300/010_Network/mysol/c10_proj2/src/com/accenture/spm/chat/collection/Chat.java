package com.accenture.spm.chat.collection;

public class Chat {

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
