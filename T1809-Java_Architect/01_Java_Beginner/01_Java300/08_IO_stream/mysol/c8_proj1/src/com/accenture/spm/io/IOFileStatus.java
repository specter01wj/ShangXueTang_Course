package com.accenture.spm.io;

import java.io.File;

public class IOFileStatus {

	public static void main(String[] args) {
		
		File src = new File("IO.png");
		System.out.println(src.getAbsolutePath());
		System.out.println("Exist:" + src.exists());
		System.out.println("File:" + src.isFile());
		System.out.println("Directory:" + src.isDirectory());
		
	}
	
}
