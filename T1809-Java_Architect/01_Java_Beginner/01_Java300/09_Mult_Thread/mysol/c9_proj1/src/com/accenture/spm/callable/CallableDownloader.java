package com.accenture.spm.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.accenture.spm.thread.WebDownloader;

public class CallableDownloader implements Callable<Boolean> {
	private String url;
	private String name;
	
	public CallableDownloader(String url, String name) {
		this.url = url;
		this.name = name;
	}

	@Override
	public Boolean call() throws Exception {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
		return true;
	}

	public static void main(String[] args) {
		CallableDownloader cd1 =new CallableDownloader("http://images6.fanpop.com/image/photos/33800000/Decepticon-Skystalker-transformers-33827443-988-508.jpg","tf_3.jpg");
		CallableDownloader cd2 =new CallableDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl_3.jpg");
		CallableDownloader cd3 =new CallableDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","brucelee_3.jpg");
		
		ExecutorService  ser=Executors.newFixedThreadPool(3);
		
		Future<Boolean> result1 =ser.submit(cd1);
		Future<Boolean> result2 =ser.submit(cd2);
		Future<Boolean> result3 =ser.submit(cd3);
	}

}
