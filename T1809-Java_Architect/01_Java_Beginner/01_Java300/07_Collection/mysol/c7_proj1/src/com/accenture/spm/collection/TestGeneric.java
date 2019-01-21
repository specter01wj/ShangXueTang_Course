package com.accenture.spm.collection;

public class TestGeneric {

	public static void main(String[] args) {
		
		//MyCollection mc1 = new MyCollection();
		MyCollection<String> mc1 = new MyCollection();
		mc1.setObjs("James", 0);
		//mc1.setObjs(1011, 1);
		
		//String a1 = (String)mc1.getObjs(0);
		String a1 = mc1.getObjs(0);
		//Integer b1 = (Integer)mc1.getObjs(1);
		System.out.println(mc1.getObjs(0));
		//System.out.println("/" + a1 + "/" + b1);
		System.out.println("/" + a1);
		
		List list1;
		
	}
	
}

/*class MyCollection {
	
	Object[] objs = new Object[5];
	
	public Object getObjs(int index) {
		return objs[index];
	}
	
	public void setObjs(Object objs, int index) {
		this.objs[index] = objs;
	}
	
}*/

class MyCollection<E> {
	
	Object[] objs = new Object[5];

	public E getObjs(int index) {
		return (E)objs[index];
	}

	public void setObjs(E e, int index) {
		this.objs[index] = e;
	}
	
}
