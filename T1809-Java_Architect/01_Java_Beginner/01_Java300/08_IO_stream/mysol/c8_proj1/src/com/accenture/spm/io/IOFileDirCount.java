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

	public long getLen() {
		return len;
	}

	public int getFileSize() {
		return fileSize;
	}

	public int getDirSize() {
		return dirSize;
	}


	public static void main(String[] args) {
		IOFileDirCount dir = new IOFileDirCount("./src");
		System.out.println(dir.getLen());
		System.out.println(dir.getFileSize()+"-->"+dir.getDirSize());
		
		System.out.println("=============");
		
		IOFileDirCount dir2 = new IOFileDirCount("./bin");
		System.out.println(dir2.getLen());
		System.out.println(dir2.getFileSize()+"-->"+dir2.getDirSize());
	}
	
}
