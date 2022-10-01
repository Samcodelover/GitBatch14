package gitClass01B14;

public class student {
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Student is deleting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizza...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student friadoonObject = new student();
		friadoonObject.name="Friadoon";
		friadoonObject.id="123";
		friadoonObject.age=22;
		
		System.out.println(friadoonObject.name);
		System.out.println(friadoonObject.age);
		friadoonObject.eat();
		
		student student2=new student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		student2.eat();
		
		
	}

}
