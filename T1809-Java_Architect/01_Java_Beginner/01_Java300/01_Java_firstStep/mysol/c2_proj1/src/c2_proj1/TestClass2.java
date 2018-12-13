package c2_proj1;

public class TestClass2 {

	int id, age;
	String name;
	
	Computer comp;
	
	void study() {
		System.out.println("Studying! Using: " + comp.brand);
	}
	
	void play() {
		System.out.println("Playing!");
	}
	
	public static void main(String[] args) {
		
		// 062
		TestClass2 tl2 = new TestClass2();
		tl2.play();
		
		// 063
		tl2.id = 1001;
		tl2.name = "James";
		tl2.age = 32;
		
		Computer c1 = new Computer();
		c1.brand = "Lenovo";
		tl2.comp = c1;
		tl2.study();
		
		// 064
		
		// 065
		Point p03 = new Point(3, 4);
		Point origin03 = new Point(0, 0);
		
		System.out.println(p03.getDistance(origin03));
		System.out.println(p03.getDistance(p03));
		
		User03 u03_1 = new User03();
		User03 u03_2 = new User03(101, "James");
		User03 u03_3 = new User03(102, "Kate");
		
		// 066
		// 067
		// 068
		TestThis testThis04 = new TestThis(2, 3);
		testThis04.eat();
		
		// 069
		User04 user04 = new User04(100012, "James");
		User04.printCompany();
		User04.company = "Amazon";
		User04.printCompany();
		//User04.login();
		
		// 070
		User05 user05 = new User05();
		//user05.printCompany();
		
		// 071
		User06 user06 = new User06(10101, "Kim");
		user06.testParaTransfer01(user06);
		System.out.println(user06.name);
		
		user06.testParaTransfer02(user06);
		System.out.println(user06.name);
		
	}
	
}

class Computer {
	String brand;
}

class Point {
	double x, y;
	
	public Point(double _x, double _y) {
		x = _x;
		y = _y;
	}
	
	public double getDistance(Point p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
	
}

class User03 {
	int id;
	String name, pwd;
	
	public User03() {
		
	}
	
	public User03(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public User03(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
}

class TestThis {
	int a, b, c;
	
	TestThis(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c) {
		this(a,b);
		this.c = c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		this.sing();
		System.out.println("TestThis: eat!" + a + b);
	}
	
}

class User04 {
	int id;
	String name, pwd;
	
	static String company = "Google";
	
	public User04(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("Login: " + name);
	}
	
	public static void printCompany() {
		//login();
		System.out.println(company);
	}
	
}

class User05 {
	int id;
	String name, pwd;
	static String company;
	
	static {
		System.out.println("Class init!");
		company = "Apple";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
}

class User06 {
	int id;
	String name, pwd;
	
	public User06(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParaTransfer01(User06 user06) {
		user06.name = "John";
	}
	
	public void testParaTransfer02(User06 user06) {
		user06 = new User06(200201, "Ling");
	}
	
}


