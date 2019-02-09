package com.accenture.spm.ioprocess;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOProcessBufferInput {

	public static void main(String[] args) {
		File src = new File("abc.txt");
		InputStream  is =null;
		try {
			is =new BufferedInputStream(new FileInputStream(src));
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
	}
	
	public static void test1() {
		File src = new File("abc.txt");
		InputStream  is =null;
		BufferedInputStream bis =null;
		try {
			is =new FileInputStream(src);
			bis = new BufferedInputStream(is);
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null!=bis) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
