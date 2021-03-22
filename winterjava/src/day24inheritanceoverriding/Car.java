package day24inheritanceoverriding;

public class Car extends Vehicle{

	/*
	 Child cannot put restriction to his parent
	 */
	public void numOfTires () {
		System.out.println("Cars have 4 tires");
	}
}

