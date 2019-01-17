package com.accenture.spm.commonclass;

import java.io.File;

public class PrintFileTree {

	public static void main(String[] args) {
		
		File file1 = new File("files");
		
		printFile(file1);
		
	}
	
	static void printFile(File file) {
		System.out.println(file.getName());
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File temp : files) {
				printFile(temp);
			}
		}
	}
	
}
