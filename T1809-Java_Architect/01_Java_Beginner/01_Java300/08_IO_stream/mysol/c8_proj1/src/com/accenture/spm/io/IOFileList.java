package com.accenture.spm.io;

import java.io.File;

public class IOFileList {

	public static void main(String[] args) {
		
		File dir = new File("src");
		
		String[] subNames = dir.list();
		
		for(String s : subNames) {
			System.out.println(s);
		}
		
		File[] subFiles = dir.listFiles();
		for(File s : subFiles) {
			System.out.println(s);
			//System.out.println(s.getAbsolutePath());
		}
		
	}
	
}
