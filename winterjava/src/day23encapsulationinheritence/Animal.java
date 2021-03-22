package day23encapsulationinheritence;

public class Animal {

	/*
	 1)Why do we need inheritance?
	 2)What are the benefits of inheritance?
	 		a)No repetation
	 		b)Less coding
	 		c)Easy update
	 		d)Easy maintanance
	 		
	 3)We store common class members(variables or methods) into Parent Class
	 4)We store specific class members into Child classes
	 5)Private class members in Parent Class cannot be used by child Classes
	 6)If child class and parent class are in same package then child class can use the default 
	 	class members in parent class
	 7)Child Classes can use all protected class members in Parent Class
	 8)For public and protected access modifiers inheritance works without any issue
	 9)For private access modifiers there is no inheritance
	 10)For default access modifiers you should be careful
	 */
	
		public void eat() {
			System.out.println("They eat...");
		}
		
		public void drink() {
			System.out.println("They drink...");
		}
	}

