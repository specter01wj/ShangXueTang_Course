package c1_proj2;

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
		
		

		
		


		
	}
	
}
