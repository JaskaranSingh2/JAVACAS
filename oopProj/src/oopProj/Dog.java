package oopProj;

public class Dog extends Animal {
	
	String colour;
	int age;
	String height;
	String weight;
	
	@Override
	public void makesSound() {
		System.out.println("Dog barks...");
	}
}
