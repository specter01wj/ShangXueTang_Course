package com.accenture.spm.ioprocess;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOProcessPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
	
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print_pw.txt")), true);
		pw.println("Print Stream!");
		pw.println(true);
		pw.close();

	}

}
