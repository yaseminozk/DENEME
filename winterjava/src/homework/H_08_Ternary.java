package homework;

import java.util.Scanner;

public class H_08_Ternary {

	public static void main(String[] args) {
	/*
	 Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
	 */
Scanner scanner = new Scanner(System.in);
System.out.println("enter an integer");

int num = scanner.nextInt();
 
System.out.println((num%2==0) ? ("The integer is even"): ("The integer is odd") );

/*
 Type java code by using ternary and if-else. Ask user to enter two integers
Write a program to print the minimum one on the console.
 */

System.out.println("enter two integers");
int num1 = scanner.nextInt();
int num2 = scanner.nextInt();

System.out.println((num1>num2)?num1:num2);

/*
 Type java code by using ternary.
Write a program to print absolute value of an integer entered by user.
 */

System.out.println("enter an integer to see absolute value");
int number = scanner.nextInt();

System.out.println((number>0)?number:number*-1);

/*
 Type java code by using using ternary.
Take values of length and width of a rectangle from user and check if it is square or not.
 */

System.out.println("enter a length");
int length = scanner.nextInt();
System.out.println("enter a width");
int width = scanner.nextInt();

System.out.println((length==width)? ("it is square"): ("it is rectangle")); 

/*
 Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
 */

Scanner scan = new Scanner(System.in);

System.out.println("enter a string to see if it is state abbreviation");
String str = scan.nextLine();

System.out.println((str.length()==2)?"It is valid for state abbreviations": 
	"It is not valid for state abbreviations");
/*
 Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”

How can you decide the number of digits of an integer?
 */

System.out.println("enter a number has 3 digits");
String digit = scan.nextLine();

System.out.println(digit.length()==3?"This number has 3 digits": "This number has not 3 digits");

/*
 Ask user ta enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.

Cube of a = a*a*a Square of a = a*a
 */

System.out.println("enter a number less than 10");
int a = scanner.nextInt();

System.out.println((a<10 && a>=0)?a*a*a:a*a );
	}

}
