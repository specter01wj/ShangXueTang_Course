package com.accenture.spm.oo78;

//import com.accenture.spm.oo78.*;

public class ChildClass78 extends FatherClass78 {

	public int value;
	
	public void f() {
		super.f();
		value = 200;
		System.out.println("ChildClass value = " + value);
		System.out.println(value);
		System.out.println(super.value);
	}
	
	
}
