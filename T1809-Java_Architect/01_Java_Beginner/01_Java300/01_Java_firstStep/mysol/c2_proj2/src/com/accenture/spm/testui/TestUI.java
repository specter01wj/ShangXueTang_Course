package com.accenture.spm.testui;

import com.accenture.spm.oo.*;
import com.accenture.spm.oo2.*;
import com.accenture.spm.oo75.Horse75;

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
		
		
		
		
		
	}

	
}
