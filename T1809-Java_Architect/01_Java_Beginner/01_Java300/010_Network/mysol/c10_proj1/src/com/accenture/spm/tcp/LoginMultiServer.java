package com.accenture.spm.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginMultiServer {

	public static void main(String[] args) throws IOException {
		System.out.println("-----Server-----");
		// 1、指定端口 使用ServerSocket创建服务器
		ServerSocket server =new ServerSocket(8888);
		boolean isRunning =true;;
		// 2、阻塞式等待连接 accept
		while(isRunning) {
			Socket  client =server.accept(); 
			System.out.println("1 client connected!");
			new Thread(new Channel(client)).start();
		}
		server.close();
	}
	
	static class Channel implements Runnable{
		private Socket  client;
		//输入流
		private DataInputStream dis;
		//输出流
		private DataOutputStream dos;
		
		public Channel(Socket  client) {
			this.client = client;
			try {
				//输入
				dis = new DataInputStream(client.getInputStream());
				//输出
				dos =new DataOutputStream(client.getOutputStream());	
			} catch (IOException e) {
				e.printStackTrace();
				release();
			}
			
		}
		
		//接收数据
		private String receive() {
			String datas ="";
			try {
				datas = dis.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return datas;
		}
		
		//释放资源
		private void release() {
			// 4、释放资源 
			try {
				if(null != dos) {
					dos.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null != dis) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null != client) {
					client.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//发送数据
		private void send(String msg) {
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {						
			// 3、操作: 输入输出流操作					
			String uname ="";
			String upwd ="";
			//分析
			String[] dataArray = receive().split("&");
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
			if(uname.equals("specter01wj") && upwd.equals("551365")) { //成功
				send("Success! Welcome Back!!!");
			}else { //失败
				send("Wrong password or username???");
			}
			release();
		}
		
	}

}
