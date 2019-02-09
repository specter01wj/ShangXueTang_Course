package com.accenture.spm.ioprocess;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOProcessBufferOutput {

	public static void main(String[] args) {
		
		File dest = new File("dest.txt");
		OutputStream os =null;
		try {
			os =new BufferedOutputStream( new FileOutputStream(dest));
			String msg ="IO is so easy\r\n";
			byte[] datas =msg.getBytes();
			os.write(datas,0,datas.length);
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
			} catch (Exception e) {
			}
		}
		
	}
	
}
