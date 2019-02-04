package com.accenture.spm.io;

import java.io.UnsupportedEncodingException;

public class IOFileDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg ="性命生命使命a";
		
		byte[] data = msg.getBytes();
		
		String msg_dec = new String(data, 0, data.length, "utf8");
		System.out.println(msg_dec);
		
	}
	
}
