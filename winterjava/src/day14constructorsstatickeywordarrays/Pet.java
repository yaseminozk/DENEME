package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		Dog.eat();// to access static methods just class name is enough
		
		
		Dog dog = new Dog();
		dog.drink();//To access nonstatic methods, you must create object
		dog.eat();//To access static methods, you can use objects as well but it is not 
						//recommended, because it is a long way and Java gives you notification
						// with yellow underline
	}

}
