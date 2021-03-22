package day23encapsulationinheritence;

public class Encapsulation01 {
	
	private String nameString = "Ali Can";
	private int age = 21;
	private boolean retired = false;
	private char initial = 'A';
	private  String address = "Miami Florida";
	
	public String getName() {
		return nameString;
	}
	public int getAge() {
		return age;
	}
//	public boolean getRetired() {
//		return retired;
//	}

	//void is used A)When you print sth on the console 
	//						B)When you just an action
	public void setName(String nameString) {
		this.nameString = nameString;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public void setRetired(boolean retired) {
//		this.retired = retired;
//	}
	
	
	/*
	 NOT: For getters of boolean variables start the name of getter with "is"
	 
	 */
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	//NOT: To make "initial" variable just readable, you should  not create "setter"
	//	just create "getter"
	public char getInitial() {
		return initial;
	}
	//getting just "setter" makes variable just 'updatable'
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	//If you want not to update any value, DO NOT CREATE ANY SETTER
	//If you do not create any setter method it means no value can be updated
	/*
	 1) If you want not to update any value, do not create any setter method.
	 Question: How can you make a value immutable?
	 Answer: Create private variable and do not use setter
	 */
	
}
