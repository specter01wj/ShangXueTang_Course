package com.accenture.spm.commonsIO;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class IOCommonsIO {

	public static void main(String[] args) {
		long fileLen =FileUtils.sizeOf(new File("lib/p.png"));
		System.out.println(fileLen);

		long dirLen = FileUtils.sizeOf(new File("lib"));
		System.out.println(dirLen);
	}

}
