package com.accenture.spm.io;

import java.io.File;

public class IOFileGet {

	public static void main(String[] args) {
		File src = new File("c8_proj1/IO.png");
		
		System.out.println(src.length());
		System.out.println("name: " + src.getName());
	}
	
}
