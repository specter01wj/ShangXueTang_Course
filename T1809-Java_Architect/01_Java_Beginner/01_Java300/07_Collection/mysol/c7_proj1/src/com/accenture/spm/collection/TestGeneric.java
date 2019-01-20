package com.accenture.spm.collection;

public class TestGeneric {

	public static void main(String[] args) {
		
		MyCollection mc1 = new MyCollection();
		mc1.setObjs("James", 0);
		mc1.setObjs(1011, 1);
		
		System.out.println(mc1);
	}
	
}

class MyCollection {
	
	Object[] objs = new Object[5];

	public Object getObjs(int index) {
		return objs[index];
	}

	public void setObjs(Object objs, int index) {
		this.objs[index] = objs;
	}
	
	
	
}
