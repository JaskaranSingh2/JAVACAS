package oopProj;

// instance variables/properties of objects and methods = behaviors

public class Bicycle {  //public class thing starts with uppercase letter

	// fields or instance variables or non-static variables 
	// properties of an object
	
	String colour;
	int size;
	int weight;
	String brand;
	int gear;
	int speed;
	
	//default constructor
	public Bicycle() {
	}
	
	public void pedal() { // use this as bicycle.pedal();
		speed = speed+5;
	
	}
	public void applyBreak() { // use this as bicycle.applyBreak();
		speed = 0;
	}
}
