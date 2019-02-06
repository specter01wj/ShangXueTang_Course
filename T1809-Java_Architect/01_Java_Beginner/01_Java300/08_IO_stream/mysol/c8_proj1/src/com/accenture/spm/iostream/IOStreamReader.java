package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOStreamReader {

public static void main(String[] args) {
		
		File src = new File("abc.txt");
		Reader reader = null;
		try {
			reader = new FileReader(src);
			
			char[] flush = new char[1024];
			int len = -1;
			while((len = reader.read(flush)) != -1) {
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
				if(null!=reader) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
