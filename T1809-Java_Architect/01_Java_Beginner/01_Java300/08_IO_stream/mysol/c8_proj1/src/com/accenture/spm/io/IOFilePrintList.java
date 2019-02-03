package com.accenture.spm.io;

import java.io.File;

public class IOFilePrintList {

	public static void main(String[] args) {
		File src =  new File("./");
		
		printName(src, 0);
	}
	
	public static void printName(File src, int deep) {
		
		for(int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		
		System.out.println(src.getName());
		
		if(null == src || !src.exists()) {
			return;
		} else if(src.isDirectory()) {
			for(File s : src.listFiles()) {
				printName(s, deep+1);
			}
		}
	}
	
}
