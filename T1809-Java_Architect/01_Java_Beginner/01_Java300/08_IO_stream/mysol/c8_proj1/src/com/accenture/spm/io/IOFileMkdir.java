package com.accenture.spm.io;

import java.io.File;

public class IOFileMkdir {

	public static void main(String[] args) {
		File dir = new File("mkdir");
		
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		File dir2 = new File("mkdirs/test");
		
		boolean flag2 = dir2.mkdirs();
		System.out.println(flag2);
		
	}
	
}
