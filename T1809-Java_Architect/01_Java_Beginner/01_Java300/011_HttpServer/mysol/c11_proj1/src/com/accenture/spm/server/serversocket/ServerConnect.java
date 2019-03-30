package com.accenture.spm.server.serversocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {

	public static void main(String[] args) {
		ServerConnect server = new ServerConnect();
		server.start();
	}
	
	private ServerSocket serverSocket;
	
	public void start() {
		try {
			serverSocket =  new ServerSocket(8888);
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ServerSocket Failure....");
		}
	}
	
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("1 client Connected....");
			//获取请求协议
			InputStream is =client.getInputStream();
			byte[] datas = new byte[1024*1024];
			int len = is.read(datas);
			String requestInfo = new String(datas,0,len);
			System.out.println(requestInfo);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Client Error!");
		}
	}
	
	public void stop() {
		
	}

}
