package com.accenture.spm.runnable;
import com.accenture.spm.thread.WebDownloader;

public class RunnableDownloader implements Runnable {

	private String url; //远程路径
	private String name;  //存储名字
	
	public RunnableDownloader(String url, String name) {
		this.url = url; 
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		RunnableDownloader td1 =new RunnableDownloader("http://images6.fanpop.com/image/photos/33800000/Decepticon-Skystalker-transformers-33827443-988-508.jpg","tf_2.jpg");
		RunnableDownloader td2 =new RunnableDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl_2.jpg");
		RunnableDownloader td3 =new RunnableDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","brucelee_2.jpg");
		
		//启动三个线程
		new Thread(td1).start();
		new Thread(td2).start();
		new Thread(td3).start();
	}
	
}
