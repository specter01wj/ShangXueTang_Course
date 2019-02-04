package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IOStreamInputStream {

	public static void main(String[] args) {
		
		File src = new File("abc.txt");
		
		try {
			InputStream is = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
