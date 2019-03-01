package com.accenture.spm.tcp;

public class LoginClient {

	public static void main(String[] args) {
		System.out.println("-----Client-----");
		BufferedReader console =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入用户名:");
		String uname =console.readLine();
		System.out.print("请输入密码:");
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
