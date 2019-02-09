package com.accenture.spm.ioprocess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOProcessBufferReader {

	public static void main(String[] args) {
		File src = new File("abc.txt");
		BufferedReader  reader =null;
		try {
			reader =new BufferedReader(new FileReader(src));
			String line =null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=reader) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
