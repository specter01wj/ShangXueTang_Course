package com.accenture.spm.collection;

public class TestGeneric {

	public static void main(String[] args) {
		
		
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
