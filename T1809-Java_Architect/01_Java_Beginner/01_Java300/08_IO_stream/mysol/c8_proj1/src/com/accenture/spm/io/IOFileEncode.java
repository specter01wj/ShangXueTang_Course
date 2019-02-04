package com.accenture.spm.io;

import java.io.UnsupportedEncodingException;

public class IOFileEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg ="性命生命使命a";
		
		byte[] datas = msg.getBytes();
		System.out.println(datas.length);
		
		datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = msg.getBytes("GBK");
		System.out.println(datas.length);	
	}
	
}
