package c1_proj2;

import java.util.Scanner;
import java.math.*;

public class TestClass {

	int a;
	static int size;
	
	public static void main(String[] args) {
		//--char
		int $123 = 1;
		//--variable
		int age = 19;
		//--var classify
		{
			int i=11;
		}
		//System.out.println(i);
		//--constant
		final String name = "jin";
		//name = "jim";
		//--primitive data type
		//--integer
		int b = 015, c = 0x15, d = 0b1101;
		System.out.println(b + " ," + c + " ," + d);
		//--float
		float a1 = 3.14f;
		double b1 = 628e-2, b11 = 3.14;;
		System.out.println(a1 == b1/2);
		
		System.out.println("##################");
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);// 0.5
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);// 0.5000000000000001
		
		BigDecimal  bd2 = BigDecimal.valueOf(0.1);
		BigDecimal  bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3)); 
		
		char a11 = '\u0061';
		System.out.println(a11); 

		boolean a12 = true;
		System.out.println(a12); 

		byte a21 = 1;
		int b21 = 2;
		long b22 = 3;
		float f1 = 3.14f;
		float d21 = b21 + b22;
		
		int a31 = 3;
		int b31 = a31++;
		System.out.println("b = " + b31 + "; a = " + a31);
		b31 = ++a31;
		System.out.println("b = " + b31 + "; a = " + a31);
		
		int a41 = 3, b41 = 4;
		a41 *= b41 + 3;
		System.out.println("b = " + b41 + "; a = " + a41);
		
		char a51 = 'a', b51 = 'b';
		System.out.println("a = " + (int)a51 + " / a = " + (0+a51) + "; a<b " + (a51<b51));
		
		boolean b61 = true, b62 = true;
		System.out.println("b1 ^ b2: " + (b61 ^ b62));
		boolean b63 = 1>2 && 2<(3/0);
		System.out.println("b3: " + b63);

		// 039
		int a71 = 3, b71 = 4, c71 = 5;
		System.out.println("a &|^ b = " + (a71&b71) + "/" + (a71|b71) + "/" + (a71^b71));
		System.out.println("c: >> <<" + (c71>>1) + "/" + (c71<<2));

		// 040
		String a81 = "101";
		int b81 = 3, c81 = 4;
		char d81 = 'a';
		System.out.println("a+b+c: " + (a81+b81+c81));
		System.out.println("b+c+a: " + (b81+c81+a81));
		System.out.println("d+c: " + (d81+c81));

		// 041
		int score = 95, score2 = -100;
		System.out.println("pass?: " + (score > 60 ? (score > 85 ? "A+" : "pass") : "fail"));
		System.out.println("x: " + (score2 > 0 ? 1 : score2 == 0 ? 0 : -1));
		
		// 043
		int a91 = 10;
		long b91 = a91;
		double d91 = b91;
		float f91 = 2323L;
		byte g91 = 123;
		
		// 044
		double a01 = 3.99;
		int b01 = (int)a01;
		System.out.println("b01: " + b01);
		char c01 = 'a';
		int d01 = c01 + 2;
		System.out.println("d01: " + d01);
		System.out.println("d01:char " + (char)d01);
		
		// 045
		int a02 = 1000000000, b02 = 20;
		long c02 = a02 * (long)b02;
		System.out.println("c02:long " + c02);
		
		// 046
//		Scanner scanner01 = new Scanner(System.in);
//		String a03 = scanner01.nextLine();
//		int b03 = scanner01.nextInt();
//		System.out.println("you are: " + a03 + "; age = " + b03);
		
		// 048
		double a04 = Math.random();
		System.out.println("num: " + a04);
		
		int b04 = (int)(6*Math.random()+1), c04 = (int)(6*Math.random()+1),
				d04 = (int)(6*Math.random()+1);
		int e04 = b04 + c04 + d04;
		if(e04 > 12) {
			System.out.println("Big! - " + e04);
		}
		if(e04 >= 8 && e04 <= 12) {
			System.out.println("Ave=: " + e04);
		}
		if(e04 < 8) {
			System.out.println("Low?: " + e04);
		}
		
		// 049
		double a05 = 4 * Math.random(), area05 = Math.PI*Math.pow(a05, 2),
				circle05 = 2 * Math.PI * a05;
		System.out.println("radius: " + a05 + ",area: " + area05 + ",perimeter: " + circle05);
		if(area05 > circle05) {
			System.out.println("Area > Perimeter");
		} else {
			System.out.println("Area < Perimeter");
		}
		
		// 050
		int age06 = (int)(100 * Math.random());
		System.out.println("your age: " + age06 + " belong to: ");
		if(age06 < 15) {
			System.out.println("Kid!");
		} else if (age06 < 30) {
			System.out.println("College Student!");
		} else if (age06 < 60) {
			System.out.println("Working people!");
		} else {
			System.out.println("Old man?");
		}
		
		// 051
		char c07 = 'a';
		int rand07 = (int)(26*Math.random());
		char d07 = (char)(c07+rand07);
		System.out.println("Add - " + rand07 + "/Char " + d07 + " is: ");
		
		switch(d07) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel!");
				break;
			case 'y':
			case 'w':
				System.out.println("Semi-Vowel!");
				break;
			default:
				System.out.println("Consonant!");
		}
		
		// 052
		int i08 = 1, sum08 = 0;
		while(i08 <= 100) {
			sum08 += i08;
			i08++;
		}
		System.out.println("Sum: " + sum08);
		
		// 053
		for(int i = 1; i <= 100; i++) {
			sum08 += i;
		}
		System.out.println("Sum:(for) " + sum08);
		
		// 054
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= 5; j++) {
				System.out.print(i + "  ");
			}
			System.out.println();
		}
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + 
						(i*j < 10 ? ("0" + i * j) : i*j) + " ");
			}
			System.out.println();
		}
		
		int sum09_1 = 0, sum09_2 = 0;
		for(int i=1; i <= 100; i++) {
			if(i%2 == 0) {
				sum09_1 += i;
			} else {
				sum09_2 += i;
			}
		}
		System.out.println("Even: " + sum09_1 + "; Odd: " + sum09_2);
		
		int flag5 = 1;
		for(int i = 1; i <= 1000; i++) {
			if(i%5 == 0) {
				System.out.print(" " + i);
				if(flag5 % 5 == 0) {
					System.out.println();
				}
				flag5 = flag5 == 5 ? flag5 = 1 : ++flag5;
			}
		}
		
		// 055
		
		
		
		
		
		
		
	}
	
}
