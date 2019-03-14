package com.accenture.spm.server.basic;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clz1 = new Iphone().getClass();
		
		Class clz2 = Iphone.class;
		
		Class clz3 = Class.forName("com.accenture.spm.server.basic.Iphone");
		
	}

}

class Iphone {
	
	public Iphone() {
		
	}
	
}
