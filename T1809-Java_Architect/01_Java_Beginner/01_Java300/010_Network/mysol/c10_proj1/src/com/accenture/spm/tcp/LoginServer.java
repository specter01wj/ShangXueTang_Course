package com.accenture.spm.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

	public static void main(String[] args) throws IOException {
		System.out.println("-----Server-----");
		// 1、指定端口 使用ServerSocket创建服务器
		ServerSocket server =new ServerSocket(8888);
		// 2、阻塞式等待连接 accept
		Socket  client =server.accept(); 
		System.out.println("1 client connected!");
		// 3、操作: 输入输出流操作
		DataInputStream dis =new DataInputStream(client.getInputStream());
		String datas =dis.readUTF();
		//分析
		String[] dataArray = datas.split("&");
		for(String info:dataArray) {
			String[] userInfo =info.split("=");
				if(userInfo[0].equals("uname")) {
					System.out.println("Your name:"+userInfo[1]);
				}else if(userInfo[0].equals("upwd")) {
					System.out.println("Your password:"+userInfo[1]);
				}
				
		}
		// 4、释放资源 
		dis.close();
		client.close();
		
		server.close();
	}

}
