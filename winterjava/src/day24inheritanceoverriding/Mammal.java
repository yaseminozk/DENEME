package day24inheritanceoverriding;

public class Mammal extends Animal{

	public boolean haveBaby;
	
	public Mammal() {
		super(5);
		/*
		 1)To create an object you can use just a single constructor
		 2)Super() keyword must  be in the first line inside the constructor
		 3)You can use super() just once in a constructor
		 4)If you make constructor call for a nonexisting constructor from parent class
		 	you ll get compile time error
		 5)this() ==> Calls the constructors inside the class itself
		 	super()==> Calls the constructors from parent class
		 */
		
		System.out.println("Mammal constructor without parameter");
	}
}
