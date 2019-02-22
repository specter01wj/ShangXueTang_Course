package com.accenture.spm.commonsIO;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class IOCommonsIOCopy {

	public static void main(String[] args) throws IOException {
		
		FileUtils.copyFile(new File("lib/p.png"),new File("lib/p-copy.png"));
		
		FileUtils.copyFileToDirectory(new File("abc.txt"),new File("lib"));
		
		FileUtils.copyDirectoryToDirectory(new File("lib"),new File("lib2"));
		
		FileUtils.copyDirectory(new File("lib2"),new File("lib3"));
		
		String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
		FileUtils.copyURLToFile(new URL(url), new File("marvel.jpg"));
		String datas =IOUtils.toString(new URL("https://abcnews.go.com/"), "UTF-8");
		System.out.println(datas);

	}

}
