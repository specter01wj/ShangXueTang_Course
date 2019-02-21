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
		CallableDownloader cd1 =new CallableDownloader("http://images6.fanpop.com/image/photos/33800000/Decepticon-Skystalker-transformers-33827443-988-508.jpg","tf_3.jpg");
		CallableDownloader cd2 =new CallableDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl_3.jpg");
		CallableDownloader cd3 =new CallableDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","brucelee_3.jpg");
		

	}

}
