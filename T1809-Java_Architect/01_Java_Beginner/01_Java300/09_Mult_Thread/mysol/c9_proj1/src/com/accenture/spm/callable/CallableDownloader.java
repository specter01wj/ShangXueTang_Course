package com.accenture.spm.callable;

import com.accenture.spm.thread.WebDownloader;
import java.util.concurrent.Callable;

public class CallableDownloader implements Callable {
	private String url;
	private String name;
	
	public CallableDownloader(String url, String name) {
		this.url = url;
		this.name = name;
	}

	@Override
	public Object call() throws Exception {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
		return true;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
