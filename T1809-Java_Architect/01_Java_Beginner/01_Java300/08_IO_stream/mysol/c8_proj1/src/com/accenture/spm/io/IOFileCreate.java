package com.accenture.spm.io;

import java.io.File;
import java.io.IOException;

public class IOFileCreate {

	public static void main(String[] args) throws IOException {
		File src = new File("io.txt");
		boolean flag = src.createNewFile();
		System.out.println(flag);
		
	}
	
}
