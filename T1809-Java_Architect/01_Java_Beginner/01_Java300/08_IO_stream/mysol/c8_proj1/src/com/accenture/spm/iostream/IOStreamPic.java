package com.accenture.spm.iostream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamPic {

	public static void main(String[] args) {
		
		byte[] data = fileToByteArray("IO.png");
		System.out.println(data.length);
		
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
			while((len = is.read()) != -1) {
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
	
	public static void ByteArrayToFile(byte[] src, String filePath) {
		
	}
	
}
