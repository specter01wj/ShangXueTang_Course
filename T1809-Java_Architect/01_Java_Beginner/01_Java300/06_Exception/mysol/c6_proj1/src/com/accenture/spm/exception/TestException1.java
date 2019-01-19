package com.accenture.spm.exception;

public class TestException1 {

	public static void main(String[] args) {
		
		//int a = 1/0;
		int a = 0, b = 1;
		
		if(a!=0) {
			System.out.println(b/a);
		}
		
		String str = null;
		if(str!=null) {
			System.out.println(str.length());
		}
		
		Animal a1 = new Dog();
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
		}
		
		int[] arr = new int[5];
		int a2 = 5;
		if(a2 < arr.length) {
			System.out.println(arr[a2]);
		}
		
	}
	
}

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}
