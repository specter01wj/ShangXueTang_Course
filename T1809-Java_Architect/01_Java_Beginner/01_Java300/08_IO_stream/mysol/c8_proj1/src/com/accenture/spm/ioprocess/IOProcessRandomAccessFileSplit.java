package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class IOProcessRandomAccessFileSplit {
	
	private File src;
	private String destDir;
	private List<String> destPaths;
	private int blockSize;
	private int size;

	public static void main(String[] args) throws IOException {
		IOProcessRandomAccessFileSplit sf = new IOProcessRandomAccessFileSplit("p.png","dest") ;
		sf.split();
		sf.merge("aaa.java");

	}
	
	public IOProcessRandomAccessFileSplit(String srcPath,String destDir) {
		this(srcPath,destDir,1024);
	}
	public IOProcessRandomAccessFileSplit(String srcPath,String destDir,int blockSize) {
		this.src =new File(srcPath);
		this.destDir =destDir;
		this.blockSize =blockSize;
		this.destPaths =new ArrayList<String>();
		
		 init();
	}
	
	private void init() {
		long len = this.src.length();		
		this.size =(int) Math.ceil(len*1.0/blockSize);
		
		for(int i=0;i<size;i++) {
			this.destPaths.add(this.destDir +"/"+i+"-"+this.src.getName());
		}
	}
	
	public void split() throws IOException {
		long len = src.length();		
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
			splitDetail(i,beginPos,actualSize);
		}
	}	
	
	private void splitDetail(int i,int beginPos,int actualSize ) throws IOException {
		RandomAccessFile raf =new RandomAccessFile(this.src,"r");
		RandomAccessFile raf2 =new RandomAccessFile(this.destPaths.get(i),"rw");

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
	/**
	 * 文件的合并
	 * @throws IOException 
	 */
	public void merge(String destPath) throws IOException {
		//输出流
		OutputStream os =new BufferedOutputStream( new FileOutputStream(destPath,true));	
		Vector<InputStream> vi=new Vector<InputStream>();
		SequenceInputStream sis =null;
		//输入流
		for(int i=0;i<destPaths.size();i++) {
			vi.add(new BufferedInputStream(new FileInputStream(destPaths.get(i))));											
		}
		sis =new SequenceInputStream(vi.elements());
		//拷贝
		//3、操作 (分段读取)
		byte[] flush = new byte[1024]; //缓冲容器
		int len = -1; //接收长度
		while((len=sis.read(flush))!=-1) {
			os.write(flush,0,len); //分段写出
		}			
		os.flush();	
		sis.close();
		os.close();
	}

}
