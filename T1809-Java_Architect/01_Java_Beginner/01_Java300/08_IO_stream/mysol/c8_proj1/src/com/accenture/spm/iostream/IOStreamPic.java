package com.accenture.spm.iostream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamPic {

	public static void main(String[] args) {
		
		byte[] data = fileToByteArray("IO.png");
		System.out.println(data.length);
		byteArrayToFile(data,"io-byte.png");	
		
	}
	
	public static byte[] fileToByteArray(String filePath) {
		File src = new File(filePath);
		byte[] dest = null;
		
		InputStream is = null;
		ByteArrayOutputStream baos =null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			
			byte[] flush = new byte[1024*10];
			int len = -1;
			while((len = is.read(flush)) != -1) {
				baos.write(flush,0,len);
			}
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void byteArrayToFile(byte[] src, String filePath) {
		File dest = new File(filePath);
		
		InputStream  is =null;
		OutputStream os =null;
		try {
			is =new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			
			byte[] flush = new byte[5];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}		
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (null != os) {
					os.close();
				} 
			} catch (Exception e) {
			}
		}
	}
	
}
