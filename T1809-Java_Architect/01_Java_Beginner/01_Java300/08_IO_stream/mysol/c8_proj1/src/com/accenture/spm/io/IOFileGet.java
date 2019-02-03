package com.accenture.spm.io;

import java.io.File;

public class IOFileGet {

	public static void main(String[] args) {
		File src = new File("IO.png");
		
		System.out.println(src.length());
		System.out.println("name: " + src.getName());
		System.out.println("path: " + src.getPath());
		System.out.println("path: " + src.getAbsolutePath());
		System.out.println("Parent path:" + src.getParent());
		//System.out.println("Parent class:" + src.getParentFile().getName());
	}
	
}
