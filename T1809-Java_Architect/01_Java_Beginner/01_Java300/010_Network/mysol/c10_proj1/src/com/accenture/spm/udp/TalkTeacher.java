package com.accenture.spm.udp;

public class TalkTeacher {

	public static void main(String[] args) {
		new Thread(new TalkReceive(9999,"student")).start();
		
		new Thread(new TalkSend(5555,"localhost",8888)).start();
	}

}
