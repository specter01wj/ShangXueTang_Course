package com.accenture.spm.iostream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStreamByteArrayOutput {

	public static void main(String[] args) {
		
		byte[] dest = null;
		ByteArrayOutputStream os = null;
		
		try {
			os = new ByteArrayOutputStream();
			
			String msg = "James Wang is coming!\r\n";
			byte[] data = msg.getBytes();
			os.write(data, 0, data.length);
			os.flush();
			
			dest = os.toByteArray();
			System.out.println(dest.length + "--->" + new String(dest, 0, os.size()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null!=os) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
