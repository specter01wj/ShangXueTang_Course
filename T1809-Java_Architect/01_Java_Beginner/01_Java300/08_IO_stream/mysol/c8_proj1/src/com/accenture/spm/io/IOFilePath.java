package com.accenture.spm.io;

import java.io.File;

public class IOFilePath {

	public static void main(String[] args) {
		String path = "IO.png";
		
		File src = new File(path);
		System.out.println(src.length());
	}
	
}
