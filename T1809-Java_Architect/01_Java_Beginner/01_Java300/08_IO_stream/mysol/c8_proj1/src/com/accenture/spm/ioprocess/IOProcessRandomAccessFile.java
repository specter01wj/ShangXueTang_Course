package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFile {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		test3();
	}
	
	public static void test3() throws IOException {
		
		File src = new File("abc.txt");
		//总长度
		long len = src.length();
		//每块大小
		int blockSize =12;
		//块数: 多少块
		int size =(int) Math.ceil(len*1.0/blockSize);
		System.out.println(size);
		
		//起始位置和实际大小
		int beginPos = 0;
		int actualSize = (int)(blockSize>len?len:blockSize); 
		for(int i=0;i<size;i++) {
			beginPos = i*blockSize;
			if(i==size-1) { //最后一块
				actualSize = (int)len;
			}else {
				actualSize = blockSize;
				len -=actualSize; //剩余量
			}
			System.out.println(i+"-->"+beginPos +"-->"+actualSize);
			split(i,beginPos,actualSize);
		}
		
	}
	
	public static void split(int i,int beginPos,int actualSize ) throws IOException {
		RandomAccessFile raf =new RandomAccessFile(new File("abc.txt"),"r");
		//随机读取 
		raf.seek(beginPos);
		//读取
		//3、操作 (分段读取)
		byte[] flush = new byte[1024]; //缓冲容器
		int len = -1; //接收长度
		while((len=raf.read(flush))!=-1) {			
			if(actualSize>len) { //获取本次读取的所有内容
				System.out.println(new String(flush,0,len));
				actualSize -=len;
			}else { 
				System.out.println(new String(flush,0,actualSize));
				break;
			}
		}			
		
		raf.close();
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
