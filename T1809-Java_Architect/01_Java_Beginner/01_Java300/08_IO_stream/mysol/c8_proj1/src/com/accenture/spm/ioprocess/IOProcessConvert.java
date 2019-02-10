package com.accenture.spm.ioprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOProcessConvert {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(System.out));){
					
					String msg ="";
					while(!msg.equals("exit")) {
						msg = reader.readLine();
						writer.write(msg);
						writer.newLine();
						writer.flush();
					}
				}catch(IOException e) {
					System.out.println("操作异常");
				}
		
	}
	
}
