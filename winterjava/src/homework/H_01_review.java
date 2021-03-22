package homework;



public class H_01_review {
	/*
	 	Create a class whose name is “Review”
		Create main method
		Create a program to print all primitive data types on the console
	 */

	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		float e = 5.5f;
		double f = 6.6;
		System.out.println(a +b + c + d + e + f);
		
		/*
		 	Create two integer variables their names are num1 and num2
			and output should be “The sum of the numbers : The sum of 
			num1 and num2”
		 */
		
		int num1 = 3;
		int num2 = 4;
		System.out.println("The sum of the numbers : " + (num1 +num2));
		
		//Create char variables to print your first name on the console
		
		char name1 ='y';
		char name2 ='a';
		char name3 ='s';
		char name4 ='e';
		char name5 ='m';
		char name6 ='i';
		char name7 ='n';
		
		System.out.println(""+name1+name2+name3+name4+name5+name6+name7);
		
		//Find the maximum and minimum values of long and print them on the console.
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		/*
		 Answer the following questions by using multi line comment method
inside the Review Class

What is the difference between the primitive and non-primitive data types?
==>	The main difference between primitive and non-primitive data types are: 
	Primitive types are predefined (already defined) in Java. Non-primitive 
	types are created by the programmer and is not defined by Java (except for String ) 
	A primitive type has always a value, while non-primitive types can be null .

What is the camelCase rule
==>	camelCase(lovercase is first word then uppercase is second word)

Which symbols can you use while you name a variable or method?
==>You should only use alphabets and numbers while naming anything in Java. 
The only special characters that are allowed are the dollar 
sign(‘$’) and the underscore(‘_’).

What is the object oriented programming, explain it in three sentences?
==>Object Oriented programming (OOP) is a programming paradigm
that relies on the concept of classes and objects. It is used to
structure a software program into simple, reusable pieces of 
code blueprints (usually called classes), which are used to 
create individual instances of objects.Object-oriented 
programming (OOP) is a computer programming model that organizes 
software design around data, or objects, rather than functions 
and logic.


		 */
		

	}

}