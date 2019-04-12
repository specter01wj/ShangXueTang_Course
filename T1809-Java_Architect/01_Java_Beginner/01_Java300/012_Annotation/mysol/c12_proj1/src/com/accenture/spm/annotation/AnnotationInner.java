package com.accenture.spm.annotation;

import java.util.Date;

public class AnnotationInner {

	public static void main(String[] args) {
		Date d = new Date();
		test001();
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Deprecated
	public static void test001(){
		System.out.println("test001");
	}

}
