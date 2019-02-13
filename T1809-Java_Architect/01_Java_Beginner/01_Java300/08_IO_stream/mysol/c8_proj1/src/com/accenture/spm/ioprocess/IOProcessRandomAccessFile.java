package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFile {

	public static void main(String[] args) throws IOException {
		//test1();
		test2();
		
	}
	
	public static void test2() throws IOException {
		RandomAccessFile raf =new RandomAccessFile(new File("abc.txt"),"r");

		int beginPos =12;
		int actualSize = 1026;
		raf.seek(beginPos);
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1) {			
			if(actualSize>len) {
				System.out.println(new String(flush,0,len));
				actualSize -=len;
			}else { 
				System.out.println(new String(flush,0,actualSize));
				break;
			}
		}			
		
		raf.close();
	}
	
	public static void test1() throws IOException {
		
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
