package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamInputStreamCache {

	public static void main(String[] args) {
		
		File src = new File("abc.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			
			byte[] car = new byte[3];
			int len = -1;
			while((len = is.read(car)) != -1) {
				String str = new String(car, 0, len);
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
