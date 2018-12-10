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


