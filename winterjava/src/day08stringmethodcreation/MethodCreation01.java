package day08stringmethodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(add(3, 4));
		System.out.println(add(3.4, 5.6));
		System.out.println(add('a', 7));

	}


/*
 1)We create methods out of the main method and use them in main method
 to make main method simplier.
 2)Static method can use just static class members because of that
 we have to make our method to be able to call them from main method
 3)The variables which are created in method paranthesis are called 
 "parameters"
 4)The values which are used in main method call are called as "arguments"
 5)For number parameter you can use "chars" but do not use string or boolean
 otherwise you ll get COMPILE time error
 */
	
/*
 METHOD OVERLOADING: If you create method whose names are same and parameters
 are different in a class it is called METHOD OVERLOADING
 
 When you use same name for methods in a class Java complains.
 To stop complaining we have to change parameters
 Changing access modifier will not stop complaining
 Changing return type will not stop complaining
 Removing static keyword 
 */

public static double add(double num1, double num2) {
	return num1+num2;
	
}
public static double add(int num1,char num2) {
	return num1+num2;
}
public static double add(char num1,int num2) {
	return num1+num2;
}
public static double add(int num1,char num2, int num3) {
	return num1+num2+num3;
}
}
