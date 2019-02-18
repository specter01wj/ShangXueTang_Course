package com.accenture.spm.thread;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class WebDownloader {

	public void download(String url, String name) {
		FileUtils.copyURLToFile(new URL(url), new File(name));
	}
	
}
