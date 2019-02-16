package com.accenture.spm.ioprocess;

public class IOProcessRandomAccessFileSplit {

	public static void main(String[] args) {
		SplitFile sf = new SplitFile("src/com/sxt/io/SplitFile.java","dest") ;
		sf.split();
		sf.merge("aaa.java");

	}
	
	

}
