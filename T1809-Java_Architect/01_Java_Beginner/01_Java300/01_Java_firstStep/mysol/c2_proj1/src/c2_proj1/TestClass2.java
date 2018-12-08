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
		



		
		
		
		
	}
	
}

class Computer {
	String brand;
}



