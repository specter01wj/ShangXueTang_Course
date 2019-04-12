package com.accenture.spm.annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	@SuppressWarnings("all")
	public static void test002(){
		List list = new ArrayList();
		List list2 = new ArrayList();
	}

}
