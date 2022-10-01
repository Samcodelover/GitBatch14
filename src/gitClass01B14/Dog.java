package gitClass01B14;

public class Dog {
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	void bark() {
		System.out.println("Bark....");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping....");
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.sleep();
 	}
}
