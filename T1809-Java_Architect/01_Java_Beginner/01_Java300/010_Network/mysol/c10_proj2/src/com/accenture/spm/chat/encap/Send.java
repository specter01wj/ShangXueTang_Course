package com.accenture.spm.chat.encap;

public class Send implements Runnable {

	private BufferedReader console ;
	private DataOutputStream dos;
	private Socket client;
	private boolean isRunning;
	public Send(Socket client) {
		this.client =client;
		console =new BufferedReader(new InputStreamReader(System.in));
		this.isRunning = true;
		try {
			dos =new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			System.out.println("==1==");
			this.release();
		}	
	}
	@Override
	public void run() {
		while(isRunning) {
			String msg = getStrFromConsole();
			if(!msg.equals("")) {
				send(msg);
			}
		}
	}	
	//发送消息
	private void send(String msg) {
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("===3==");
			release();
		}
	}
	/**
	 * 从控制台获取消息
	 * @return
	 */
	private String getStrFromConsole() {
		try {
			return  console.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	//释放资源
	private void release() {
		this.isRunning = false;
		SxtUtils.close(dos,client);
	}
	
}
