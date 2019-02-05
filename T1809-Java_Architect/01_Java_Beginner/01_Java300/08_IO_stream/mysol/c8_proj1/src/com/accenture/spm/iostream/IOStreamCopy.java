package com.accenture.spm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamCopy {

	public static void main(String[] args) {
		File src = new File("abc.txt"); 
		File dest = new File("io.txt");
		
		InputStream  is = null;
		OutputStream os = null;
		
		try {
			is =new FileInputStream(src);
			os = new FileOutputStream(dest);		
			
			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len); //分段写出
			}			
			os.flush();
		}catch(FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			//4、释放资源 分别关闭 先打开的后关闭
			try {
				if (null != os) {
					os.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
