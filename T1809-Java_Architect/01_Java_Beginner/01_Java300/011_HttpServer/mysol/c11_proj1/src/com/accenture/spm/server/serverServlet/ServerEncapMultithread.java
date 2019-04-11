package com.accenture.spm.server.serverServlet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEncapMultithread {

	public static void main(String[] args) {
		ServerEncapMultithread server = new ServerEncapMultithread();
		server.start();
	}
	
	private ServerSocket serverSocket;
	private boolean isRunning;
	
	public void start() {
		try {
			serverSocket =  new ServerSocket(8888);
			isRunning = true;
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ServerSocket Failure....");
		}
	}
	
	public void receive() {
		while(isRunning) {
			try {
				Socket client = serverSocket.accept();
				System.out.println("1 client Connected....");
				//获取请求协议
				Request request = new Request(client);
				Response response = new Response(client);
				
				//关注了内容
				Servlet servlet= WebApp.getServletFromUrl(request.getUrl());
				
				if(null!=servlet) {
					servlet.service(request, response);
					//关注了状态码
					response.pushToBrowser(200);
				}else {
					//错误....
					response.pushToBrowser(404);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Client Error!");
			}
		}
	}
	
	public void stop() {
		isRunning = false;
		try {
			this.serverSocket.close();
			System.out.println("Server Stopped!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
