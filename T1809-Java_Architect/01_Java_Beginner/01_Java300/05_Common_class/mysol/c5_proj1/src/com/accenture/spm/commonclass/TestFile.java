package com.accenture.spm.commonclass;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("files/c1.txt");
		file1.createNewFile();
		System.out.println(file1);
		file1.renameTo(new File("files/bb1.txt")); 
		
		System.out.println(System.getProperty("user.dir"));
	}
	
}
