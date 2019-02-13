package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFile {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "r");
		raf.seek(2);
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1) {
			System.out.println(new String(flush,0,len));
		}	
		raf.close();
	}
	
}
