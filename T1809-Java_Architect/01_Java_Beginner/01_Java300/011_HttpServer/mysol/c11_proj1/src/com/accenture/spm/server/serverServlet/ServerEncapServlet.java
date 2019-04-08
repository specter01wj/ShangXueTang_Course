package com.accenture.spm.server.serverServlet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEncapServlet {

	public static void main(String[] args) {
		ServerEncapServlet server = new ServerEncapServlet();
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
			Request request =new Request(client);
			
			
			
			Response response =new Response(client);
			
			//关注了内容
			Servlet servlet= null;
			if(request.getUrl().equals("login")) {
				servlet= new LoginServlet();
			}else if(request.getUrl().equals("reg")) {
				servlet= new RegisterServlet();
			}else {
				//首页....
				servlet= new LoginServlet();
			}
			
			servlet.service(request, response);		
			//关注了状态码
			response.pushToBrowser(200);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Client Error!");
		}
	}
	
	public void stop() {
		
	}

}
