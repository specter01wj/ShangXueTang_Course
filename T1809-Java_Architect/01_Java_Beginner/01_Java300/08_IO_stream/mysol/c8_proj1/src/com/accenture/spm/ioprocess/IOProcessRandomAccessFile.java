package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "r");
		
	}
	
}
