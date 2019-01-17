package com.accenture.spm.commonclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("files/c1.txt");
		file1.createNewFile();
		System.out.println(file1);
		file1.renameTo(new File("files/bb1.txt")); 
		
		System.out.println(System.getProperty("user.dir"));
		
		File f2 = new File("gg.txt");
		f2.createNewFile();
		
		System.out.println("File if exist: "+f2.exists());
        System.out.println("File if dir: "+f2.isDirectory());
        System.out.println("File if file: "+f2.isFile());
        System.out.println("File last mod: "+new Date(f2.lastModified()));
        System.out.println("File size: "+f2.length());
        System.out.println("File name: "+f2.getName());
        System.out.println("File dir: "+f2.getAbsolutePath());
	}
	
}
