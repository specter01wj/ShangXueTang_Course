package com.accenture.spm.commonsIO;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class IOCommonsIORead {

	public static void main(String[] args) throws IOException {
		
		String msg =FileUtils.readFileToString(new File("emp.txt"),"UTF-8");
		System.out.println(msg);
		byte[] datas = FileUtils.readFileToByteArray(new File("emp.txt"));
		System.out.println(datas.length);
		
		 List<String> msgs= FileUtils.readLines(new File("emp.txt"),"UTF-8");
		 for (String string : msgs) {
			System.out.println(string);
		}
		LineIterator it =FileUtils.lineIterator(new File("emp.txt"),"UTF-8");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}

	}

}
