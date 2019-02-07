package com.accenture.spm.iostream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamFileUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("abc_4.txt");
			copy(is,os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("IO.png");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			copy(is,os);
			datas = os.toByteArray();
			System.out.println(datas.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			InputStream is = new ByteArrayInputStream(datas);
			OutputStream os = new FileOutputStream("io-copy4.png");
			copy(is,os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void copy(InputStream is,OutputStream os) {
		
		try {
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}			
			os.flush();
		}catch(FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (null != os) {
					os.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
