package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOStreamWriter {

	public static void main(String[] args) {
		
		File src = new File("dest_3.txt");
		Writer writer = null;
		
		try {
			writer = new FileWriter(src, true);
			
			String msg = "James Wang is coming!\r\n王进在华盛顿！！！";
			/*char[] data = msg.toCharArray();
			writer.write(data, 0, data.length);*/
			writer.write(msg);
			writer.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null!=writer) {
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
