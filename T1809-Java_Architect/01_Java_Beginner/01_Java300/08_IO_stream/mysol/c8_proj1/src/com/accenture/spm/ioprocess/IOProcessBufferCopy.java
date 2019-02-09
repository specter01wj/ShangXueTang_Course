package com.accenture.spm.ioprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOProcessBufferCopy {

	public static void main(String[] args) {
		copy("abc.txt","abc-copy.txt"); 
	}	
	public static void copy(String srcPath,String destPath) {
			File src = new File(srcPath);
			File dest = new File(destPath);
			
			try( BufferedReader br=new BufferedReader(new FileReader(src));
					BufferedWriter bw =new BufferedWriter( new FileWriter(dest));	) {				
				
				String line =null;
				while((line=br.readLine())!=null) {
					bw.write(line);
					bw.newLine();
				}			
				bw.flush();
			}catch(FileNotFoundException e) {		
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
