package com.accenture.spm.io;

import java.io.File;

public class IOFileStatus {

	public static void main(String[] args) {
		
		File src = new File("IO.png");
		System.out.println(src.getAbsolutePath());
		System.out.println("Exist:" + src.exists());
		System.out.println("File:" + src.isFile());
		System.out.println("Directory:" + src.isDirectory());
		
		File src2 = new File("io_test");
		System.out.println(src2.getAbsolutePath());
		System.out.println("Exist:" + src2.exists());
		System.out.println("File:" + src2.isFile());
		System.out.println("Directory:" + src2.isDirectory());
		
		src = new File("IO.png");
		if(null == src || !src.exists()) {
			System.out.println("File not exist!");
		}else {
			if(src.isFile()) {
				System.out.println("File!");
			}else {
				System.out.println("Directory!");
			}
		}
		
	}
	
}
