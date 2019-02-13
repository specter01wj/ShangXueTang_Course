package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFile {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "r");
		
		raf.close();
	}
	
}
