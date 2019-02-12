package com.accenture.spm.ioprocess;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IOProcessPrint {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = System.out;
		ps.println("Print Stream!");
		ps.println(true);
		
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
		ps.println("Print Stream!");
		ps.println(true);
		//ps.flush();
		ps.close();
		
		System.setOut(ps);
		System.out.println("change!");
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
		System.out.println("Back!!!");
		
	}
	
}
