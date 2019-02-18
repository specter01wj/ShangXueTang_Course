package com.accenture.spm.thread;

public class WebDownloader {

	public void download(String url, String name) {
		FileUtils.copyURLToFile(new URL(url), new File(name));
	}
	
}
