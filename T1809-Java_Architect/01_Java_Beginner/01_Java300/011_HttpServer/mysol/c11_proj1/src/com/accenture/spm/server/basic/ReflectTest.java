package com.accenture.spm.server.basic;

import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class clz1 = new Iphone().getClass();
		
		Class clz2 = Iphone.class;
		
		Class clz3 = Class.forName("com.accenture.spm.server.basic.Iphone");
		
//		Iphone iphone2 =(Iphone)clz3.newInstance();
//		System.out.println(iphone2);
		Iphone iphone3 = (Iphone)clz3.getConstructor().newInstance();
		System.out.println(iphone3);
	}

}

class Iphone {
	
	public Iphone() {
		
	}
	
}
