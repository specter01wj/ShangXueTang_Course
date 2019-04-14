package com.accenture.spm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value=ElementType.METHOD)
@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SchoolAnnotation {

	String studentName() default "";
	int age() default 0;
	int id() default -1;
	
	
	
	String[] schools() default {"Duke","UVA","UNC","UK"};

}
