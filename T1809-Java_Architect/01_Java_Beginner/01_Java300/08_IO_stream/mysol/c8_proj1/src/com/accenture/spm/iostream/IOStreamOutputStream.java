package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStreamOutputStream {

	public static void main(String[] args) {
		
		File src = new File("dest.txt");
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(src);
			
			String msg = "James Wang is coming!";
			byte[] data = msg.getBytes();
			os.write(data, 0, data.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null!=os) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
