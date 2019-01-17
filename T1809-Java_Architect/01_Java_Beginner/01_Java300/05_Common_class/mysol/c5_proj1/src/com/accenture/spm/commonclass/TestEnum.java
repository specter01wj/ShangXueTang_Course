package com.accenture.spm.commonclass;

import java.io.IOException;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Season.SUMMER);
		
		Season a1 = Season.AUTUMN;
		Season b1 = Season.UNKNOWN;
		
		switch(a1) {
		case SPRING:
			System.out.println("Spring coming!");
			break;
		case SUMMER:
			System.out.println("Summer coming!");
			break;
		case AUTUMN:
			System.out.println("Autumn coming!");
			break;
		case WINTER:
			System.out.println("Winter coming!");
			break;
		default:
			System.out.println("Stay Home?");
			break;
		}
		
	}
	
}

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER, UNKNOWN
}

enum Week {
	MON, TUE, WED, THUR, FRI, SAT, SUN
}
