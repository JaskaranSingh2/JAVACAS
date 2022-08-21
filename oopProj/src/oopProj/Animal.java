package oopProj;

abstract public class Animal {
	
	String colour;
	int age;
	String height;
	String weight;

	abstract public void makesSound(); // we use this to enforce it in the subclasses
}
