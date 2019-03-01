package com.accenture.spm.tcp;

public class Client {

	public static void main(String[] args) {
		System.out.println("-----Client-----");
		//1、建立连接: 使用Socket创建客户端 +服务的地址和端口
		Socket client =new Socket("localhost",8888);
		//2、操作: 输入输出流操作
		DataOutputStream dos =new DataOutputStream(client.getOutputStream());
		String data ="hello";
		dos.writeUTF(data);
		dos.flush();
		//3、释放资源 
		dos.close();
		client.close();
	}

}
