package com.accenture.spm.iostream;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamByteArray {

	public static void main(String[] args) {
		
		byte[] src = "James Wang from Maryland!!".getBytes();
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);
			
			byte[] flush = new byte[5];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}			
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
		
	}
	
}
