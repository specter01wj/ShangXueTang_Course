package com.accenture.spm.ioprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class IOProcessConvertURL {

	public static void main(String[] args) {
		
		try(BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.google.com").openStream(),"UTF-8"));
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("google.html"),"UTF-8"));){
			
			String msg ;
			while((msg=reader.readLine())!=null) {
				System.out.println(msg);
				writer.write(msg);
				writer.newLine();
			}					
			writer.flush();
		}catch(IOException e) {
			System.out.println("Exception!");
		}
		
	}
	
	public static void test2() {
		
		try(InputStreamReader is =
				new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8");){
			
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}		
			
		}catch(IOException e) {
			System.out.println("Exception!");
		}
	}
	
	public static void test1() {
		
		try(InputStream is =new URL("http://www.baidu.com").openStream();){
			
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}		
			
		}catch(IOException e) {
			System.out.println("Exception!");
		}
		
		
	}

}
