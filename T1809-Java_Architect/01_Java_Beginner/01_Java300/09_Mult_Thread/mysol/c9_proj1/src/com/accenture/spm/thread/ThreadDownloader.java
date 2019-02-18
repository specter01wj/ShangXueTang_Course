package com.accenture.spm.thread;

public class ThreadDownloader extends Thread {

	private String url;
	private String name;
	
	public ThreadDownloader(String url, String name) {
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
