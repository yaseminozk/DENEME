package day25overridingexceptions;

public class Runner {

	public static void main(String[] args) {
		/*
		 Create an object whose data type is Animal, Constructor is Dog
		 Note: When u create an object, you may use "parent classes" as data type
		 Note: If parent and child classes have methods whose are same 
		 			look at the data type to understnd which one ll be called
		 Note: If you use parent class as a data type the class members in child class ll be 
		 			unaccessable
		 */

		Animal obj1 = new Dog();
		//Note: If you use child class as a data type the class members in child class
		//and in parent class ll be accessable
		
		
		Dog obj2 = new Dog();//birthYear, tail, name, height - drink(), bark()
	}

}
