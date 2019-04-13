package com.accenture.spm.annotation;

public class AnnotationCustom {

	@SchoolAnnotation(age=25,studentName="James",id=81013,schools={"CMU","MIT"})
	public void test(){
		
	}
	
	@ValueAnnotation("A101")
	public void test2(){
	}
	
}
