package com.accenture.spm.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Login2WayServer {

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
		String uname ="";
		String upwd ="";
		//分析
		String[] dataArray = datas.split("&");
		for(String info:dataArray) {
				String[] userInfo =info.split("=");
				if(userInfo[0].equals("uname")) {
					System.out.println("Your Name:"+userInfo[1]);
					uname = userInfo[1];
				}else if(userInfo[0].equals("upwd")) {
					System.out.println("Your Password:"+userInfo[1]);
					upwd = userInfo[1];
				}				
		}
		//输出
		DataOutputStream dos =new DataOutputStream(client.getOutputStream());			
		if(uname.equals("specter01wj") && upwd.equals("551365")) { //成功
			dos.writeUTF("Success! Welcome Back!!");
		}else { //失败
			dos.writeUTF("Wrong User name or password?");
		}
		dos.flush();
		// 4、释放资源 
		dis.close();
		client.close();
		
		server.close();
	}

}
