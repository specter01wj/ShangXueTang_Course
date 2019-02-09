package com.accenture.spm.ioprocess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IOProcessBufferWriter {

	public static void main(String[] args) {
		File dest = new File("dest.txt");
		BufferedWriter writer =null;
		try {
			writer = new BufferedWriter(new FileWriter(dest));
			writer.append("IO is so easy");
			writer.newLine();
			writer.append("-- Coming to NYC!");
			writer.flush();
		}catch(FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (null != writer) {
					writer.close();
				} 
			} catch (Exception e) {
			}
		}
	}
	
}
