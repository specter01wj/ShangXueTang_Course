package com.accenture.spm.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrow {

	public static void main(String[] args) throws IOException {
		
		readMyFile();
		
	}
	
	public static void readMyFile() throws IOException {
		FileReader reader = null;
		
		reader = new FileReader("bb1.txt");
		char c1 = (char) reader.read();
		char c2 = (char) reader.read();
		System.out.println("Read file content: " + c1 + c2);
		
		if(reader != null) {
			System.out.println("File close!");
			reader.close();
		}
	
	}
	
}
