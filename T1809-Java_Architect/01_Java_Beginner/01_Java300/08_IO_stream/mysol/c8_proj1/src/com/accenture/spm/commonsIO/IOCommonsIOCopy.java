package com.accenture.spm.commonsIO;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class IOCommonsIOCopy {

	public static void main(String[] args) throws IOException {
		
		FileUtils.copyFile(new File("p.png"),new File("p-copy.png"));
				//复制文件到目录
				//FileUtils.copyFileToDirectory(new File("p.png"),new File("lib"));
				//复制目录到目录
				//FileUtils.copyDirectoryToDirectory(new File("lib"),new File("lib2"));
				//复制目录
				//FileUtils.copyDirectory(new File("lib"),new File("lib2"));
				//拷贝URL内容
				//String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
				//FileUtils.copyURLToFile(new URL(url), new File("marvel.jpg"));
				String datas =IOUtils.toString(new URL("http://www.163.com"), "gbk");
				System.out.println(datas);

	}

}
