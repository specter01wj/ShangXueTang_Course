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
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ThreadDownloader td1 = new ThreadDownloader("http://images6.fanpop.com/image/photos/33800000/Decepticon-Skystalker-transformers-33827443-988-508.jpg","tf.jpg");
		ThreadDownloader td2 = new ThreadDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
		ThreadDownloader td3 = new ThreadDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","brucelee.jpg");

		td1.start();
		td2.start();
		td3.start();
	}

}
