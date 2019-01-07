package com.xdcs.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 初始化socket 获取传输流
 * 
 * @author Administrator
 *
 */
public class SocketUtil {
	// 创建套接字
	private static Socket socket;
	// 创建字符打印流
	private static PrintWriter pw;
	// 创建字符输入流
	private static BufferedReader br;
	// 创建对象输入流
	private static ObjectInputStream ois;
	// 创建对象输出流
	private static ObjectOutputStream oos;
	// 创建工具类对象
	// 保证单例模式
	private static SocketUtil socketUtil;

	private SocketUtil() {

	}

	/**
	 * 获取socket套接字并初始化 如果socket存在，继续使用 如果不存在，初始化socket
	 */
	private static void getSocket() {
		if (socketUtil == null) {
			socketUtil = new SocketUtil();
			try {
				socket = new Socket("127.0.0.1", 8888);
				// 获取对象输出流
				oos = new ObjectOutputStream(socket.getOutputStream());
				// 获取对象输入流
				ois = new ObjectInputStream(socket.getInputStream());
				// 获取字符打印流
				pw = new PrintWriter(socket.getOutputStream());
				// 获取字符输入流
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 获取字符输入流
	 * 
	 * @return
	 */
	public static BufferedReader getBufferedReader() {
		getSocket();
		return br;
	}

	/**
	 * 获取字符打印流
	 * 
	 * @return
	 */
	public static PrintWriter getPrintWriter() {
		getSocket();
		return pw;
	}

	/**
	 * 获取对象输入流
	 * 
	 * @return
	 */
	public static ObjectInputStream getObjectInputStream() {
		getSocket();
		return ois;
	}

	/**
	 * 获取对象输入流
	 * 
	 * @return
	 */
	public static ObjectOutputStream getObjectOutputStream() {
		getSocket();
		return oos;
	}

	/**
	 * 判断socket是否连接状态
	 * 
	 * @return
	 */
	public static boolean socketConnection() {
		return socket.isConnected();
	}

	/**
	 * 判断socket是否为空
	 * 
	 * @return
	 */
	public static boolean socketEmpty() {
		if (socket == null) {
			return true;
		}
		return false;
	}
}
