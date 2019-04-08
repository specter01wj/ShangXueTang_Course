package com.accenture.spm.server.serversocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEncapResponseMap {

	public static void main(String[] args) {
		ServerEncapResponseMap server = new ServerEncapResponseMap();
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
			RequestMap request =new RequestMap(client);
			
			Response response =new Response(client);
			//关注了内容
			response.print("<html>");
			response.print("<head>");
			response.print("<title>");
			response.print("Server Response Success!!!");
			response.print("</title>");
			response.print("</head>");
			response.print("<body>");
			response.print("James's server is Back!!!" + request.getParameter("uname"));
			response.print("</body>");
			response.print("</html>");
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
