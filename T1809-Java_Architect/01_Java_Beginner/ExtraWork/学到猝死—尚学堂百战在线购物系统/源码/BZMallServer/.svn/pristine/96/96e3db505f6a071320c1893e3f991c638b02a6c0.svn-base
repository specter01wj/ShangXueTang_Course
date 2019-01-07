package com.xdcs.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import com.xdcs.service.Protocol;

/**
 * 服务器启动类
 * 
 * @author Administrator
 *
 */
public class BZMallServer {
	public static Map<String, Socket> socketMap = new HashMap<>();

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			while (true) {
				final Socket socket = serverSocket.accept();
				// System.out.println("1111");
				Thread th = new Thread(new Protocol(socket, socketMap));
				// System.out.println("22222");
				th.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
