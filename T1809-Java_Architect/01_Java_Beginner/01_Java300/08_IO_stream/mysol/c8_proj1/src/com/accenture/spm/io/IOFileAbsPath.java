package com.accenture.spm.io;

import java.io.File;

public class IOFileAbsPath {

	public static void main(String[] args) {
		String path = "IO.png";
		
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
	}
	
}
