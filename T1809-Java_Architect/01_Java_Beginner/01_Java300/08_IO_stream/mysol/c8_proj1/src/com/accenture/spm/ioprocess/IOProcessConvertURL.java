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
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"UTF-8"));){
			//3、操作 (读取)
			String msg ;
			while((msg=reader.readLine())!=null) {
				System.out.println(msg);
				writer.write(msg); //字符集不统一不够出现乱码
				writer.newLine();
			}					
			writer.flush();
		}catch(IOException e) {
			System.out.println("操作异常");
		}
		
	}
	
	public static void test2() {
		//操作网络流  下载百度的源代码
		try(InputStreamReader is =
				new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8");){
			//3、操作 (读取)
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}		
			
		}catch(IOException e) {
			System.out.println("操作异常");
		}
	}
	
	public static void test1() {
		//操作网络流  下载百度的源代码
		try(InputStream is =new URL("http://www.baidu.com").openStream();){
			//3、操作 (读取)
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp); //字节数不够出现乱码
			}		
			
		}catch(IOException e) {
			System.out.println("操作异常");
		}
		
		
	}

}
