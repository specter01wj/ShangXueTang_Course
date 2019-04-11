package com.accenture.spm.server.serverServlet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEncapIndex {

	public static void main(String[] args) {
		ServerEncapIndex server = new ServerEncapIndex();
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
				//多线程处理
				new Thread(new Dispatcher(client)).start();
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
