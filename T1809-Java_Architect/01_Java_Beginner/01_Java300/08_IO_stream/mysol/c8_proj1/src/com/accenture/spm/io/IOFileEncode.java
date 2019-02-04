package com.accenture.spm.io;

import java.io.UnsupportedEncodingException;

public class IOFileEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg ="性命生命使命a";
		
		byte[] data = msg.getBytes();
		System.out.println(data.length);
		
		data = msg.getBytes("UTF-16LE");
		System.out.println(data.length);
		
		data = msg.getBytes("GBK");
		System.out.println(data.length);	
	}
	
}