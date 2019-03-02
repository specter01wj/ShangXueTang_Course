package com.accenture.spm.tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class LoginClient {

	public static void main(String[] args) throws IOException {
		System.out.println("-----Client-----");
		BufferedReader console =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input your name:");
		String uname =console.readLine();
		System.out.print("Input password:");
		String upwd =console.readLine();
		
		//1、建立连接: 使用Socket创建客户端 +服务的地址和端口
		Socket client =new Socket("localhost",8888);
		//2、操作: 输入输出流操作
		DataOutputStream dos =new DataOutputStream(client.getOutputStream());		
		dos.writeUTF("uname="+uname+"&"+"upwd="+upwd);
		dos.flush();
		//3、释放资源 
		dos.close();
		client.close();
		
		
		
	}

}
