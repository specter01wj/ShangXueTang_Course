package com.accenture.spm.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestIOException {

	public static void main(String[] args) {
		
		readMyFile();
		
	}
	
	public static void readMyFile() {
		FileReader reader = null;
		
		try {
			reader = new FileReader("bb1.txt");
			char c1 = (char) reader.read();
			char c2 = (char) reader.read();
			System.out.println("Read file content: " + c1 + c2);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					System.out.println("File close!");
					reader.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
