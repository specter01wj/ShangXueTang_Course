package com.accenture.spm.ioprocess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOProcessRandomAccessFileRW {

	public static void main(String[] args) throws IOException {
		File src = new File("p.png");
		
		long len = src.length();
		int blockSize =1024*20;
		int size =(int) Math.ceil(len*1.0/blockSize);
		System.out.println(size);
		
		int beginPos = 0;
		int actualSize = (int)(blockSize>len?len:blockSize); 
		for(int i=0;i<size;i++) {
			beginPos = i*blockSize;
			if(i==size-1) {
				actualSize = (int)len;
			}else {
				actualSize = blockSize;
				len -=actualSize;
			}
			System.out.println(i+"-->"+beginPos +"-->"+actualSize);
			split(i,beginPos,actualSize);
		}

	}
	
	public static void split(int i,int beginPos,int actualSize ) throws IOException {
		RandomAccessFile raf =new RandomAccessFile(new File("p.png"),"r");
		RandomAccessFile raf2 =new RandomAccessFile(new File("dest/"+i+"p.png"),"rw");
		
		raf.seek(beginPos);
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1) {			
			if(actualSize>len) {
				raf2.write(flush, 0, len);
				actualSize -=len;
			}else { 
				raf2.write(flush, 0, actualSize);
				break;
			}
		}			
		raf2.close();
		raf.close();
	}

}
