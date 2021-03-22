package day13constructors;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	//I created a constructor at the below
	//The constructor has no any parameter
	//The constructor has nothing inside the body
	//That kind of constructors are same with the default constructors
	//NOTE: If you create a constructor Java deletes the "default one"
	public Dog() {
		
	}
	public Dog(String name) {
		this.name= name;
	}
	public Dog (int weight, int height) {
		
	}
	public Dog (String name, int weight, int height){
		this.height= height;
		this.name= name;
		this.weight= weight;
	}
	public static void main(String[] args) {
		Dog dog1 = new Dog("Joe");
		System.out.println(dog1.name);//Joe
		dog1.sound();
		System.out.println("========================");
		
		//Create a dog by using name, weight, height
		Dog dog2 = new Dog("Rocky", 40, 20);
		System.out.println(dog2.name);//Rocky
		System.out.println(dog2.weight);//40
		System.out.println(dog2.height);//20
		dog2.sound();  

	}
	public static void sound() {
		System.out.println("Dogs bark...");
	}

}
