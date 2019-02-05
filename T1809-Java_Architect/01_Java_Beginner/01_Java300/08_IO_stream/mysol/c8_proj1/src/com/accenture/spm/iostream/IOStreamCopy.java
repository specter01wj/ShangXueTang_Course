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
		
	}
	
	public static void streamCopy(String srcPath,String destPath) {
		File src = new File(srcPath); 
		File dest = new File(destPath);
		
		InputStream  is = null;
		OutputStream os = null;
		
		try {
			is =new FileInputStream(src);
			os = new FileOutputStream(dest);		
			
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}			
			os.flush();
		}catch(FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
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
