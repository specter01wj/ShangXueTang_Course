package com.accenture.spm.testui;

import com.accenture.spm.oo.*;
import com.accenture.spm.oo2.*;
import com.accenture.spm.oo75.Horse75;
import com.accenture.spm.oo76.Person76;
import com.accenture.spm.oo77.*;
import com.accenture.spm.oo78.*;
import com.accenture.spm.oo79.*;
import com.accenture.spm.oo80.*;
import com.accenture.spm.oo81.*;
import com.accenture.spm.arrays84.*;

import static java.lang.Math.*;
import java.util.Arrays;

public class TestUI {
	
	public static void main(String[] args) {
		
		// 073
		User01 user01 = new User01();
		
		System.out.println(PI);
		
		// 074
		Student1 stu1 = new Student1();
		stu1.name = "Jin";
		stu1.height = 180;
		stu1.rest();
		//Student1 stu2 = new Student1("John", 198. "EE");
		System.out.println(stu1 instanceof Student1);
		System.out.println(stu1 instanceof Person1);
		System.out.println(stu1 instanceof Object);
		
		// 075
		Horse75 horse75 = new Horse75();
		horse75.run();
		
		// 076
		//Object obj = new Object();
		TestUI tu = new TestUI();
		System.out.println(tu);
		Person76 person76 = new Person76("King", 36);
		System.out.println(person76.toString());
		
		// 077
		User77 user77_1 = new User77(1001, "James", "123");
		User77 user77_2 = new User77(1001, "James", "123");
		System.out.println(user77_1 == user77_2);
		System.out.println(user77_1.equals(user77_2));
		
		String str77_1 = new String("KK");
		String str77_2 = new String("KK");
		System.out.println(str77_1 == str77_2);
		System.out.println(str77_1.equals(str77_2));
		
		// 078
		new ChildClass78().f();
		new ChildClass78_2();
		
		// 079
		Human79 human79 = new Human79();
		//human79.age = 13;
		//human79.name = "Jin";
		//human79.height = 131;
		human79.sayName();
		
		// 080
		Person80 person80 = new Person80();
		person80.setAge(134);
		System.out.println("Age: " + person80.getAge());
		
		// 081
		Animal81 animal81 = new Animal81();
		animalCry81(animal81);
		Dog81 dog81 = new Dog81();
		animalCry81(dog81);
		animalCry81(new Cat81());
		
		// 082
		Animal81 dog82 = new Dog81();
		animalCry81(dog82);
		//dog82.seeDoor();
		Dog81 dog82_2 = (Dog81) dog82;
		dog82_2.seeDoor();
		
		// 083
		//String str83;
		
		// 084
		int[] arr84_1 = new int[10];
		String[] arr84_2 = new String[5];
		TestArrays tAs= new TestArrays();
		TestArrays.User84[] arr84_3 = new TestArrays.User84[3];
		
		for(int i = 0; i < arr84_1.length; i++) {
			arr84_1[i] = 10*i;
		}
		System.out.println("Array84 arrays: " + Arrays.toString(arr84_1));
		
//		arr84_3[0] = tAs.new User84(1001,"James1");
//		arr84_3[1] = tAs.new User84(1002,"James2");
//		arr84_3[2] = tAs.new User84(1003,"James3");
		for(int i = 0; i < arr84_3.length; i++) {
			arr84_3[i] = tAs.new User84(i, "Jin");
		}
		for(int i = 0; i < arr84_3.length; i++) {
			System.out.println("Array84 class: " + (arr84_3[i].getId()) + "," 
					+ (arr84_3[i].getName()));
		}
		
		// 085
		int[] a85 = {2, 4, 5, 6};
		TestArrays.User84[] b85 = {
				tAs.new User84(1001, "James1"),
				tAs.new User84(1002, "James2"),
				tAs.new User84(1003, "James3")
		};
		
		// 086
		int[] arr86 = new int[10];
		for(int i = 0; i < arr84_1.length; i++) {
			arr86[i] = 20*i;
		}
		for(int m : arr86) {
			System.out.println("Array86 foreach: " + m);
		}
		
		
		
		
		
		
		
		
		
	}
	
	static void animalCry81(Animal81 a) {
		a.shout();
	}
	
	public String toString() {
		return "Override toString!";
	}

	
}
