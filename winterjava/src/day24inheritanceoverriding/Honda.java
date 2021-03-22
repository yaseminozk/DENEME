package day24inheritanceoverriding;

public class Honda extends Car{

	public void factory() {
		System.out.println("Factory is in Japan");
	}
	/*
	 Using @override annotation is not must to achieve "overriding" but
	 it has 2 benefits: 
	 		a) When you use "@override" annotation, Java checks
	 for you. If it is not correct, it gives you Comp. time error
	 		b) When you use "@override" annotation, it is good for readability
	
	Note: "private" methods cannot be overriden (Interview question)
	
	Note: Access modifiers of "overriding methods"  (Methods are in Child Class)
				Method is in Parent class called "Overridden method"
	 */

	@Override
	public void move() {
		System.out.println("Honda reaches 100 in 6 seconds");
	}

	@Override
	public void engine() {
		System.out.println("Honda has ecoengine in every model");
	}
}
