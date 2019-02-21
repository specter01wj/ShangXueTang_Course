package com.accenture.spm.callable;

import java.util.concurrent.Callable;

public class CallableDownloader implements Callable {
	private String url;
	private String name;
	
	public CallableDownloader(String url, String name) {
		this.url = url;
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
