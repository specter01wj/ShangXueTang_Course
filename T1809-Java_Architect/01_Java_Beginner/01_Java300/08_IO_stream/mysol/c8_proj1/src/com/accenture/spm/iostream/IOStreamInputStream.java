package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamInputStream {

	public static void main(String[] args) {
		
		File src = new File("abc.txt");
		
		try {
			InputStream is = new FileInputStream(src);
			
			int data1 = is.read();
			int data2 = is.read();
			int data3 = is.read();
			System.out.println((char)data1);
			System.out.println((char)data2);
			System.out.println((char)data3);
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
