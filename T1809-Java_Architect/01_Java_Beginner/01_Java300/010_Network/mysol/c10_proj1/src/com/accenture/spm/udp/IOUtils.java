package com.accenture.spm.udp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {

	public static byte[] fileToByteArray(String filePath) {
		//1、创建源与目的地
		File src = new File(filePath);
		byte[] dest =null;
		//2、选择流
		InputStream  is =null;
		ByteArrayOutputStream baos =null;
		try {
			is =new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			//3、操作 (分段读取)
			byte[] flush = new byte[1024*10]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);		 //写出到字节数组中			
			}		
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;		
	}
	
	public static void byteArrayToFile(byte[] src,String filePath) {
		//1、创建源
		File dest = new File(filePath);
		//2、选择流
		InputStream  is =null;
		OutputStream os =null;
		try {
			is =new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			//3、操作 (分段读取)
			byte[] flush = new byte[5]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);			//写出到文件	
			}		
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if (null != os) {
					os.close();
				} 
			} catch (Exception e) {
			}
		}
	}
	
}
