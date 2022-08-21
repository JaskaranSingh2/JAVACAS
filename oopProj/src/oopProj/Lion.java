package oopProj;

public class Lion extends Animal {
	
	String colour;
	int age;
	String height;
	String weight;
	
	@Override
	public void makesSound() {
		System.out.println("Lion roars...");
	}
}
