package com.accenture.spm.testui;

import com.accenture.spm.oo.*;
import com.accenture.spm.oo2.*;
import com.accenture.spm.oo75.Horse75;
import com.accenture.spm.oo76.Person76;
import com.accenture.spm.oo77.*;
import com.accenture.spm.oo78.*;

import static java.lang.Math.*;

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
		
		
		
		
		
	}
	
	public String toString() {
		return "Override toString!";
	}

	
}
