package com.accenture.spm.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationReflection {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			Class clazz = Class.forName("com.accenture.spm.annotation.StudentAnnotation");
			//获得类的所有有效注解
			Annotation[] annotations=clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			//获得类的指定的注解
			TableAnnotation st = (TableAnnotation) clazz.getAnnotation(TableAnnotation.class);
			System.out.println(st.value());
			
			//获得类的属性的注解
			Field f = clazz.getDeclaredField("studentName");
			FieldAnnotation sxtField = f.getAnnotation(FieldAnnotation.class);
			System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());
			
			//根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
