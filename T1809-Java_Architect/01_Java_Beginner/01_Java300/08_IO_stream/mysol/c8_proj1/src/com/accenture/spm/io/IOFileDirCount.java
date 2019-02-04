package com.accenture.spm.io;

import java.io.File;

public class IOFileDirCount {

	private long len;
	private String path;
	private File src;
	private int fileSize;
	private int dirSize;
	
	public IOFileDirCount(String path) {
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}

	private void count(File src) {	
		
		if(null!=src && src.exists()) {
			if(src.isFile()) {
				len+=src.length();
				this.fileSize++;
			}else {
				this.dirSize++;
				for(File s:src.listFiles()) {
					count(s);
				}
			}
		}
	}	


	public static void main(String[] args) {
		IOFileDirCount dir = new IOFileDirCount("./src");
		
		
	}
	
}
