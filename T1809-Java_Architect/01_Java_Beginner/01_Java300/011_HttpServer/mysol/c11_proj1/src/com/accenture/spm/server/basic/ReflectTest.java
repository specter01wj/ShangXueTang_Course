package com.accenture.spm.server.basic;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class clz1 = new Iphone().getClass();
		
		Class clz2 = Iphone.class;
		
		Class clz3 = Class.forName("com.accenture.spm.server.basic.Iphone");
		
		Iphone iphone2 =(Iphone)clz3.newInstance();
		System.out.println(iphone2);
		
	}

}

class Iphone {
	
	public Iphone() {
		
	}
	
}
