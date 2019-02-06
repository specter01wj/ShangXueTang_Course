package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamReader {

public static void main(String[] args) {
		
		File src = new File("abc.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			
			byte[] flush = new byte[5];
			int len = -1;
			while((len = is.read(flush)) != -1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
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
