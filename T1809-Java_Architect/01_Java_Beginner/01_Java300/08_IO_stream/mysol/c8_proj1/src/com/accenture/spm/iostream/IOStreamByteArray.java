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
			int temp;
			while((temp = is.read()) != -1) {
				System.out.println((char)temp);
			}
			
			
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
		
	}
	
}
