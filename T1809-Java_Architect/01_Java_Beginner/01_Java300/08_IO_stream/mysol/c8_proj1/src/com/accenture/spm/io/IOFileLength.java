package com.accenture.spm.io;

import java.io.File;

public class IOFileLength {

	public static void main(String[] args) {
		File src = new File("IO.png");
		
		System.out.println("Len: " + src.length());
		
		src = new File("/Users/jinwang/Work/StudyGround/ShangXueTang/T1809-Java_Architect/01_Java_Beginner/01_Java300/08_IO_stream/mysol/c8_proj1/IO.png");
		System.out.println("Len Abs File: " + src.length());
		
		src = new File("/Users/jinwang/Work/StudyGround/ShangXueTang/T1809-Java_Architect/01_Java_Beginner/01_Java300/08_IO_stream/mysol/c8_proj1/io_test");
		System.out.println("Len Dir:"+ src.length());
	}
	
}
