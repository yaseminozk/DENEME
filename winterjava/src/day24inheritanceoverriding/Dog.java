package day24inheritanceoverriding;

public class Dog extends Mammal{
	
	public boolean smellWell;

	public Dog() {
		super();//If you type "super()" it is fine'
					// If you dont  Java puts it automatically
		System.out.println("Dog constructor without parameter");
	}
	public Dog(boolean smellWell) {
	
		this.smellWell = smellWell;
	}
}
